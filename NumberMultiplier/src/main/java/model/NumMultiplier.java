package model;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Sep 23, 2021
 */
public class NumMultiplier {
	private int numOne;
	private int numTwo;
	private int finalResult;
	
	public NumMultiplier() {
		super();
	}
	//ask user to input both numbers 
	public NumMultiplier(int numOne, int numTwo) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		
		this.finalResult = numOne * numTwo;
	}
	
	public void setResult(int numOne, int numTwo) {
		
		
		this.finalResult = numOne * numTwo;
		
	}
	
	/**
	 * @return the numOne
	 */
	public int getNumOne() {
		return numOne;
	}
	/**
	 * @param numOne the numOne to set
	 */
	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}
	/**
	 * @return the numTwo
	 */
	public int getNumTwo() {
		return numTwo;
	}
	/**
	 * @param numTwo the numTwo to set
	 */
	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}
	/**
	 * @return the finalResult
	 */
	public int getFinalResult() {
		return finalResult;
	}
	/**
	 * @param finalResult the finalResult to set
	 */
	public void setFinalResult(int finalResult) {
		this.finalResult = finalResult;
	}
	@Override
	public String toString() {
		return "NumMultiplier [numOne=" + numOne + ", numTwo=" + numTwo + ", finalResult=" + finalResult + "]";
	}
}
