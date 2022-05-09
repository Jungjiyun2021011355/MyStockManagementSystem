package week6H.W;
import java.util.Scanner;
public abstract class Menusimulator extends Menu {
	Scanner input = new Scanner(System.in);
	
	Menu mn []= new Menu[100];

	
	public void add() {
		while(Name.equals(null)) {
			Name = input.next();
		    ID = input.next();
			Data = input.nextLine();
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
				System.out.println("주식 이름: " + this.Name);
				System.out.println("주식 아이디: " + this.ID);
				System.out.println("주식 데이터: " + this.Data);
			}
		}
	}
}
