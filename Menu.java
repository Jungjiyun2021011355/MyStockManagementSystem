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
				file.write("\t add함수 실행: " + i);
				
				System.out.print((i+1) + "번째 주식 이름을 입력하시오");
				String Name = input.nextLine();
				super.setName(Name, i);
				file.write("\t 추가한 이름: " + Name);
				
				if(Name.equals(" ")) {
				    	break;
				}
				System.out.println((i+1)+ "번째 주식 아이디를 입력하시오");
				String ID = input.nextLine();
				super.setID(ID, i);
				file.write("\t 추가한 아이디: " + ID);
				
				System.out.println((i+1) + "번째 주식 정보를 입력하시오");
				String Data = input.nextLine();
			    super.setData(Data, i);
				file.write("\t 추가한 데이터: " + Data + "\n");
			    
			    count++;
			    this.count = count;
			}
			System.out.println("정상적으로 저장되었습니다");
			
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
			System.out.println("저장된 정보가 없습니다.");
		}
		try {
			
			FileWriter file = new FileWriter("text.txt", true);
			try {
				int i = input.nextInt();
				file.write("\t Delete함수 실행: " + i);
				
			    super.setName(null, i);
			    file.write("\t 제거한 이름: " + null);
				super.setID(null, i);
				file.write("\t 제거한 아이디: " + null);
				super.setData(null, i);
				file.write("\t 제거한 데이터: " + null + "\n");
				System.out.println("정상적으로 삭제되었습니다");
		    }catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("전체 인덱스 값보다 큰 값으로 접근");
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
			
			file.write("\t edit함수 실행: " + i);

			System.out.println("새로 저장할 이름을 입력하시오");
			newName = input.nextLine();
			super.setName(newName, i);
			file.write("\t 새로 추가한 이름: " + newName);
			
			System.out.println("아이디를 입력하시오");
			newID = input.nextLine();
			super.setID(newID, i);
			file.write("\t 새로 추가한 아이디: " + newID);
			
			System.out.println("정보를 입력하시오");
			newData = input.nextLine();
			super.setData(newData, i);
			file.write("\t 새로 추가한 데이터: " + newData + "\n");
			
			System.out.println("정상적으로 편집되었습니다");
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
					file.write("\t view함수 실행: " + i);
					System.out.println("주식 이름: " + super.getName(i));
					file.write("\t 출력한 주식이름: " + super.getName(i));
					
					System.out.println("주식 아이디: " + super.getID(i));
					file.write("\t 출력한 주식아이디: " + super.getID(i));
					
					System.out.println("주식 데이터: " + super.getData(i));
					file.write("\t 출력한 주식데이터: " + super.getData(i) + "\n");

					System.out.println("-------------------------");
				}
			}catch (Exception e) {
				System.out.println("저장된 정보가 없습니다.");
			}
			System.out.println("정상적으로 출력되었습니다");
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