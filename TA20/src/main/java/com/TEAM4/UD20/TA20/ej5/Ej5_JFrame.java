// @Marc Lopez Team 4 03/05/2022
// Revision @borjaMontseny

package com.TEAM4.UD20.TA20.ej5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ej5_JFrame extends JFrame {

	private JPanel contentPane;
	private String texto = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej5_JFrame frame = new Ej5_JFrame();
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
	public Ej5_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextPane txtpnE = new JTextPane();
		txtpnE.setText("");
		txtpnE.setBounds(15, 46, 418, 99);
		contentPane.add(txtpnE);
		
		JButton btnNewButton = new JButton("Limpiar");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = "";
				txtpnE.setText(texto);
			}
		});
		btnNewButton.setBounds(5, 5, 440, 29);
		contentPane.add(btnNewButton);
		
		contentPane.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += "Has soltado el panel";
				txtpnE.setText(texto);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += "Has pulsado el panel";
				txtpnE.setText(texto);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += "Has salido del panel";
				txtpnE.setText(texto);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += "Has entrado al panel";
				txtpnE.setText(texto);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				texto += "Has clicado el panel";
				txtpnE.setText(texto);
				
			}
		});
		
	
		
	}
	
	

		
}
