package week5;
import java.util.Scanner;

public class MyStockManagementSystem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;

        StockSimulator ss = new StockSimulator();
		
		num = input.nextInt();
		input.nextLine();
		
		while (num != 6) {
			System.out.println("*** Stock managementSystem Menu ***");
			System.out.println("1. open my stock list: ");
			System.out.println("2. Add my stocks: ");
			System.out.println("3. view my stocks: ");
			System.out.println("4. delete my stocks: ");
			System.out.println("5. edit my stock list: ");
			System.out.println("6. exit");
			System.out.print("Select one number between 1-6: ");

			switch(num) {
			case 1:
				System.out.print("welcome to visit my stock list");
				break;
			case 2:
			    ss.Add();
				break;
			case 3:
				ss.view();
				break;
			case 4:
				ss.delete();
				break;
			case 5:
				ss.edit();
				break;
			default:
				break;
			}
		}
	}
}