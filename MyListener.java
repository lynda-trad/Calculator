package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener
{
	private MyJFrame frame;
		
	public MyListener(MyJFrame f)
	{
		this.frame = f;
	}
		
	@Override
	public void actionPerformed(ActionEvent e)
	{
			this.frame.buttonPressed(e);
	}
}