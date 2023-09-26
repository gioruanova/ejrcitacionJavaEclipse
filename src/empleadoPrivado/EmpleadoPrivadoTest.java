package empleadoPrivado;

public class EmpleadoPrivadoTest {

	public static void main(String[] args) {
		EmpleadoPrivado e1 = new EmpleadoPrivado();
		EmpleadoPrivado e2 = new EmpleadoPrivado();
		EmpleadoPrivado e3 = new EmpleadoPrivado();

		System.out.println("Empleado PRIVADO");
		e1.setNombre("Jorge");
		e1.setnLegajo(123);
		e1.setSueldo(200000.50);
		e1.setEmail("jorge@test.com");

		System.out.println("Nombre: " + e1.getNombre() + "\nLegajo: " + e1.getnLegajo() + "\nSueldo: " + e1.getSueldo()
				+ "\nEmail: " + e1.getEmail());

		System.out.println("-------------");

		System.out.println("Empleado PRIVADO");
		e2.setNombre("Pepe");
		e2.setnLegajo(456);
		e2.setSueldo(150000.50);
		e2.setEmail("pepe@test.com");
		System.out.println("Nombre: " + e2.getNombre() + "\nLegajo: " + e2.getnLegajo() + "\nSueldo: " + e2.getSueldo()
				+ "\nEmail: " + e2.getEmail());

		System.out.println("-------------");
		
		System.out.println("Empleado PRIVADO");
		e3.setNombre("Luis");
		e3.setnLegajo(789);
		e3.setSueldo(110000.50);
		e3.setEmail("luis@test.com");
		System.out.println("Nombre: " + e3.getNombre() + "\nLegajo: " + e3.getnLegajo() + "\nSueldo: " + e3.getSueldo()
				+ "\nEmail: " + e3.getEmail());

	}

}
