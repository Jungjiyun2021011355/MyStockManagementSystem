package week6H.W;
import java.util.Scanner;
public class Menusimulator extends Menu {
	Scanner input = new Scanner(System.in);
	
	Menu mn []= new Menu[100];
	
	public void add() {
		while(input.hasNext()) {
			int i = 0;
			String Name = input.next();
			mn[i].setName(Name);
		    String ID = input.next();
		    mn[i].setID(ID);
			String Data = input.nextLine();
			mn[i].setData(Data);
			i++;	
		}
	}
	public void delete() {
		int i = input.nextInt();
		mn[i].setName(null);
		mn[i].setID(null);
		mn[i].setData(null);
	}
	public void edit(String newName, String newID, String newData) {
		int i = input.nextInt();
		newName = input.next();
		mn[i].setName(newName);
		
		newID = input.next();
		mn[i].setID(newID);
		
		newData = input.nextLine();
		mn[i].setData(newData);
	}
	public void view() {
		for(int i = 0; i < 100; i++) {
			if(mn[i].equals(null)) {
				break;
			}
			else {
				System.out.println("주식 이름: " + mn[i].getName());
				System.out.println("주식 아이디: " + mn[i].getID());
				System.out.println("주식 데이터: " + mn[i].getData());
			}
		}
	}
}
