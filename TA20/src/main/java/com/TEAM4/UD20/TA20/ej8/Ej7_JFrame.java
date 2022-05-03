package com.TEAM4.UD20.TA20.ej8;

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

//@author Marc Lopez
//@author&revision Eloi Martorell Martin
//03/05/2022

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

		//labels
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(47, 25, 143, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(258, 25, 75, 16);
		contentPane.add(lblNewLabel_1);

		//textFields
		textField = new JTextField();
		textField.setBounds(183, 25, 66, 16);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(323, 25, 121, 16);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		//refactor botoneuro a botonEuro @Eloi
		final JButton botonEuro = new JButton("Euros a ptas");
		botonEuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//refactor cantidadmoneda a cantidadMoneda @Eloi
				double cantidadMoneda = Double.parseDouble(textField.getText());
				double resultado = cantidadMoneda * 166.386;
				textField_1.setText(String.valueOf(resultado));

			}
		});
		botonEuro.setBounds(114, 63, 117, 29);
		contentPane.add(botonEuro);

		//refactor botopetas a botonPesetas @Eloi
		final JButton botonPesetas = new JButton("Ptas a euros");
		botonPesetas.setBounds(114, 63, 117, 29);
		contentPane.add(botonPesetas);
	    botonPesetas.setVisible(false);

	    //refactor botocambiar a botonCambiar @Eloi
		JButton botonCambiar = new JButton("Cambiar");
		botonCambiar.setBounds(258, 63, 117, 29);
		contentPane.add(botonCambiar);
		
		botonCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botonEuro.isEnabled()) {
					botonEuro.setVisible(false);
				    botonPesetas.setVisible(true);
				}else {
				    botonPesetas.setVisible(false);
				    botonEuro.setVisible(true);
				}
			}
		});
		
		botonPesetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//refactor cantidadmoneda a cantidadMoneda @Eloi
				double cantidadMoneda = Double.parseDouble(textField.getText());
				double resultado = (cantidadMoneda / 166.386) ;
				textField_1.setText(String.valueOf(resultado));
			}
		});
		
	}

}
