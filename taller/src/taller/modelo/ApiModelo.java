package taller.modelo;

public class ApiModelo {
	
	private Taller taller;
	private static ApiModelo instancia;
	
	private ApiModelo() {
		taller=new Taller();
	}

	public static ApiModelo getInstancia() {
		if(instancia==null) {
			instancia= new ApiModelo();
		}
		return instancia;
		
	}
	public void altaVehiculo(String matricula, int tipo) {
		taller.altaVehiculo(matricula, tipo);
	}
}
