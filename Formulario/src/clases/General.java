package clases;
import java.io.Serializable;
import clases.Modelo;


public class General implements Serializable {
	
	private Marca marca;
	private Modelo modelo;
	private SistemaOperativo sistemaOperativo;
	private int capacidadMemoria;
	private int capacidadDisco;
	private int resolucion;
	private int tama�oPantalla;
	private String compania;
	private int numeroTelefonico;
	
	
	
	
	public General(Marca marca, Modelo modelo, SistemaOperativo sistemaOperativo, int capacidadMemoria,
			int capacidadDisco, int resolucion, int tama�oPantalla, String compania, int numeroTelefonico) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.sistemaOperativo = sistemaOperativo;
		this.capacidadMemoria = capacidadMemoria;
		this.capacidadDisco = capacidadDisco;
		this.resolucion = resolucion;
		this.tama�oPantalla = tama�oPantalla;
		this.compania = compania;
		this.numeroTelefonico = numeroTelefonico;
	}

	public void General() {
	}

	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public Modelo getModelo() {
		return modelo;
	}


	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}


	public SistemaOperativo getSistemaOperativo() {
		return sistemaOperativo;
	}


	public void setSistemaOperativo(SistemaOperativo sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	public int getCapacidadMemoria() {
		return capacidadMemoria;
	}


	public void setCapacidadMemoria(int capacidadMemoria) {
		this.capacidadMemoria = capacidadMemoria;
	}


	public int getCapacidadDisco() {
		return capacidadDisco;
	}


	public void setCapacidadDisco(int capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}


	public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public int getTama�oPantalla() {
		return tama�oPantalla;
	}


	public void setTama�oPantalla(int tama�oPantalla) {
		this.tama�oPantalla = tama�oPantalla;
	}


	
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public int getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(int numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	@Override
	public String toString() {
		return "General [marca=" + marca + ", modelo=" + modelo + ", sistemaOperativo=" + sistemaOperativo
				+ ", capacidadMemoria=" + capacidadMemoria + ", capacidadDisco=" + capacidadDisco + ", resolucion="
				+ resolucion + ", tama�oPantalla=" + tama�oPantalla + ", compania=" + compania + ", numeroTelefonico="
				+ numeroTelefonico + "]";
	}

	
}
