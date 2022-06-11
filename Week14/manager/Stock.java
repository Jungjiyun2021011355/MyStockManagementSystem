package manager;
import java.io.Serializable;
import java.util.Scanner;

public abstract class Stock implements StockInput, Serializable{
	
	
	
    private static final long serialVersionUID = 6840686466120215970L;

    String ID;
    String Data;
    String Name;

    Stock() {
    }
    public String getName() {
    	return Name;
    }
    public void setName(String Name) {
    	this.Name = Name;
    }
    public String getID() {
    	return ID;
    }
    public void setID(String ID) {
    	this.ID = ID;
    }
    public String getData() {
    	return Data;
    }
    public void setData(String Data) {
    	this.Data = Data;
    }
    
    public abstract void printInfo();
    
    public void setStockID(Scanner input) {
		System.out.print("Stock ID:");
		String id = input.next();
		this.setID(id);
	}
	
	public void setStockName(Scanner input) {
		System.out.print("Stock Name:");
		String name = input.next();
		this.setName(name);
	}
	
	public void setStockData(Scanner input) {
		System.out.print("Stock Data:");
		String data = input.next();
		this.setData(data);
	}
    public abstract Object getsubject();
}
