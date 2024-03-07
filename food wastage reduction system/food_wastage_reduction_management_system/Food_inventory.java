package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Food_inventory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idtextf;
	private JTextField nametextf;
	private JTextField purctextf;
	private JTextField exptextf;
	private JTextField quantitextf;
	private JTextField passwordtextf;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food_inventory frame = new Food_inventory();
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
	public Food_inventory() {
		setTitle("Food_invetory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1072, 749);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setForeground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Food inventory details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(286, 23, 213, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("food_id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 95, 74, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("purchase_date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 238, 111, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("expire_date");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 191, 124, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("quantity");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 293, 89, 25);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_wastage_reduction_management_system","root","");
			String sql="INSERT INTO food_inventory VALUES(?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1,Integer.parseInt(idtextf.getText()));
			st.setString(2,nametextf.getText());
			st.setString(3, exptextf.getText());
			st.setString(4, purctextf.getText());
			st.setString(5, quantitextf.getText());
			st.setInt(6, Integer.parseInt(passwordtextf.getText()));
			
			st.executeUpdate();
			JOptionPane.showMessageDialog(btnNewButton, "data saved!!");
			
			st.close();
			con.close();
					
					
					
					
					
					
					
					
					
				} catch (Exception e2) {
					
				}	
					
					login ad = new login();
					if(e.getSource()==btnNewButton) {
						ad.main(new String[0]);
					}
					
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBackground(new Color(255, 128, 64));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(10, 557, 162, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {idtextf.setText(null);
			nametextf.setText(null);
			purctextf.setText(null);
			exptextf.setText(null);
			quantitextf.setText(null);
			passwordtextf.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(225, 557, 163, 65);
		contentPane.add(btnNewButton_1);
		
		idtextf = new JTextField();
		idtextf.setBounds(291, 86, 213, 36);
		contentPane.add(idtextf);
		idtextf.setColumns(10);
		
		nametextf = new JTextField();
		nametextf.setBounds(291, 133, 213, 37);
		contentPane.add(nametextf);
		nametextf.setColumns(10);
		
		purctextf = new JTextField();
		purctextf.setBounds(291, 234, 213, 36);
		contentPane.add(purctextf);
		purctextf.setColumns(10);
		
		exptextf = new JTextField();
		exptextf.setBounds(296, 187, 213, 36);
		contentPane.add(exptextf);
		exptextf.setColumns(10);
		
		quantitextf = new JTextField();
		quantitextf.setBounds(291, 286, 213, 36);
		contentPane.add(quantitextf);
		quantitextf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 144, 74, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("password");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 329, 101, 40);
		contentPane.add(lblNewLabel_6);
		
		passwordtextf = new JTextField();
		passwordtextf.setBounds(291, 333, 208, 36);
		contentPane.add(passwordtextf);
		passwordtextf.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("view");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_wastage_reduction_management_system","root","");
					java.sql.Statement st=con.createStatement();
					String query="SELECT * FROM food_inventory";
					ResultSet rs=st.executeQuery(query);
					java.sql.ResultSetMetaData rsdm=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel)table_2.getModel();
					int cols=rsdm.getColumnCount();
					String[]colName=new String[cols];
					for(int i=0;i<cols;i++)
					colName[i]=rsdm.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String food_id,name,expire_date,purchase_date,quantity,password;
					while(rs.next()) {
						food_id=rs.getString(1);
						name=rs.getString(2);
						expire_date=rs.getString(3);
						purchase_date=rs.getString(4);
						quantity=rs.getString(5);
						password=rs.getString(6);
						
						String[]row= {food_id,name,expire_date,purchase_date,quantity,password};	
						model.addRow(row);
						
								
					}
					
					
				}catch (Exception e2) {
					// TODO: handle exception
				}
					
				
				
					
					
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(439, 557, 175, 62);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("update");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_wastage_reduction_management_system","root","");
					String sql="UPDATE food_inventory SET name=?,expire_date=?,purchase_date=?,quantity=?,password=? WHERE food_id=?";					
					PreparedStatement st=con.prepareStatement(sql);

					st.setString(1,nametextf.getText());
					st.setString(2, exptextf.getText());
					st.setString(3, purctextf.getText());
					st.setString(4, quantitextf.getText());
					st.setString(5,passwordtextf.getText() );					
					st.setInt(6, Integer.parseInt(idtextf.getText()));					
										
										
					JOptionPane.showMessageDialog(btnNewButton_3, "data changed!!!");
					st.executeUpdate();
					st.close();
					con.close();
										
										
										
										
									} catch (Exception e2) {
										// TODO: handle exception
									}
									
									
									
			}	
								
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(676, 557, 145, 62);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("delete");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_wastage_reduction_management_system","root","");	
					String sql="DELETE FROM food_inventory WHERE  id=?";
					int idtextf=Integer.parseInt(JOptionPane.showInputDialog("Enter  to delete ")); 
					PreparedStatement st=con.prepareStatement(sql);
					st.setInt(1, idtextf);
					Component delete;
					JOptionPane.showMessageDialog(btnNewButton_5, "recored out!!");
					st.executeUpdate();
					st.close();
					con.close();
					
					
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}	
					
				}
			
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBounds(902, 557, 124, 62);
		contentPane.add(btnNewButton_5);
		
		table_1 = new JTable();
		table_1.setBounds(823, 70, 0, 155);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(536, 23, 512, 466);
		contentPane.add(table_2);
	}
}
