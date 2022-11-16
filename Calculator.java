package calculator;

import javax.swing.JFrame;

public class Calculator
{
	private String firstNumber;
	private String secondNumber;
	
	private String operator;
	
	public Calculator()
	{
		this.firstNumber = "";
		this.secondNumber = "";
		this.operator = "";
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
		
	public void clearCalculator()
	{
		this.firstNumber = "";
		this.secondNumber = "";
		this.operator = "";
	}
	
	public void calculatingResult(MyJFrame frame)
	{
		int result = 0;
		switch(this.operator)
		{
			case "+":
				result = Integer.parseInt(this.firstNumber) + Integer.parseInt(this.secondNumber);
				break;
			case "-":
				result = Integer.parseInt(this.firstNumber) - Integer.parseInt(this.secondNumber);
				break;
			case "*":
				result = Integer.parseInt(this.firstNumber) * Integer.parseInt(this.secondNumber);
				break;
			case "/":
				result = Integer.parseInt(this.firstNumber) / Integer.parseInt(this.secondNumber);
				break;
			default:
				break;
		}
		frame.printResult(Integer.toString(result));
	}
	
	public static void main(String []args) throws InterruptedException
	{
		Calculator c = new Calculator();
		MyJFrame frame = new MyJFrame(c);
		int result = 0;
		int count = 0;
		while(true){}
	}
}