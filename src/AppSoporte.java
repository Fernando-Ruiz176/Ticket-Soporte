import java.util.ArrayList;
import java.util.Scanner;

public class AppSoporte {
	
	private static ArrayList<Cliente> clientes     = new ArrayList<>();
	private static ArrayList<Ejecutivo> ejecutivos = new ArrayList<>();
	private static ArrayList<Producto> productos   = new ArrayList<>();
	private static ArrayList<Ticket> tickets       = new ArrayList<>();
	
	private static Ejecutivo ejecutivoConectado;

	public static void main(String[] args) {
		init();
		
		Scanner scannerConsola = new Scanner(System.in);
		System.out.println("Por favor ingrese su usuario: ");
		String usuario = scannerConsola.next();
		System.out.println("por favor ingrese su password: ");
		String password = scannerConsola.next();
		
		for(Ejecutivo ejecutivo : ejecutivos) {
			if( ejecutivo.getRut().equalsIgnoreCase( usuario )
					&& ejecutivo.getPassword().equals(password)  ) {
				ejecutivoConectado = ejecutivo;
				break;
				
			} 
			System.out.println("Usuario y/o contraseña No existen !!! ");
			System.exit(0);
		}
		
	}
	
	private static void init() {
		clientes.add(new Cliente(1, "12345678-1", "Maria Maldonado", "9 8888 4444", "maria@aiep.cl"));
		clientes.add(new Cliente(2, "8765432-1", "Andrés Vargas", "8 7777 2222", "andres@aiep.cl"));
		
		ejecutivos.add(new Ejecutivo(1, "Juan Perez", "12444333-1", 'N', "1234"));
		ejecutivos.add(new Ejecutivo(2, "Ramon Farias", "11999000-k", 'N', "4321"));
		ejecutivos.add(new Ejecutivo(3, "Camilo Fernandez", "15121353-1", 'E', "9876"));
		
		productos.add(new Producto(1, "Fibra 300"));
		productos.add(new Producto(2, "Fibra 600"));
		productos.add(new Producto(3, "Fibra 900"));
		productos.add(new Producto(4, "Movil 150"));
		productos.add(new Producto(5, "Movil 180"));
		productos.add(new Producto(6, "Movil 300"));
		
	}

}
