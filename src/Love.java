import java.util.Scanner;
public class Love {
	public static void main(String[] args) {
		Scanner love = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		String object = love.next();
		
		System.out.println("��� ��¥�� �Է��Ͻÿ�");
		int days = love.nextInt();
		
		for (int i = 1; i < days; i++) {
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ� ", i);
			System.out.printf(object + "�� ����آ�\n", i);
		}	
	}
}
