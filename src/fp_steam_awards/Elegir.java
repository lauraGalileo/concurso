package fp_steam_awards;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Elegir extends JPanel{
	
	private Ventana jf;
	private JLabel titulo;
	private Opciones opc;
	
	
	public Elegir(Ventana ventana){
		jf=ventana;
		this.setLayout(new BorderLayout());
		titulo = new JLabel("Elige tus estudios");
		titulo.setFont(new Font("Franklin Gothic Book",Font.BOLD,20));
		titulo.setHorizontalAlignment(JLabel.CENTER);
		this.add(titulo,BorderLayout.NORTH);
		opc = new Opciones(jf);
		this.add(opc,BorderLayout.CENTER);
		this.setVisible(false);
	}

	public Ventana getJf() {
		return jf;
	}

	public void setJf(Ventana jf) {
		this.jf = jf;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public Opciones getOpc() {
		return opc;
	}

	public void setOpc(Opciones opc) {
		this.opc = opc;
	}



	

}
