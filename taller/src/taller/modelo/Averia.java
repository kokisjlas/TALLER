package taller.modelo;

public class Averia {
	private int codigo;
	private String descripcion;
	private double costeAveria;
	
	
	public Averia(int codigo, String descripcion, double costeAveria) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.costeAveria=costeAveria;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getCostePorAveria() {
		return costeAveria;
	}


	public void setCostePorAveria(double costeTotal) {
		this.costeAveria = costeTotal;
	}


	@Override
	public String toString() {
		return "Averia [codigo=" + codigo + ", descripcion=" + descripcion + ", costeTotal=" + costeAveria + "]";
	}
	

}
