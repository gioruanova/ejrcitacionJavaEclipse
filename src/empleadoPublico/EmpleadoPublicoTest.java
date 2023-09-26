package empleadoPublico;

public class EmpleadoPublicoTest {

	public static void main(String[] args) {

		EmpleadoPublico e1 = new EmpleadoPublico();
		EmpleadoPublico e2 = new EmpleadoPublico();
		EmpleadoPublico e3 = new EmpleadoPublico();
		
		System.out.println("Empleado PUBLICO");
		e1.nombre = "Jorge";
		e1.nLegajo = 123;
		e1.sueldo = 200000.50;
		e1.email = "jorge@test.com";
		e1.mostrarInfo();
		
		System.out.println("-------------");
		
		System.out.println("Empleado PUBLICO");
		e2.nombre = "Pepe";
		e2.nLegajo = 456;
		e2.sueldo = 150000.50;
		e2.email = "pepe@test.com";
		e2.mostrarInfo();

		System.out.println("-------------");
		
		System.out.println("Empleado PUBLICO");
		e3.nombre = "Luis";
		e3.nLegajo = 789;
		e3.sueldo = 120000.50;
		e3.email = "luis@test.com";
		e3.mostrarInfo();
		
	}

}
