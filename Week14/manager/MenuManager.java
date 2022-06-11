package manager;
import java.io.*;  
import java.util.*;
import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		StockManager stockManager = getObject("StockManager.ser");
		if(stockManager == null) {
			stockManager = new StockManager(input);
		}else {
			stockManager.setScanner(input);
		}
		WindowFrame frame = new WindowFrame(stockManager);
		
		int num = input.nextInt();

		try {

			while (num != 6) {
				System.out.println("---Stock Management System Menu---");
				System.out.println("1. Add Reminder");
				System.out.println("2. Delete Reminder");
				System.out.println("3. Edit Reminder");
				System.out.println("4. View Reminder");
				System.out.println("5. Show a menu");
				System.out.println("6. Exit");
				System.out.println("1 부터 6 중 번호를 선택하세요.");
				num = input.nextInt();
				input.nextLine();
				switch(num) {
				case 1:
					stockManager.addManager();
					logger.log("add a stock");
					break;
				case 2:
					stockManager.deleteManager();
					logger.log("delete a stock");
					break;
				case 3:
					stockManager.editManager();
					logger.log("edit a stock");
					break;
				case 4:
					stockManager.viewManager();
					logger.log("edit a list of stock");
					break;
				default:
					continue;
				}
			}
		}
		catch(InputMismatchException e){
			System.out.println("InputMismatchException");
			if(input.hasNext()) {
				input.next();
			}
			num = -1;
		}
	}
	
	public static StockManager getObject(String filename) {
		StockManager StockManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			StockManager = (StockManager) in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return StockManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return StockManager;
	}
	public static void putObject(StockManager stockManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(stockManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}