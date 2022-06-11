import java.util.*;

public class MyStockManagementSystem2 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		String[] StockName = new String[100];
		String[] StockID = new String[100];
		String Name = null;
		String ID = null;
		
		while (num != 6) {
			System.out.println("*** Stock managementSystem Menu ***");
			System.out.println("1. open my stock list: ");
			System.out.println("2. Add my stocks: ");
			System.out.println("3. view my stocks: ");
			System.out.println("4. delete my stocks: ");
			System.out.println("5. edit my stock list: ");
			System.out.println("6. exit");
			System.out.print("Select one number between 1-6: ");
			
			num = input.nextInt();
			input.nextLine();

			int i;
			
			switch(num) {
			case 1:
				System.out.print("welcome to visit my stock list");
				break;
			case 2:
				System.out.print("i = ");
				i = input.nextInt();
				input.nextLine();
				
				System.out.print("Add StockInformation: Name ");
			    Name = input.nextLine();
			    StockName[i] = Name;
			    
				System.out.print("Add StockInformation: ID ");
				ID = input.nextLine();
				StockID[i] = ID;
				
				System.out.println("Adding Stock is finished ");
				break;
			case 3:
				System.out.println("View StockInformation: list number");
				for(int j = 0; j < 100; j++) {
					if(StockName[j] == null) {
						continue;
					}
					else {
						System.out.println("Stock name is "+ StockName[j] +" \nStock ID is "+ StockID[j]);
					}
				}
				break;
			case 4:
				System.out.println("Delete StockName: ");
				Name = input.next();
				System.out.println("Delete StockID: ");
				ID = input.next();
				for(int k = 0; k < 100; k++) {
					if (Name.equals(StockName[k]) && ID.equals(StockID[k])) {
						StockName[k] = null;
						StockID[k] = null;
					    System.out.println("This stock is deleted");
					    break;
					}
					else {
						System.out.println("Can't find stock to delete");
						break;
					}
				}
				break;
			case 5:
				System.out.print("enter a number to want editing");
				i = input.nextInt();
				System.out.printf("enter a change name: ");
				String newName = input.next();
				StockName[i] = newName;
				System.out.printf("enter a change ID");
				String newID = input.next();
				StockID[i] = newID;
				break;
			default:
				break;
			}
		}
	}
}