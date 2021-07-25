package ec.edu.epn.proyecto;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		//Datos quemados
		Scanner sc= new Scanner(System.in);
		ListaVehiculo vehiculos= new ListaVehiculo();
		ListaServicio servicios= new ListaServicio();
		ListaFichaTecnica fichasTecnicas= new ListaFichaTecnica();
		servicios.aniadir(new Servicio("Cambio de Aceite Regular", "Aceite SW-40", 30.00));
		servicios.aniadir(new Servicio("Cambio de Aceite Premium", "Aceite SW-50", 40.00));
		servicios.aniadir(new Servicio("Cambio de Aceite Ultra Premium", "Aceite SW-60", 55.70));

		//Prueba Primer Caso de Uso-Mejorando la consola
		Propietario propietario1= new Propietario("Christian", "1721795811", "0984149550", "Conocoto");
		Mecanico mecanico= new Mecanico("José", "1232321289", "0984568790", "Mitad del Mundo");
		InformacionEmpleado informacionEmpleado = new InformacionEmpleado(400.0);
		mecanico.setInformacionEmpleado(informacionEmpleado);

		System.out.println("\nPrueba de Registro de un Vehículo.");
		System.out.println(vehiculos.toString());
		//System.out.println("Ingrese el tipo del vehículo: (Se recomienda ingresar Sedan)");
		String tipo= "Sedan";
		//System.out.println("Ingrese el modelo del vehículo: (Se recomienda ingresar Aveo)");
		String modelo = "Aveo";
		//System.out.println("Ingrese la marca del vehículo: (Se recomienda ingresar Chevrolet)");
		String marca = "Chevrolet";
		//System.out.println("Ingrese la matrícula del vehículo: (Se recomienda ingresar POV-336)");
		String matricula= "PLQ-8798";
		Vehiculo vehiculo= new Vehiculo(propietario1,tipo, modelo, marca, matricula);
		vehiculos.aniadir(vehiculo);
		System.out.println("Registro exitoso.");
		System.out.println( vehiculo.toString());

		//Prueba Segundo Caso de Uso-Consola Mejorada
		//System.out.println(vehiculos.toString());
		System.out.println("\nPrueba de Registro de un Servicio.");
		//System.out.println(servicios.toString());
		//System.out.println("Ingrese el tipo del servicio: (Se recomienda ingresar ABC de Motor)");
		String tipoS= "ABC Motor";
		//System.out.println("Ingrese el detalle del servicio: (Se recomienda ingresar ABC de Motor + Lavado Profundo)");
		String detalleS= "Limpieza de inyectores, cambio de filtro de aceite, regulación de sensor O2";
		//System.out.println("Ingrese el costo del servicio: (Se recomienda ingresar 45.60)");
		Double costo = 90.30;
		Servicio servicio= new Servicio(tipoS, detalleS, costo);
		servicios.aniadir(servicio);
		System.out.println("\nRegistro exitoso.\n");
		System.out.println(servicio.toString());

		//Prueba Tercer Caso de Uso-Consola mejorada
		System.out.println("\nPrueba de Añadir un Servicio Realizado.");
		FichaTecnica fichaTecnica= new FichaTecnica(vehiculo, mecanico);
		int menu=0;
		//System.out.println(servicios.toString());
		//System.out.println("Ingrese el servicio que desea agregar: (Se recomienda ingresar número del 1 al 4)");
		menu= 4;
		fichaTecnica.registrarServicioRealizado(servicios.getServicios().get(menu-1));
		System.out.println("\nServicio Registrado Exitosamente.\n");
		System.out.println(fichaTecnica.toString());
		fichasTecnicas.aniadir(fichaTecnica);
		//System.out.println(fichasTecnicas.toString());


		//Prueba Cuarto Caso de Uso
		System.out.println("\nPrueba de Mostrar la Factura");
		System.out.println("\nFactura realizada Exitosamente.");
		String metodoPago = "Efectivo";
		System.out.println(fichaTecnica.solicitarFactura(metodoPago));

		//Funcionalidades implementadas en la práctica 5
		System.out.println("Datos Mecánico: \n" + mecanico.toString() );

		/*Prueba Test 1
		 *Prueba donde incrementamos el salario de un empleado enviando el un numero de horas para
		 *que el aumento del sueldo sea en funcion del numero de horas que trabajó*/
		System.out.println("\nPrueba de Incrementar el salario de un empleado");
		informacionEmpleado.incrementSalary(20);
		System.out.println(mecanico.toString());

		/*Prueba Test 2
		 *Prueba donde descontamos el salario de un empleado enviando el valor en dolares
		 * Donde descontaremos el sueldo*/
		System.out.println("\nPrueba de Descontar el salario de un empleado");
		informacionEmpleado.discountSalary(20);
		System.out.println(mecanico.toString());

		/*Prueba Test 3
		 *Prueba donde verificaremos si el empleado tiene 3 memos, esta función solo
		 *nos devolvera un valor booleano VERDADERO si tiene un numero de memos igual a 3*/
		informacionEmpleado.increaseMemo();
		informacionEmpleado.increaseMemo();
		//informacionEmpleado.increaseMemo();
		System.out.println("\nPrueba de verificar si un empleado tiene un numero de memos igual a 3");
		System.out.println(informacionEmpleado.verifyMemo()? "El empleado SI tiene 3 memos en total":
				"El empleado NO tiene 3 memos todavía");


	}
}