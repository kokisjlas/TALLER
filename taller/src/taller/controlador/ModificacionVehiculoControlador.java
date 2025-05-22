package taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import taller.modelo.ApiModelo;
import taller.vistas.ModificacionVehiculoVista;

public class ModificacionVehiculoControlador implements ActionListener {

	private ModificacionVehiculoVista vista;
	private ApiModelo api = ApiModelo.getInstancia();

	public ModificacionVehiculoControlador(ModificacionVehiculoVista vista) {
		this.vista = vista;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			System.out.println("Boton Modificar correctamente");
			if (vista.getMatricula().equals("")) {
				vista.lanzarError("Matricula obligatoria");
			} else if (vista.getTipo() != 1 && vista.getTipo() != 2) {
				vista.lanzarError("El tipo debe ser 1 o 2");
			} else if (vista.getTipoEstado().equals("")) {
				vista.lanzarError("Tipo Estado obligatorio");
			} else {
				api.modificarVehiculo(vista.getMatricula(), vista.getTipo(), vista.getTipoEstado());
				vista.lanzarOk();
			}

		} catch (NumberFormatException ex) {
			vista.lanzarError("El tipo es obligatorio");
		}catch(IllegalArgumentException et) {
			vista.lanzarError("El tipoEstado es incorrecto (En_REPARACION,EN_ESPERA,REPARADO)");
		}
	}

}
