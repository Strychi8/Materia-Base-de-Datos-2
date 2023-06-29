package Farmacia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Sistema {
	CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build()));
	MongoClientSettings settings = MongoClientSettings.builder()
	        .codecRegistry(pojoCodecRegistry).build();
	MongoClient mongoClient;
	MongoCollection<Document> collection;
	

	public MongoClient getMongoClient() {
		return mongoClient;
	}

	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

	public MongoCollection<Document> getCollection() {
		return collection = collection.withCodecRegistry(pojoCodecRegistry);
	}

	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}

	public void conexion(String host, int port) {
		// Getting a connection
		this.mongoClient = new MongoClient(host, port);

		// Select the database and collection
		this.collection = this.mongoClient.getDatabase("Farmacia").getCollection("Venta");
	}

	public void agregarVenta(int numeroTicket, Cliente cliente, LocalDate fechaVenta, String formaPago,
			Sucursal sucursalAsignada, Empleado empleadoCobrador, Empleado empleadoAtendedor,
			List<DetalleVenta> listaDetalleVentas) {

		Document document = new Document();
		document.append("numeroTicket", numeroTicket);
		document.append("cliente", cliente.toDBObjectCliente());

		String fechaComoCadena = fechaVenta.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		document.append("fechaVenta", new Date(fechaComoCadena));

		document.append("formaPago", formaPago);
		document.append("sucursal", sucursalAsignada.toDBObjectSucursal());
		document.append("empleadoCobrador", empleadoCobrador.toDBObjectEmpleado());
		document.append("empleadoAtendedor", empleadoAtendedor.toDBObjectEmpleado());

		List<DBObject> lista = new ArrayList<DBObject>();
		for (DetalleVenta dv : listaDetalleVentas) {
			lista.add(dv.toDBObjectDetalleVenta());
		}
		document.put("listaDetalleVentas", lista);

		// Insert the document in the collection
		this.getCollection().insertOne(document);
	}

	public void desconexion() {
		this.getMongoClient().close();
	}
}
