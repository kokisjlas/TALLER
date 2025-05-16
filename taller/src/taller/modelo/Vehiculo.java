package taller.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Vehiculo {
	private String matricula;
	private TipoEstado estado;
	private int tipo; /*1-Coche o 2-Moto*/
	
	/*private Averia[] averias;
	private int indicador_averias=0;*/
	private ArrayList<Averia> averiasA= new ArrayList<Averia>();
	
	
	

	public Vehiculo(String matricula, int tipo) {
		
		this.matricula=matricula;
		this.tipo=tipo;
		this.estado=TipoEstado.EN_ESPERA;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoEstado getEstado() {
		return estado;
	}

	public void setEstado(TipoEstado estado) {
		this.estado = estado;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Averia> getAveriasA() {
		return averiasA;
	}

	public void setAveriasA(ArrayList<Averia> averiasA) {
		this.averiasA = averiasA;
	}

	public int costeReparacion() {
	    int costeTotal = 0;
	   /* for (int i = 0; i < indicador_averias; i++) {
	        if (averias[i] != null) {
	            costeTotal += averias[i].getCostePorAveria();
	        }
	    }*/
	    for (Averia a: averiasA) {
	    	if(a!=null) {
	    		costeTotal+=a.getCostePorAveria();
	    	}
	    }
	    return costeTotal;
	}

	public void altaAveria(Averia averia) {
		/*averias[indicador_averias]=averia;
		indicador_averias++;*/
		averiasA.add(averia);
	}

	@Override
	public String toString() {
	    return "Vehiculo [matricula=" + matricula + ", estado=" + estado + ", tipo=" + tipo + 
	           ", costeReparacion=" + costeReparacion() + "]";
	}

	}

