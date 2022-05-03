package project2;
/**
 * Receiver for string lists
 * @author bkunk
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {

	private List<String> list = new ArrayList<>(); 

	private int num; 
	
	public StringList() {
		num = 1; 
	}

	/**
	 * Adds string to list
	 * @param word
	 */
	public void enter(String word){
		list.add(word); 
	}

	/**
	 * Iteratively adds list elements to string
	 * @return string of elements
	 */
	public String print(){
		String printString = ""; 
		for(int j = 0; j < list.size(); j++) {
			if(j != list.size()-1)
				printString += list.get(j) + ", ";
			else
				printString += list.get(j);
		}
		return printString; 
	}

	/**
	 * Uses collections to sort list of strings
	 */
	public void sort(){
		Collections.sort(list);
	}

	/**
	 * Clears list
	 */
	public void clear(){
		list.clear();
	}

	/**
	 * Checks to see if list is currently empty 
	 * @return
	 */
	public boolean isEmpty() {
		if(list == null || list.isEmpty()) {
			return true;
		}else {
			return false; 
		}
	}

	/**
	 * Setter for enter() iteration num
	 * @param num
	 */
	public void setCurName(int num) {
		this.num = num; 
	}

	/**
	 * Getter for enter() iteration num
	 * @return
	 */
	public int getCurNum() {
		return num; 
	}


}
