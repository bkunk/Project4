package project2;
/**
 * Concrete command for sorting stringlist 
 * @author bkunk
 *
 */
public class SortString implements Command{

	private StringList stringlist;
	private int current; 

	public SortString(StringList list, int current) {
		this.stringlist = list; 
		this.current = current; 
	}

	@Override
	public String execute() {
		String printString = "";
		if(stringlist.isEmpty()) {
			printString += "List "+current+" is empty.\n"; 
		}else{
			printString += "List "+current+" is now sorted.\n"; 
			stringlist.sort(); 
		}
		printString += "\n"; 
		return printString; 
	}
	
	public String toString() {
		String menu = ": Sort List";
		return menu; 
	}
	


}
