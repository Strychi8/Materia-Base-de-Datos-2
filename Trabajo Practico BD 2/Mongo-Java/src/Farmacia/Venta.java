package Farmacia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

import com.mongodb.BasicDBObject;

public class Venta {

	private int id;
	private int nroTicket;
	private String formaPago;
	private Cliente cliente;
	private LocalDate fechaVenta;
	private Empleado empleadoAtendedor;
	private Empleado empleadoCobrador;
	private List<DetalleVenta> detalleVentas;
	private Sucursal sucursal;

	public Venta(int id, int nroTicket, String formaPago, LocalDate fechaVenta, Empleado empleadoAtendedor,
			Empleado empleadoCobrador, List<DetalleVenta> detalleVentas, Cliente cliente, Sucursal sucursal) {
		super();
		this.id = id;
		this.nroTicket = nroTicket;
		this.formaPago = formaPago;
		this.fechaVenta = fechaVenta;
		this.empleadoAtendedor = empleadoAtendedor;
		this.empleadoCobrador = empleadoCobrador;
		this.detalleVentas = detalleVentas;
		this.cliente = cliente;
		this.sucursal = sucursal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNroTicket() {
		return nroTicket;
	}

	public void setNroTicket(int nroTicket) {
		this.nroTicket = nroTicket;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public List<DetalleVenta> getDetalleVentas() {
		return detalleVentas;
	}

	public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
		this.detalleVentas = detalleVentas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Empleado getEmpleadoAtendedor() {
		return empleadoAtendedor;
	}

	public void setEmpleadoAtendedor(Empleado empleadoAtendedor) {
		this.empleadoAtendedor = empleadoAtendedor;
	}

	public Empleado getEmpleadoCobrador() {
		return empleadoCobrador;
	}

	public void setEmpleadoCobrador(Empleado empleadoCobrador) {
		this.empleadoCobrador = empleadoCobrador;
	}

	// TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB

	public BasicDBObject toDBObjectVenta() {
		BasicDBObject dbObjetcVenta = new BasicDBObject();

		dbObjetcVenta.append("id", this.getId());
		dbObjetcVenta.append("nroTicket", this.getNroTicket());
		dbObjetcVenta.append("formaPago", this.getFormaPago());
		dbObjetcVenta.append("cliente", this.getCliente().toDBObjectCliente());

		String fechaComoCadena = this.getFechaVenta().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		dbObjetcVenta.append("fechaVenta", fechaComoCadena);

		dbObjetcVenta.append("sucursal", this.getSucursal().toDBObjectSucursal());
		dbObjetcVenta.append("empleadoCobrador", this.getEmpleadoCobrador().toDBObjectEmpleado());
		dbObjetcVenta.append("empleadoAtendedor", this.getEmpleadoAtendedor().toDBObjectEmpleado());

		return dbObjetcVenta;
	}

}
