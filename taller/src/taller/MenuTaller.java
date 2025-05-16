package taller;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import taller.vistas.AltaVehiculoVista;

/*SE CREA UNA CLASE MenuTaller que implementa ActionListener
 * PARA AGREGAR LAS OPCIONES DEL MENU (ALTA,MODIFICACION,CONSULTA Y BAJA)
 * */
public class MenuTaller implements ActionListener{
	//ATRIBUTO VENTANA,CONTENEDOR Y MENUBAR OBLIGATORIOS PARA PODER MOSTRAR LAS OPCIONES EN EL MENU GRAFICO
	private JFrame ventana;
	private Container contenedor;
	private JMenuBar menuBar;
	
	//ATRIBUTOS PARA LA INTERFAZ GRAFICA DE VEHICULO
	private JMenu vehiculoJMenu;
	private JMenuItem altaVehiculoJMenuItem;
	private JMenuItem consultaVehiculoJMenuItem;
	private JMenuItem modificacionVehiculoJMenuItem;
	private JMenuItem bajaVehiculoJMenuItem;
	
	
	public MenuTaller(JFrame ventana) {
		this.ventana=ventana;
		contenedor=this.ventana.getContentPane();
		
		menuBar= new JMenuBar();
		ventana.setJMenuBar(menuBar);
		
		//MENU VEHICULO
		vehiculoJMenu=new JMenu("VEHICULOS");
		menuBar.add(vehiculoJMenu);
		
		altaVehiculoJMenuItem=new JMenuItem("Alta Vehiculo");
		vehiculoJMenu.add(altaVehiculoJMenuItem);
		altaVehiculoJMenuItem.addActionListener(this);
		
		consultaVehiculoJMenuItem= new JMenuItem("Consulta Vehiculo");
		vehiculoJMenu.add(consultaVehiculoJMenuItem);
		
		modificacionVehiculoJMenuItem= new JMenuItem("Modificar Vehiculo");
		vehiculoJMenu.add(modificacionVehiculoJMenuItem);
		
		bajaVehiculoJMenuItem= new JMenuItem("Baja Vehiculo");
		vehiculoJMenu.add(bajaVehiculoJMenuItem);
	}
	/*METODO QUE IMPLEMENTA ACTIONLISTENER
	 * ACA SE VE CUAL DE LAS OPCIONES DEL MENU SE HA ESCOGIDO Y SE EJECUTA
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource()==altaVehiculoJMenuItem) {
		//SE IMPRIME LA OPCION, SE AGREGA A LA VENTANA LLAMANDO A LA CLASE .VISTA DE LA OPCION Y SE PONE VISIBLE
		System.out.println("Alta Vehiculo");
		ventana.setContentPane(new AltaVehiculoVista());
		ventana.setVisible(true);
		
	}
	else if(e.getSource()==consultaVehiculoJMenuItem) {
		System.out.println("Consultar Vehiculo");
		
	}
		
	}
	
	

}
