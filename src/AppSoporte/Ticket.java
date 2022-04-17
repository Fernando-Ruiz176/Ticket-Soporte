package AppSoporte;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Ticket {

	
	private LocalDateTime fechaHora = LocalDateTime.now();
	private Cliente cliente;
	private Producto producto;
	private Ejecutivo ejecutivoPrimario;
	private Ejecutivo ejecutivoSoporte;
	private String Problema;
	private String solucion;
	private String estado;
	
	public Ticket() {
	}

	public Ticket(LocalDateTime fechaHora, Cliente cliente, Producto producto, Ejecutivo ejecutivoPrimario,
			Ejecutivo ejecutivoSoporte, String problema, String solucion, String estado) {
		this.fechaHora = fechaHora;
		this.cliente = cliente;
		this.producto = producto;
		this.ejecutivoPrimario = ejecutivoPrimario;
		this.ejecutivoSoporte = ejecutivoSoporte;
		Problema = problema;
		this.solucion = solucion;
		this.estado = estado;
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

	public Ejecutivo getEjecutivoPrimario() {
		return ejecutivoPrimario;
	}

	public void setEjecutivoPrimario(Ejecutivo ejecutivoPrimario) {
		this.ejecutivoPrimario = ejecutivoPrimario;
	}

	public Ejecutivo getEjecutivoSoporte() {
		return ejecutivoSoporte;
	}

	public void setEjecutivoSoporte(Ejecutivo ejecutivoSoporte) {
		this.ejecutivoSoporte = ejecutivoSoporte;
	}

	public String getProblema() {
		return Problema;
	}

	public void setProblema(String problema) {
		Problema = problema;
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
