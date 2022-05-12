package ejemplo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	//IMPORTANTE
	private JComboBox<String> cbLocalidades;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cbLocalidades = new JComboBox<String>();
		cbLocalidades.setBounds(66, 97, 139, 20);
		contentPane.add(cbLocalidades);
		cbLocalidades.addItem("Tigre");
		cbLocalidades.addItem("San Fernando");
		cbLocalidades.addItem("San Miguel");

		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Localidad seleccionada: "+cbLocalidades.getSelectedItem());
			}
		});
		btnAceptar.setBounds(230, 96, 89, 23);
		contentPane.add(btnAceptar);
	}
}
