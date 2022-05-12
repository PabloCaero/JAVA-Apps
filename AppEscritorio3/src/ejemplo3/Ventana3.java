package ejemplo3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejemplo2.Categorias;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Ventana3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNombre;
	private JList listCategorias; //MODELO GRAFICO DE LA LISTA
	private DefaultListModel<Categorias> dlModel; //LISTA MODELO CON LA QUE VA A LABURAR EL JLIST

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(10, 28, 46, 14);
		contentPane.add(lblID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 67, 46, 14);
		contentPane.add(lblNombre);
		
		txtID = new JTextField();
		txtID.setBounds(66, 25, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 64, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		
		//EVENTO CUANDO SE SELECCIONA UN ELEMENTO
		listCategorias = new JList();
		listCategorias.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if(listCategorias.getSelectedIndex()!=-1) {
					//SE SELECCIONO UN ELEMENTO DEL JLIST
					JOptionPane.showMessageDialog(null, "Se eliminó categoría "+ ((Categorias)listCategorias.getSelectedValue()).getNombre()  +" exitosamente");
					dlModel.remove(listCategorias.getSelectedIndex());
					
				}
				
			}
		
		});
		listCategorias.setBounds(34, 137, 343, 88);
		
		dlModel = new DefaultListModel<Categorias>();
		listCategorias.setModel(dlModel);
		
		contentPane.add(listCategorias);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categorias x = new Categorias();
				x.setId(Integer.parseInt(txtID.getText()));
				x.setNombre(txtNombre.getText());
				//LISTA RELACIONADA
				dlModel.addElement(x);
				
			}
		});
		btnAceptar.setBounds(165, 63, 89, 23);
		contentPane.add(btnAceptar);
		
		
	}
}
