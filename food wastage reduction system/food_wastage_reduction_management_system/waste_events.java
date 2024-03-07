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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class waste_events extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField measuretxf;
	private JTextField nametxf;
	private JTextField targettxf;
	private JTextField target_foodtxf;
	private JTextField implementationtxf;
	private JTextField responsibletxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					waste_events frame = new waste_events();
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
	public waste_events() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(341, 32, 49, 0);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("measure_id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(44, 47, 108, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(44, 97, 108, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("target_location");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(44, 144, 108, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("target_food_cartegory");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(44, 175, 159, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("implementation_date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(44, 235, 169, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("responsible_person");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(44, 291, 187, 29);
		contentPane.add(lblNewLabel_6);
		
		measuretxf = new JTextField();
		measuretxf.setBounds(306, 50, 96, 20);
		contentPane.add(measuretxf);
		measuretxf.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("waste events_measures");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(136, 7, 290, 25);
		contentPane.add(lblNewLabel_7);
		
		nametxf = new JTextField();
		nametxf.setBounds(306, 97, 96, 20);
		contentPane.add(nametxf);
		nametxf.setColumns(10);
		
		targettxf = new JTextField();
		targettxf.setBounds(306, 147, 96, 20);
		contentPane.add(targettxf);
		targettxf.setColumns(10);
		
		target_foodtxf = new JTextField();
		target_foodtxf.setBounds(306, 196, 96, 20);
		contentPane.add(target_foodtxf);
		target_foodtxf.setColumns(10);
		
		implementationtxf = new JTextField();
		implementationtxf.setBounds(306, 235, 96, 20);
		contentPane.add(implementationtxf);
		implementationtxf.setColumns(10);
		
		responsibletxf = new JTextField();
		responsibletxf.setBounds(306, 291, 96, 20);
		contentPane.add(responsibletxf);
		responsibletxf.setColumns(10);
		JButton wastetxf = new JButton("submit");
		wastetxf.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 try {
						Class.forName("com.mysql.cj.jdbc.Driver");

						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Food_wastage_reduction_management_system","root","");
				String sql="INSERT INTO waste_events VALUES(?,?,?,?,?,?)";
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1, Integer.parseInt(measuretxf.getText()));
				st.setString(2,nametxf.getText());
				st.setString(3, targettxf.getText());
				st.setString(4, target_foodtxf.getText());
				st.setString(5, implementationtxf.getText());
				st.setString(6, responsibletxf.getText());
				
				
				st.executeUpdate();
				JOptionPane.showMessageDialog(wastetxf, "data saved!!");
				
				st.close();
				con.close();
						
						
						
						
						
						
						
						
						
					} catch (Exception e2) {
						
					}	

				
					
			}
		});
		wastetxf.setBackground(new Color(255, 255, 0));
		wastetxf.setFont(new Font("Tahoma", Font.BOLD, 18));
		wastetxf.setBounds(31, 398, 145, 34);
		contentPane.add(wastetxf);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {measuretxf.setText(null);
			nametxf.setText(null);
			targettxf.setText(null);
			target_foodtxf.setText(null);
			implementationtxf.setText(null);
			responsibletxf.setText(null);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(306, 386, 120, 45);
		contentPane.add(btnNewButton_1);
	}

}
