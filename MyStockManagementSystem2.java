import java.util.*;
public class MyStockManagementSystem2 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (num != 6) {
			num = input.nextInt();
			input.nextLine();
			
			System.out.println("*** Stock managementSystem Menu ***");
			System.out.println("1. open my stocky list: ");
			System.out.println("2. Add my stocks: ");
			System.out.println("3. view my stocks: ");
			System.out.println("4. delete my stocks: ");
			System.out.println("5. edit my stock list: ");
			System.out.println("6. exit");
			System.out.println("Select one number between 1-6: ");

			int[] StockID = new int [100];
			String[] StockName = new String [100];
			int i;
			
			switch(num) {
			case 1:
				System.out.print("welcome to visit my stock list");
				break;
			case 2:
				i = 0;
				System.out.println("i = ");
				i = input.nextInt();
				
				System.out.println("Add StockInformation: Name");
			    
			    StockName [i] = input.next();
				System.out.println("Add StockInformation: ID");
				StockID [i] = input.nextInt();
				
				System.out.println("To add Stocks are finished ");
				break;
			case 3:
				System.out.println("View StockInformation: Name&ID");
				i = input.nextInt();
				System.out.println("view stock" + StockName[i] + StockID[i]);
				break;
			case 4:
				System.out.println("Delete StockName: ");
				String Name = input.next();
				System.out.println("Delete StockID: ");
				int ID = input.nextInt();
				for(int k = 0; k < 100; k++) {
					if (Name == StockName[k] && ID == StockID [k]) {
						StockName[k] = null;
						StockID [k] = (Integer)null;
					    System.out.println("This stock is deleted");
					    break;
					}
					else {
						System.out.println("Don't find to delete stock");
						break;
					}
				}
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