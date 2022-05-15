package week7;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ManagementSystem {
	public static void main(String[] args) {
		NumberConfinement nc = new NumberConfinement();
		
		Scanner input = new Scanner(System.in);
		
		Menu m = new Menu();		
		
		try {
			int num = input.nextInt();
			
			nc.numc(num);
			
			while (num != 6) {
				System.out.println("*** Stock managementSystem Menu ***");
				System.out.println("1. open my stock list: ");
				System.out.println("2. Add my stocks: ");
				System.out.println("3. view my stocks: ");
			 	System.out.println("4. delete my stocks: ");
				System.out.println("5. edit my stock list: ");
				System.out.println("6. exit");
				System.out.print("Select one number between 1-6: ");
				
				try {
					int i = input.nextInt();
					nc.numc(i);
		
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
				}catch (InputMismatchException e) {
					System.out.println("숫자를 입력해주세요");
					break;
				}catch (Exception e) {
					System.out.println("1부터 6사이의 정수를 입력해주세요");
					break;
				}
			}
		}catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");	
		}catch (Exception e) {
			System.out.println("1부터 6사이의 정수를 입력해주세요");
		}
	}
}
class NumberConfinement{
	public NumberConfinement(){}
	public void numc(int num) throws Exception{
		if(num < 7 && num > 0) {
		}
		else {
			throw new Exception();
		}
	}	
}      