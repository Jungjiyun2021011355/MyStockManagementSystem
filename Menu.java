package week7;
import java.util.Scanner;

public class Menu extends StockInformation implements Stock{
Scanner input = new Scanner(System.in);
int count;

	public void add(int count) {
		
		for(int i = 0; i < 100; i++) {
			
			System.out.print((i+1) + "��° �ֽ� �̸��� �Է��Ͻÿ�");
			String Name = input.nextLine();
			super.setName(Name, i);
			
			if(Name.equals(" ")) {
			    	break;
			}
			System.out.println((i+1)+ "��° �ֽ� ���̵� �Է��Ͻÿ�");
			String ID = input.nextLine();
			super.setID(ID, i);
			
			System.out.println((i+1) + "��° �ֽ� ������ �Է��Ͻÿ�");
			String Data = input.nextLine();
		    super.setData(Data, i);
		    
		    count++;
		    this.count = count;
		}
	    System.out.println("���������� ����Ǿ����ϴ�");
	}
	
	public void delete() {
		ViewConfinement vc = new ViewConfinement();
		
		try {
			vc.Count(count);
		}catch (Exception e) {
			System.out.println("����� ������ �����ϴ�.");
		}
		try { 
			int i = input.nextInt();
		
	    super.setName(null, i);
		super.setID(null, i);
		super.setData(null, i);
		System.out.println("���������� �����Ǿ����ϴ�");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��ü �ε��� ������ ū ������ ����");
			
		}
	}
	public void edit(String newName, String newID, String newData) {
		int i = input.nextInt();

		System.out.println("���� ������ �̸��� �Է��Ͻÿ�");
		newName = input.nextLine();
		super.setName(newName, i);
		
		System.out.println("���̵� �Է��Ͻÿ�");
		newID = input.nextLine();
		super.setID(newID, i);
		
		System.out.println("������ �Է��Ͻÿ�");
		newData = input.nextLine();
		super.setData(newData, i);
		
		System.out.println("���������� �����Ǿ����ϴ�");
	}
	public void view() {
	    ViewConfinement vc = new ViewConfinement();
		try {
			vc.Count(count);
		}catch (Exception e) {
			System.out.println("����� ������ �����ϴ�.");
		}
		for(int i = 0; i < count; i++) {
			System.out.println("�ֽ� �̸�: " + super.getName(i));
			System.out.println("�ֽ� ���̵�: " + super.getID(i));
			System.out.println("�ֽ� ������: " + super.getData(i));
			System.out.println("-------------------------");
		}
		System.out.println("���������� ��µǾ����ϴ�");
	}
}

class SetConfinement {
	public SetConfinement() {}
	public void Count(int num) throws Exception{
		if(num > 10) {
			throw new Exception();
		}
	}
}
class ViewConfinement{
	public ViewConfinement() {}
	public void Count(int num) throws Exception{
		if(num == 0) {
			throw new Exception();
		}
	}
}