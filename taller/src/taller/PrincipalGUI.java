package taller;

import javax.swing.JFrame;


public class PrincipalGUI {

	public static void main(String[] args) {

		JFrame ventana= new JFrame("Taller");
		ventana.setVisible(true);
		ventana.setSize(400,500);
		
		MenuTaller menu=new MenuTaller(ventana);


	}

}
