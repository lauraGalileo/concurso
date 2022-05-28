package fp_steam_awards;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Datos extends JPanel{
	
	private Ventana ventana;
	private JLabel nom, ape, edad, sexo;
	private JTextField text_nom, text_ape,text_edad;
	private JComboBox combo_sexo;
	
	public Datos(Ventana ventana) {
		
		this.ventana=ventana;
		nom= new JLabel("Nombre");ape= new JLabel("Apellidos");
		edad= new JLabel("Edad");sexo= new JLabel("Sexo");
		
		text_nom = new JTextField();
		text_ape = new JTextField();
		text_edad = new JTextField();
		
		combo_sexo = new JComboBox();
		
		this.setLayout(null);
		this.add(nom);this.add(text_nom);
		this.add(ape);this.add(text_ape);
		this.add(edad);this.add(text_edad);
		this.add(sexo);
		combo_sexo.addItem("");
		combo_sexo.addItem("Hombre");
		combo_sexo.addItem("Mujer");
		combo_sexo.addActionListener(new AccionSexo(ventana));
		this.add(combo_sexo);
		
		
		
		nom.setBounds(30, 30, 100, 20);
		text_nom.setBounds(130,30,120,20);
		ape.setBounds(30, 90, 100, 20);
		text_ape.setBounds(130, 90, 120, 20);
		edad.setBounds(300, 60, 100, 20);
		text_edad.setBounds(400, 60, 100, 20);
		sexo.setBounds(150, 150, 80, 20);	
		combo_sexo.setBounds(230, 150, 100, 20);
		
		
	}


	public JLabel getNom() {
		return nom;
	}

	public void setNom(JLabel nom) {
		this.nom = nom;
	}

	public JLabel getApe() {
		return ape;
	}

	public void setApe(JLabel ape) {
		this.ape = ape;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JLabel getSexo() {
		return sexo;
	}

	public void setSexo(JLabel sexo) {
		this.sexo = sexo;
	}

	public JTextField getText_nom() {
		return text_nom;
	}

	public void setText_nom(JTextField text_nom) {
		this.text_nom = text_nom;
	}

	public JTextField getText_ape() {
		return text_ape;
	}

	public void setText_ape(JTextField text_ape) {
		this.text_ape = text_ape;
	}

	public JTextField getText_edad() {
		return text_edad;
	}

	public void setText_edad(JTextField text_edad) {
		this.text_edad = text_edad;
	}

	public JComboBox getCombo_sexo() {
		return combo_sexo;
	}

	public void setCombo_sexo(JComboBox combo_sexo) {
		this.combo_sexo = combo_sexo;
	}
	
}
