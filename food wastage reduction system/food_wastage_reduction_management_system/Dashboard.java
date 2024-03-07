package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("food_inventory");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Food_inventory ad= new Food_inventory();
				if(e.getSource()==btnNewButton) {
					ad .main(new String[0]);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(28, 121, 185, 70);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("wate_prevention_measures");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 waste_prevention_measures ad= new waste_prevention_measures();
					if(e.getSource()==btnNewButton_1) {
						ad .main(new String[0]);
					}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(176, 28, 240, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("reports");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 reports ad= new reports();
				if(e.getSource()==btnNewButton_2) {
					ad .main(new String[0]);
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(408, 127, 151, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("storage_location");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				storage_location ad = new storage_location();
				if(e.getSource()==btnNewButton_3) {
				 ad.main(new String[0]);
		}
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(408, 241, 151, 59);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("waste_events");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 waste_events ad = new waste_events();
					if(e.getSource()==btnNewButton_4) {
					 ad.main(new String[0]);
			}
			}		
			});
		
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(34, 260, 179, 54);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("logout");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
			}
				});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(216, 356, 227, 83);
		contentPane.add(btnNewButton_5);
		
			}
		}
		
	
       
  
	

         
         
         
