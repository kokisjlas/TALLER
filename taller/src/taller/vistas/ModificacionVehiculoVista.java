package taller.vistas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import taller.controlador.ModificacionVehiculoControlador;
import taller.modelo.TipoEstado;

import javax.swing.JButton;

public class ModificacionVehiculoVista extends JPanel {
	private JTextField matriculatextField;
	private JTextField tipotextField;
	private JTextField estadotextField;
	private ModificacionVehiculoControlador controlador;

	public ModificacionVehiculoVista() {

		controlador = new ModificacionVehiculoControlador(this);
		this.setLayout(null);

		JLabel modificarJLabel = new JLabel("Modificar Vehiculo");
		modificarJLabel.setBounds(168, 40, 104, 14);
		add(modificarJLabel);

		JLabel matriculaJLabel = new JLabel("Matricula:");
		matriculaJLabel.setBounds(103, 68, 47, 14);
		add(matriculaJLabel);

		matriculatextField = new JTextField();
		matriculatextField.setBounds(160, 65, 112, 20);
		add(matriculatextField);
		matriculatextField.setColumns(10);

		JLabel tipoJLabel = new JLabel("Tipo:");
		tipoJLabel.setBounds(104, 104, 46, 14);
		add(tipoJLabel);

		tipotextField = new JTextField();
		tipotextField.setBounds(160, 101, 112, 20);
		add(tipotextField);
		tipotextField.setColumns(10);

		JLabel estadoJLabel = new JLabel("Estado:");
		estadoJLabel.setBounds(103, 142, 46, 14);
		add(estadoJLabel);

		estadotextField = new JTextField();
		estadotextField.setBounds(160, 139, 112, 20);
		add(estadotextField);
		estadotextField.setColumns(10);

		JButton modificarButton = new JButton("Modificar");
		modificarButton.setBounds(165, 199, 89, 23);
		add(modificarButton);

		modificarButton.addActionListener(controlador);

	}

	public String getMatricula() {
		return matriculatextField.getText();
	}

	public int getTipo() throws NumberFormatException {
		try {
			return Integer.parseInt(tipotextField.getText());
		} catch (NumberFormatException e) {
			throw e;
		}
	}

	public TipoEstado getTipoEstado() {
		/* CASTEO DEL STRING A TIPOESTADO */
		String texto = estadotextField.getText();
		TipoEstado estado = TipoEstado.valueOf(texto.toUpperCase().trim());
		return estado;
	}

	public void lanzarError(String mensaje) {
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(matriculatextField), mensaje);

	}

	public void lanzarOk() {
		JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(tipotextField), "Modificacion Correcta.");
	}

}
