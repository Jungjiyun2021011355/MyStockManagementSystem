import java.util.Scanner;
public class MyStockManagementSystem {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (num != 6) {
			num = input.nextInt();
			input.nextLine();
			
			System.out.println("*** Stock managementSystem Menu ***");
			System.out.println("1. open my stocky list: ");
			System.out.println("2. Add my stock: ");
			System.out.println("3. view my stock: ");
			System.out.println("4. remove my stock: ");
			System.out.println("5. close my stock list: ");
			System.out.println("6. exit");
			System.out.println("Select one number between 1-6: ");

			switch(num) {
			case 1:
				System.out.print("welcome to visit my stock list");
				break;
			case 2:
				System.out.print("StockName: ");
				String stockName = input.next();
				System.out.print("StockId: ");
				int stockId = input.nextInt();
				String AddStock = stockName;
				System.out.printf("Add %s", AddStock);
				break;
			case 3:
				System.out.print("StockName: ");
				stockName = input.next();
				System.out.print("StockId: ");
				stockId = input.nextInt();
				String RemoveStock = stockName;
				System.out.printf("view %s", RemoveStock);
				break;
			case 4:
				System.out.print("StockName: ");
				stockName = input.next();
				System.out.print("StockId: ");
				stockId = input.nextInt();
				RemoveStock = stockName;
				System.out.printf("Remove %s", RemoveStock);
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
