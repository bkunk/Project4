package project2;
/**
 * Concrete command for printing numberlist 3
 * @author bkunk
 *
 */
public class PrintNum implements Command{

	private NumberList list;
	private int current; 
	
	public PrintNum(NumberList list, int current) {
		this.list = list; 
		this.current = current; 
	}

	@Override
	public String execute() {
		String printString = ""; 
		if(list.isEmpty() == true) {
			printString += "List "+current+" is {}\n"; 
		}else {
			printString += "List "+current+" is {";
			printString += list.print(); 
			printString += "}\n";
		}	 
		return printString; 
	}
	
	public String toString() {
		String menu = ": Print List "+current;
		return menu; 
	}

}
