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

public class waste_prevention_measures extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField wastetxf;
	private JTextField datetxf;
	private JTextField quantitytxf;
	private JTextField reasontxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					waste_prevention_measures frame = new waste_prevention_measures();
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
	public waste_prevention_measures() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("waste_events");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(264, 11, 135, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("waste_events_id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(22, 90, 156, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(23, 133, 127, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("quantity_wasted");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(22, 190, 156, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("reason");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(25, 258, 107, 31);
		contentPane.add(lblNewLabel_4);
		
		wastetxf = new JTextField();
		wastetxf.setBounds(264, 84, 135, 30);
		contentPane.add(wastetxf);
		wastetxf.setColumns(10);
		
		datetxf = new JTextField();
		datetxf.setBounds(264, 133, 135, 30);
		contentPane.add(datetxf);
		datetxf.setColumns(10);
		
		quantitytxf = new JTextField();
		quantitytxf.setBounds(264, 190, 135, 32);
		contentPane.add(quantitytxf);
		quantitytxf.setColumns(10);
		
		reasontxf = new JTextField();
		reasontxf.setBounds(264, 260, 135, 31);
		contentPane.add(reasontxf);
		reasontxf.setColumns(10);
		
		JButton waste_eventstxf = new JButton("submit");
		waste_eventstxf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Food_wastage_reduction_management_system","root","");
			String sql="INSERT INTO waste_prevention_measures VALUES(?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1,Integer.parseInt(wastetxf.getText()));
			st.setString(2,datetxf.getText());
			st.setString(3, quantitytxf.getText());
			st.setString(4, reasontxf.getText());
			
			
			st.executeUpdate();
			JOptionPane.showMessageDialog(waste_eventstxf, "data saved!!");
			
			st.close();
			con.close();
					
					
					
					
					
					
					
					
					
				} catch (Exception e2) {
					
				}	
				
			}
		});
		waste_eventstxf.setBackground(new Color(0, 255, 128));
		waste_eventstxf.setFont(new Font("Tahoma", Font.BOLD, 18));
		waste_eventstxf.setBounds(43, 368, 156, 44);
		contentPane.add(waste_eventstxf);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {wastetxf.setText(null);
			datetxf.setText(null);
			quantitytxf.setText(null);
			reasontxf.setText(null);
			}
		});
		btnNewButton_1.setBackground(new Color(128, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(282, 362, 127, 39);
		contentPane.add(btnNewButton_1);
	}

}
