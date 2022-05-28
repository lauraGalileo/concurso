package fp_steam_awards;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Opciones extends JPanel {


	private Ventana ven;
	private OpcionesMujer op_mujer;
	private OpcionesHombre op_hombre;
	
	public Opciones(Ventana ventana) {
		ven=ventana;
		this.setLayout(new CardLayout());
		op_mujer=new OpcionesMujer();
		op_hombre= new OpcionesHombre();
		this.add(op_hombre,BorderLayout.CENTER);
		this.add(op_mujer,BorderLayout.CENTER);
	}

	public Ventana getVen() {
		return ven;
	}

	public void setVen(Ventana ven) {
		this.ven = ven;
	}

	public OpcionesMujer getOp_mujer() {
		return op_mujer;
	}

	public void setOp_mujer(OpcionesMujer op_mujer) {
		this.op_mujer = op_mujer;
	}

	public OpcionesHombre getOp_hombre() {
		return op_hombre;
	}

	public void setOp_hombre(OpcionesHombre op_hombre) {
		this.op_hombre = op_hombre;
	}
	
}
