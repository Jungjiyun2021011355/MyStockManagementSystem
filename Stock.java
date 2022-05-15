package week7;

public interface Stock {
	public abstract void add(int count);
	public abstract void delete();
	public abstract void edit(String newName, String newID, String newData);
	public abstract void view();

}
