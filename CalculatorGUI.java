package banking;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorGUI 
{
	static double num1,num2, result;
	static char operator;
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Calculator");
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JTextField display = new JTextField();
		display.setFont(new Font("Arial",Font.BOLD,24));
		display.setHorizontalAlignment(JTextField.RIGHT);
		frame.add(display, BorderLayout.NORTH);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		String[] buttons= {
				"7","8","9","/",
				"4","5","6","*",
				"1","2","3","-",
				"0","C","=","+"
		};
		for(String text : buttons)
		{
			JButton btn = new JButton(text);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					String value = text;
					if(value.matches("[0-9]"))
					{
						display.setText(display.getText()+value);
					}
					else if (value.matches("[+\\-*/]"))
					{
						num1= Double.parseDouble(display.getText());
						operator = value.charAt(0);
						display.setText("");
					}
					else if(value.equals("="))
					{
						num2 = Double.parseDouble(display.getText());
						switch(operator)
						{
						case '+':
							result = num1+num2;
							break;
						case '-':
							result= num1-num2;
							break;
						case '*':
							result= num1*num2;
							break;
						case '/':
							if(num2==0)
							{
								display.setText("Error");
								return;
							}
							result = num1/num2;
							break;
						}
						display.setText(String.valueOf(result));
					}
					else if(value.equals("C"))
					{
						display.setText("");
					}
				}
			});
			panel.add(btn);
		}
	}

}
