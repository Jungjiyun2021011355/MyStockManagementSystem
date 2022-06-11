package manager;
import java.io.Serializable;
import java.util.*;

import manager.*;
public class StockManager implements Serializable {

	private static final long serialVersionUID = 7697204917960877385L;
	
	transient Scanner input;
	ArrayList<StockInput> stocks = new ArrayList<>();

	StockManager(Scanner input){
		this.input = input;
	}
	public void setScanner(Scanner input) {
		this.input = input; 
	}
	
	public void addManager(StockInput stockInput) {
	    stocks.add(stockInput);
	}
	
	public void addManager() {
		for (int i = 0; i < stocks.size(); i++) {
			StockInput si= stocks.get(i);
			System.out.print("stock name?: ");
			si.setName(input.nextLine());
			input.nextLine();
			System.out.println();
			System.out.print("stock ID?: ");
			si.setID(input.nextLine());
			input.nextLine();
			System.out.println();
			System.out.print("stock Data?: ");
			si.setData(input.nextLine());
			input.nextLine();
			System.out.println();
			this.stocks.add(si);
		}
		
	}
	public void deleteManager() {
		try {
			System.out.println("Enter a stockName to delete");
			String stockID = input.next();
			int index = findIndex(stockID);
			removefromStocks(index, stockID);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("10이하의 정수로 다시 입력하세요");
		}
	}
	
	public int findIndex(String stockID) {
		int index = -1;
		for (int i = 0; i < stocks.size(); i++) {
			if (stocks.get(i).getID() == stockID) {
				index = i;
				break;
			}
		}
		return index;
	}
	public void editManager() {
		try {
			System.out.println("Enter an index to edit: ");
			int i = input.nextInt();
			StockInput si = stocks.get(i);
			input.nextLine();
			System.out.print("What is stock name?: ");
			si.setName(input.nextLine());
			input.nextLine();
			System.out.println();
			System.out.print("What is stock ID?: ");
			si.setID(input.nextLine());
			input.nextLine();
			System.out.println();
			System.out.print("What is stock Data?: ");
			si.setData(input.nextLine());
			input.nextLine();
			System.out.println();
			this.stocks.add(i, si);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("10이하의 정수로 다시 입력하세요");
	    }
	}
	
	
	public int removefromStocks(int index, String stockID) {
		if (index >= 0) {
			stocks.remove(index);
			System.out.println("the stock" + stockID + "is deleted");
			return 1;
		}
		else {
			System.out.println("the stock has not been registered");
			return -1;
		}
	}
	
	
	
	public void viewManager() {
		for(int i =0; i < stocks.size(); i++) {
			stocks.get(i).printInfo();
		}
	}
	public int size() {
		return stocks.size();
	}
	public StockInput get(int index) {
		return (Stock) stocks.get(index);
	}
}