package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import clases.General;
import clases.Telefono;
import clases.Compania;
import clases.Marca;
import clases.Modelo;
import clases.Computadora;
import clases.OtrosComponentes;
import clases.SistemaOperativo;
import clases.Televisor;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ControladorFormulario implements Initializable{
	
	private ObservableList<General> generales;
	//private ObservableList<Telefono> telefonos;
	private ObservableList<Marca> marcas;
	private ObservableList<Modelo> modelos;
	private ObservableList<SistemaOperativo> sistemas;
	
	@FXML private ComboBox<Marca> infoMarca;
	@FXML private ComboBox<SistemaOperativo> infoSistema;
	@FXML private ComboBox<Modelo> infoModelo;
	//@FXML private ComboBox<Telefono> infoTelefono;
	@FXML private TextField capacidadMemoria;
	@FXML private TextField capacidadDisco;	
	@FXML private TextField resolucion;
	@FXML private TextField tamañoPantalla;
	@FXML private RadioButton rbtClaro;
	@FXML private RadioButton rbtTigo;
	@FXML private RadioButton rbtHondutel;
	@FXML private TextField numeroTelefonico;
	@FXML private TextField capacidadCamara;
	@FXML private CheckBox otrosComponentes;
	@FXML private ToggleGroup grupoCompania;
	
	@FXML private Button btnNuevo;
	@FXML private Button btnGuardar;
	@FXML private Button btnActualizar;
	@FXML private Button btnEliminar;
	@FXML private Button btnSalir;
	
	@FXML private ListView<General> listaGeneral;
	
	private ArrayList<OtrosComponentes> componentes;
	private ArrayList<String> errores;
	
	
	public ControladorFormulario() {
	} //contructor vacio

	@FXML public void salir() {
		
		System.exit(0);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		generales = FXCollections.observableArrayList();
		modelos = FXCollections.observableArrayList();
		marcas = FXCollections.observableArrayList();
		sistemas = FXCollections.observableArrayList();
		
		errores = new ArrayList<String>(); //arreglo de errores aparte de los arreglos observables
		
		marcas.add(new Marca("Huawei",123));
		marcas.add(new Marca("Samsung",456));
		marcas.add(new Marca("Iphone",789));
		infoMarca.setItems(marcas);
		
		sistemas.add(new SistemaOperativo("Android", 123, 2019));
		sistemas.add(new SistemaOperativo("IOS", 456, 2017));
		sistemas.add(new SistemaOperativo("BLU", 123, 2019));
		infoSistema.setItems(sistemas);
		
		//telefonos.add(new Telefono(333333, new Compania(123,"Apple","USA",222222),1080, "Intel", new OtrosComponentes("l","k","p")));
		//telefonos.add(new Telefono(444444, new Compania(456,"Samsung","USA",55555),1180, "Intel 2", new OtrosComponentes("t","y","u")));
		modelos.add(new Modelo(123, null, 456, null, null));
		modelos.add(new Modelo(456, null, 789, null, null));
		modelos.add(new Modelo(156, null, 896, null, null));
				
		//infoTelefono.setItems(telefonos);
		infoModelo.setItems(modelos);

		listaGeneral.setItems(generales);
		
		listaGeneral.getSelectionModel().selectedItemProperty().addListener(
				
				new ChangeListener<General>() {

					@Override
					public void changed(ObservableValue<? extends General> arg0, General valorAnterior , General valorActual) {
						
						System.out.println("Valor actual: "+valorActual);
						
						if(valorActual!=null) {
							
							infoMarca.getSelectionModel().select(valorActual.getMarca());
							infoSistema.getSelectionModel().select(valorActual.getSistemaOperativo());
							infoModelo.getSelectionModel().select(valorActual.getModelo());
							capacidadMemoria.setText(String.valueOf(valorActual.getCapacidadMemoria()));
							capacidadDisco.setText(String.valueOf(valorActual.getCapacidadDisco()));
							resolucion.setText(String.valueOf(valorActual.getResolucion()));
							tamañoPantalla.setText(String.valueOf(valorActual.getTamañoPantalla()));
							
							if(valorActual.getCompania().equals("Tigo"))
								rbtTigo.setSelected(true);
							if(valorActual.getCompania().equals("Claro"))
								rbtClaro.setSelected(true);
							if(valorActual.getCompania().equals("Hondutel"))
								rbtHondutel.setSelected(true);
							
							numeroTelefonico.setText(String.valueOf(valorActual.getNumeroTelefonico()));
							capacidadCamara.setText(String.valueOf(valorActual.getNumeroTelefonico()));
							
							
						btnGuardar.setDisable(true);	
						btnActualizar.setDisable(false);
						btnEliminar.setDisable(false);
							
					}		
					}
					}
			);
			//leerInformacionArchivo();
	}
	
	@FXML 
	public void nuevo() {
		
		infoMarca.getSelectionModel().clearSelection();
		infoModelo.getSelectionModel().clearSelection();
		infoSistema.getSelectionModel().clearSelection();
		capacidadMemoria.clear();
		capacidadDisco.clear();
		resolucion.clear();
		tamañoPantalla.clear();
		
		
		
		
	}
	}

