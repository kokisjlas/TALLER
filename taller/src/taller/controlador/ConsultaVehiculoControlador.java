package taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import taller.modelo.ApiModelo;
import taller.vistas.ConsultaVehiculoVista;

public class ConsultaVehiculoControlador implements ActionListener {
	private ConsultaVehiculoVista vista;
	private ApiModelo api = ApiModelo.getInstancia();

	public ConsultaVehiculoControlador(ConsultaVehiculoVista vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Funciona correctamente el boton");
		if (vista.getMatricula().equals("")) {
			vista.lanzarError("Matricula vacia, es obligatoria");
		} else {
			api.consultaVehiculo(vista.getMatricula());
			vista.lanzarOk();
		}

	}

}
