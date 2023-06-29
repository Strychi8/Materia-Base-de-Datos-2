package Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Farmacia.Cliente;
import Farmacia.DetalleVenta;
import Farmacia.Domicilio;
import Farmacia.Empleado;
import Farmacia.ObraSocial;
import Farmacia.Producto;
import Farmacia.Sistema;
import Farmacia.Sucursal;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Domicilio domicilio = new Domicilio(1, "20 de Septiembre", "Banfield", "Buenos Aires");
		Domicilio domicilio1 = new Domicilio(2, "Avenida Pavon", "Lanus", "Buenos Aires");
		Domicilio domicilio2 = new Domicilio(3, "Miguel Cane", "Lanus", "Buenos Aires");
		Domicilio domicilio3 = new Domicilio(4, "Figueroa Alcorta", "Palermo", "Buenos Aires");
		Domicilio domicilio4 = new Domicilio(5, "La Pampa", "Palermo", "Buenos Aires");
		Domicilio domicilio5 = new Domicilio(6, "Sarmiento", "Villa Fiorito", "Buenos Aires");

		ObraSocial obraSocial = new ObraSocial(1, "Hermanos S.A", 1);
		ObraSocial obraSocial1 = new ObraSocial(2, "AFIP", 2);

		// CLIENTES
		Cliente cliente1 = new Cliente(1, "Jorge", "Perez", 41767737, domicilio, obraSocial);
		Cliente cliente2 = new Cliente(2, "Manuel", "Grecco", 31321345, domicilio1, obraSocial);
		Cliente cliente3 = new Cliente(3, "Mario", "Lopez", 36789654, domicilio3, obraSocial);
		Cliente cliente4 = new Cliente(4, "Carlos", "Benitez", 40123432, domicilio2, obraSocial1);
		Cliente cliente5 = new Cliente(5, "Matias", "Corvalan", 42567432, domicilio4, obraSocial);
		Cliente cliente6 = new Cliente(6, "Federico", "Acosta", 39654321, domicilio, obraSocial1);
		Cliente cliente7 = new Cliente(7, "Leopoldo", "Garro", 38567432, domicilio4, obraSocial1);
		Cliente cliente8 = new Cliente(8, "Mauro", "Barco", 34567321, domicilio5, obraSocial);
		Cliente cliente9 = new Cliente(9, "Tomas", "Esposito", 37654211, domicilio3, obraSocial);
		Cliente cliente10 = new Cliente(10, "Enrique", "Sotto", 38666544, domicilio2, obraSocial);

		// PRODUCTOS
		Producto producto1 = new Producto(1, "Perfume", "Axel", "Eurolab", "1010", 125);
		Producto producto2 = new Producto(2, "Perfume", "Rexonna", "Richmond", "1111", 100);
		Producto producto3 = new Producto(3, "Perfume", "Pacco", "Richmond", "1212", 73);
		Producto producto4 = new Producto(4, "Medicamento", "Morfina", "Eurolab", "1313", 325);
		Producto producto5 = new Producto(5, "Medicamento", "Manitol", "Eurolab", "1414", 300);
		Producto producto6 = new Producto(6, "Medicamento", "Isoprotenerol", "Richmond", "1515", 415);
		Producto producto7 = new Producto(7, "Medicamento", "Dopamina", "Richmond", "1616", 245);
		Producto producto8 = new Producto(8, "Medicamento", "Atropina", "Richmond", "1717", 350);
		Producto producto9 = new Producto(9, "Medicamento", "Propofol", "Eurolab", "1818", 520);
		Producto producto10 = new Producto(10, "Medicamento", "Aspirina", "Eurolab", "1919", 480);
        
		//EMPLEADOS
		Empleado empleado1 = new Empleado(1,"Facundo","Fernandez",11111111,"20111111110",domicilio,obraSocial);
		Empleado empleado2 = new Empleado(2,"Jorge","Rivera",22222222,"21222222220",domicilio1,obraSocial1);
		Empleado empleado3 = new Empleado(3,"Claudio","Fernandez",33333333,"22333333330",domicilio3,obraSocial);
		Empleado empleado4 = new Empleado(4,"Leandro","Lopez",44444444,"20444444440",domicilio3,obraSocial1);
	    Empleado empleado5 = new Empleado(5,"Lucas","Morandi",55555555,"23555555550",domicilio,obraSocial1);
	    Empleado empleado6 = new Empleado(6,"Alejo","Suarez",66666666,"21666666660",domicilio5,obraSocial1);
	    Empleado empleado7 = new Empleado(7,"Roberto","Guzman",77777777,"21777777770",domicilio4,obraSocial1);
	    Empleado empleado8 = new Empleado(8,"Julian","Vazquez",88888888,"21888888880",domicilio1,obraSocial);
	    Empleado empleado9 = new Empleado(9,"Mariano","Sotto",99999999,"21999999990",domicilio5,obraSocial);
	    
		// LISTA de EMPLEADOS
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		List<Empleado> listaEmpleados1 = new ArrayList<Empleado>();
		List<Empleado> listaEmpleados2 = new ArrayList<Empleado>();
		
		 listaEmpleados.add(new Empleado(1,"Facundo","Fernandez",11111111,"20111111110",domicilio,obraSocial));
		 listaEmpleados.add(new Empleado(2,"Jorge","Rivera",22222222,"21222222220",domicilio1,obraSocial1));
		 listaEmpleados.add(new Empleado(3,"Claudio","Fernandez",33333333,"22333333330",domicilio3,obraSocial));
		 
		 listaEmpleados1.add(new Empleado(4,"Leandro","Lopez",44444444,"20444444440",domicilio3,obraSocial1));
		 listaEmpleados1.add(new Empleado(5,"Lucas","Morandi",55555555,"23555555550",domicilio,obraSocial1));
		 listaEmpleados1.add(new Empleado(6,"Alejo","Suarez",66666666,"21666666660",domicilio5,obraSocial1));
		 
		 listaEmpleados2.add(new Empleado(7,"Roberto","Guzman",77777777,"21777777770",domicilio4,obraSocial1));
		 listaEmpleados2.add(new Empleado(8,"Julian","Vazquez",88888888,"21888888880",domicilio1,obraSocial));
		 listaEmpleados2.add(new Empleado(9,"Mariano","Sotto",99999999,"21999999990",domicilio5,obraSocial));
		  
		// SUCURSALES
		Sucursal sucursal1 = new Sucursal(1, "Farmacity",1,domicilio5,"Facundo Fernandez",listaEmpleados);
		Sucursal sucursal2 = new Sucursal(2, "Trebol Verde",5,domicilio1,"Leandro Lopez",listaEmpleados1);
		Sucursal sucursal3 = new Sucursal(3, "Asoprofarma",7,domicilio4,"Roberto Guzman",listaEmpleados2);
		
		//DETALLE VENTA SUCURSAL 1
		  DetalleVenta dv1 = new DetalleVenta(1,producto5.getPrecio(),5,producto5);
		  DetalleVenta dv2 = new DetalleVenta(2,producto1.getPrecio(),4,producto1);
		  DetalleVenta dv3 = new DetalleVenta(3,producto2.getPrecio(),3,producto2);
		  DetalleVenta dv4 = new DetalleVenta(4,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv5 = new DetalleVenta(5,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv6 = new DetalleVenta(6,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv7 = new DetalleVenta(7,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv8 = new DetalleVenta(8,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv9 = new DetalleVenta(9,producto6.getPrecio(),7,producto6);
		  DetalleVenta dv10 = new DetalleVenta(10,producto7.getPrecio(),6,producto7);
		  DetalleVenta dv11 = new DetalleVenta(11,producto8.getPrecio(),5,producto8);
		  DetalleVenta dv12 = new DetalleVenta(12,producto9.getPrecio(),2,producto9);
		  DetalleVenta dv13 = new DetalleVenta(13,producto10.getPrecio(),1,producto10);
		  DetalleVenta dv14 = new DetalleVenta(14,producto1.getPrecio(),2,producto1);
		  DetalleVenta dv15 = new DetalleVenta(15,producto2.getPrecio(),3,producto2);
		  DetalleVenta dv16 = new DetalleVenta(16,producto2.getPrecio(),4,producto2);
		  DetalleVenta dv17 = new DetalleVenta(17,producto3.getPrecio(),7,producto3); 
		  DetalleVenta dv18 = new DetalleVenta(18,producto1.getPrecio(),9,producto1);
		  DetalleVenta dv19 = new DetalleVenta(19,producto6.getPrecio(),6,producto6);
		  DetalleVenta dv20 = new DetalleVenta(20,producto5.getPrecio(),9,producto5);
		  DetalleVenta dv21 = new DetalleVenta(21,producto8.getPrecio(),10,producto8);
		  DetalleVenta dv22 = new DetalleVenta(22,producto9.getPrecio(),5,producto9); 
		  DetalleVenta dv23 = new DetalleVenta(23,producto10.getPrecio(),5,producto10);
		  DetalleVenta dv24 = new DetalleVenta(24,producto2.getPrecio(),7,producto2);
		  DetalleVenta dv25 = new DetalleVenta(25,producto1.getPrecio(),3,producto1);
		  DetalleVenta dv26 = new DetalleVenta(26,producto1.getPrecio(),3,producto1);
		  DetalleVenta dv27 = new DetalleVenta(27,producto4.getPrecio(),2,producto4);
		  DetalleVenta dv28 = new DetalleVenta(28,producto4.getPrecio(),2,producto4);
		  DetalleVenta dv29 = new DetalleVenta(29,producto5.getPrecio(),1,producto5);
		  DetalleVenta dv30 = new DetalleVenta(30,producto6.getPrecio(),3,producto6);
		  DetalleVenta dv31 = new DetalleVenta(31,producto7.getPrecio(),5,producto7);
		  DetalleVenta dv32 = new DetalleVenta(32,producto7.getPrecio(),6,producto7);
		  DetalleVenta dv33 = new DetalleVenta(33,producto4.getPrecio(),7,producto4);
		  DetalleVenta dv34 = new DetalleVenta(34,producto4.getPrecio(),8,producto4);
		  DetalleVenta dv35 = new DetalleVenta(35,producto4.getPrecio(),9,producto4);
		  DetalleVenta dv36 = new DetalleVenta(36,producto5.getPrecio(),10,producto5);
		  DetalleVenta dv37 = new DetalleVenta(37,producto1.getPrecio(),11,producto1);
		  DetalleVenta dv38 = new DetalleVenta(38,producto2.getPrecio(),5,producto2);
		  DetalleVenta dv39 = new DetalleVenta(39,producto3.getPrecio(),7,producto3);
		  DetalleVenta dv40 = new DetalleVenta(40,producto5.getPrecio(),8,producto5);
		  DetalleVenta dv41 = new DetalleVenta(41,producto4.getPrecio(),9,producto4);
		  DetalleVenta dv42 = new DetalleVenta(42,producto3.getPrecio(),6,producto3);
		  DetalleVenta dv43 = new DetalleVenta(43,producto3.getPrecio(),2,producto3);
		  DetalleVenta dv44 = new DetalleVenta(44,producto4.getPrecio(),3,producto4);
		  DetalleVenta dv45 = new DetalleVenta(45,producto3.getPrecio(),5,producto3);
		  DetalleVenta dv46 = new DetalleVenta(46,producto6.getPrecio(),6,producto6);
		  DetalleVenta dv47 = new DetalleVenta(47,producto6.getPrecio(),8,producto6);
		  DetalleVenta dv48 = new DetalleVenta(48,producto10.getPrecio(),2,producto10);
		  DetalleVenta dv49 = new DetalleVenta(49,producto10.getPrecio(),5,producto10);		
		  
		//DETALLE VENTA SUCURSAL 2
		  DetalleVenta dv50 = new DetalleVenta(50,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv51 = new DetalleVenta(51,producto2.getPrecio(),6,producto2);
		  DetalleVenta dv52 = new DetalleVenta(52,producto3.getPrecio(),6,producto3);
		  DetalleVenta dv53 = new DetalleVenta(53,producto4.getPrecio(),5,producto4);
		  DetalleVenta dv54 = new DetalleVenta(54,producto5.getPrecio(),4,producto5);
		  DetalleVenta dv55 = new DetalleVenta(55,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv56 = new DetalleVenta(56,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv57 = new DetalleVenta(57,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv58 = new DetalleVenta(58,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv59 = new DetalleVenta(59,producto6.getPrecio(),7,producto6);
		  DetalleVenta dv60 = new DetalleVenta(60,producto7.getPrecio(),6,producto7);
		  DetalleVenta dv61 = new DetalleVenta(61,producto8.getPrecio(),5,producto8);
		  DetalleVenta dv62 = new DetalleVenta(62,producto9.getPrecio(),2,producto9);
		  DetalleVenta dv63 = new DetalleVenta(63,producto10.getPrecio(),1,producto10);
		  DetalleVenta dv64 = new DetalleVenta(64,producto1.getPrecio(),2,producto1);
		  DetalleVenta dv65 = new DetalleVenta(65,producto2.getPrecio(),3,producto2);
		  DetalleVenta dv66 = new DetalleVenta(66,producto2.getPrecio(),4,producto2);
		  DetalleVenta dv67 = new DetalleVenta(67,producto3.getPrecio(),7,producto3); 
		  DetalleVenta dv68 = new DetalleVenta(68,producto1.getPrecio(),9,producto1);
		  DetalleVenta dv69 = new DetalleVenta(69,producto6.getPrecio(),6,producto6);
		  DetalleVenta dv70 = new DetalleVenta(70,producto5.getPrecio(),9,producto5);
		  DetalleVenta dv71 = new DetalleVenta(71,producto8.getPrecio(),10,producto8);
		  DetalleVenta dv72 = new DetalleVenta(72,producto9.getPrecio(),5,producto9); 
		  DetalleVenta dv73 = new DetalleVenta(73,producto10.getPrecio(),5,producto10);
		  DetalleVenta dv74 = new DetalleVenta(74,producto2.getPrecio(),7,producto2);
		  DetalleVenta dv75 = new DetalleVenta(75,producto1.getPrecio(),3,producto1);
		  DetalleVenta dv76 = new DetalleVenta(76,producto1.getPrecio(),3,producto1);
		  DetalleVenta dv77 = new DetalleVenta(77,producto4.getPrecio(),2,producto4);
		  DetalleVenta dv78 = new DetalleVenta(78,producto4.getPrecio(),2,producto4);
		  DetalleVenta dv79 = new DetalleVenta(79,producto5.getPrecio(),1,producto5);
		  DetalleVenta dv80 = new DetalleVenta(80,producto6.getPrecio(),3,producto6);
		  DetalleVenta dv81 = new DetalleVenta(81,producto7.getPrecio(),5,producto7);
		  DetalleVenta dv82 = new DetalleVenta(82,producto7.getPrecio(),6,producto7);
		  DetalleVenta dv83 = new DetalleVenta(83,producto4.getPrecio(),7,producto4);
		  DetalleVenta dv84 = new DetalleVenta(84,producto4.getPrecio(),8,producto4);
		  DetalleVenta dv85 = new DetalleVenta(85,producto4.getPrecio(),9,producto4);
		  DetalleVenta dv86 = new DetalleVenta(86,producto5.getPrecio(),10,producto5);
		  DetalleVenta dv87 = new DetalleVenta(87,producto1.getPrecio(),11,producto1);
		  DetalleVenta dv88 = new DetalleVenta(88,producto2.getPrecio(),5,producto2);
		  DetalleVenta dv89 = new DetalleVenta(89,producto3.getPrecio(),7,producto3);
		  DetalleVenta dv90 = new DetalleVenta(90,producto5.getPrecio(),8,producto5);
		  DetalleVenta dv91 = new DetalleVenta(91,producto4.getPrecio(),9,producto4);
		  DetalleVenta dv92 = new DetalleVenta(92,producto3.getPrecio(),6,producto3);
		  DetalleVenta dv93 = new DetalleVenta(93,producto3.getPrecio(),2,producto3);
		  DetalleVenta dv94 = new DetalleVenta(94,producto4.getPrecio(),3,producto4);
		  DetalleVenta dv95 = new DetalleVenta(95,producto3.getPrecio(),5,producto3);
		  DetalleVenta dv96 = new DetalleVenta(96,producto6.getPrecio(),6,producto6);
		  DetalleVenta dv97 = new DetalleVenta(97,producto6.getPrecio(),8,producto6);
		  DetalleVenta dv98 = new DetalleVenta(98,producto10.getPrecio(),2,producto10);
		  DetalleVenta dv99 = new DetalleVenta(99,producto10.getPrecio(),5,producto10);
		  DetalleVenta dv100 = new DetalleVenta(100,producto5.getPrecio(),5,producto5);
		  DetalleVenta dv101 = new DetalleVenta(101,producto1.getPrecio(),4,producto1);
		  DetalleVenta dv102 = new DetalleVenta(102,producto2.getPrecio(),3,producto2);
		  DetalleVenta dv103 = new DetalleVenta(103,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv104 = new DetalleVenta(104,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv105 = new DetalleVenta(105,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv106 = new DetalleVenta(106,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv107 = new DetalleVenta(107,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv108 = new DetalleVenta(108,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv109 = new DetalleVenta(109,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv110 = new DetalleVenta(110,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv111 = new DetalleVenta(111,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv112 = new DetalleVenta(112,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv113 = new DetalleVenta(113,producto2.getPrecio(),8,producto2);
		  	  
		//DETALLE VENTA SUCURSAL 3
		  DetalleVenta dv114 = new DetalleVenta(114,producto5.getPrecio(),3,producto5);
		  DetalleVenta dv115 = new DetalleVenta(115,producto1.getPrecio(),4,producto1);
		  DetalleVenta dv116 = new DetalleVenta(116,producto2.getPrecio(),2,producto2);
		  DetalleVenta dv117 = new DetalleVenta(117,producto3.getPrecio(),4,producto3);
		  DetalleVenta dv118 = new DetalleVenta(118,producto4.getPrecio(),2,producto4);
		  DetalleVenta dv119 = new DetalleVenta(119,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv120 = new DetalleVenta(120,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv121 = new DetalleVenta(121,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv122 = new DetalleVenta(122,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv123 = new DetalleVenta(123,producto6.getPrecio(),7,producto6);
		  DetalleVenta dv124 = new DetalleVenta(124,producto7.getPrecio(),6,producto7);
		  DetalleVenta dv125 = new DetalleVenta(125,producto8.getPrecio(),5,producto8);
		  DetalleVenta dv126 = new DetalleVenta(126,producto9.getPrecio(),2,producto9);
		  DetalleVenta dv127 = new DetalleVenta(127,producto10.getPrecio(),1,producto10);
		  DetalleVenta dv128 = new DetalleVenta(128,producto1.getPrecio(),2,producto1);
		  DetalleVenta dv129 = new DetalleVenta(129,producto2.getPrecio(),3,producto2);
		  DetalleVenta dv130 = new DetalleVenta(130,producto2.getPrecio(),4,producto2);
		  DetalleVenta dv131 = new DetalleVenta(131,producto3.getPrecio(),7,producto3); 
		  DetalleVenta dv132 = new DetalleVenta(132,producto1.getPrecio(),9,producto1);
		  DetalleVenta dv133 = new DetalleVenta(133,producto6.getPrecio(),6,producto6);
		  DetalleVenta dv134 = new DetalleVenta(134,producto5.getPrecio(),9,producto5);
		  DetalleVenta dv135 = new DetalleVenta(135,producto8.getPrecio(),10,producto8);
		  DetalleVenta dv136 = new DetalleVenta(136,producto9.getPrecio(),5,producto9); 
		  DetalleVenta dv137 = new DetalleVenta(137,producto10.getPrecio(),5,producto10);
		  DetalleVenta dv138 = new DetalleVenta(138,producto2.getPrecio(),7,producto2);
		  DetalleVenta dv139 = new DetalleVenta(139,producto1.getPrecio(),3,producto1);
		  DetalleVenta dv140 = new DetalleVenta(140,producto1.getPrecio(),3,producto1);
		  DetalleVenta dv141 = new DetalleVenta(141,producto4.getPrecio(),2,producto4);
		  DetalleVenta dv142 = new DetalleVenta(142,producto4.getPrecio(),2,producto4);
		  DetalleVenta dv143 = new DetalleVenta(143,producto5.getPrecio(),1,producto5);
		  DetalleVenta dv144 = new DetalleVenta(144,producto6.getPrecio(),3,producto6);
		  DetalleVenta dv145 = new DetalleVenta(145,producto7.getPrecio(),5,producto7);
		  DetalleVenta dv146 = new DetalleVenta(146,producto7.getPrecio(),6,producto7);
		  DetalleVenta dv147 = new DetalleVenta(147,producto4.getPrecio(),7,producto4);
		  DetalleVenta dv148 = new DetalleVenta(148,producto4.getPrecio(),8,producto4);
		  DetalleVenta dv149 = new DetalleVenta(149,producto4.getPrecio(),9,producto4);
		  DetalleVenta dv150 = new DetalleVenta(150,producto5.getPrecio(),10,producto5);
		  DetalleVenta dv151 = new DetalleVenta(151,producto1.getPrecio(),11,producto1);
		  DetalleVenta dv152 = new DetalleVenta(152,producto2.getPrecio(),5,producto2);
		  DetalleVenta dv153 = new DetalleVenta(153,producto3.getPrecio(),7,producto3);
		  DetalleVenta dv154 = new DetalleVenta(154,producto5.getPrecio(),8,producto5);
		  DetalleVenta dv155 = new DetalleVenta(155,producto4.getPrecio(),9,producto4);
		  DetalleVenta dv156 = new DetalleVenta(156,producto3.getPrecio(),6,producto3);
		  DetalleVenta dv157 = new DetalleVenta(157,producto3.getPrecio(),2,producto3);
		  DetalleVenta dv158 = new DetalleVenta(158,producto4.getPrecio(),3,producto4);
		  DetalleVenta dv159 = new DetalleVenta(159,producto3.getPrecio(),5,producto3);
		  DetalleVenta dv160 = new DetalleVenta(160,producto6.getPrecio(),6,producto6);
		  DetalleVenta dv161 = new DetalleVenta(161,producto6.getPrecio(),8,producto6);
		  DetalleVenta dv162 = new DetalleVenta(162,producto10.getPrecio(),2,producto10);
		  DetalleVenta dv163 = new DetalleVenta(163,producto10.getPrecio(),5,producto10);
		  DetalleVenta dv164 = new DetalleVenta(164,producto5.getPrecio(),5,producto5);
		  DetalleVenta dv165 = new DetalleVenta(165,producto1.getPrecio(),4,producto1);
		  DetalleVenta dv166 = new DetalleVenta(166,producto2.getPrecio(),3,producto2);
		  DetalleVenta dv167 = new DetalleVenta(167,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv168 = new DetalleVenta(168,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv169 = new DetalleVenta(169,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv170 = new DetalleVenta(170,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv171 = new DetalleVenta(171,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv172 = new DetalleVenta(172,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv173 = new DetalleVenta(173,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv174 = new DetalleVenta(174,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv175 = new DetalleVenta(175,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv176 = new DetalleVenta(176,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv177 = new DetalleVenta(177,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv178 = new DetalleVenta(178,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv179 = new DetalleVenta(179,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv180 = new DetalleVenta(180,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv181 = new DetalleVenta(181,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv182 = new DetalleVenta(182,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv183 = new DetalleVenta(183,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv184 = new DetalleVenta(184,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv185 = new DetalleVenta(185,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv186 = new DetalleVenta(186,producto1.getPrecio(),8,producto1);
		  DetalleVenta dv187 = new DetalleVenta(187,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv188 = new DetalleVenta(188,producto2.getPrecio(),8,producto2);
		  DetalleVenta dv189 = new DetalleVenta(189,producto5.getPrecio(),2,producto5);
		  DetalleVenta dv190 = new DetalleVenta(190,producto3.getPrecio(),10,producto3);
		  DetalleVenta dv191 = new DetalleVenta(191,producto1.getPrecio(),5,producto1);
		  DetalleVenta dv192 = new DetalleVenta(192,producto1.getPrecio(),8,producto1);
		  
		//LISTAS PARA DetalleVenta
		  List<DetalleVenta> venta1 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta2 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta3 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta4 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta5 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta6 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta7 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta8 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta9 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta10 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta11 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta12 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta13 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta14 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta15 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta16 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta17 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta18 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta19 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta20 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta21 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta22 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta23 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta24 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta25 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta26 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta27 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta28 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta29 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta30 = new ArrayList<DetalleVenta>();
		  
		  List<DetalleVenta> venta31 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta32 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta33 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta34 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta35 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta36 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta37 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta38 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta39 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta40 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta41 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta42 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta43 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta44 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta45 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta46 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta47 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta48 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta49 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta50 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta51 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta52 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta53 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta54 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta55 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta56 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta57 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta58 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta59 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta60 = new ArrayList<DetalleVenta>();
		  
		  List<DetalleVenta> venta61 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta62 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta63 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta64 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta65 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta66 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta67 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta68 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta69 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta70 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta71 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta72 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta73 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta74 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta75 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta76 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta77 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta78 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta79 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta80 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta81 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta82 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta83 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta84 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta85 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta86 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta87 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta88 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta89 = new ArrayList<DetalleVenta>();
		  List<DetalleVenta> venta90 = new ArrayList<DetalleVenta>();
		 
		  
		  
		  /****************SUCURSAL 1**********************/
		  venta1.add(dv1); venta1.add(dv2); venta1.add(dv3);
		  venta2.add(dv4); venta2.add(dv5);
		  venta3.add(dv6);
		  venta4.add(dv7); venta4.add(dv8); venta4.add(dv9);
		  venta5.add(dv10); venta5.add(dv11); venta5.add(dv12);
		  venta6.add(dv13); venta6.add(dv14); venta6.add(dv15);
		  venta7.add(dv16); venta7.add(dv17);
		  venta8.add(dv18);
		  venta9.add(dv19);
		  venta10.add(dv20);
		  venta11.add(dv21); venta11.add(dv22); venta11.add(dv23);
		  venta12.add(dv24); venta12.add(dv25);
		  venta13.add(dv26);
		  venta14.add(dv27);
		  venta15.add(dv28); venta15.add(dv29);
		  venta16.add(dv30);
		  venta17.add(dv31);
		  venta18.add(dv32); venta18.add(dv33);
		  venta19.add(dv34);
		  venta20.add(dv35);
		  venta21.add(dv36);
		  venta22.add(dv37);
		  venta23.add(dv38); venta23.add(dv39); venta23.add(dv40);
		  venta24.add(dv41);
		  venta25.add(dv42);
		  venta26.add(dv43); venta26.add(dv44);
		  venta27.add(dv45);
		  venta28.add(dv46);
		  venta29.add(dv47); venta29.add(dv48);
		  venta30.add(dv49);
		  
		  /****************SUCURSAL 2**********************/
		  venta31.add(dv50); venta31.add(dv51); venta31.add(dv52);
		  venta32.add(dv53); 
		  venta33.add(dv54); venta33.add(dv55);
		  venta34.add(dv56); venta34.add(dv57); 
		  venta35.add(dv58); venta35.add(dv59); 
		  venta36.add(dv60); venta36.add(dv61); venta36.add(dv62);
		  venta37.add(dv63); venta37.add(dv64);
		  venta38.add(dv65);
		  venta39.add(dv66);
		  venta40.add(dv67); venta40.add(dv68);
		  venta41.add(dv69); 
		  venta42.add(dv70); venta42.add(dv71);
		  venta43.add(dv72);
		  venta44.add(dv73); venta44.add(dv74); venta44.add(dv75);
		  venta45.add(dv76); venta45.add(dv77);
		  venta46.add(dv78);
		  venta47.add(dv79); venta47.add(dv80);
		  venta48.add(dv81); 
		  venta49.add(dv82);
		  venta50.add(dv83); venta50.add(dv84); venta50.add(dv85);
		  venta51.add(dv86); venta51.add(dv87); venta51.add(dv88);
		  venta52.add(dv89);
		  venta53.add(dv90); venta53.add(dv91); venta53.add(dv92);
		  venta54.add(dv93);
		  venta55.add(dv94); venta55.add(dv95);
		  venta56.add(dv96); venta56.add(dv97); venta56.add(dv98);
		  venta57.add(dv99); venta57.add(dv100); venta57.add(dv101);
		  venta58.add(dv102); venta58.add(dv103); venta58.add(dv104);
		  venta59.add(dv105); venta59.add(dv106); venta59.add(dv107); venta59.add(dv108); venta59.add(dv109); venta59.add(dv110);
		  venta60.add(dv111); venta60.add(dv112); venta60.add(dv113);
		  
		  /****************SUCURSAL 3**********************/
		  venta61.add(dv114); venta61.add(dv115); venta61.add(dv116);
		  venta62.add(dv117); venta62.add(dv118); venta62.add(dv119);
		  venta63.add(dv120); venta63.add(dv121); venta63.add(dv122);
		  venta64.add(dv123); venta64.add(dv124); venta64.add(dv125);
		  venta65.add(dv126); venta65.add(dv127); venta65.add(dv128);
		  venta66.add(dv129); venta66.add(dv130); venta66.add(dv131);
		  venta67.add(dv132); venta67.add(dv133); venta67.add(dv134);
		  venta68.add(dv135); venta68.add(dv136); venta68.add(dv137);
		  venta69.add(dv138); venta69.add(dv139); venta69.add(dv140);
		  venta70.add(dv141); venta70.add(dv142); venta70.add(dv143);
		  venta71.add(dv144); venta71.add(dv145); venta71.add(dv146);
		  venta72.add(dv147); venta72.add(dv148); venta72.add(dv149);
		  venta73.add(dv150); venta73.add(dv151); venta73.add(dv152);
		  venta74.add(dv153); venta74.add(dv154); venta74.add(dv155);
		  venta75.add(dv156); venta75.add(dv157); venta75.add(dv158);
		  venta76.add(dv159); venta76.add(dv160); venta76.add(dv161);
		  venta77.add(dv162); venta77.add(dv163); venta77.add(dv164);
		  venta78.add(dv165); venta78.add(dv166); venta78.add(dv167);
		  venta79.add(dv168); venta79.add(dv169); venta79.add(dv170);
		  venta80.add(dv171); venta80.add(dv172);
		  venta81.add(dv173); venta81.add(dv174);
		  venta82.add(dv175); venta82.add(dv176);
		  venta83.add(dv177); venta83.add(dv178);
		  venta84.add(dv179); venta84.add(dv180);
		  venta85.add(dv181); venta85.add(dv182);
		  venta86.add(dv183); venta86.add(dv184);
		  venta87.add(dv185); venta87.add(dv186);
		  venta88.add(dv187); venta88.add(dv188);
		  venta89.add(dv189); venta89.add(dv190);
		  venta90.add(dv191); venta90.add(dv192);
		  
		  
		  //Convertir Objetos Java a JSON
		  
		  /*Gson gson = new Gson();
		  String JSON1 = gson.toJson(cliente1);
		  String JSON2 = gson.toJson(empleado1);
		  String JSON3 = gson.toJson(producto1);
		  String JSON4 = gson.toJson(sucursal1);
		  String JSON5 = gson.toJson(venta1);
		
		  System.out.println("\nCliente 1: " + JSON1);
		  System.out.println("\nEmpleado 1: " + JSON2);
		  System.out.println("\nProducto 1: " + JSON3);
		  System.out.println("\nSucursal 1: " + JSON4);
		  System.out.println("\nVenta 1: " + JSON5);*/
		 
		  
		  //INICIALIZACION DE LA CLASE QUE INTERACTUA CON MONGO 
		  Sistema sistema = new Sistema();
		  
		  //CONEXION AL SERVER DE MONGO DB
		  sistema.conexion("localhost", 27017);
		  
          
		//VENTAS SUCURSAL 1
		  sistema.agregarVenta(0001100, cliente1, LocalDate.of(2023,4,9), "Efectivo", sucursal1, empleado1, empleado3 ,venta1);
		  sistema.agregarVenta(0001101, cliente1, LocalDate.of(2023,4,10), "Efectivo", sucursal1, empleado1, empleado3 ,venta2);
		  sistema.agregarVenta(0001102, cliente1, LocalDate.of(2023,4,10), "Efectivo", sucursal1, empleado3, empleado2 ,venta3);
		  sistema.agregarVenta(0001103, cliente2, LocalDate.of(2023,04,11), "Efectivo", sucursal1, empleado3, empleado1, venta4);
		  sistema.agregarVenta(0001104, cliente2, LocalDate.of(2023,04,12), "Debito", sucursal1, empleado3, empleado1, venta5);
		  
		  sistema.agregarVenta(0001105, cliente2, LocalDate.of(2023,4,15), "Efectivo", sucursal1, empleado3, empleado1 ,venta6);
		  sistema.agregarVenta(0001106, cliente2, LocalDate.of(2023,4,16), "Efectivo", sucursal1, empleado3, empleado1 ,venta7);
		  sistema.agregarVenta(0001107, cliente3, LocalDate.of(2023,4,16), "Efectivo", sucursal1, empleado3, empleado1 ,venta8);
		  //pongo 8 o 9 por el rango
		  sistema.agregarVenta(8, cliente3, LocalDate.of(2023,04,17), "Efectivo", sucursal1, empleado3, empleado1, venta9);
		  sistema.agregarVenta(9, cliente3, LocalDate.of(2023,04,17), "Debito", sucursal1, empleado3, empleado1, venta10);
		  
		  sistema.agregarVenta(0001110, cliente3, LocalDate.of(2023,4,17), "Credito", sucursal1, empleado3, empleado2 ,venta11);
		  sistema.agregarVenta(0001111, cliente3, LocalDate.of(2023,4,17), "Credito", sucursal1, empleado3, empleado2 ,venta12);
		  sistema.agregarVenta(0001112, cliente4, LocalDate.of(2023,4,17), "Credito", sucursal1, empleado3, empleado2 ,venta13);
		  sistema.agregarVenta(0001113, cliente4, LocalDate.of(2023,04,18), "Credito", sucursal1, empleado3, empleado2, venta14);
		  sistema.agregarVenta(0001114, cliente4, LocalDate.of(2023,04,18), "Credito", sucursal1, empleado3, empleado2, venta15);
		  sistema.agregarVenta(0001115, cliente5, LocalDate.of(2023,4,18), "Credito", sucursal1, empleado3, empleado2 ,venta16);
		  sistema.agregarVenta(0001116, cliente5, LocalDate.of(2023,5,19), "Efectivo", sucursal1, empleado3, empleado2 ,venta17);
		  
		  sistema.agregarVenta(0001117, cliente6, LocalDate.of(2023,5,20), "Efectivo", sucursal1, empleado1, empleado3 ,venta18);
		  sistema.agregarVenta(18, cliente6, LocalDate.of(2023,5,20), "Efectivo", sucursal1, empleado1, empleado3, venta19);
		  sistema.agregarVenta(19, cliente6, LocalDate.of(2023,5,20), "Debito", sucursal1, empleado1, empleado3, venta20);
		  sistema.agregarVenta(0001120, cliente6, LocalDate.of(2023,5,21), "Efectivo", sucursal1, empleado1, empleado3 ,venta21);
		  sistema.agregarVenta(0001121, cliente6, LocalDate.of(2023,5,22), "Efectivo", sucursal1, empleado1, empleado3 ,venta22);
		  sistema.agregarVenta(0001122, cliente7, LocalDate.of(2023,5,22), "Efectivo", sucursal1, empleado1, empleado3 ,venta23);
		  sistema.agregarVenta(0001123, cliente7, LocalDate.of(2023,5,22), "Efectivo", sucursal1, empleado2, empleado3, venta24);
		  sistema.agregarVenta(0001124, cliente8, LocalDate.of(2023,5,24), "Debito", sucursal1, empleado2, empleado1, venta25);
		  sistema.agregarVenta(0001125, cliente8, LocalDate.of(2023,5,26), "Efectivo", sucursal1, empleado2, empleado1 ,venta26);
		  sistema.agregarVenta(0001126, cliente9, LocalDate.of(2023,5,26), "Efectivo", sucursal1, empleado2, empleado1 ,venta27);
		  sistema.agregarVenta(0001127, cliente9, LocalDate.of(2023,5,27), "Efectivo", sucursal1, empleado3, empleado1 ,venta28);
		  sistema.agregarVenta(28, cliente10, LocalDate.of(2023,5,28), "Efectivo", sucursal1, empleado3, empleado1, venta29);
		  sistema.agregarVenta(29, cliente10, LocalDate.of(2023,6,5), "Debito", sucursal1, empleado3, empleado1, venta30);
		  
		//VENTAS SUCURSAL 2
		  sistema.agregarVenta(0005200, cliente1, LocalDate.of(2023,4,10), "Efectivo", sucursal2, empleado4, empleado5 ,venta31);
		  sistema.agregarVenta(0005201, cliente1, LocalDate.of(2023,4,11), "Efectivo", sucursal2, empleado4, empleado5 ,venta32);
		  sistema.agregarVenta(0005202, cliente1, LocalDate.of(2023,4,11), "Efectivo", sucursal2, empleado5, empleado4 ,venta33);
		  sistema.agregarVenta(0005203, cliente2, LocalDate.of(2023,04,12), "Efectivo", sucursal2, empleado5, empleado4, venta34);
		  sistema.agregarVenta(0005204, cliente2, LocalDate.of(2023,04,12), "Credito", sucursal2, empleado5, empleado4, venta35);
		  
		   sistema.agregarVenta(0005205, cliente2, LocalDate.of(2023,4,15), "Credito", sucursal2, empleado5, empleado6 ,venta36);
		  sistema.agregarVenta(0005206, cliente2, LocalDate.of(2023,4,15), "Credito", sucursal2, empleado5, empleado6 ,venta37);
		  sistema.agregarVenta(0005207, cliente2, LocalDate.of(2023,4,15), "Credito", sucursal2, empleado5, empleado6 ,venta38);
		  sistema.agregarVenta(38, cliente3, LocalDate.of(2023,04,15), "Efectivo", sucursal2, empleado5, empleado6, venta39);
		  sistema.agregarVenta(39, cliente3, LocalDate.of(2023,04,18), "Debito", sucursal2, empleado5, empleado6, venta40);
		   sistema.agregarVenta(0005210, cliente3, LocalDate.of(2023,4,19), "Efectivo", sucursal2, empleado5, empleado6 ,venta41);
		  sistema.agregarVenta(0005211, cliente3, LocalDate.of(2023,4,25), "Efectivo", sucursal2, empleado5, empleado6 ,venta42);
		  sistema.agregarVenta(0005212, cliente3, LocalDate.of(2023,4,25), "Efectivo", sucursal2, empleado5, empleado6 ,venta43);
		  sistema.agregarVenta(0005213, cliente4, LocalDate.of(2023,04,27), "Efectivo", sucursal2, empleado5, empleado6, venta44);
		  
		  sistema.agregarVenta(0005214, cliente5, LocalDate.of(2023,04,28), "Debito", sucursal2, empleado5, empleado4, venta45);
		   sistema.agregarVenta(0005215, cliente5, LocalDate.of(2023,4,28), "Debito", sucursal2, empleado5, empleado4 ,venta46);
		  sistema.agregarVenta(0005216, cliente5, LocalDate.of(2023,4,28), "Efectivo", sucursal2, empleado5, empleado4 ,venta47);
		  sistema.agregarVenta(0005217, cliente5, LocalDate.of(2023,4,29), "Efectivo", sucursal2, empleado6, empleado4 ,venta48);
		  sistema.agregarVenta(48, cliente5, LocalDate.of(2023,5,11), "Efectivo", sucursal2, empleado6, empleado4, venta49);
		  sistema.agregarVenta(49, cliente5, LocalDate.of(2023,5,11), "Debito", sucursal2, empleado6, empleado4, venta50);
		   sistema.agregarVenta(0005220, cliente6, LocalDate.of(2023,5,11), "Efectivo", sucursal2, empleado6, empleado4 ,venta51);
		  sistema.agregarVenta(0005221, cliente6, LocalDate.of(2023,5,11), "Efectivo", sucursal2, empleado6, empleado5 ,venta52);
		  sistema.agregarVenta(0005222, cliente6, LocalDate.of(2023,5,11), "Efectivo", sucursal2, empleado6, empleado5 ,venta53);
		  sistema.agregarVenta(0005223, cliente7, LocalDate.of(2023,5,16), "Efectivo", sucursal2, empleado6, empleado5, venta54);
		  sistema.agregarVenta(0005224, cliente7, LocalDate.of(2023,5,16), "Credito", sucursal2, empleado6, empleado5, venta55);
		   sistema.agregarVenta(0005225, cliente8, LocalDate.of(2023,5,19), "Credito", sucursal2, empleado6, empleado5 ,venta56);
		  sistema.agregarVenta(0005226, cliente8, LocalDate.of(2023,5,19), "Credito", sucursal2, empleado6, empleado5 ,venta57);
		  sistema.agregarVenta(0005227, cliente9, LocalDate.of(2023,5,19), "Efectivo", sucursal2, empleado4, empleado5 ,venta58);
		  sistema.agregarVenta(58, cliente10, LocalDate.of(2023,5,21), "Efectivo", sucursal2, empleado4, empleado5, venta59);
		  sistema.agregarVenta(59, cliente10, LocalDate.of(2023,5,21), "Debito", sucursal2, empleado4, empleado6, venta60);
		  
		//VENTAS SUCURSAL 3
		  sistema.agregarVenta(0007600, cliente1, LocalDate.of(2023,4,18), "Efectivo", sucursal3, empleado8, empleado7 ,venta61);
		  sistema.agregarVenta(0007601, cliente1, LocalDate.of(2023,4,19), "Efectivo", sucursal3, empleado8, empleado7 ,venta62);
		  sistema.agregarVenta(0007602, cliente1, LocalDate.of(2023,4,20), "Efectivo", sucursal3, empleado8, empleado7 ,venta63);
		  sistema.agregarVenta(0007603, cliente2, LocalDate.of(2023,4,21), "Efectivo", sucursal3, empleado8, empleado7, venta64);
		  sistema.agregarVenta(0007604, cliente2, LocalDate.of(2023,4,21), "Debito", sucursal3, empleado8, empleado7, venta65);
		  
		  sistema.agregarVenta(0007605, cliente9, LocalDate.of(2023,4,21), "Credito", sucursal3, empleado7, empleado9 ,venta66);
		  sistema.agregarVenta(0007606, cliente9, LocalDate.of(2023,4,25), "Credito", sucursal3, empleado7, empleado9 ,venta67);
		  sistema.agregarVenta(0007607, cliente10, LocalDate.of(2023,4,26), "Credito", sucursal3, empleado7, empleado9 ,venta68);
		  sistema.agregarVenta(68, cliente10, LocalDate.of(2023,4,27), "Efectivo", sucursal3, empleado7, empleado8, venta69);
		  sistema.agregarVenta(69, cliente2, LocalDate.of(2023,4,27), "Debito", sucursal3, empleado9, empleado7, venta70);
		  
		  sistema.agregarVenta(0007610, cliente2, LocalDate.of(2023,4,27), "Efectivo", sucursal3, empleado8, empleado9 ,venta71);
		  sistema.agregarVenta(0007611, cliente3, LocalDate.of(2023,4,28), "Efectivo", sucursal3, empleado8, empleado9 ,venta72);
		  sistema.agregarVenta(0007612, cliente3, LocalDate.of(2023,4,29), "Efectivo", sucursal3, empleado8, empleado9 ,venta73);
		  sistema.agregarVenta(0007613, cliente3, LocalDate.of(2023,4,30), "Efectivo", sucursal3, empleado8, empleado9, venta74);
		  sistema.agregarVenta(0007614, cliente3, LocalDate.of(2023,5,18), "Debito", sucursal3, empleado8, empleado9, venta75);
		  
		  sistema.agregarVenta(0007615, cliente3 , LocalDate.of(2023,5,18), "Efectivo", sucursal3, empleado8, empleado9 ,venta76);
		  sistema.agregarVenta(0007616, cliente4, LocalDate.of(2023,5,18), "Efectivo", sucursal3, empleado8, empleado9 ,venta77);
		  sistema.agregarVenta(0007617, cliente4, LocalDate.of(2023,5,18), "Efectivo", sucursal3, empleado7, empleado9 ,venta78);
		  sistema.agregarVenta(78, cliente5, LocalDate.of(2023,5,18), "Efectivo", sucursal3, empleado7, empleado9, venta79);
		  sistema.agregarVenta(79, cliente5, LocalDate.of(2023,5,19), "Debito", sucursal3, empleado7, empleado9, venta80);
		  
		  sistema.agregarVenta(0007620, cliente6, LocalDate.of(2023,5,19), "Efectivo", sucursal3, empleado7, empleado9 ,venta81);
		  sistema.agregarVenta(0007621, cliente6, LocalDate.of(2023,5,20), "Efectivo", sucursal3, empleado7, empleado9 ,venta82);
		  sistema.agregarVenta(0007622, cliente6, LocalDate.of(2023,5,20), "Efectivo", sucursal3, empleado9, empleado7 ,venta83);
		  sistema.agregarVenta(0007623, cliente6, LocalDate.of(2023,5,20), "Efectivo", sucursal3, empleado9, empleado7, venta84);
		  sistema.agregarVenta(0007624, cliente6, LocalDate.of(2023,5,21), "Debito", sucursal3, empleado9, empleado8, venta85);
		  
		  sistema.agregarVenta(0007625, cliente7, LocalDate.of(2023,5,21), "Efectivo", sucursal3, empleado9, empleado7 ,venta86);
		  sistema.agregarVenta(0007626, cliente7, LocalDate.of(2023,5,21), "Efectivo", sucursal3, empleado9, empleado7 ,venta87);
		  sistema.agregarVenta(0007627, cliente8, LocalDate.of(2023,5,23), "Debito", sucursal3, empleado9, empleado7 ,venta88);
		  sistema.agregarVenta(88, cliente8, LocalDate.of(2023,5,25), "Debito", sucursal3, empleado9, empleado7, venta89);
		  sistema.agregarVenta(89, cliente8, LocalDate.of(2023,5,26), "Debito", sucursal3, empleado7, empleado9, venta90);
		  
		  //DESCONEXION DEL SERVER DE MONGO	  
		  sistema.desconexion();
	}

}
