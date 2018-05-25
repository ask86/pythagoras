package PART1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class pythaGorus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pythaGorus frame = new pythaGorus();
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
	public pythaGorus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 274, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField sideA = new JTextField();
		sideA.setBounds(66, 11, 182, 20);
		contentPane.add(sideA);
		sideA.setColumns(10);
		
		JTextField sideB = new JTextField();
		sideB.setBounds(66, 42, 182, 20);
		contentPane.add(sideB);
		sideB.setColumns(10);
		
		JTextField sideC = new JTextField();
		sideC.setBounds(66, 73, 182, 20);
		contentPane.add(sideC);
		sideC.setColumns(10);
		sideC.setEditable(false);
		
		JLabel lblSideA = new JLabel("Side A");
		lblSideA.setBounds(10, 14, 46, 14);
		contentPane.add(lblSideA);
		
		JLabel lblSideB = new JLabel("Side B");
		lblSideB.setBounds(10, 45, 46, 14);
		contentPane.add(lblSideB);
		
		JLabel lblSideC = new JLabel("Side C");
		lblSideC.setBounds(10, 76, 46, 14);
		contentPane.add(lblSideC);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(e -> {
			double a;
			double b;
			double c;
			try{
				
				//performing calculate action
				
				if(sideA.getText().equals("")&&sideB.getText().equals(""))
				{  	
					
					JOptionPane.showMessageDialog(null, "Please enter values of Sides","ERROR", JOptionPane.ERROR_MESSAGE, null);
					
				}
				else if(sideA.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter value of Side A","ERROR", JOptionPane.ERROR_MESSAGE, null);
				}
				else if(sideB.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter value of Side B","ERROR", JOptionPane.ERROR_MESSAGE, null);
				}
				else{
					a= Double.parseDouble(sideA.getText());   //value of side A
					b= Double.parseDouble(sideB.getText());		//value of side B
					double j= java.lang.Math.pow(a,2.00);
					double l= java.lang.Math.pow(b,2.00);
					c=java.lang.Math.sqrt((j+l));				//calculate side C
					sideC.setText(Double.toString(c));			// display side C
				
				}
				
			}
			catch(Exception e1)
			{
				//error message for datatype of input sides
				JOptionPane.showMessageDialog(null, "Please enter correct value of Sides","ERROR",JOptionPane.ERROR_MESSAGE, null);
			}
			
			
			
		});
		btnCalculate.setBounds(35, 104, 89, 23);
		contentPane.add(btnCalculate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(e-> {
				pythaGorus.this.processWindowEvent(
                        new WindowEvent(
                                pythaGorus.this, WindowEvent.WINDOW_CLOSING));
			}
		);
		btnExit.setBounds(138, 104, 89, 23);
		contentPane.add(btnExit);
	}
}
