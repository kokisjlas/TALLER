package taller.vistas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import taller.controlador.ConsultaVehiculoControlador;

import javax.swing.JButton;

public class ConsultaVehiculoVista extends JPanel {

	private JLabel matriculaJLabel;
	private JTextField matriculatextField;
	private ConsultaVehiculoControlador controlador;

	public ConsultaVehiculoVista() {
		controlador= new ConsultaVehiculoControlador(this);

		this.setLayout(null);

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
		
		consultaButton.addActionListener(controlador);

	}

	public String getMatricula() {
		return matriculatextField.getText();
	}

	public void lanzarError(String mensaje) {
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(matriculatextField), mensaje);

	}

	public void lanzarOk() {
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(matriculatextField), "Consulta correcta.");
	}

}
