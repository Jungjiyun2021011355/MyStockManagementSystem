import java.util.Scanner;
public class Love {
	public static void main(String[] args) {
		Scanner love = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		String object = love.next();
		
		System.out.println("사귄 날짜를 입력하시오");
		int days = love.nextInt();
		
		for (int i = 1; i < days; i++) {
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡ ", i);
			System.out.printf(object + "아 사랑해♡\n", i);
		}	
	}
}
