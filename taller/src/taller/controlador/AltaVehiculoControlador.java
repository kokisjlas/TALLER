package taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import taller.modelo.ApiModelo;
import taller.vistas.AltaVehiculoVista;

public class AltaVehiculoControlador implements ActionListener {
	private AltaVehiculoVista vista;
	private ApiModelo api;

	public AltaVehiculoControlador(AltaVehiculoVista vista) {
		this.vista = vista;
		api = api.getInstancia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			System.out.println("recojo evento del alta vista");
			if (vista.getMatricula().equals("")) {
				vista.lanzarError("Matricula obligatoria");
				
			}else if(vista.getTipo()!=1 && vista.getTipo()!=2) {
					vista.lanzarError("Tipo debe ser 1 o 2");
		
			} else {
				api.altaVehiculo(vista.getMatricula(), vista.getTipo());

				vista.lanzarOk();
			}
		}catch(NumberFormatException ex) {
			vista.lanzarError("El tipo es obligatorio");
		}
		

	}

}
