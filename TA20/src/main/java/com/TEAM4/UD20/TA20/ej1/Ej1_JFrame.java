package com.TEAM4.UD20.TA20.ej1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JLabel;

public class Ej1_JFrame extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-18,284
	 */
	private final JSlider slider_1 = new JSlider();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1_JFrame frame = new Ej1_JFrame();
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
	public Ej1_JFrame() {
		
		setTitle("EJERCICIO 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonRESTAURAR = new JButton("RESTAURAR");
		botonRESTAURAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(100, 100, 450, 300);
			}
		});
		
		botonRESTAURAR.setBounds(10, 10, 112, 21);
		contentPane.add(botonRESTAURAR);
		
		JButton botonMAXIMIZAR = new JButton("MAXIMIZAR");
		botonMAXIMIZAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBounds(100, 100, 1500, 1000);
				// X, Y, ANCHO, ALTO
			}
		});
		botonMAXIMIZAR.setBounds(132, 10, 112, 21);
		contentPane.add(botonMAXIMIZAR);
		
		JButton botonCERRAR = new JButton("CERRAR");
		botonCERRAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		botonCERRAR.setBounds(254, 10, 112, 21);
		contentPane.add(botonCERRAR);

		// Maximizar ETIQUETA-HELLO WORLD
		final JSlider slider = new JSlider();
		slider.setValue(10);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(20);
		slider.setBounds(10, 135, 416, 61);
		contentPane.add(slider);
		
		final JLabel labelETIQUETA = new JLabel("HELLO WORLD");
		labelETIQUETA.setBounds(170, 98, 182, 27);
		labelETIQUETA.setFont(new Font("Serif", Font.BOLD, 10));
		contentPane.add(labelETIQUETA);
		
		JButton btnNewButton = new JButton("CAMBIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valorSlider = slider.getValue();
				labelETIQUETA.setFont(new Font("Serif", Font.BOLD, valorSlider));
			}
		});
		btnNewButton.setBounds(124, 206, 190, 21);
		contentPane.add(btnNewButton);
		
	}
}
