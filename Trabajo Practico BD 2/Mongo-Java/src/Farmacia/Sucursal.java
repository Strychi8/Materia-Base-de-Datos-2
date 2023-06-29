package Farmacia;

import java.util.List;

import com.mongodb.BasicDBObject;

public class Sucursal {

	private int id;
	private String nombre;
	private int puntoVenta;
	private Domicilio domicilio;
	private String encargado;
	private List<Empleado> empleados;
	
	public Sucursal(int id, String nombre, int puntoVenta, Domicilio domicilio, String encargado,
			List<Empleado> empleados) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntoVenta = puntoVenta;
		this.domicilio = domicilio;
		this.encargado = encargado;
		this.empleados = empleados;
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
	public int getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(int puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	// TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
		public BasicDBObject toDBObjectSucursal() {
			BasicDBObject dbObjetcSucursal = new BasicDBObject();

			dbObjetcSucursal.append("id", this.getId());
			dbObjetcSucursal.append("nombre", this.getNombre());
			dbObjetcSucursal.append("puntoVenta", this.getPuntoVenta());
			dbObjetcSucursal.append("domicilio", this.getDomicilio());
			dbObjetcSucursal.append("encargado", this.getEncargado());
			dbObjetcSucursal.append("empleados", this.getEmpleados());

			return dbObjetcSucursal;

		}
	
	
}
