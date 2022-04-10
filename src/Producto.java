
public class Producto {
	
	private int id;
	private String Tipo;
	
	public Producto() {
	}

	public Producto(int id, String tipo) {
		this.id = id;
		Tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
}
