package Ejercicio02;

public class Principal {
	 public static void main(String[] args) {
		    
	     EmpleadoPermanente empleado1 = new EmpleadoPermanente("Chanquete", 1001, 3000.0, "Seguro de salud");
	     empleado1.mostrarDetalles();


	     EmpleadoTemporal empleado2 = new EmpleadoTemporal("Mar", 1002, 6);
	     empleado2.mostrarDetalles();

	     EmpleadoContratista empleado3 = new EmpleadoContratista("PiesdePlomo", 1003, 25.0, 12);
	     empleado3.mostrarDetalles();
	 }
}
