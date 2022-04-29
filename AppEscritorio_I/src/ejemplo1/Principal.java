package ejemplo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
													  /*INICIO VENTANA*/

		//PARA CREAR UNA VENTANA NECESITAMOS UN JFRAME		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//LOCALIZACION
		frame.setLocation(350, 350);
		//frame.setBounds(350, 350, 500, 500); //MANERA DE REPRESENTAR EL SETSIZE Y EL SETLOCATION
		
		//TITULO
		frame.setTitle("TITULO 1");
		
		//SE RECOMIENDA SIEMPRE A LO ULTIMO PARA QUE SE MUESTRE LA VENTANA
		
		//BOTON
		JButton boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(10, 15, 140, 30);
		
		//AGREGO EL BOTON A LA VENTANA / CONTROL
		frame.setLayout(null); //IMPORTANTE
		frame.getContentPane().add(boton);
		frame.setVisible(true);
														/*FIN VENTANA*/
		
		
		
	}

}
