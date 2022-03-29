
public class Ejecutivo {
	
	private int id;
	private String nombre;
	private String rut;
	private char tipo;
	private String password;
	
	
	
	public Ejecutivo() {
		
	}

	public Ejecutivo(int id, String nombre, String rut, char tipo, String password) {
		
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.tipo = tipo;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if( id > 0) {
			this.id = id;
		} else {
			throw new Exception("No se pueden asignar valores menores a 1 al ID");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
