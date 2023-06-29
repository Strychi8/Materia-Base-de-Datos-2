package Farmacia;

import com.mongodb.BasicDBObject;

public class Domicilio {
	
    private int id;
    private String calle;
    private String localidad;
    private String provincia;
	
	public Domicilio(int id, String calle, String localidad, String provincia) {
		super();
		this.id = id;
		this.calle = calle;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	// TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	public BasicDBObject toDBObjectDomicilio() {
		BasicDBObject dbObjetcDomicilio = new BasicDBObject();

		dbObjetcDomicilio.append("id", this.getId());
		dbObjetcDomicilio.append("calle", this.getCalle());
		dbObjetcDomicilio.append("localidad", this.getLocalidad());
		dbObjetcDomicilio.append("provincia", this.getProvincia());

		return dbObjetcDomicilio;

	}
	
	

}
