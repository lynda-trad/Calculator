package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JButton buttonClear;
	
	private JButton buttons[];
	
	private Calculator calculator;
	private JLabel calculation;
	private JLabel resultLabel;
	
	public void buttonPressed(ActionEvent e)
	{
		if(e.getSource() == buttonClear)
		{
			this.calculator.clearCalculator();
		}
		
		if (e.getSource() == buttonEqual)
		{
			this.calculator.calculatingResult(this);
		}
		else if (e.getSource() == buttonPlus)
		{
			if(this.calculator.getOperator().length() == 0)
			{
				this.calculator.setOperator("+");
			}
			else
			{
				this.resultLabel.setText("\" " + this.calculator.getOperator() + " \"" + " was already chosen.");
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
				this.resultLabel.setText("\" " + this.calculator.getOperator() + " \"" + " was already chosen.");
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
				this.resultLabel.setText("\" " + this.calculator.getOperator() + " \"" + " was already chosen.");
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
				this.resultLabel.setText("\" " + this.calculator.getOperator() + " \"" + " was already chosen.");
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
		}
		this.calculation.setText(this.calculator.getFirstNumber() + " " + this.calculator.getOperator() + " " + this.calculator.getSecondNumber());
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
		
		this.buttonClear = new JButton ("CLEAR");
		
		this.buttons = new JButton[]
		{
				this.button1,
				this.button2,
				this.button3,
				this.buttonPlus,
				this.button4,
				this.button5,
				this.button6,
				this.buttonMinus,
				this.button7,
				this.button8,
				this.button9,
				this.buttonTimes,
				this.button0,
				this.buttonDivide,
				this.buttonEqual,
				this.buttonClear
		};
		
		for(int i = 0; i < this.buttons.length; i++)
		{
			this.buttons[i].addActionListener(listener);
			this.buttons[i].setBackground(Color.LIGHT_GRAY);
			this.buttons[i].setForeground(Color.BLACK);
		}
	}
	
	private void addButtonsToPanel(JPanel panel)
	{
		for(int i = 0; i < this.buttons.length; i++)
		{
			panel.add(this.buttons[i]);
		}
	}
	
	public void printResult(String result)
	{
		this.resultLabel.setText(result);
	}
	
	public MyJFrame(Calculator c)
	{
		this.calculator = c;
		this.setTitle("~ Calculator ~");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(0, 0);
		this.setLocationRelativeTo(null);
		this.setSize(200, 230);
		this.setResizable(false);
	
		MyListener listener = new MyListener(this);
		
		JPanel buttonsPanel = new JPanel();
		
		this.initButtons(listener);
		
		this.addButtonsToPanel(buttonsPanel);
		
		JPanel calculationPanel = new JPanel();
		this.calculation = new JLabel("Click on the buttons to start !", JLabel.CENTER);
		calculationPanel.add(calculation, BorderLayout.SOUTH);
		
		this.resultLabel = new JLabel(" ", JLabel.CENTER);
		this.resultLabel.setSize(100, 100);
		
		this.add(this.calculation, BorderLayout.PAGE_START);
		this.add(buttonsPanel, BorderLayout.CENTER);
		this.add(this.resultLabel, BorderLayout.PAGE_END);
		
		this.setVisible(true);
	}
}