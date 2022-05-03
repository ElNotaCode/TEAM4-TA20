package com.TEAM4.UD20.TA20.ej6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej6_JFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JSeparator separator_1;
	private JButton btnNewButton;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej6_JFrame frame = new Ej6_JFrame();
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
	public Ej6_JFrame() {
		setTitle("EJERCICIO 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// ALTURA
		JLabel lblALTURA = new JLabel("ALTURA (M)");
		lblALTURA.setBounds(10, 10, 108, 13);
		contentPane.add(lblALTURA);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 56, 130, 13);
		contentPane.add(separator);
		separator.setBackground(Color.black);
		
		textField = new JTextField();
		textField.setBounds(10, 27, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// PESO
		JLabel lblNewLabel_1 = new JLabel("PESO (KG)");
		lblNewLabel_1.setBounds(10, 67, 108, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 79, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(128, 0, 2, 119);
		contentPane.add(separator_1);
		separator_1.setBackground(Color.black);
		
		btnNewButton = new JButton("CALCULAR IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorAlturaStr = textField.getText();
				Double valorAltura = Double.parseDouble(valorAlturaStr);
				String valorPesoStr = textField_1.getText();
				Double valorPeso = Double.parseDouble(valorPesoStr);
				Double resultadoIMC = valorPeso / (Math.pow(valorAltura, 2));
				String resultadoIMCStr = String.valueOf(resultadoIMC);
				textField_2.setText(resultadoIMCStr);
			}
		});
		btnNewButton.setBounds(140, 26, 151, 21);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(169, 79, 122, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(140, 82, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("About");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Team 4: Eloi M, Borja M, Marc L");
			}
		});
		btnNewButton_1.setBounds(0, 215, 85, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(341, 215, 85, 21);
		contentPane.add(btnNewButton_2);
		
		
		
	}
}
