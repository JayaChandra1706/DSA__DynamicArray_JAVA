import java.util.Scanner;
public class ArrayApp {
	
	 public static void main(String args[]) {
			System.out.print("Enter the Length of Array:");
			Scanner scan=new Scanner(System.in);
			int len=scan.nextInt();
			System.out.println();
			Array a=new Array(len);
			  while(true) {	
				System.out.println();
				System.out.println("Enter 1 to Insert");
				System.out.println("Enter 2 to Delete");
				System.out.println("Enetr 3 to Display");
				System.out.println("Enter Any Number to Exit");
				System.out.println();
	            System.out.print("Enter your choice:");
				int choice=scan.nextInt();
				switch(choice) {
				case 1:
					a.insert();
					break;
				case 2:
					 a.delete();
					break;
				case 3:
					a.display();
					break;
				default:
					System.exit(0);
				}
			}
		}
	
}
