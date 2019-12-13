package clases;

import java.io.Serializable;

public class Marca implements Serializable{
	
	private String nombreMarca;
	private int codigoMarca;
	
	public Marca(String nombreMarca, int codigoMarca) {
		super();
		this.nombreMarca = nombreMarca;
		this.codigoMarca = codigoMarca;
	}
	
	public void Marca() {
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public int getCodigoMarca() {
		return codigoMarca;
	}

	public void setCodigoMarca(int codigoMarca) {
		this.codigoMarca = codigoMarca;
	}

	
	public String toString() {
		return "Marca [nombreMarca=" + nombreMarca + ", codigoMarca=" + codigoMarca + "]";
	}
	
	
}
