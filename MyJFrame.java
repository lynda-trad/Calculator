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
		if (e.getSource() == button1)
		{
			if(this.calculator.getOperrand().length() == 0)
			{
				// button1.setText("Clicked !");
				this.calculator.concatFirstNumber("1");
			}
			else
			{
				this.calculator.concatSecondNumber("1");
			}
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