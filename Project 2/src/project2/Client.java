package project2;
/**
 * Gets our first 2 initial commands together and passes it to the invoker 
 * by adding commands to the invoker's list of commands
 * @author bkunk
 *
 */
public class Client {


	public static void main(String[] args) {

		ConsoleMenu consoleMenu = new ConsoleMenu();
		
		Adder adder = new Adder(); 

		AddStringList addStringList = new AddStringList(consoleMenu, adder); 
		AddNumberList addNumberList = new AddNumberList(consoleMenu, adder); 
		

		consoleMenu.add(addStringList);
		consoleMenu.add(addNumberList);

		consoleMenu.displayList(); 


	}

}
