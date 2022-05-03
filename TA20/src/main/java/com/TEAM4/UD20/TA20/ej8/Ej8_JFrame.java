package com.TEAM4.UD20.TA20.ej8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;

//@author Marc Lopez
//@author&revision Eloi Martorell Martin
//03/05/2022

public class Ej8_JFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej8_JFrame frame = new Ej8_JFrame();
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
	public Ej8_JFrame() {
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
		tf1 = new JTextField();
		tf1.setBounds(183, 25, 66, 16);
		contentPane.add(tf1);
		tf1.setColumns(10);

		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setBounds(323, 25, 121, 16);
		contentPane.add(tf2);
		tf2.setColumns(10);

		//refactor botoneuro a botonEuro @Eloi
		final JButton botonEuro = new JButton("Euros a ptas");
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
		
		//boton borrar
		JButton botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(258, 103, 117, 29);
		contentPane.add(botonBorrar);
		
		//listener borrar
		botonBorrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
			}
		});
		//listener cambiar
		botonCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botonEuro.isVisible()) {
					botonEuro.setVisible(false);
				    botonPesetas.setVisible(true);
				}else {
				    botonPesetas.setVisible(false);
				    botonEuro.setVisible(true);
				}
			}
		});
		
		try {
			
			//listner converiones
			
			botonEuro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//refactor cantidadmoneda a cantidadMoneda @Eloi
					double cantidadMoneda = Double.parseDouble(tf1.getText());
					double resultado = cantidadMoneda * 166.386;
					tf2.setText(String.valueOf(resultado));

				}
			});
			
			botonPesetas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//refactor cantidadmoneda a cantidadMoneda @Eloi
					double cantidadMoneda = Double.parseDouble(tf1.getText());
					double resultado = (cantidadMoneda / 166.386) ;
					tf2.setText(String.valueOf(resultado));
				}
			});
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
		    String message = "yeee";
		        JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
		}
		

		
	}
}
