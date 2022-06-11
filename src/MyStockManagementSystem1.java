import java.util.Scanner;
public class MyStockManagementSystem1 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (num != 6) {
			num = input.nextInt();
			input.nextLine();
			
			System.out.println("*** Stock managementSystem Menu ***");
			System.out.println("1. open my stocky list: ");
			System.out.println("2. view my stock: ");
			System.out.println("3. show my stock fluctuation rate: ");
			System.out.println("4. show my stock deposit: ");
			System.out.println("5. close my stock list: ");
			System.out.println("6. exit");
			System.out.println("Select one number between 1-6: ");

			switch(num) {
			case 1:
				System.out.print("welcome to visit my stock list");
				break;
			case 2:
				System.out.println("StockName: kai");
				System.out.print("StockId: 047810");
				break;
			case 3:
				System.out.println("StockName: ");
				String stockName = input.next();
				System.out.println("StockId: ");
				int stockId = input.nextInt();
				float fluctuationrate = (float)13.22;
				System.out.printf("The fluctuation of stock is %f percentage", fluctuationrate);
				break;
			case 4:
			    double deposit = 4000000+200000*(1.1321);
				System.out.printf("stock deposit: %f", deposit);
				break;
			case 5:
				System.out.print("Thanks you for using");
				break;
			default:
				break;
			}
		}
	}

}
