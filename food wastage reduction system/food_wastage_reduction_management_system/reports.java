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

public class reports extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField reporttxf;
	private JTextField typetxf;
	private JTextField periodtxf;
	private JTextField genertxf;
	private JTextField datetxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reports frame = new reports();
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
	public reports() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 514);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("reports ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(287, 11, 119, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("report_id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 70, 118, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(50, 134, 107, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("period");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(50, 198, 107, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("generated_date");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(50, 262, 136, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(50, 316, 118, 37);
		contentPane.add(lblNewLabel_5);
		
		reporttxf = new JTextField();
		reporttxf.setBounds(287, 80, 119, 20);
		contentPane.add(reporttxf);
		reporttxf.setColumns(10);
		
		typetxf = new JTextField();
		typetxf.setBounds(287, 124, 119, 27);
		contentPane.add(typetxf);
		typetxf.setColumns(10);
		
		periodtxf = new JTextField();
		periodtxf.setBounds(287, 185, 119, 27);
		contentPane.add(periodtxf);
		periodtxf.setColumns(10);
		
		genertxf = new JTextField();
		genertxf.setBounds(287, 264, 119, 27);
		contentPane.add(genertxf);
		genertxf.setColumns(10);
		
		datetxf = new JTextField();
		datetxf.setBounds(287, 323, 124, 27);
		contentPane.add(datetxf);
		datetxf.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Food_wastage_reduction_management_system","root","");
			String sql="INSERT INTO reports VALUES(?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1,Integer.parseInt(reporttxf.getText()));
			st.setString(2,typetxf.getText());
			st.setString(3, periodtxf.getText());
			st.setString(4, genertxf.getText());
			st.setString(5, datetxf.getText());
			
			st.executeUpdate();
			JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
			
			st.close();
			con.close();
					
					
					
					
					
					
					
					
					
				} catch (Exception e2) {
					
				}
				
				
					
					
					
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(33, 405, 135, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reporttxf.setText(null);
				typetxf.setText(null);
				periodtxf.setText(null);
				genertxf.setText(null);
				datetxf.setText(null);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(299, 405, 107, 37);
		contentPane.add(btnNewButton_1);
	}

}
