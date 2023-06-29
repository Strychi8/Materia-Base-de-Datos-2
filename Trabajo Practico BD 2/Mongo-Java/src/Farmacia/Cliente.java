package Farmacia;

import com.mongodb.BasicDBObject;

public class Cliente {

	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private Domicilio domicilio;
	private ObraSocial obraSocial;

	public Cliente(int id, String nombre, String apellido, int dni, Domicilio domicilio, ObraSocial obraSocial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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
	public BasicDBObject toDBObjectCliente() {
		BasicDBObject dbObjetcCliente = new BasicDBObject();

		dbObjetcCliente.append("id", this.getId());
		dbObjetcCliente.append("nombre", this.getNombre());
		dbObjetcCliente.append("apellido", this.getApellido());
		dbObjetcCliente.append("dni", this.getDni());
		dbObjetcCliente.append("domicilio", this.getDomicilio());
		dbObjetcCliente.append("obraSocial", this.getObraSocial());

		return dbObjetcCliente;

	}

}
