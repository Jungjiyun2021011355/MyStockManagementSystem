package week6H.W;
import java.util.Scanner;
public class ManagementSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Menu m = new Menu();		
		
		int num = input.nextInt();
		
		
		while (num != 6) {
			System.out.println("*** Stock managementSystem Menu ***");
			System.out.println("1. open my stock list: ");
			System.out.println("2. Add my stocks: ");
			System.out.println("3. view my stocks: ");
		 	System.out.println("4. delete my stocks: ");
			System.out.println("5. edit my stock list: ");
			System.out.println("6. exit");
			System.out.print("Select one number between 1-6: ");
			
			int i = input.nextInt();
			
			switch(i) {
			
			case 1:
			    System.out.println("Welcome to visit");
			    break;
			case 2: 
				m.add(0);
				break;
			case 3: 
				m.delete();
				break;
			case 4: 
				m.edit(null, null, null);
				break;
			case 5: 
				m.view();
				break;
			default:
				break;
			}
		}
			
	}
}         