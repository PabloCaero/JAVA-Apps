package ejemplo2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{ //VENTANA AHORA ES UN JFRAME
	
	//ESTA SERIAL QUE SE SUELE UTILIZAR PARA VER SI EL OBJETO QUE ESTOY CREANDO, CUANDO LO MANDO A ALGO EXTERNO COMO UN 
	//ARCHIVO FUNCIONA O NO
	private static final long serialVersionUID = 1L;
	private JButton boton;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(350, 350);
		setTitle("Titulo 2");
		
		boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(250, 250, 300, 30);
		
		setLayout(null);
		getContentPane().add(boton);
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
	}
	
}
