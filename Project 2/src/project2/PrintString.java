package project2;
/**
 * Concrete command for printing stringlist 
 * @author bkunk
 *
 */
public class PrintString implements Command{

	private StringList stringlist; 
	private int current;

	public PrintString(StringList list, int current) {
		this.stringlist = list; 
		this.current = current; 
	}

	@Override
	public String execute() {
		String printString = ""; 
		if(stringlist.isEmpty() == true) {
			printString += "List "+current+" is {}\n"; 
		}else {
			printString += "List "+current+" is {";
			printString += stringlist.print(); 
			printString += "}\n";
		}	 
		return printString; 
	}
	
	public String toString() {
		String menu = ": Print List "+current;
		return menu; 
	}


}
