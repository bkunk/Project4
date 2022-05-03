package project2;
/**
 * Holds an int that counts which number list number is being displayed
 * @author bkunk
 *
 */
public class Adder {

	private int curListNum; //list numbers for all added lists
	
	public Adder() {
		curListNum = 1; 
	}
	
	/**
	 * Getter for current list number
	 * @return list curListNum
	 */
	public int getListNum() {
		return curListNum;
	}
	
	/**
	 * Setter for current list number 
	 * @param num
	 */
	public void setListNum(int num) {
		this.curListNum = num; 
	}

}
