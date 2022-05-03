package project2;
/**
 * Receiver for number lists
 * @author bkunk
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberList {
	
	private List<Number> list = new ArrayList<>(); 
	
	private int num; //current num for number entering
	
	public NumberList() {
		num = 1; 
	}
	
	/**
	 * Adds Number to list
	 * @param one
	 */
	public void enter(Number one) {
		list.add(one); 
	}
	
	/**
	 * Iteratively adds list elements to string
	 * @return string of list elements
	 */
	public String print() {
		String printString = ""; 
		for(int j = 0; j < list.size(); j++) {
			if(j  != list.size()-1)
				printString += list.get(j) + ", ";
			else
				printString += list.get(j);
		}
		return printString; 
	}
	
	/**
	 * Uses collections to find largest number in list
	 * @return largest number in list
	 */
	public Number largestNum() {
		return Collections.max(list, Comparator.comparing(Number::doubleValue));
	}
	
	/**
	 * Clears list
	 */
	public void clear() {
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
