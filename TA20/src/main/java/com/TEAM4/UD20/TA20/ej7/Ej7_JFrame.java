package com.TEAM4.UD20.TA20.ej7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej7_JFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej7_JFrame frame = new Ej7_JFrame();
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
	public Ej7_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(47, 25, 143, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(258, 25, 75, 16);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(183, 25, 66, 16);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(323, 25, 121, 16);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		final JButton botoneuro = new JButton("Euros a ptas");
		botoneuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cantidadmoneda = Double.parseDouble(textField.getText());

				double resultado = cantidadmoneda * 166.386;
				textField_1.setText(String.valueOf(resultado));

			}
		});
		botoneuro.setBounds(114, 63, 117, 29);
		contentPane.add(botoneuro);

		final JButton botopetas = new JButton("Ptas a euros");
		botopetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cantidadmoneda = Double.parseDouble(textField.getText());

				double resultado = (cantidadmoneda / 166.386) ;
				textField_1.setText(String.valueOf(resultado));
			}
		});
		botopetas.setBounds(114, 63, 117, 29);
		contentPane.add(botopetas);
	    botopetas.setVisible(false);

		JButton botocambiar = new JButton("Cambiar");
		botocambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (botoneuro.isEnabled()) {
				
					botoneuro.setVisible(false);
				    botopetas.setVisible(true);


				}else {
								
				    botopetas.setVisible(false);
				    botoneuro.setVisible(true);

				}

			}
		});
		botocambiar.setBounds(258, 63, 117, 29);
		contentPane.add(botocambiar);
	}

}
