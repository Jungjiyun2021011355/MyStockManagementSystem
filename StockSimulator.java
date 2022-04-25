package week5;
import java.util.Scanner;
public class StockSimulator {
	Scanner input = new Scanner(System.in);
	Stocklist[] sl = new Stocklist[100];
	
	int i = 0;
	
	public void Add() {
		System.out.println("Enter a Name");
		sl[i].setName(input.next());
		System.out.println("Enter a ID");
		sl[i].setID(input.next());
		System.out.println("Enter a data");
		sl[i].setData(input.next());
		this.i++;
	}
	
	public void delete() {
		System.out.println("Enter i(index) to delete");
		int j = input.nextInt();
		sl[j].setName(null);
		sl[j].setID(null);
		sl[j].setData(null);
	}
	
	public void edit() {
		System.out.println("Enter i(index) to edit");
		int j = input.nextInt();
		System.out.println("Enter a Name");
		sl[j].setName(input.next());
		System.out.println("Enter a ID");
		sl[j].setID(input.next());
		System.out.println("Enter a data");
		sl[j].setData(input.next());
	}
	
	public void view() {
		for(int k = 0; k < i; k++) {
			if (!sl[k].getName().equals(null)) {
				System.out.println("Stock name is " + sl[k].getName());
				System.out.println("Stock ID is " + sl[k].getID());
				System.out.println("Stock data is " + sl[k].getData());
			}
		}
	}

}
