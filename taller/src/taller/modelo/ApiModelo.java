package taller.modelo;

public class ApiModelo {

	private Taller taller;
	private static ApiModelo instancia;

	private ApiModelo() {
		taller = new Taller();
	}

	public static ApiModelo getInstancia() {
		if (instancia == null) {
			instancia = new ApiModelo();
		}
		return instancia;

	}

	public void altaVehiculo(String matricula, int tipo) {
		taller.altaVehiculo(matricula, tipo);
	}

	public void consultaVehiculo(String matricula) {
		taller.buscarVehiculo(matricula);
	}
	public void modificarVehiculo(String matricula, int tipo, TipoEstado tipoEstado) {
		taller.modificarVehiculo(matricula, tipo, tipoEstado);
	}
	public void bajaVehiculo(String matricula) {
		taller.bajaVehiculo(matricula);
	}
}
