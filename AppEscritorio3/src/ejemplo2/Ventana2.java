package ejemplo2;

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

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private	JComboBox<Categorias> cbCategoria;
	private JButton btnAceptar;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//AGREGO ELEMENTOS DE UNA CLASE, NO DE UN STRING
		cbCategoria = new JComboBox<Categorias>();
		cbCategoria.setBounds(58, 101, 113, 20);
		contentPane.add(cbCategoria);
		
		cbCategoria.addItem(new Categorias(1, "Limpieza"));
		cbCategoria.addItem(new Categorias(2, "Bebida"));
		cbCategoria.addItem(new Categorias(3, "Comida"));
		//EL COMBOBOX MOSTRARA TODO EL METODO TOSTRING

		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//IMPORTANTISIMO PARA CASTEAR! Y MOSTRAR COMBOBOX
				JOptionPane.showMessageDialog(null, "El usuario seleccionó: "+ ((Categorias)cbCategoria.getSelectedItem()).getNombre());
			}
		});
		btnAceptar.setBounds(199, 100, 89, 23);
		contentPane.add(btnAceptar);
	}

}
