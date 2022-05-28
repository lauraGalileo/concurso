package fp_steam_awards;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Opciones extends JPanel {


	private ButtonGroup opciones;
	private JRadioButton opc1, opc2, opc3, opc4, opc5, opc6, opc7, opc8, opc9, opc10, opc11, opc12, opc13, opc14, opc15, opc16;
	
	public Opciones() {
		
		
		this.setLayout(new GridLayout(8,2));
		
		opciones = new ButtonGroup();
		opc1 =new JRadioButton("Desarrollo de Aplicaciones WEB");
		opc2 =new JRadioButton("Automoci�n");
		opc3 =new JRadioButton("Mecatr�nica Industrial");
		opc4 =new JRadioButton("Construcciones Met�licas");
		opc5 =new JRadioButton("Automatizaci�n y Rob�tica Industrial");
		opc6 =new JRadioButton("Proyectos de Obra Civil");
		opc7 =new JRadioButton("Mantenimiento Electr�nico");
		opc8 =new JRadioButton("Administraci�n de Sistemas Inform�ticos");
		opc9 =new JRadioButton("Diet�tica");
		opc10 =new JRadioButton("Educaci�n Infantil");
		opc11 =new JRadioButton("Estilismo y Direcci�n de Peluquer�a");
		opc12 =new JRadioButton("Integraci�n Social");
		opc13 =new JRadioButton("Comercio Internacional");
		opc14 =new JRadioButton("Dise�o y Amueblamiento");
		opc15 =new JRadioButton("Gu�a, Informaci�n y Asistencias Tur�sticas");
		opc16 =new JRadioButton("Higiene Bucodental");
		
		opciones.add(opc1);opciones.add(opc2);
		opciones.add(opc3);opciones.add(opc4);
		opciones.add(opc5);opciones.add(opc6);
		opciones.add(opc7);opciones.add(opc8);
		opciones.add(opc9);opciones.add(opc10);
		opciones.add(opc11);opciones.add(opc12);
		opciones.add(opc13);opciones.add(opc14);
		opciones.add(opc15);opciones.add(opc16);
		
		this.add(opc1);this.add(opc2);
		this.add(opc3);this.add(opc4);
		this.add(opc5);this.add(opc6);
		this.add(opc7);this.add(opc8);
		this.add(opc9);this.add(opc10);
		this.add(opc11);this.add(opc12);
		this.add(opc13);this.add(opc14);
		this.add(opc15);this.add(opc16);
		this.setVisible(false);
	}

	public ButtonGroup getOpciones() {
		return opciones;
	}

	public void setOpciones(ButtonGroup opciones) {
		this.opciones = opciones;
	}

	public JRadioButton getOpc1() {
		return opc1;
	}

	public void setOpc1(JRadioButton opc1) {
		this.opc1 = opc1;
	}

	public JRadioButton getOpc2() {
		return opc2;
	}

	public void setOpc2(JRadioButton opc2) {
		this.opc2 = opc2;
	}

	public JRadioButton getOpc3() {
		return opc3;
	}

	public void setOpc3(JRadioButton opc3) {
		this.opc3 = opc3;
	}

	public JRadioButton getOpc4() {
		return opc4;
	}

	public void setOpc4(JRadioButton opc4) {
		this.opc4 = opc4;
	}

	public JRadioButton getOpc5() {
		return opc5;
	}

	public void setOpc5(JRadioButton opc5) {
		this.opc5 = opc5;
	}

	public JRadioButton getOpc6() {
		return opc6;
	}

	public void setOpc6(JRadioButton opc6) {
		this.opc6 = opc6;
	}

	public JRadioButton getOpc7() {
		return opc7;
	}

	public void setOpc7(JRadioButton opc7) {
		this.opc7 = opc7;
	}

	public JRadioButton getOpc8() {
		return opc8;
	}

	public void setOpc8(JRadioButton opc8) {
		this.opc8 = opc8;
	}

}
