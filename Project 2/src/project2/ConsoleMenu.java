package project2;
/**
 * Invoker, in charge of invoking concrete commands when user asks for certain command
 * @author bkunk
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {

	public Scanner input = new Scanner(System.in); 

	private List<Command> commandList; //dynamic list of commands

	public ConsoleMenu() {
		commandList = new ArrayList<>();
	}

	/**
	 * Displays list and executes command picked by user
	 */
	public void displayList() {

		int option = -1; 

		while(option != commandList.size()+1) {

			printMenu(); 
			option = input.nextInt(); 
			
			//executing command 
			if(option != commandList.size()+1 && (option > 0 && option < commandList.size()+1)) { //executing list of commands
				System.out.println(commandList.get(option-1).execute()); 
			}else if(option == commandList.size()+1) { //quit
				break;
			}else { //user input was not apart of menu options
				System.out.println("Please pick valid menu option.\n"); 
			}

		}

	}


	/**
	 * Adds command objects to arraylist
	 * @param command
	 */
	public void add(Command command) {
		commandList.add(command); 
	}

	/**
	 * Prints menu items using toString()
	 */
	public void printMenu() {
		System.out.println("String and Number List Menu");

		for(int i = 0; i < commandList.size(); i++) {
			if(i == 0) {
				System.out.println(1 + commandList.get(i).toString()); 
			}else {
				int num = i+1;
				System.out.println(num + commandList.get(i).toString()); 
			}

		}

		System.out.println(commandList.size()+1+": Quit");
		System.out.println("Please pick an option:");
	}





}
