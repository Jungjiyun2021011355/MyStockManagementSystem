package week6H.W;
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
		int i = input.nextInt();
	    super.setName(null, i);
		super.setID(null, i);
		super.setData(null, i);
		System.out.println("정상적으로 삭제되었습니다");
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
		for(int i = 0; i < count; i++) {
			System.out.println("주식 이름: " + super.getName(i));
			System.out.println("주식 아이디: " + super.getID(i));
			System.out.println("주식 데이터: " + super.getData(i));
			System.out.println("-------------------------");
		}
		System.out.println("정상적으로 출력되었습니다");
	}
}