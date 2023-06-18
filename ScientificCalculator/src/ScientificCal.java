import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class ScientificCal {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCal window = new ScientificCal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 302, 317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+one.getText();
				textField.setText(number);
			}
		});
		one.setBounds(69, 165, 50, 32);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+two.getText();
				textField.setText(number);
			}
		});
		two.setBounds(122, 165, 50, 32);
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+three.getText();
				textField.setText(number);
			}
			
		});
		three.setBounds(176, 165, 50, 32);
		frame.getContentPane().add(three);
		
		JButton equal = new JButton("=");
		equal.setFont(new Font("Tahoma", Font.BOLD, 11));
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				second = Double.parseDouble(textField.getText());
				if(operation=="+") {
					result = first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result = first%second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		equal.setBounds(176, 200, 50, 32);
		frame.getContentPane().add(equal);
		
		JButton dout = new JButton(".");
		dout.setFont(new Font("Tahoma", Font.BOLD, 11));
		dout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+dout.getText();
				textField.setText(number);
			}
		});
		dout.setBounds(122, 200, 50, 32);
		frame.getContentPane().add(dout);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+zero.getText();
				textField.setText(number);
			}
		});
		zero.setBounds(69, 200, 50, 32);
		frame.getContentPane().add(zero);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+six.getText();
				textField.setText(number);
			}
		});
		six.setBounds(176, 127, 50, 32);
		frame.getContentPane().add(six);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+four.getText();
				textField.setText(number);
			}
		});
		four.setBounds(69, 127, 50, 32);
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+five.getText();
				textField.setText(number);
			}
		});
		five.setBounds(122, 127, 50, 32);
		frame.getContentPane().add(five);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+seven.getText();
				textField.setText(number);
			}
		});
		seven.setBounds(69, 92, 50, 32);
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+eight.getText();
				textField.setText(number);
			}
		});
		eight.setBounds(122, 92, 50, 32);
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+nine.getText();
				textField.setText(number);
			}
		});
		nine.setBounds(176, 92, 50, 32);
		frame.getContentPane().add(nine);
		
		JButton plus = new JButton("+");
		plus.setFont(new Font("Tahoma", Font.BOLD, 11));
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		plus.setBounds(227, 127, 50, 32);
		frame.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.setFont(new Font("Tahoma", Font.BOLD, 15));
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		minus.setBounds(227, 165, 50, 32);
		frame.getContentPane().add(minus);
		
		JButton multi = new JButton("*");
		multi.setFont(new Font("Tahoma", Font.BOLD, 11));
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		multi.setBounds(227, 200, 50, 32);
		frame.getContentPane().add(multi);
		
		JButton divide = new JButton("/");
		divide.setFont(new Font("Tahoma", Font.BOLD, 11));
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		divide.setBounds(227, 236, 50, 32);
		frame.getContentPane().add(divide);
		
		JButton cos = new JButton("cos");
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		cos.setFont(new Font("Tahoma", Font.BOLD, 11));
		cos.setBounds(10, 127, 55, 32);
		frame.getContentPane().add(cos);
		
		JButton tan = new JButton("tan");
		tan.setFont(new Font("Tahoma", Font.BOLD, 11));
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		tan.setBounds(10, 165, 55, 32);
		frame.getContentPane().add(tan);
		
		JButton sin = new JButton("sin");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		sin.setFont(new Font("Tahoma", Font.BOLD, 11));
		sin.setBounds(10, 92, 55, 32);
		frame.getContentPane().add(sin);
		
		JButton log = new JButton("log");
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		log.setFont(new Font("Tahoma", Font.BOLD, 11));
		log.setBounds(10, 200, 55, 32);
		frame.getContentPane().add(log);
		
		JButton sqrt = new JButton("\u221A");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		sqrt.setFont(new Font("Tahoma", Font.BOLD, 11));
		sqrt.setBounds(10, 236, 55, 32);
		frame.getContentPane().add(sqrt);
		
		JButton clear = new JButton("AC");
		clear.setFont(new Font("Tahoma", Font.BOLD, 11));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		clear.setBounds(122, 236, 105, 32);
		frame.getContentPane().add(clear);
		
		JButton module = new JButton("%");
		module.setFont(new Font("Tahoma", Font.BOLD, 11));
		module.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		module.setBounds(69, 236, 50, 32);
		frame.getContentPane().add(module);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(10, 22, 267, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setBounds(10, 0, 162, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JButton backspace = new JButton("\uF0E7");
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(textField.getText().length()>0) {
					StringBuilder str =  new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					
				}
			}
		});
		backspace.setBounds(227, 92, 50, 32);
		frame.getContentPane().add(backspace);
	}
}
