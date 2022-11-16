package calculator;

import javax.swing.JFrame;

public class Calculator
{
	private String firstNumber;
	private String secondNumber;
	
	private String operator;
	
	private boolean inputDone;
	
	public Calculator()
	{
		this.firstNumber = "";
		this.secondNumber = "";
		this.operator = "";
		this.inputDone = false;
	}

	public void setOperator(String o)
	{
		this.operator = o;
	}
	
	public String getOperator()
	{
		return this.operator;
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
		System.out.println(this.firstNumber + " " + this.operator + " " + this.secondNumber);
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
		
		switch(c.operator)
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