package Farmacia;

import com.mongodb.BasicDBObject;

public class ObraSocial {

	private int id;
	private String nombre;
	private int numAfiliado;

	public ObraSocial(int id, String nombre, int numAfiliado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numAfiliado = numAfiliado;
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

	public int getNumAfiliado() {
		return numAfiliado;
	}

	public void setNumAfiliado(int numAfiliado) {
		this.numAfiliado = numAfiliado;
	}

	// TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	public BasicDBObject toDBObjectObraSocial() {
		BasicDBObject dbObjetcObraSocial = new BasicDBObject();

		dbObjetcObraSocial.append("id", this.getId());
		dbObjetcObraSocial.append("nombre", this.getNombre());
		dbObjetcObraSocial.append("numAfiliado", this.getNumAfiliado());

		return dbObjetcObraSocial;

	}

}
