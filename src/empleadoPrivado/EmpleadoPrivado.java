package empleadoPrivado;

public class EmpleadoPrivado {
	private String nombre;// null
	private int nLegajo;// 0
	private double sueldo;// 0.0
	private String email;// null

	// Setters & Getters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setnLegajo(int nLegajo) {
		this.nLegajo = nLegajo;
	}

	public int getnLegajo() {
		return nLegajo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Metodos
	public void mostrarInfo() {
		System.out.println("EMPLEADO CLASE 2\nNombre: " + nombre + "\nLegajo: " + nLegajo + "\nSueldo: " + sueldo
				+ "\nEmail: " + email);
	}
}
