package fp_steam_awards;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AccionSexo implements ActionListener{

	private Ventana ventana;
	
	public AccionSexo(Ventana ventana) {
		
		this.ventana=ventana;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ventana.getElegir().setVisible(true);
		ventana.getEnviar().setVisible(true);
		ventana.getElegir().getOpc().setVisible(true);
		}
		
	

}
