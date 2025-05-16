package taller;

import java.util.Scanner;

import taller.modelo.Averia;
import taller.modelo.Mecanico;
import taller.modelo.Taller;
import taller.modelo.TipoEstado;
import taller.modelo.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String menu="1-Recepcion de vehiculo"+"\n"+
					"2-Terminacion de una reparacion"+"\n"+
					"3-Entrega de vehiculos reparados"+"\n"+
					"4-Salir";
		
		Taller taller= new Taller();
		Mecanico mecanico01= new Mecanico(001,"Raul",1);
		Mecanico mecanico02= new Mecanico(002,"Carlos",2);
		Mecanico mecanico03= new Mecanico(003,"Jose",1);
		taller.altaMecanico(mecanico01);
		taller.altaMecanico(mecanico02);
		taller.altaMecanico(mecanico03);
		
		Averia averia01= new Averia(10,"Neumatico pinchado",100);
		Averia averia02= new Averia(20,"Bujia desgastada",200);
		Averia averia03= new Averia(30,"Vehiculo con sobrecalentamiento",300);
		Averia averia04= new Averia(40,"Problema con gasolina",400);
		
		Vehiculo vehiculo01= new Vehiculo("A01",1);
		Vehiculo vehiculo02= new Vehiculo("B02",2);
		Vehiculo vehiculo03= new Vehiculo("C03",1);
		Vehiculo vehiculo04= new Vehiculo("D04",2);
		
		vehiculo01.altaAveria(averia01);
		vehiculo02.altaAveria(averia02);
		vehiculo03.altaAveria(averia03);
		vehiculo04.altaAveria(averia04);
		
		int opcion;
		int codigo;
		int tipo;
		String matricula;
		do {
			System.out.println(menu);
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la matricula");
				matricula=sc.next();
				System.out.println("Ingrese el tipo de vehiculo (1-Coche, 2-Moto)");
				tipo=sc.nextInt();
				taller.altaVehiculo(matricula, tipo);
				break;
				
			case 2:
				System.out.println("Ingrese el codigo de Mecanico");
				codigo=sc.nextInt();
				Mecanico mecanico=taller.buscarMecanico(codigo);
				if(mecanico==null) {
					System.out.println("No se ha encotrado al mecanico");
					
				}else {
					System.out.println("Mecanico encontrado");
					Vehiculo vehiculo=mecanico.getVehiculo();
					vehiculo.costeReparacion();
					vehiculo.setEstado(TipoEstado.REPARADO);
					
					Vehiculo nuevovehiculo=taller.vehiculosEnEspera();
					if(nuevovehiculo!=null) {
						System.out.println("Nuevo Vehiculo en espera asginado");
						mecanico.asignarVehiculo(nuevovehiculo);
						
					}else {
						System.out.println("No hay vehiculos en espera");
						mecanico.setLibre(true);
						mecanico.asignarVehiculo(null);
					}
				}
				break;
			case 3:
				System.out.println("Lista de Vehiculos en el Taller");
				taller.listarVehiculos();
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
		}while(opcion!=4);
	}

}
