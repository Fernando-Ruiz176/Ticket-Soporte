package AppSoporte;

import java.util.ArrayList;
import java.util.Scanner;

import java.time.LocalDateTime;



public class AppSoporte {
	
	private static ArrayList<Cliente> clientes 		= new ArrayList<>();
	private static ArrayList<Ejecutivo> ejecutivos	= new ArrayList<>();
	private static ArrayList<Producto> productos 	= new ArrayList<>();
	private static ArrayList<Ticket> tickets		= new ArrayList<>(); 

	private static Ejecutivo ejecutivoConectado;
	private final static int OPCION_MENU_CREAR_TICKET 	= 1;
	private final static int OPCION_MENU_VER_TICKET 	= 2;
	private final static int OPCION_MENU_SALIR 			= 3;
	
	 
	public static void main(String[] args) {
		init();			
		Scanner scanner = new Scanner (System.in);
		int opcionSeleccionada;
		if (autenticar()){
			
			do {
				opcionSeleccionada = menu();
				switch (opcionSeleccionada){
					case OPCION_MENU_CREAR_TICKET:
						crearTicket();
						break;
					case OPCION_MENU_VER_TICKET:
						verTicket();
						break;	
				}
			}while (opcionSeleccionada != OPCION_MENU_SALIR);

		}else {
			System.out.println("Usuario y/o contraseña NO existen!!!");
			System.exit(0);
		}
	}
	
	
	public static void init() {
		//Clientes
		String idCliente  = "1";
		String rut		  ="12345678-1";
		String nombre	  ="Maria Maldonado";
		String telefono	  ="9 8888 4444";
		String email	  ="maria@aiep.cl";
		Cliente cliente   = new Cliente(idCliente, rut, nombre, telefono, email);
		clientes.add(cliente);
		
		String idCliente2 = "2";
		String rut2		  ="8765432-1";
		String nombre2	  ="Andres Vargas";
		String telefono2  ="8 7777 2222";
		String email2	  ="andres@aiep.cl";
		Cliente cliente2  = new Cliente(idCliente2, rut2, nombre2, telefono2, email2);
		clientes.add(cliente2);
		//Ejecutivos
		int id						= 1;
		String rutEjecutivo 		= "12444333-1";
		String nombreEjecutivo  	= "Juan Perez";
		char tipoEjecutivo    		= 'N';
		String password			    = "1234";
		Ejecutivo ejecutivoAtencion = new Ejecutivo(id, rutEjecutivo, nombreEjecutivo, tipoEjecutivo, password);
		ejecutivos.add(ejecutivoAtencion);
		
		int id2						= 2;
		String rutEjecutivo2 		= "15121353-1";
		String nombreEjecutivo2  	= "Camilo Fernandez";
		char tipoEjecutivo2    		= 'E';
		String password2			= "9876";
		Ejecutivo ejecutivoSoporte  = new Ejecutivo(id2, rutEjecutivo2, nombreEjecutivo2, tipoEjecutivo2, password2);
		ejecutivos.add(ejecutivoSoporte);
		
		int id3						= 3;
		String rutEjecutivo3 		= "11999000-k";
		String nombreEjecutivo3  	= "Ramon Farias";
		char tipoEjecutivo3    		= 'N';
		String password3			    = "4321";
		Ejecutivo ejecutivoAtencion2 = new Ejecutivo(id3, rutEjecutivo3, nombreEjecutivo3, tipoEjecutivo3, password3);
		ejecutivos.add(ejecutivoAtencion2);
		
		int id4						= 4;
		String rutEjecutivo4 		= "17123456-1";
		String nombreEjecutivo4  	= "Julio Manriquez";
		char tipoEjecutivo4    		= 'E';
		String password4			= "6835";
		Ejecutivo ejecutivoSoporte2  = new Ejecutivo(id4, rutEjecutivo4, nombreEjecutivo4, tipoEjecutivo4, password4);
		ejecutivos.add(ejecutivoSoporte2);
		
		
		//Productos
		String codigoProducto  = "300";
		String nombreProducto  = "Fibra Óptica 300 Megas";
		Producto producto 	   = new Producto(codigoProducto,nombreProducto);
		productos.add(producto);
		
		String codigoProducto1 = "600";
		String nombreProducto1 = "Fibra Óptica 600 Megas";
		Producto producto1 	   = new Producto(codigoProducto1,nombreProducto1);
		productos.add(producto1);
			
		String codigoProducto2 =  "900" ;
		String nombreProducto2 =  "Fibra Óptica 900 Megas" ;
		Producto producto2     =  new  Producto (codigoProducto2,nombreProducto2);
		productos.add(producto2);


		String codigoProducto3 =  "movil 150" ;
		String nombreProducto3 =  "Internet Móvil 150 GB " ;
		Producto producto3     =  new  Producto (codigoProducto3,nombreProducto3);
		productos.add(producto3);


		String codigoProducto4 =  "movil 180" ;
		String nombreProducto4 =  "Internet Movil 180 GB " ;
		Producto producto4     =  new  Producto (codigoProducto4,nombreProducto4);
		productos.add(producto4);


		String codigoProducto5 =  "movil 200" ;
		String nombreProducto5 =  "Internet Móvil 200 GB " ;
		Producto producto5     =  new  Producto (codigoProducto5,nombreProducto5);
		productos.add(producto5);
		
		
	}


	public static void crearTicket() {
		LocalDateTime fechaHora = LocalDateTime.now();
		Scanner scanner = new Scanner (System.in);
		System.out.println("Confirme rut del cliente:");
		String ruts     = scanner.nextLine();
		Cliente rutCliente = buscarCliente (ruts);
		
		System.out.println("Ingrese nombre y codigo del servicio afectado");
		String codigoProducto= scanner.nextLine();
		Producto codigoDelProducto = null;
		for(Producto producto: productos) {
			if (codigoProducto == producto.getCodigoProducto()) {
				codigoDelProducto = producto;
			}
		}
		
		System.out.println("Confirme rut del ejecutivo primario:");
		String ruts2     = scanner.nextLine();
		Ejecutivo rutEjecutivo = buscarEjecutivo (ruts2);
			
		System.out.println("Ingrese especificacion del Problema");
		String especificacion = scanner.nextLine();
		
		System.out.println("Genere la ayuda y resetee sistema, espere respuesta");
		String solucion = scanner.nextLine();
		
		System.out.println("Confirme rut del ejecutivo de soporte:");
		String ruts22     = scanner.nextLine();
		Ejecutivo rutEjecutivo2 = buscarEjecutivo (ruts22);
					
		System.out.println("Ingrese estado");
		String estado = scanner.nextLine();
		
		Ticket ticketNuevo = new Ticket(fechaHora, rutCliente,  codigoDelProducto, rutEjecutivo , rutEjecutivo2, especificacion,  solucion,  estado);
		tickets.add(ticketNuevo);
		
	}
	
	private static Cliente buscarCliente(String rut) {
		for(Cliente cliente: clientes) {
			if( cliente.getRut().equalsIgnoreCase(rut)) {
				return cliente;
			}
		}
		return null;
	}
	
	private static Ejecutivo buscarEjecutivo(String rut) {
		for(Ejecutivo ejecutivo: ejecutivos) {
			if( ejecutivo.getRutEjecutivo().equalsIgnoreCase(rut)) {
				return ejecutivo;
			}
		}
		return null;
	}
	private static Ejecutivo buscarEjecutivo2(String rut) {
		for(Ejecutivo ejecutivo2: ejecutivos) {
			if( ejecutivo2.getRutEjecutivo().equalsIgnoreCase(rut)) {
				return ejecutivo2;
			}
		}
		return null;
	}
	
	public static void verTicket() {
		System.out.println("\nReporte de Atencion\n========================\n");


		for(Ticket ticket : tickets) {
			System.out.printf("Ticket        : " + ticket.getFechaHora() 
			+ "\nEspecificacin : " + ticket.getProblema()
			+ "\nAsistente     : " + ticket.getEjecutivoPrimario().getNombreEjecutivo()
			+ "\nSolucion      : " + ticket.getSolucion()
			+ "\nSoporte       : " + ticket.getEjecutivoSoporte().getNombreEjecutivo()
			+ "\nEstado        : " + ticket.getEstado()); 
			 
		}
	
	}

    public static boolean autenticar() {
        Scanner scannerConsola = new Scanner( System.in );
        System.out.println("Por favor ingrese su rut (ej: 12345678-k):");
        String usuario = scannerConsola.next();
        System.out.println("Por favor ingrese su password:");
        String password = scannerConsola.next();

        for( Ejecutivo ejecutivo : ejecutivos ) {
                                   
                if(    ejecutivo.getRutEjecutivo().equalsIgnoreCase( usuario ) 
                       && ejecutivo.getPassword().equals(password)         ) {
                	   ejecutivoConectado = ejecutivo; 
                        return true; 
                } 
        }
        return false;
    }
    
	public static int menu() {
		System.out.println("\n\nMenu Atencion al Cliente \n========================\n");
		System.out.println("1. Crear Ticket");
		System.out.println("2. Ver Ticket");
		System.out.println("3. Salir");
		System.out.println("\nPor favor Seleccione una Opcion");
		Scanner scanner = new Scanner(System.in);
		int opcionSeleccionada = scanner.nextInt();
		
		return opcionSeleccionada;
	}

}
