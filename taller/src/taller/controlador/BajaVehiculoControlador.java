package taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import taller.modelo.ApiModelo;
import taller.vistas.BajaVehiculoVista;

public class BajaVehiculoControlador implements ActionListener {

	private BajaVehiculoVista vista;
	private ApiModelo api = ApiModelo.getInstancia();

	public BajaVehiculoControlador(BajaVehiculoVista vista) {
		this.vista = vista;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Boton baja correcto");
		if (vista.getMatricula().equals("")) {
			vista.lanzarError("Matricula obligatoria");
		} else {
			vista.lanzarOk();

			api.bajaVehiculo(vista.getMatricula());
		}

	}

}
