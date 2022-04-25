package week5;
import java.util.Scanner;

public class Stock {
	String name = null;
	String ID = null;
	int n = 0;
	String data = null;
	
	Stock(){
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public String getName() {
		return name;
	}
	public String getID() {
		return ID;
	}
	public String getData() {
		return data;
	}
	public int getN() {
		return n;
	}
}
