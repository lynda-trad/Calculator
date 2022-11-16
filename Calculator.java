package calculator;

import javax.swing.JFrame;

public class Calculator
{
	private String firstNumber;
	private String secondNumber;
	
	private String operand;
	
	private boolean inputDone;
	
	public Calculator()
	{
		this.firstNumber = "";
		this.secondNumber = "";
		this.operand = "";
		this.inputDone = false;
	}

	public void setOperrand(String o)
	{
		this.operand = o;
	}
	
	public String getOperrand()
	{
		return this.operand;
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
	
	public void printCalculation()
	{
		System.out.println(this.firstNumber + " " + this.operand + " " + this.secondNumber);
	}
	
	public static void main(String []args) throws InterruptedException
	{
		Calculator c = new Calculator();
		JFrame frame = new MyJFrame(c);
		int result = 0;
		
		while(!c.inputDone)
		{
			// wait for input
		}
		
		switch(c.operand)
		{
			case "+":
				result = Integer.parseInt(c.firstNumber) + Integer.parseInt(c.secondNumber);
				System.out.println(c.firstNumber + " + " + c.secondNumber + " = " + result);
			case "-":
				result = Integer.parseInt(c.firstNumber) - Integer.parseInt(c.secondNumber);
				System.out.println(c.firstNumber + " - " + c.secondNumber + " = " + result);
			case "*":
				result = Integer.parseInt(c.firstNumber) * Integer.parseInt(c.secondNumber);
				System.out.println(c.firstNumber + " * " + c.secondNumber + " = " + result);
			case "/":
				result = Integer.parseInt(c.firstNumber) / Integer.parseInt(c.secondNumber);
				System.out.println(c.firstNumber + " / " + c.secondNumber + " = " + result);
			default:
				System.exit(0);
		}
		System.exit(0);
	}
}