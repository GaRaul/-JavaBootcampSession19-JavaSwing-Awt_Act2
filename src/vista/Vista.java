package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel1.setBounds(10, 39, 155, 14);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Peliculas");
		lblNewLabel2.setBounds(235, 39, 58, 14);
		contentPane.add(lblNewLabel2);
		
		textField = new JTextField();
		textField.setBounds(37, 84, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(222, 94, 149, 28);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tituloPelicula = textField.getText();
				comboBox.addItem(tituloPelicula);
			}
		});
		btnNewButton.setBounds(34, 151, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
