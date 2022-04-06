
public class Producto {
	
	private int tipo;
	private String subTipo;
	
	public Producto() {
	}

	public Producto(int tipo, String subTipo) {
		this.tipo = tipo;
		this.subTipo = subTipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getSubTipo() {
		return subTipo;
	}

	public void setSubTipo(String subTipo) {
		this.subTipo = subTipo;
	}
	
	
}
