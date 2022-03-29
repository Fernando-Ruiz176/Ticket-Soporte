import java.time.LocalDateTime;

public class Ticket {

	private int numero;
	private LocalDateTime fechaHora = LocalDateTime.now();
	private Cliente cliente;
	private Producto producto;
	private Ejecutivo ejecutivo;
	private Ejecutivo ejecutivoDerivado;
	private String problema;
	private String solucion;
	private String estado;
	
	
	public Ticket() {
		
	}

	public Ticket(int numero, LocalDateTime fechaHora, Cliente cliente, Producto producto, Ejecutivo ejecutivo,
			Ejecutivo ejecutivoDerivado, String problema, String solucion, String estado) throws Exception {
		if (ejecutivo == null) {
			throw new Exception("El ticket debe tener asignado un ejecutivo");
		}
		
		this.numero = numero;
		this.fechaHora = fechaHora;
		this.cliente = cliente;
		this.producto = producto;
		this.ejecutivo = ejecutivo;
		this.ejecutivoDerivado = ejecutivoDerivado;
		this.problema = problema;
		this.solucion = solucion;
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Ejecutivo getEjecutivo() {
		return ejecutivo;
	}

	public void setEjecutivo(Ejecutivo ejecutivo) {
		this.ejecutivo = ejecutivo;
	}

	public Ejecutivo getEjecutivoDerivado() {
		return ejecutivoDerivado;
	}

	public void setEjecutivoDerivado(Ejecutivo ejecutivoDerivado) {
		this.ejecutivoDerivado = ejecutivoDerivado;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
