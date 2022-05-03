package project2;
/**
 * Concrete command for creating a new string list
 * @author bkunk
 *
 */
public class AddStringList implements Command{
	
	private ConsoleMenu menu = new ConsoleMenu(); 
	
	private Adder adder = new Adder(); 

	public AddStringList(ConsoleMenu menu, Adder adder) {
		this.menu = menu; 
		this.adder = adder; 
	}

	@Override
	public String execute() {
		
		int counter = adder.getListNum(); //getting current list number

		StringList list = new StringList(); 

		//adding string list commands into main command list inside invoker
		menu.add(new EnterString(list, counter));
		menu.add(new PrintString(list, counter));
		menu.add(new SortString(list, counter));
		menu.add(new ClearString(list, counter));
		
		adder.setListNum(counter+1); //adding 1 to current list number

		return ""; //makes compiler happy
	}
	
	public String toString() {
		return ": Add String List";
	}

}
