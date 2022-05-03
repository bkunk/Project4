package project2;
/**
 * Concrete command for clearing number list 3
 * @author bkunk
 *
 */
public class ClearNum implements Command{

	private NumberList list;
	private int current; 
	
	public ClearNum(NumberList list, int current) {
		this.list = list; 
		this.current = current; 
	}

	@Override
	public String execute() {
		String printString = ""; 
		if(list.isEmpty() == true) {
			printString += "List "+current+" is already empty.\n";
		}else {
			list.setCurName(1);
			printString += "List "+current+" is now empty"; 
			list.clear(); 
		}
		printString += "\n";   
		return printString; 
	}
	
	public String toString() {
		String menu = ": Clear List "+current;
		return menu; 
	}

}
