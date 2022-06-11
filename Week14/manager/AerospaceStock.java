package manager;
import java.util.Scanner;
import manager.Stock;
import manager.StockInput;

public class AerospaceStock extends Stock {
	public AerospaceStock() {
	}
	
	public void getUserInput(Scanner input) {
		setStockID(input);
		setStockName(input);
		setStockData(input);
	}
	
	public void printInfo() {
		System.out.println("Stock name:" + Name + ", id: " + ID + ", Data:" + Data);
	}

	@Override
	public Object getsubject() {
		// TODO Auto-generated method stub
		return null;
	}


}
