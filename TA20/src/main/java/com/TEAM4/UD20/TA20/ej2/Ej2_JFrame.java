package com.TEAM4.UD20.TA20.ej2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej2_JFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2_JFrame frame = new Ej2_JFrame();
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
	public Ej2_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Has pulsado:");
		lblNewLabel.setBounds(34, 30, 100, 22);
		contentPane.add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(121, 30, 61, 22);
		contentPane.add(lblNewLabel_1);
		
		 final JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String texto = "";
				texto = btnNewButton.getText();
				lblNewLabel_1.setText(texto);
			}
		});
		btnNewButton.setBounds(194, 28, 117, 29);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Boton 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String texto = "";
				texto = btnNewButton_1.getText();
				lblNewLabel_1.setText(texto);
			}
		});
		btnNewButton_1.setBounds(312, 28, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
