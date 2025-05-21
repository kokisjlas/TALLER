package taller.vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConsultaVehiculoVista extends JPanel{
	
	private JLabel matriculaJLabel;
	private JTextField matriculatextField;

	
	public ConsultaVehiculoVista() {
		
		JLabel lblNewLabel = new JLabel("Consulta Vehiculo");
		this.setLayout(null);
		
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Consulta Vehiculo");
		lblNewLabel_1.setBounds(193, 17, 95, 14);
		add(lblNewLabel_1);
		
		JLabel matriculaJlabel = new JLabel("Matricula:");
		matriculaJlabel.setBounds(116, 73, 76, 14);
		add(matriculaJlabel);
		
		matriculatextField = new JTextField();
		matriculatextField.setBounds(172, 70, 121, 20);
		add(matriculatextField);
		matriculatextField.setColumns(10);
		
		JButton consultaButton = new JButton("Consultar");
		consultaButton.setBounds(182, 130, 89, 23);
		add(consultaButton);
		System.out.println("Vista Consulta Vehiculo");
		
		
		
	}
}
