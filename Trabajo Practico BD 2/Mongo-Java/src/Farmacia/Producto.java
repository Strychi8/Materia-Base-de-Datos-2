package Farmacia;

import com.mongodb.BasicDBObject;

public class Producto {
    
	private int id;
    private String tipo;
    private String descripcion;
    private String laboratorio;
    private String codNumerico;
    private double precio;
    
	public Producto(int id, String tipo, String descripcion, String laboratorio, String codNumerico, double precio) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.codNumerico = codNumerico;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public String getCodNumerico() {
		return codNumerico;
	}
	public void setCodNumerico(String codNumerico) {
		this.codNumerico = codNumerico;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	// TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
		public BasicDBObject toDBObjectProducto() {
			BasicDBObject dbObjetcProducto = new BasicDBObject();

			dbObjetcProducto.append("id", this.getId());
			dbObjetcProducto.append("tipo", this.getTipo());
			dbObjetcProducto.append("descripcion", this.getDescripcion());
			dbObjetcProducto.append("laboratorio", this.getLaboratorio());
			dbObjetcProducto.append("codNumerico", this.getCodNumerico());
			dbObjetcProducto.append("precio", this.getPrecio());

			return dbObjetcProducto;

		}
    
    
}
