package manager;
import java.util.Scanner;
public interface StockInput {
	public String getID();
	
	public void setID(String id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getData();
	
	public void setData(String data);
	
	public void printInfo();
	
	public void setStockID(Scanner input);
	
	public void setStockName(Scanner input);
	
	public void setStockData(Scanner input);
}
