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

	public String getFirstNumber()
	{
		return this.firstNumber;
	}
	
	public String getSecondNumber()
	{
		return this.secondNumber;
	}
	
	public String getOperator()
	{
		return this.operator;
	}
	
	public void setOperator(String o)
	{
		this.operator = o;
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
	
	public void clearCalculator()
	{
		this.firstNumber = "";
		this.secondNumber = "";
		this.operator = "";
		this.inputDone = false;
	}
	
	public static void main(String []args) throws InterruptedException
	{
		Calculator c = new Calculator();
		JFrame frame = new MyJFrame(c);
		int result = 0;
		while(true)
		{
			while(!c.inputDone)
			{
				// wait for complete input
			}
			
			switch(c.operator)
			{
				case "+":
					result = Integer.parseInt(c.firstNumber) + Integer.parseInt(c.secondNumber);
					System.out.println(c.firstNumber + " + " + c.secondNumber + " = " + result);
					break;
				case "-":
					result = Integer.parseInt(c.firstNumber) - Integer.parseInt(c.secondNumber);
					System.out.println(c.firstNumber + " - " + c.secondNumber + " = " + result);
					break;
				case "*":
					result = Integer.parseInt(c.firstNumber) * Integer.parseInt(c.secondNumber);
					System.out.println(c.firstNumber + " * " + c.secondNumber + " = " + result);
					break;
				case "/":
					result = Integer.parseInt(c.firstNumber) / Integer.parseInt(c.secondNumber);
					System.out.println(c.firstNumber + " / " + c.secondNumber + " = " + result);
					break;
				default:
					System.exit(0);
			}
		}
	}
}