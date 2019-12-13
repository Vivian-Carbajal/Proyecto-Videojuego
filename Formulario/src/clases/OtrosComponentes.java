package clases;

public class OtrosComponentes {
	
	private String NFL;
	private String LTE;
	private String Bluetooth;
	
	public OtrosComponentes(String nFL, String lTE, String bluetooth) {
		super();
		NFL = nFL;
		LTE = lTE;
		Bluetooth = bluetooth;
	}

	public String getNFL() {
		return NFL;
	}

	public void setNFL(String nFL) {
		NFL = nFL;
	}

	public String getLTE() {
		return LTE;
	}

	public void setLTE(String lTE) {
		LTE = lTE;
	}

	public String getBluetooth() {
		return Bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		Bluetooth = bluetooth;
	}

	public String toString() {
		return "OtrosComponentes [NFL=" + NFL + ", LTE=" + LTE + ", Bluetooth=" + Bluetooth + "]";
	}

}
