package calculator;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame extends JFrame
{
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;

	private JButton buttonPlus;
	private JButton buttonMinus;
	private JButton buttonTimes;
	private JButton buttonDivide;
	private JButton buttonEqual;
	
	private Calculator calculator;
	
	public void buttonPressed(ActionEvent e)
	{
		if (e.getSource() == buttonEqual)
		{
			this.calculator.inputDoneToTrue();
		}
		else if (e.getSource() == buttonPlus)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.setOperator("+");
			}
			else
			{
				System.out.println("You already chose " + this.calculator.getOperator() + " as your operator.");
			}
		}
		else if (e.getSource() == buttonMinus)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.setOperator("-");
			}
			else
			{
				System.out.println("You already chose " + this.calculator.getOperator() + " as your operator.");
			}
		}
		else if (e.getSource() == buttonTimes)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.setOperator("*");
			}
			else
			{
				System.out.println("You already chose " + this.calculator.getOperator() + " as your operator.");
			}
		}
		else if (e.getSource() == buttonDivide)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.setOperator("/");
			}
			else
			{
				System.out.println("You already chose " + this.calculator.getOperator() + " as your operator.");
			}
		}
		

		if (e.getSource() == button0)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("0");
			}
			else
			{
				this.calculator.concatSecondNumber("0");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button1)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("1");
			}
			else
			{
				this.calculator.concatSecondNumber("1");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button2)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("2");
			}
			else
			{
				this.calculator.concatSecondNumber("2");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button3)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("3");
			}
			else
			{
				this.calculator.concatSecondNumber("3");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button4)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("4");
			}
			else
			{
				this.calculator.concatSecondNumber("4");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button5)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("5");
			}
			else
			{
				this.calculator.concatSecondNumber("5");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button6)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("6");
			}
			else
			{
				this.calculator.concatSecondNumber("6");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button7)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("7");
			}
			else
			{
				this.calculator.concatSecondNumber("7");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button8)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("8");
			}
			else
			{
				this.calculator.concatSecondNumber("8");
			}
			this.calculator.printCalculation();
		}
		else if (e.getSource() == button9)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.concatFirstNumber("9");
			}
			else
			{
				this.calculator.concatSecondNumber("9");
			}
			this.calculator.printCalculation();
		}
	}
	
	private void initButtons(MyListener listener)
	{
		this.button0 = new JButton ("0");
		this.button1 = new JButton ("1");
		this.button2 = new JButton ("2");
		this.button3 = new JButton ("3");
		this.button4 = new JButton ("4");
		this.button5 = new JButton ("5");
		this.button6 = new JButton ("6");
		this.button7 = new JButton ("7");
		this.button8 = new JButton ("8");
		this.button9 = new JButton ("9");

		this.buttonPlus = new JButton ("+");
		this.buttonMinus = new JButton ("-");
		this.buttonTimes = new JButton ("*");
		this.buttonDivide = new JButton ("/");
		this.buttonEqual = new JButton ("=");
		
		button0.addActionListener(listener);
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
		button7.addActionListener(listener);
		button8.addActionListener(listener);
		button9.addActionListener(listener);
		
		buttonPlus.addActionListener(listener);
		buttonMinus.addActionListener(listener);
		buttonTimes.addActionListener(listener);
		buttonDivide.addActionListener(listener);
		buttonEqual.addActionListener(listener);
	}
	
	private void addButtonsToPanel(JPanel panel)
	{
		panel.add(button0);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
		panel.add(buttonPlus);
		panel.add(buttonMinus);
		panel.add(buttonTimes);
		panel.add(buttonDivide);
		panel.add(buttonEqual);
	}
	
	public MyJFrame(Calculator c)
	{
		this.calculator = c;
		this.setTitle("~ Calculator ~");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(0, 0);
		this.setLocationRelativeTo(null); /*centers the frame*/
		this.setSize(465, 485);
		this.setResizable(false);
	
		MyListener listener = new MyListener(this);
		
		JPanel panel= new JPanel();
		
		this.initButtons(listener);
		
		this.addButtonsToPanel(panel);
		
		this.add(panel);
		this.setVisible(true);
	}
}