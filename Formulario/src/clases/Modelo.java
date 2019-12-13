package clases;

public class Modelo {
	
	private int numeroTelefonico;
	private Compania compania;
	private int capacidadCamara;
	private String marcaProcesador;
	private OtrosComponentes otrosComponentes;
	
	
	public Modelo(int numeroTelefonico, Compania compania, int capacidadCamara, String marcaProcesador,
			OtrosComponentes otrosComponentes) {
		super();
		this.numeroTelefonico = numeroTelefonico;
		this.compania = compania;
		this.capacidadCamara = capacidadCamara;
		this.marcaProcesador = marcaProcesador;
		this.otrosComponentes = otrosComponentes;
		
	}
	
	public void Modelo() {
	}


	public int getNumeroTelefonico() {
		return numeroTelefonico;
	}


	public void setNumeroTelefonico(int numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}


	public Compania getCompania() {
		return compania;
	}


	public void setCompania(Compania compania) {
		this.compania = compania;
	}


	public int getCapacidadCamara() {
		return capacidadCamara;
	}


	public void setCapacidadCamara(int capacidadCamara) {
		this.capacidadCamara = capacidadCamara;
	}


	public String getMarcaProcesador() {
		return marcaProcesador;
	}


	public void setMarcaProcesador(String marcaProcesador) {
		this.marcaProcesador = marcaProcesador;
	}


	public OtrosComponentes getOtrosComponentes() {
		return otrosComponentes;
	}


	public void setOtrosComponentes(OtrosComponentes otrosComponentes) {
		this.otrosComponentes = otrosComponentes;
	}


	
	public String toString() {
		return "Modelo [numeroTelefonico=" + numeroTelefonico + ", compania=" + compania + ", capacidadCamara="
				+ capacidadCamara + ", marcaProcesador=" + marcaProcesador + ", otrosComponentes=" + otrosComponentes
				+ "]";
	}

}



