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

public class storage_location extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField locationtxf;
	private JTextField nametxf;
	private JTextField temperaturetxf;
	private JTextField capacitytxf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					storage_location frame = new storage_location();
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
	public storage_location() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("storage_location");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(230, 26, 181, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("location_id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 75, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(21, 121, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("temperature_range");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 175, 160, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("capacity");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(21, 226, 108, 14);
		contentPane.add(lblNewLabel_4);
		
		locationtxf = new JTextField();
		locationtxf.setBounds(230, 63, 181, 26);
		contentPane.add(locationtxf);
		locationtxf.setColumns(10);
		
		nametxf = new JTextField();
		nametxf.setBounds(230, 104, 181, 31);
		contentPane.add(nametxf);
		nametxf.setColumns(10);
		
		temperaturetxf = new JTextField();
		temperaturetxf.setBounds(230, 155, 181, 34);
		contentPane.add(temperaturetxf);
		temperaturetxf.setColumns(10);
		
		capacitytxf = new JTextField();
		capacitytxf.setBounds(230, 209, 181, 31);
		contentPane.add(capacitytxf);
		capacitytxf.setColumns(10);
		
		JButton loctextf = new JButton("submit");
		loctextf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_wastage_reduction_management_system","root","");
			String sql="INSERT INTO storage_location VALUES(?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1,Integer.parseInt(locationtxf.getText()));
			st.setString(2,nametxf.getText());
			st.setString(3, temperaturetxf.getText());
			st.setString(4, capacitytxf.getText());
			
			
			st.executeUpdate();
			JOptionPane.showMessageDialog(loctextf, "data saved!!");
			
			st.close();
			con.close();
					
					
					
					
					
					
					
					
					
				} catch (Exception e2) {
					
				}
				
				
			}
		 });
		loctextf.setBackground(new Color(255, 128, 0));
		loctextf.setFont(new Font("Tahoma", Font.BOLD, 18));
		loctextf.setBounds(10, 310, 181, 44);
		contentPane.add(loctextf);
		
		JButton nametextf = new JButton("cancel");
		nametextf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { locationtxf.setText(null);
			nametxf.setText(null);
			temperaturetxf.setText(null);
			capacitytxf.setText(null);
			}
		});
		nametextf.setBackground(new Color(128, 0, 255));
		nametextf.setFont(new Font("Tahoma", Font.BOLD, 18));
		nametextf.setBounds(230, 310, 181, 44);
		contentPane.add(nametextf);
	}

}
