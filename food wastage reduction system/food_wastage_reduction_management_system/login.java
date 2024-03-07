package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nametxf = new JLabel("name");
		nametxf.setFont(new Font("Tahoma", Font.BOLD, 14));
		nametxf.setBounds(53, 53, 109, 40);
		contentPane.add(nametxf);
		
		JLabel gendertxf = new JLabel("gender");
		gendertxf.setFont(new Font("Tahoma", Font.BOLD, 14));
		gendertxf.setBounds(53, 110, 109, 38);
		contentPane.add(gendertxf);
		
		JLabel passwordtxf = new JLabel("pasword");
		passwordtxf.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordtxf.setBounds(53, 159, 109, 36);
		contentPane.add(passwordtxf);
		
		JLabel confirmtxf = new JLabel("comfirm_password");
		confirmtxf.setFont(new Font("Tahoma", Font.BOLD, 14));
		confirmtxf.setBounds(37, 221, 163, 20);
		contentPane.add(confirmtxf);
		
		textField = new JTextField();
		textField.setBounds(259, 59, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(259, 110, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(259, 159, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(259, 209, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton= new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login ad = new login();
				if(e.getSource()==btnNewButton) {
					ad.main(new String[0]);
				
				}	
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(49, 349, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(266, 349, 89, 23);
		contentPane.add(btnNewButton_1);
	}
			
			}
