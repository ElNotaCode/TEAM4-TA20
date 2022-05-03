package com.TEAM4.UD20.TA20.ej4;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Ej4_Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej4_Frame frame = new Ej4_Frame();
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
	private String events = new String();
	public Ej4_Frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		events += "Ventana creada \n";
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		events += "Panel creado \n";
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(88, 11, 336, 239);
		contentPane.add(textPane);
		events += "Panel de texto creado \n";
		
		JLabel lbl = new JLabel("Eventos");
		lbl.setBounds(10, 120, 46, 14);
		contentPane.add(lbl);
		events += "Label 'Eventos' creada \n";
		
		textPane.setText(events);
		
		textPane.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha soltado el click del panel de texto \n";
				textPane.setText(events);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha pulsado el panel de texto \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha salido el raton el panel de texto \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha entrado el raton en panel de texto \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha clickado el raton en el panel de texto \n";
				textPane.setText(events);
			}
		});
		
		lbl.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha soltado el click de label 'Eventos' \n";
				textPane.setText(events);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha pulsado el label 'Eventos' \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha salido el raton en label 'Eventos' \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha entrado el raton en label 'Eventos' \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha clickado el raton en label 'Eventos' \n";
				textPane.setText(events);
			}
		});
		
		textPane.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha soltado el click del panel \n";
				textPane.setText(events);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha pulsado el panel \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha salido el raton en panel \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha entrado el raton en panel \n";
				textPane.setText(events);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				events += "Ha clickado el raton en panel \n";
				textPane.setText(events);
			}
		});
	}
}
