package fp_steam_awards;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	private Datos datos;
	private Elegir elegir;
	private Enviar enviar ;
	
	
	
	public Ventana() {
		super("Elige tu futuro");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(560,600));
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(3,1));
		datos= new Datos(this);
		this.add(datos);
		elegir=new Elegir(this);
		this.add(elegir);
		enviar= new Enviar(this);
		this.add(enviar);
		this.setVisible(true);	
		
	}

	public Datos getDatos() {
		return datos;
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}

	public Elegir getElegir() {
		return elegir;
	}

	public void setElegir(Elegir elegir) {
		this.elegir = elegir;
	}

	public Enviar getEnviar() {
		return enviar;
	}

	public void setEnviar(Enviar enviar) {
		this.enviar = enviar;
	}

}
