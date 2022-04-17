package AppSoporte;

public class Ejecutivo {
	
	private int id;
	private String rutEjecutivo;
	private String nombreEjecutivo;
	private char tipoEjecutivo;
	private String password;
	
	public Ejecutivo() {
	}

	public Ejecutivo(int id, String rutEjecutivo, String nombreEjecutivo, char tipoEjecutivo, String password) {
		this.id = id;
		this.rutEjecutivo = rutEjecutivo;
		this.nombreEjecutivo = nombreEjecutivo;
		this.tipoEjecutivo = tipoEjecutivo;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutEjecutivo() {
		return rutEjecutivo;
	}

	public void setRutEjecutivo(String rutEjecutivo) {
		this.rutEjecutivo = rutEjecutivo;
	}

	public String getNombreEjecutivo() {
		return nombreEjecutivo;
	}

	public void setNombreEjecutivo(String nombreEjecutivo) {
		this.nombreEjecutivo = nombreEjecutivo;
	}

	public char getTipoEjecutivo() {
		return tipoEjecutivo;
	}

	public void setTipoEjecutivo(char tipoEjecutivo) {
		this.tipoEjecutivo = tipoEjecutivo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	}
	
	

