package project2;
/**
 * Concrete command for producing a new number list
 * @author bkunk
 *
 */
public class AddNumberList implements Command{

	private ConsoleMenu menu = new ConsoleMenu(); 
	
	private Adder adder = new Adder(); 

	public AddNumberList(ConsoleMenu menu, Adder adder) {
		this.menu = menu; 
		this.adder = adder; 
	}

	@Override
	public String execute() {
		
		int curListNum = adder.getListNum(); //getting current list number

		NumberList list = new NumberList();

		//adding number list commands into main command list inside invoker
		menu.add(new EnterNum(list, curListNum));
		menu.add(new PrintNum(list, curListNum));
		menu.add(new LargestNum(list, curListNum));
		menu.add(new ClearNum(list, curListNum));

		adder.setListNum(curListNum+1); //adding 1 to current list number

		return ""; //makes compiler happy
	}
	
	public String toString() {
		return ": Add Number List";
	}

}
