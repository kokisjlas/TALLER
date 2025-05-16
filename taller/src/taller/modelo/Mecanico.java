package taller.modelo;

public class Mecanico {
	private int codigo;
	private String nombre;
	private int especialidad;/* 1-Coche,2-Motocicleta*/
	private boolean libre;
	private Vehiculo vehiculo;
	
	public Mecanico(int codigo, String nombre, int especialidad) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.especialidad=especialidad;
		this.libre=true;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(int especialidad) {
		this.especialidad = especialidad;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	public void asignarVehiculo(Vehiculo vehiculo) {
	this.vehiculo=vehiculo;
		
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	@Override
	public String toString() {
		return "Mecanico [codigo=" + codigo + ", nombre=" + nombre + ", especialidad=" + especialidad + ", libre="
				+ libre + "]";
	}
	
	

}
