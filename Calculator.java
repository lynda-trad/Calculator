package calculator;

import javax.swing.JFrame;

public class Calculator
{
	private String firstNumber;
	private String secondNumber;
	
	private String opperand;
	
	private boolean inputDone;
	
	public Calculator()
	{
		this.firstNumber = "";
		this.secondNumber = "";
		this.opperand = "";
		this.inputDone = false;
	}
	
	public String getOperrand()
	{
		return this.opperand;
	}
	
	public void concatFirstNumber(String n)
	{
		this.firstNumber = this.firstNumber.concat(n);
	}

	public void concatSecondNumber(String n)
	{
		this.secondNumber = this.secondNumber.concat(n);
	}
	
	public void inputDoneToTrue()
	{
		this.inputDone = true;
	}
	
	public static void main(String []args) throws InterruptedException
	{
		Calculator c = new Calculator();
		JFrame frame = new MyJFrame(c);
		
		while(!c.inputDone)
		{
			// wait for input
		}
		// inputDone -> True bc = button was pressed
		// Do the calculation
	}
}