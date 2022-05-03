package project2;
/**
 * Concrete command for finding largest number in numberlist 1
 * @author bkunk
 *
 */
public class LargestNum implements Command{

	private NumberList list;
	private int current; 
	
	public LargestNum(NumberList list, int current) {
		this.list = list; 
		this.current = current; 
	}

	@Override
	public String execute() {
		String printString = "";
		if(list.isEmpty() == true) {
			printString += "List "+current+" is empty.\n"; 
		}else{
			printString += "Biggest number in list "+current+" is " +list.largestNum()+ "\n";  
		}
		return printString; 
	}
	
	public String toString() {
		String menu = ": Return largest number in List "+current;
		return menu; 
	}

}
