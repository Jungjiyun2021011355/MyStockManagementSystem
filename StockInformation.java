package week7;
import java.util.Scanner;
public abstract class StockInformation implements Stock {
	Scanner input = new Scanner(System.in);
	
	private String Name[] = new String[100];
	private String ID[] = new String[100];
	private String Data[] = new String[100];

	public void setName(String Name, int i) {
		this.Name[i] = Name;
	}
	public void setID(String ID, int i) {
		this.ID[i] = ID;
			
	}
	public void setData(String Data, int i) {
		this.Data[i] = Data;	
	}
	
	public String getName(int i) {
		return Name[i];
	}
	public String getID(int i) {
		return ID[i];
	}
	public String getData(int i) {
		return Data[i];
	}
}
