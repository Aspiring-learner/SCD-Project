package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNo2;
	private JTextField textNo1;
	private JLabel lblResult;
	JButton btnadd, btnsubtract;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to XYZ");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblNewLabel.setBounds(139, 36, 155, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblemail = new JLabel("Enter your email");
		lblemail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblemail.setBounds(28, 99, 122, 24);
		getContentPane().add(lblemail);
		
		JLabel lblpass = new JLabel("Enter your password");
		lblpass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblpass.setBounds(28, 150, 148, 24);
		getContentPane().add(lblpass);
		
		textField = new JTextField();
		textField.setBounds(222, 103, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(222, 154, 96, 20);
		getContentPane().add(textField_1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblsecondnum = new JLabel("Enter second number");
		lblsecondnum.setBounds(51, 124, 118, 14);
		contentPane.add(lblsecondnum);
		
		JLabel lblfirstnum_1 = new JLabel("Enter first number");
		lblfirstnum_1.setBounds(51, 67, 118, 14);
		contentPane.add(lblfirstnum_1);
		
		textNo2 = new JTextField();
		textNo2.setBounds(159, 121, 96, 20);
		contentPane.add(textNo2);
		textNo2.setColumns(10);
		
		textNo1 = new JTextField();
		textNo1.setColumns(10);
		textNo1.setBounds(159, 64, 96, 20);
		contentPane.add(textNo1);
		
		btnsubtract = new JButton("-");
		btnsubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnsubtract.setBounds(218, 182, 89, 23);
		contentPane.add(btnsubtract);
		
		btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			int no1=Integer.parseInt(textNo1.getText());
			int no2=Integer.parseInt(textNo2.getText());
			
			
			
			
			try
			{
				int result=no1+no2;

				String sumResult=String.valueOf(result);
				lblResult.setText("Ans : " + sumResult);
				
			}
			catch(ArithmeticException ex)
			{
				lblResult.setText(ex.getMessage());
			}
			
			
			
			
			}
		});
		btnadd.setBounds(99, 182, 89, 23);
		contentPane.add(btnadd);
		
		JLabel lblNewLabel = new JLabel("Calculator App");
		lblNewLabel.setBounds(171, 25, 136, 14);
		contentPane.add(lblNe'...................wLabel);
		
		lblResult = new JLabel("");
		lblResult.setBounds(174, 238, 49, 14);
		contentPane.add(lblResult);
	}

	protected int parseInt(String text) {
		// TODO Auto-generated method stub
		return 0;
	}
}
