package Farmacia;

import com.mongodb.BasicDBObject;

public class DetalleVenta {

	private int id;
	private double total;
	private double precioUnitario;
	private int cantidad;
	private Producto producto;
	
	public DetalleVenta(int id, double precioUnitario, int cantidad, Producto producto) {
		super();
		this.id = id;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.producto = producto;
		this.total = this.cantidad * this.precioUnitario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectDetalleVenta() {
		  BasicDBObject dbObjetcDetalleVenta = new BasicDBObject();
		  
		  dbObjetcDetalleVenta.append("id", this.getId());
		  dbObjetcDetalleVenta.append("total", this.getTotal());
		  dbObjetcDetalleVenta.append("precioUnitario", this.getPrecioUnitario());
		  dbObjetcDetalleVenta.append("cantidad", this.getCantidad());
		  dbObjetcDetalleVenta.append("producto", this.getProducto().toDBObjectProducto());
		  
		  return dbObjetcDetalleVenta;
	  }
	
	
}
