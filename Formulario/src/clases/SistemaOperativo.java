package clases;

public class SistemaOperativo {
	
	private String nombreSistemaOperativo;
	private int version;
	private int anioLanzamiento;
	
	public SistemaOperativo(String nombreSistemaOperativo, int version, int anioLanzamiento) {
		super();
		this.nombreSistemaOperativo = nombreSistemaOperativo;
		this.version = version;
		this.anioLanzamiento = anioLanzamiento;
	}

	public String getNombreSistemaOperativo() {
		return nombreSistemaOperativo;
	}

	public void setNombreSistemaOperativo(String nombreSistemaOperativo) {
		this.nombreSistemaOperativo = nombreSistemaOperativo;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}

	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}

	
	public String toString() {
		return "SistemaOperativo [nombreSistemaOperativo=" + nombreSistemaOperativo + ", version=" + version
				+ ", anioLanzamiento=" + anioLanzamiento + "]";
	}

}
