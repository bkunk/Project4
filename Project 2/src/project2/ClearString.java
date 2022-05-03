package project2;
/**
 * Concrete command for clearing string list
 * @author bkunk
 *
 */
public class ClearString implements Command{

	private StringList stringlist;
	private int current; 
	
	public ClearString(StringList list, int current) {
		this.stringlist = list; 
		this.current = current; 
	}


	@Override
	public String execute() {
		String printString = ""; 
		if(stringlist.isEmpty() == true) {
			printString += "List "+current+" is already empty.\n";
		}else {
			stringlist.setCurName(1); 
			printString += "List "+current+" is now empty"; 
			stringlist.clear(); 
		}
		printString += "\n";   
		
		return printString; 
	}
	
	public String toString() {
		String menu = ": Clear List " +current;
		return menu; 
	}
	
}


