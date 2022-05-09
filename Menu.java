package week6H.W;

public abstract class Menu implements Stock {
	private String Name;
	private String ID;
	private String Data;
	
	Menu() {
	}
	
	public void setName(String Name) {
			this.Name = Name;
	}
	public void setID(String ID) {
			this.ID = ID;
			
	}
	public void setData(String Data) {
			this.Data = Data;	
	}
	
	public String getName() {
		return Name;
	}
	public String getID() {
		return ID;
	}
	public String getData() {
		return Data;
	}
	public abstract void add();
	public abstract void delete();
	public abstract void edit(String newName, String newID, String newData);
	public abstract void view();
}