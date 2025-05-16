package taller.vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
//CLASE AltaVehiculoVista PARA LA INTERFAZ GRAFICA
public class AltaVehiculoVista extends JPanel{
	
	//ATRIBUTOS DE LA CLASE VEHICULO
	private JLabel matriculaJLabel;
	private JLabel tipoJLabel;
	private JTextField matriculatextField;
	private JTextField tipotextField;
	
// SE CREA UN CONSTRUCTOR DE LA CLASE DONDE SE VA GENERANDO AUTOMATICAMENTE A TRAVES DE WINDOWSBUILDER
	// ABRIR CON OPEN WITH ---> WINDOWSBUILDER---> DESIGN
	public AltaVehiculoVista() {
		System.out.println("Vista Alta Vehiculo");
		this.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alta Vehiculo");
		lblNewLabel.setBounds(195, 12, 102, 17);
		add(lblNewLabel);
		
		JLabel matriculaJlabel = new JLabel("Matricula:");
		matriculaJlabel.setBounds(64, 46, 60, 17);
		add(matriculaJlabel);
		
		JLabel lblTipocochemoto = new JLabel("Tipo (1-Coche/2-Moto):");
		lblTipocochemoto.setBounds(64, 75, 140, 17);
		add(lblTipocochemoto);
		
		matriculatextField = new JTextField();
		matriculatextField.setBounds(142, 44, 178, 21);
		add(matriculatextField);
		matriculatextField.setColumns(10);
		
		tipotextField = new JTextField();
		tipotextField.setBounds(206, 73, 114, 21);
		add(tipotextField);
		tipotextField.setColumns(10);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.setBounds(215, 119, 105, 27);
		add(btnAlta);
		
	}
}
