package Farmacia;

import com.mongodb.BasicDBObject;

public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private String cuil;
	private Domicilio domicilio;
	private ObraSocial obraSocial;

	public Empleado(int id, String nombre, String apellido, int dni, String cuil, Domicilio domicilio,
			ObraSocial obraSocial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuil = cuil;
		this.domicilio = domicilio;
		this.obraSocial = obraSocial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public ObraSocial getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	// TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	public BasicDBObject toDBObjectEmpleado() {
		BasicDBObject dbObjetcEmpleado = new BasicDBObject();

		dbObjetcEmpleado.append("id", this.getId());
		dbObjetcEmpleado.append("nombre", this.getNombre());
		dbObjetcEmpleado.append("apellido", this.getApellido());
		dbObjetcEmpleado.append("dni", this.getDni());
		dbObjetcEmpleado.append("cuil", this.getCuil());
		dbObjetcEmpleado.append("obraSocial", this.getObraSocial());
		dbObjetcEmpleado.append("domicilio", this.getDomicilio());

		return dbObjetcEmpleado;

	}

}
