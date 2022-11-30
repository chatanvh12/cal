import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JProgressBar;

public class calci {

	private JFrame frame;
	private JTextField txtMadeByChetan;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final JSeparator separator = new JSeparator();
	private JTextField txtMadeByChetan_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLUE);
		frame.setBounds(100, 100, 492, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtMadeByChetan = new JTextField();
		txtMadeByChetan.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtMadeByChetan.setBounds(16, 10, 438, 104);
		frame.getContentPane().add(txtMadeByChetan);
		txtMadeByChetan.setColumns(10);
		
		JButton Button11 = new JButton("%");
		Button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(txtMadeByChetan.getText());
				txtMadeByChetan.setText("");
				operation="%";
			}
		});
		Button11.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button11.setBounds(16, 134, 107, 80);
		frame.getContentPane().add(Button11);
		
		JButton Button31 = new JButton("4");
		Button31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button31.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button31.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button31.setBounds(16, 302, 107, 80);
		frame.getContentPane().add(Button31);
		
		JButton Button21 = new JButton("7");
		Button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button21.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button21.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button21.setBounds(16, 218, 107, 80);
		frame.getContentPane().add(Button21);
		
		JButton Button51 = new JButton("/");
		Button51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(txtMadeByChetan.getText());
				txtMadeByChetan.setText("");
				operation="/";
			}
		});
		Button51.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button51.setBounds(16, 469, 107, 80);
		frame.getContentPane().add(Button51);
		
		JButton Button41 = new JButton("1");
		Button41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				String number = txtMadeByChetan.getText()+Button41.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button41.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button41.setBounds(16, 386, 107, 80);
		frame.getContentPane().add(Button41);
		
		JButton Button12 = new JButton("CE");
		Button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMadeByChetan.setText(null);
			}
		});
		Button12.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button12.setBounds(127, 134, 107, 80);
		frame.getContentPane().add(Button12);
		
		JButton Button22 = new JButton("8");
		Button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button22.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button22.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button22.setBounds(127, 218, 107, 80);
		frame.getContentPane().add(Button22);
		
		JButton Button32 = new JButton("5");
		Button32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button32.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button32.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button32.setBounds(127, 302, 107, 80);
		frame.getContentPane().add(Button32);
		
		JButton Button42 = new JButton("2");
		Button42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button42.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button42.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button42.setBounds(127, 386, 107, 80);
		frame.getContentPane().add(Button42);
		
		JButton Button52 = new JButton("0");
		Button52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button52.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button52.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button52.setBounds(127, 469, 107, 80);
		frame.getContentPane().add(Button52);
		
		JButton Button13 = new JButton("C");
		Button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMadeByChetan.setText(null);
			}
		});
		Button13.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button13.setBounds(239, 134, 107, 80);
		frame.getContentPane().add(Button13);
		
		JButton Button23 = new JButton("9");
		Button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button23.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button23.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button23.setBounds(239, 218, 107, 80);
		frame.getContentPane().add(Button23);
		
		JButton Button33 = new JButton("6");
		Button33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button33.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button33.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button33.setBounds(239, 302, 107, 80);
		frame.getContentPane().add(Button33);
		
		JButton Button43 = new JButton("3");
		Button43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button43.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button43.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button43.setBounds(237, 386, 107, 80);
		frame.getContentPane().add(Button43);
		
		JButton Button53 = new JButton(".");
		Button53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtMadeByChetan.getText()+Button53.getText();
				txtMadeByChetan.setText(number);
			}
		});
		Button53.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button53.setBounds(239, 469, 107, 80);
		frame.getContentPane().add(Button53);
		
		JButton Button14 = new JButton("\uF0E7");
		Button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(txtMadeByChetan.getText().length()>0) {
					StringBuilder str=new StringBuilder(txtMadeByChetan.getText());
				    str.deleteCharAt(txtMadeByChetan.getText().length()-1);
				    backSpace=str.toString();
				    txtMadeByChetan.setText(backSpace);
				}
			}
		});
		Button14.setFont(new Font("windings", Font.BOLD, 17));
		Button14.setBounds(350, 134, 107, 80);
		frame.getContentPane().add(Button14);
		
		JButton Button24 = new JButton("+");
		Button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(txtMadeByChetan.getText());
				txtMadeByChetan.setText("");
				operation="+";
				
			}
		});
		Button24.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button24.setBounds(350, 218, 107, 80);
		frame.getContentPane().add(Button24);
		
		JButton Button34 = new JButton("*");
		Button34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(txtMadeByChetan.getText());
				txtMadeByChetan.setText("");
				operation="*";
			}
		});
		Button34.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button34.setBounds(350, 302, 107, 80);
		frame.getContentPane().add(Button34);
		
		JButton Button44 = new JButton("-");
		Button44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(txtMadeByChetan.getText());
				txtMadeByChetan.setText("");
				operation="-";
			}
		});
		Button44.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button44.setBounds(350, 386, 107, 80);
		frame.getContentPane().add(Button44);
		
		JButton Button54 = new JButton("=");
		Button54.setBackground(Color.ORANGE);
		Button54.setForeground(Color.BLACK);
		Button54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer = null;
				second=Double.parseDouble(txtMadeByChetan.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					txtMadeByChetan.setText(answer);
				}else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					txtMadeByChetan.setText(answer);
				}else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					txtMadeByChetan.setText(answer);
				}else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					txtMadeByChetan.setText(answer);
				}else if(operation=="/") {
					try {
					result=first/second;
					answer=String.format("%.2f", result);
					txtMadeByChetan.setText(answer);
					}finally
					{
						System.out.println("invalid");
					}
				}
				
			}
		});
		Button54.setFont(new Font("Tahoma", Font.BOLD, 17));
		Button54.setBounds(350, 469, 107, 80);
		frame.getContentPane().add(Button54);
		separator.setBounds(154, 496, 63, 36);
		frame.getContentPane().add(separator);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(107, 81, 146, 11);
		frame.getContentPane().add(progressBar);
		
		txtMadeByChetan_1 = new JTextField();
		txtMadeByChetan_1.setBackground(Color.ORANGE);
		txtMadeByChetan_1.setText("                                made by chetan");
		txtMadeByChetan_1.setBounds(109, 117, 279, 19);
		frame.getContentPane().add(txtMadeByChetan_1);
		txtMadeByChetan_1.setColumns(10);
	}
}
