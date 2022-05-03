package com.TEAM4.UD20.TA20.ej3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

//@author Eloi Martorell 03/05/2022

public class Ej3_Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3_Frame frame = new Ej3_Frame();
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
	
	//variables static para poder usarlas en el listener
	static int num1 = 0;
	static int num2 = 0;
	
	public Ej3_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(55, 56, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(226, 56, 89, 23);
		contentPane.add(btn2);
		
		JLabel lblNewLabel = new JLabel("Boton 2:");
		lblNewLabel.setBounds(226, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBoton = new JLabel("Boton 1:");
		lblBoton.setBounds(55, 31, 46, 14);
		contentPane.add(lblBoton);
		
		final JLabel lbl1 = new JLabel(num1 + " veces");
		lbl1.setBounds(111, 31, 89, 14);
		contentPane.add(lbl1);
		
		final JLabel lbl2 = new JLabel(num2 + " veces");
		lbl2.setBounds(282, 31, 89, 14);
		contentPane.add(lbl2);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//lsitener
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num1++;
				lbl1.setText(num1 + " veces");
			}
		});
		
		//lsitener
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num2++;
				lbl2.setText(num2 + " veces");
			}
		});
		
	}
	
}
