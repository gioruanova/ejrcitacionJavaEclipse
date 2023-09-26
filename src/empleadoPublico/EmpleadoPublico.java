package empleadoPublico;

public class EmpleadoPublico {

	// Atributos
	public String nombre;// null
	public int nLegajo;// 0
	public double sueldo;// 0.0
	public String email;// null

	// Metodos
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre + "\nLegajo: " + nLegajo + "\nSueldo: " + sueldo + "\nEmail: "+ email);
	}
}
