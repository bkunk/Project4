package project2;
/**
 * Concrete command for entering into string list 
 * @author bkunk
 *
 */
import java.util.Scanner;

public class EnterString implements Command{

	private StringList list = new StringList();  
	private int current; 

	public Scanner input = new Scanner(System.in); 

	public EnterString(StringList list, int current) {
		this.list = list; 
		this.current = current; 
	}

	/**
	 * Enters words into list
	 */
	@Override
	public String execute() {
		System.out.println(); 
		System.out.println("Enter words into List "+current+" one at a time"); 
		System.out.println("Enter the word \"quit\" to stop"); 
		System.out.println(""); 

		int curNum = list.getCurNum(); //getting current num
		String word = "";    
		while(!word.equals("quit")) { 
			System.out.print("Enter word "+curNum+": ");  
			word = input.next(); 
			if(!word.equals("quit")) { //entering mode
				list.enter(word);  
				curNum++; //adding one to current word being input
				list.setCurName(curNum); //setting current word being input
			}
		} 
		System.out.println(); 
		return ""; //makes compiler happy
	}

	public String toString() {
		String menu = ": Enter words into List "+ current;
		return menu; 
	}

}

