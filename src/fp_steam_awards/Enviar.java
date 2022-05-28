package fp_steam_awards;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Enviar extends JPanel{

	private JButton envia;
	private JFrame ventana;
	
	public Enviar(JFrame ventana) {
		this.ventana=ventana;
		envia= new JButton("Enviar");
		envia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ventana, "Cambiemos las reglas", " ",JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		});
		this.setLayout(null);
		
		this.add(envia);
		envia.setBounds(230, 80, 100, 40);
		this.setVisible(false);
		
	}

	public JButton getEnvia() {
		return envia;
	}

	public void setEnvia(JButton envia) {
		this.envia = envia;
	}
	
}
