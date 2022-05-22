package week8;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Menu extends StockInformation implements Stock{

    int count;

	public void add(int count) {
		Scanner input = new Scanner(System.in);
		Date date = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    try {
	    	FileOutputStream file = new FileOutputStream("text.txt", true);
    	
		    file.write(format.format(date).getBytes());
	    	
	        file.close();
	    	
	    }catch(IOException e) {
	    	System.out.println(e.getMessage());
	    }
		try {
			FileWriter file = new FileWriter("text.txt", true);
			for(int i = 0; i < 100; i++) {
				file.write("\t add�Լ� ����: " + i);
				
				System.out.print((i+1) + "��° �ֽ� �̸��� �Է��Ͻÿ�");
				String Name = input.nextLine();
				super.setName(Name, i);
				file.write("\t �߰��� �̸�: " + Name);
				
				if(Name.equals(" ")) {
				    	break;
				}
				System.out.println((i+1)+ "��° �ֽ� ���̵� �Է��Ͻÿ�");
				String ID = input.nextLine();
				super.setID(ID, i);
				file.write("\t �߰��� ���̵�: " + ID);
				
				System.out.println((i+1) + "��° �ֽ� ������ �Է��Ͻÿ�");
				String Data = input.nextLine();
			    super.setData(Data, i);
				file.write("\t �߰��� ������: " + Data + "\n");
			    
			    count++;
			    this.count = count;
			}
			System.out.println("���������� ����Ǿ����ϴ�");
			
			file.close();
		}catch(IOException e) {
			System.out.print(e.getMessage());			
		}
		
		
	}
	
	public void delete() 
	{
		Scanner input = new Scanner(System.in);
		Date date = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    try {
	    	FileOutputStream file = new FileOutputStream("text.txt", true);
    	
		    file.write(format.format(date).getBytes());
	    	
	        file.close();
	    }catch(IOException e) {
	    	System.out.println(e.getMessage());
	    }
		try {
		    ViewConfinement vc = new ViewConfinement();

			vc.Count(count);
		}catch(Exception e) {
			System.out.println("����� ������ �����ϴ�.");
		}
		try {
			
			FileWriter file = new FileWriter("text.txt", true);
			try {
				int i = input.nextInt();
				file.write("\t Delete�Լ� ����: " + i);
				
			    super.setName(null, i);
			    file.write("\t ������ �̸�: " + null);
				super.setID(null, i);
				file.write("\t ������ ���̵�: " + null);
				super.setData(null, i);
				file.write("\t ������ ������: " + null + "\n");
				System.out.println("���������� �����Ǿ����ϴ�");
		    }catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("��ü �ε��� ������ ū ������ ����");
			}
			file.close();
		}catch(IOException e) {
			System.out.print(e.getMessage());
		}	

	}
	public void edit(String newName, String newID, String newData) {
		
		Date date = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    try {
	    	FileOutputStream file = new FileOutputStream("text.txt", true);
    	
		    file.write(format.format(date).getBytes());
	    	
	        file.close();
	    	
	    }catch(IOException e) {
	    	System.out.println(e.getMessage());
	    }
	    try {
			FileWriter file = new FileWriter("text.txt", true);
			int i = input.nextInt();
			
			file.write("\t edit�Լ� ����: " + i);

			System.out.println("���� ������ �̸��� �Է��Ͻÿ�");
			newName = input.nextLine();
			super.setName(newName, i);
			file.write("\t ���� �߰��� �̸�: " + newName);
			
			System.out.println("���̵� �Է��Ͻÿ�");
			newID = input.nextLine();
			super.setID(newID, i);
			file.write("\t ���� �߰��� ���̵�: " + newID);
			
			System.out.println("������ �Է��Ͻÿ�");
			newData = input.nextLine();
			super.setData(newData, i);
			file.write("\t ���� �߰��� ������: " + newData + "\n");
			
			System.out.println("���������� �����Ǿ����ϴ�");
			file.close();

	    }catch(IOException e) {
	    	System.out.print(e.getMessage());
	    }
		
	}
	public void view() {
		Date date = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    try {
	    	FileOutputStream file = new FileOutputStream("text.txt", true);
    	
		    file.write(format.format(date).getBytes());
	    	
	        file.close();
	    }catch(IOException e) {
	        System.out.println(e.getMessage());	
	    }	
		try {
			FileWriter file = new FileWriter("text.txt", true);
			try {
			
			    ViewConfinement vc = new ViewConfinement();

				vc.Count(count);
				for(int i = 0; i < count; i++) {
					file.write("\t view�Լ� ����: " + i);
					System.out.println("�ֽ� �̸�: " + super.getName(i));
					file.write("\t ����� �ֽ��̸�: " + super.getName(i));
					
					System.out.println("�ֽ� ���̵�: " + super.getID(i));
					file.write("\t ����� �ֽľ��̵�: " + super.getID(i));
					
					System.out.println("�ֽ� ������: " + super.getData(i));
					file.write("\t ����� �ֽĵ�����: " + super.getData(i) + "\n");

					System.out.println("-------------------------");
				}
			}catch (Exception e) {
				System.out.println("����� ������ �����ϴ�.");
			}
			System.out.println("���������� ��µǾ����ϴ�");
		    file.close();
		}catch(IOException e) {
			System.out.print(e.getMessage());
		}

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