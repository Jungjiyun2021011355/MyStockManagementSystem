package week8;
import java.util.*;  
import java.text.SimpleDateFormat;
import java.io.*;
public class ManagementSystem {
	public static void main(String[] args) {
		NumberConfinement nc = new NumberConfinement();
		Scanner input = new Scanner(System.in);
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Menu m = new Menu();
		
	    try {
	    	FileOutputStream timefile = new FileOutputStream("logFile.txt", true);
    	
		    timefile.write(format.format(date).getBytes());
	    	
	        timefile.close();
	    	
	    }catch(IOException e) {
	    	System.out.println(e.getMessage());
	    }
	    try {
	    	FileWriter file = new FileWriter("logFile.txt", true);


			int num = input.nextInt();
			
			nc.numc(num);
		    
			while (num != 6) {
				System.out.println("*** Stock managementSystem Menu ***");
				System.out.println("1. open my stock list: ");
				System.out.println("2. Add my stocks: ");
			 	System.out.println("3. delete my stocks: ");
				System.out.println("4. edit my stock list: ");
				System.out.println("5. view my stocks: ");
				System.out.println("6. exit");
				System.out.print("Select one number between 1-6: ");
				
				try {
					int i = input.nextInt();
					
				    file.write("�޴� ��ȣ �Է�: " + i + "\n");

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
					case 6:
						break;
					}
					file.close();
					
				}catch (InputMismatchException e) {
					System.out.println("���ڸ� �Է����ּ���");
					break;
				}catch (Exception e) {
					System.out.println("1���� 6������ ������ �Է����ּ���");
					break;
			    }
			}
		}catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է����ּ���");	
		}catch (Exception e) {
			System.out.println("1���� 6������ ������ �Է����ּ���");
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