package week8;
import java.util.*;
import java.io.*;
import log.EventLogger;

import java.text.SimpleDateFormat;
import java.io.*;
public class ManagementSystem {
	Scanner input = new Scanner(System.in);
	static EventLogger Logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Menu m = getObject("m.ser");
		if(m == null) {
			m = new Menu();
		}
		
		selectMenu(input, m);
		putObject(m, "m.ser");
		
	}
    public static void selectMenu(Scanner input, Menu m) {
    	int num = -1;
    	while (num != 5) {
    		try {
    			showMenu();
    			num = input.nextInt();
    			switch(num) {
				
				case 1:
				    System.out.println("Welcome to visit");
				    break;
				case 2: 
					m.add(0);
					Logger.log("add a stock");
					break;
				case 3: 
					m.delete();
					Logger.log("delete a stock");
					break;
				case 4: 
					m.edit(null, null, null);
					Logger.log("edit a stock");
					break;
				case 5: 
					m.view();
					Logger.log("view a stock");
					break;
				default:
					continue;
    		    }
    		}catch(InputMismatchException e) {
				System.out.print("Select one number between 1-6: ");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
    	    }
    	}
    }
    public static void showMenu() {
		System.out.println("*** Stock managementSystem Menu ***");
		System.out.println("1. open my stock list: ");
		System.out.println("2. Add my stocks: ");
		System.out.println("3. delete my stocks: ");
		System.out.println("4. edit my stock list: ");
		System.out.println("5. view my stocks: ");
		System.out.println("6. exit");
		System.out.print("Select one number between 1-6: ");
    }
    
	public static Menu getObject(String filename) {
		Menu m = null;
	
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			m = (Menu) in.readObject();
			
			in.close();
			file.close();
		} catch(FileNotFoundException e) {
			return m;
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return m;
	}
	
	public static void putObject(Menu mn, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(mn);
			
			out.close();
			file.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
class NumberConfinement{
	public NumberConfinement(){}
	public void numc(int num) throws Exception{
		if(num < 7 && num > 0) {
		}
		else {
			throw new Exception();
		}
	}
}