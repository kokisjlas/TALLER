package taller.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BajaVehiculoVista extends JPanel{
	private JTextField matriculatextField;
	
	public BajaVehiculoVista() {
		
		this.setLayout(null);
		
		JLabel bajaJLabel = new JLabel("Baja Vehiculo");
		bajaJLabel.setBounds(197, 39, 73, 14);
		add(bajaJLabel);
		
		JLabel lblNewLabel = new JLabel("Matricula:");
		lblNewLabel.setBounds(99, 82, 59, 14);
		add(lblNewLabel);
		
		matriculatextField = new JTextField();
		matriculatextField.setBounds(168, 79, 127, 20);
		add(matriculatextField);
		matriculatextField.setColumns(10);
		
		JButton bajaButton = new JButton("Baja");
		bajaButton.setBounds(181, 133, 89, 23);
		add(bajaButton);

	}

}
