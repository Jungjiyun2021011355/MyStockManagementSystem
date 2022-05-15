package week7;
import java.util.Scanner;

public class Menu extends StockInformation implements Stock{
Scanner input = new Scanner(System.in);
int count;

	public void add(int count) {
		
		for(int i = 0; i < 100; i++) {
			
			System.out.print((i+1) + "번째 주식 이름을 입력하시오");
			String Name = input.nextLine();
			super.setName(Name, i);
			
			if(Name.equals(" ")) {
			    	break;
			}
			System.out.println((i+1)+ "번째 주식 아이디를 입력하시오");
			String ID = input.nextLine();
			super.setID(ID, i);
			
			System.out.println((i+1) + "번째 주식 정보를 입력하시오");
			String Data = input.nextLine();
		    super.setData(Data, i);
		    
		    count++;
		    this.count = count;
		}
	    System.out.println("정상적으로 저장되었습니다");
	}
	
	public void delete() {
		ViewConfinement vc = new ViewConfinement();
		
		try {
			vc.Count(count);
		}catch (Exception e) {
			System.out.println("저장된 정보가 없습니다.");
		}
		try { 
			int i = input.nextInt();
		
	    super.setName(null, i);
		super.setID(null, i);
		super.setData(null, i);
		System.out.println("정상적으로 삭제되었습니다");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("전체 인덱스 값보다 큰 값으로 접근");
			
		}
	}
	public void edit(String newName, String newID, String newData) {
		int i = input.nextInt();

		System.out.println("새로 저장할 이름을 입력하시오");
		newName = input.nextLine();
		super.setName(newName, i);
		
		System.out.println("아이디를 입력하시오");
		newID = input.nextLine();
		super.setID(newID, i);
		
		System.out.println("정보를 입력하시오");
		newData = input.nextLine();
		super.setData(newData, i);
		
		System.out.println("정상적으로 편집되었습니다");
	}
	public void view() {
	    ViewConfinement vc = new ViewConfinement();
		try {
			vc.Count(count);
		}catch (Exception e) {
			System.out.println("저장된 정보가 없습니다.");
		}
		for(int i = 0; i < count; i++) {
			System.out.println("주식 이름: " + super.getName(i));
			System.out.println("주식 아이디: " + super.getID(i));
			System.out.println("주식 데이터: " + super.getData(i));
			System.out.println("-------------------------");
		}
		System.out.println("정상적으로 출력되었습니다");
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