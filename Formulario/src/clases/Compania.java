package clases;

public class Compania {
	
	private int codigoCompania;
	private String nombreCompania;
	private String direccionCompania;
	private int numeroCompania;
	
	public Compania(int codigoCompania, String nombreCompania, String direccionCompania, int numeroCompania) {
		super();
		this.codigoCompania = codigoCompania;
		this.nombreCompania = nombreCompania;
		this.direccionCompania = direccionCompania;
		this.numeroCompania = numeroCompania;
	}

	public int getCodigoCompania() {
		return codigoCompania;
	}

	public void setCodigoCompania(int codigoCompania) {
		this.codigoCompania = codigoCompania;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public String getDireccionCompania() {
		return direccionCompania;
	}

	public void setDireccionCompania(String direccionCompania) {
		this.direccionCompania = direccionCompania;
	}

	public int getNumeroCompania() {
		return numeroCompania;
	}

	public void setNumeroCompania(int numeroCompania) {
		this.numeroCompania = numeroCompania;
	}

	
	public String toString() {
		return "Compania [codigoCompania=" + codigoCompania + ", nombreCompania=" + nombreCompania
				+ ", direccionCompania=" + direccionCompania + ", numeroCompania=" + numeroCompania + "]";
	}

}
