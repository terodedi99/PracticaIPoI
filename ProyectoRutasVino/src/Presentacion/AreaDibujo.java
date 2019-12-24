package Presentacion;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JLabel;

public class AreaDibujo extends JLabel {
	private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();

	public AreaDibujo() {
	}

	void addObjetoGrafico(ObjetoGrafico objg) {
		objetosGraficos.add(objg);
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < objetosGraficos.size(); i++) {
			ObjetoGrafico objg = objetosGraficos.get(i);
			g.drawImage(((ImagenGrafico) objg).getImagen(), objg.getX(), objg.getY(), null);
		}
	}
}
