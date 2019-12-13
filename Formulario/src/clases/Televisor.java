package clases;

public class Televisor {

	private int resolucion;
	private int pulgadas;
	
	
	public Televisor(int resolucion, int pulgadas) {
		super();
		this.resolucion = resolucion;
		this.pulgadas = pulgadas;
		
		
	}


	public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public int getPulgadas() {
		return pulgadas;
	}


	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
		
		
	}



	public String toString() {
		return "Televisor [resolucion=" + resolucion + ", pulgadas=" + pulgadas + "]";
	}
}
