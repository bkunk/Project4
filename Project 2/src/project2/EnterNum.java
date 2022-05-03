package project2;
/**
 * Concrete command for entering into number list for list 1
 * @author bkunk
 *
 */
import java.util.Scanner;

public class EnterNum implements Command{

	private NumberList list = new NumberList();
	private int current; 

	public Scanner src = new Scanner(System.in);

	public EnterNum(NumberList list, int current) {
		this.list = list; 
		this.current = current; 
	}

	/**
	 * Enters numbers into list
	 */
	@Override
	public String execute() {
		System.out.println(); 
		System.out.println("Enter numbers into List "+current+" one at a time"); 
		System.out.println("Enter the word \"quit\" to stop"); 
		System.out.println(""); 

		int integ = 0;
		double doub = 0; 
		String str = ""; //needed for "quit" to exit enter mode

		int typeChecker = 0; //assigned to different types

		int curNum = list.getCurNum(); //getting current num

		while(!str.equals("quit")) {
			System.out.print("Enter number "+curNum+": ");  

			if (src.hasNextInt()) { //checks if int is being entered by user
				typeChecker = 2; 
				integ = src.nextInt();
			} else if (src.hasNextDouble()) { //checks if double is being entered by user
				typeChecker = 3; 
				doub = src.nextDouble();
			} else if(src.hasNext()){ //checks if "quit" or invalid number is being entered by user
				str = src.next();
				if(str.equals("quit"))
					typeChecker = 0;
				else
					typeChecker = 1; 
			}

			if(!str.equals("quit") && (typeChecker == 2 || typeChecker == 3)) {
				if(typeChecker == 2) {
					list.enter(integ);
				}else if(typeChecker == 3) {
					list.enter(doub);
				}
				curNum++; //adding one to current number being input
				list.setCurName(curNum); //setting current number being input

			} else if(typeChecker == 1){ //not a number
				System.out.println("Invalid Number."); 
			}
		}
		System.out.println();  
		return ""; //makes compiler happy
	}

	public String toString() {
		String menu = ": Enter numbers into List "+current;
		return menu; 
	}

}
