package taller.modelo;

import java.util.ArrayList;

public class Taller {
	/*
	 * private Vehiculo[] vehiculos= new Vehiculo[100]; private int
	 * indicador_vehiculos=0;
	 * 
	 * private Mecanico[] mecanicos= new Mecanico[100]; private int
	 * indicador_mecanico=0;
	 */

	private ArrayList<Vehiculo> vehiculosA = new ArrayList<Vehiculo>();
	private ArrayList<Mecanico> mecanicosA = new ArrayList<Mecanico>();

	public void altaVehiculo(String matricula, int tipo) {
		Vehiculo nuevo_vehiculo = new Vehiculo(matricula, tipo);
		/*
		 * vehiculos[indicador_vehiculos]=nuevo_vehiculo; indicador_vehiculos++;
		 */
		vehiculosA.add(nuevo_vehiculo);

		Mecanico nuevo_mecanico = buscarMecanicoLibre(tipo);
		if (nuevo_mecanico == null) {

			System.out.println("No hay mecanicos disponibles");
			nuevo_vehiculo.setEstado(TipoEstado.EN_ESPERA);

		} else {

			System.out.println("Mecanico asignado");
			nuevo_mecanico.asignarVehiculo(nuevo_vehiculo);
			nuevo_vehiculo.setEstado(TipoEstado.EN_REPARACION);
			nuevo_mecanico.setLibre(false);
			System.out.println("Mecanico de codigo: " + nuevo_mecanico.getCodigo());
		}
	}

	public Mecanico buscarMecanicoLibre(int tipo) {
		/*
		 * for(int i=0;i<indicador_mecanico;i++) { if(mecanicos[i].isLibre()==true)
		 * {//Se verifica la especialidad del Mecanico (Coche)
		 * if(mecanicos[i].getEspecialidad()==tipo) { return mecanicos[i]; } } }
		 */
		for (Mecanico m : mecanicosA) {
			if (m.isLibre() == true) {
				if (m.getEspecialidad() == tipo) {
					return m;
				}
			}
		}
		return null;
	}

	public Mecanico buscarMecanico(int codigo) {

		/*
		 * for(int i=0;i<indicador_mecanico;i++) { if(mecanicos[i].getCodigo()==codigo)
		 * { return mecanicos[i]; } }
		 */
		for (Mecanico m : mecanicosA) {
			if (m.getCodigo() == codigo) {
				return m;
			}
		}
		return null;
	}

	public Vehiculo buscarVehiculo(String matricula) {
		/*
		 * for(int i=0;i<indicador_vehiculos;i++) {
		 * if(vehiculos[i].getMatricula().equals(matricula)) { return vehiculos[i]; } }
		 */
		for (Vehiculo v : vehiculosA) {
			if (v.getMatricula().equals(matricula)) {
				return v;
			}
		}
		return null;
	}

	public Vehiculo vehiculosEnEspera() {
		/*
		 * for(int i=0;i<indicador_vehiculos;i++) {
		 * if(vehiculos[i].getEstado()==TipoEstado.EN_ESPERA) { return vehiculos[i]; } }
		 */
		for (Vehiculo v : vehiculosA) {
			if (v.getEstado() == TipoEstado.EN_ESPERA) {
				return v;
			}
		}
		return null;
	}

	public void listarVehiculos() {
		/*
		 * for (int i=0;i<indicador_vehiculos;i++) {
		 * if(vehiculos[i].getEstado()==TipoEstado.REPARADO) {
		 * vehiculos[i]=vehiculos[indicador_vehiculos-1]; indicador_vehiculos--; }
		 * System.out.println(vehiculos[i]); }
		 */

		for (int i = 0; i < vehiculosA.size(); i++) {
			if (vehiculosA.get(i).getEstado() == TipoEstado.REPARADO) {
				vehiculosA.remove(i);
				i--;
			}
		}
		for (Vehiculo v : vehiculosA) {
			System.out.println(v);
		}

	}

	public void altaMecanico(Mecanico nuevomecanico) {
		/*
		 * mecanicos[indicador_mecanico]=nuevomecanico; indicador_mecanico++;
		 */
		mecanicosA.add(nuevomecanico);
	}

	public void modificarVehiculo(String matricula, int tipo, TipoEstado tipoEstado) {
		for (Vehiculo v : vehiculosA) {
			if (v.getMatricula().equals(matricula)) {
				v.setTipo(tipo);
				v.setEstado(tipoEstado);
			}
		}

	}

	public void bajaVehiculo(String matricula) {
		for (Vehiculo v : vehiculosA) {
			if (v.getMatricula().equals(matricula)) {
				vehiculosA.remove(v);
				
			}
		}
	}
}
