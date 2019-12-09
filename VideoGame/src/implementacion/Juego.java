package implementacion;

import java.util.ArrayList;
import java.util.HashMap;

import clases.Item;
import clases.JugadorAnimado;
import clases.Tile;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Juego extends Application{
	private Scene escena;
	private Group root;
	private Canvas canvas;
	private GraphicsContext graficos;
	//private Jugador jugador;
	private JugadorAnimado jugadorAnimado;
	public static boolean derecha=false;
	public static boolean izquierda=false;
	public static boolean arriba=false;
	public static boolean abajo=false;
	public static HashMap<String, Image> imagenes; //Shift+Ctrl+O
	private Item heart;
	private Item heart2;
	private Item heart3;
	private Item heart4;
	private Item heart5;
	private Item heart6;
	private Item heart7;
	private Item heart8;
	private Item heart9;
	private Item heart10;
	private Item heart11;
	private Item heart12;
	private Item heart13;
	private Item heart14;
	private Item heart15;
	private Item heart16;
	private Item heart17;
	private Item heart18;
	private Item heart19;
	private Item heart20;
	//private ArrayList<Image> imagenes;

	private ArrayList<Tile> tiles;

	private int[][] mapa = {
			{1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3},
			{2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2,4},
			
			
	};

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ventana) throws Exception {
		inicializarComponentes();
		graficos = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		ventana.setScene(escena);
		ventana.setTitle("Dragon Tales");
		gestionarEventos();
		ventana.show();
		cicloJuego();
	}

	public void inicializarComponentes() {
		//jugador = new Jugador(-50,400,"goku",1);
		jugadorAnimado = new JugadorAnimado(280,280,"Dragon",5, "volar");
		root = new Group();
		escena = new Scene(root,640,400);
		canvas  = new Canvas(640,400);
		imagenes = new HashMap<String,Image>();
		heart = new Item(20,20,20,25,"Heart");
		heart2 = new Item(450,-200,20,25,"Heart");
		heart3 = new Item(350,-500,20,25,"Heart");
		heart4 = new Item(150,-760,20,25,"Heart");
		heart5 = new Item(370,-890,20,25,"Heart");
		heart6 = new Item(590,-1030,20,25,"Heart");
		heart7 = new Item(120,-1120,20,25,"Heart");
		heart8 = new Item(489,-1290,20,25,"Heart");
		heart9 = new Item(236,-1450,20,25,"Heart");
		heart10 = new Item(50,-1755,20,25,"Heart");
		heart11 = new Item(590,-1900,20,25,"Heart");
		heart12 = new Item(450,-2230,20,25,"Heart");
		heart13 = new Item(350,-2490,20,25,"Heart");
		heart14 = new Item(150,-2570,20,25,"Heart");
		heart15 = new Item(370,-2785,20,25,"Heart");
		heart16 = new Item(590,-2975,20,25,"Heart");
		heart17 = new Item(620,-3170,20,25,"Heart");
		heart18 = new Item(489,-3290,20,25,"Heart");
		heart19 = new Item(236,-3590,20,25,"Heart");
		heart20 = new Item(50,-3760,20,25,"Heart");
		cargarImagenes();
		cargarTiles();
	}

	public void cargarImagenes() {
		imagenes.put("Dragon", new Image("Dragon.png"));
		imagenes.put("Nubes", new Image("Nubes.png"));
		imagenes.put("Heart", new Image("Heart.png"));
		imagenes.put("Tiles2", new Image("Tiles2.png"));

	}

	public void pintar() {
		graficos.setFill(Color.WHITE);
		graficos.fillRect(0, 0, 640, 400);
		graficos.setFill(Color.BLACK);
		
		//jugador.pintar(graficos);

		///Pintar tiles
		for (int i=0;i<tiles.size();i++)
			tiles.get(i).pintar(graficos);
		jugadorAnimado.pintar(graficos);

		//graficos.fillText("Puntuacion: " + puntuacion, 10, 10);
		
		heart.pintar(graficos);
		heart2.pintar(graficos);
		heart3.pintar(graficos);
		heart4.pintar(graficos);
		heart5.pintar(graficos);
		heart6.pintar(graficos);
		heart7.pintar(graficos);
		heart8.pintar(graficos);
		heart9.pintar(graficos);
		heart10.pintar(graficos);
		heart11.pintar(graficos);
		heart12.pintar(graficos);
		heart13.pintar(graficos);
		heart14.pintar(graficos);
		heart15.pintar(graficos);
		heart16.pintar(graficos);
		heart17.pintar(graficos);
		heart18.pintar(graficos);
		heart19.pintar(graficos);
		heart20.pintar(graficos);
		

	}

	public void cargarTiles() {
		tiles = new ArrayList<Tile>();
		for(int i=0; i<mapa.length; i++) {
			for(int j=0; j<mapa[i].length; j++) {
				if (mapa[i][j]!=0)
					tiles.add(new Tile(mapa[i][j], i*320, j*-320, "Tiles2",0));
			}
		}
	}

	public void gestionarEventos() {
		//Evento cuando se presiona una tecla
		escena.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent evento) {
					//Aqui tengo que poner el codigo para identificar cuando se presiono una tecla
					switch (evento.getCode().toString()) {
						case "RIGHT": //derecha
							derecha=true;
							break;
						case "LEFT": //derecha
							izquierda=true;
						break;
						case "SPACE":
							//jugador.setVelocidad(10);
							//jugador.setIndiceImagen("goku-furioso");
							break;
					}
			}
		});

		escena.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent evento) {
				//Aqui tengo que poner el codigo para identificar cuando se soltó una tecla
				switch (evento.getCode().toString()) {
				case "RIGHT": //derecha
					derecha=false;
					break;
				case "LEFT": //derecha
					izquierda=false;
				break;
				case "SPACE":
					//jugador.setVelocidad(1);
					//jugador.setIndiceImagen("goku");
					break;
			}

			}

		});

	}

	public void cicloJuego() {
		long tiempoInicial = System.nanoTime();
		AnimationTimer animationTimer = new AnimationTimer() {
			//Esta rutina simula un ciclo de 60FPS
			@Override
			public void handle(long tiempoActualNanoSegundos) {
				double t = (tiempoActualNanoSegundos - tiempoInicial) / 1000000000.0;
				pintar();
				actualizar(t);

			}

		};
		animationTimer.start(); //Inicia el ciclo
	}

	public void actualizar(double t) {
		jugadorAnimado.mover();
		jugadorAnimado.actualizarAnimacion(t);
		jugadorAnimado.verificarColisiones(heart);
		jugadorAnimado.verificarColisiones(heart2);
		jugadorAnimado.verificarColisiones(heart3);
		jugadorAnimado.verificarColisiones(heart4);
		jugadorAnimado.verificarColisiones(heart5);
		jugadorAnimado.verificarColisiones(heart6);
		jugadorAnimado.verificarColisiones(heart7);
		jugadorAnimado.verificarColisiones(heart8);
		jugadorAnimado.verificarColisiones(heart9);
		jugadorAnimado.verificarColisiones(heart10);
		jugadorAnimado.verificarColisiones(heart11);
		jugadorAnimado.verificarColisiones(heart12);
		jugadorAnimado.verificarColisiones(heart13);
		jugadorAnimado.verificarColisiones(heart14);
		jugadorAnimado.verificarColisiones(heart15);
		jugadorAnimado.verificarColisiones(heart16);
		jugadorAnimado.verificarColisiones(heart17);
		jugadorAnimado.verificarColisiones(heart18);
		jugadorAnimado.verificarColisiones(heart19);
		jugadorAnimado.verificarColisiones(heart20);
		
	}

}
