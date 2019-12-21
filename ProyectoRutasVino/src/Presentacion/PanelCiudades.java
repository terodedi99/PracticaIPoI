package Presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;

public class PanelCiudades extends JPanel {
	private JLabel lblCiudadReal;
	private JToolBar toolBar;
	private JButton btnOpiniones;
	private JButton btnPrecio;
	private JButton btnFechasDisponibles;
	private JLabel lblDescripcin;
	private JTextPane txtpnCiudadRealSe;
	private JButton btnnombreusuario;
	private JLabel label;
	private JLabel lblFotoAyuntamiento;
	private JLabel lblMapaCR;

	/**
	 * Create the panel.
	 */
	public PanelCiudades() {
		setBackground(new Color(237, 217, 194));
		setMaximumSize(new Dimension(2147483647, 2147483647));
		setSize(new Dimension(1366, 768));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{704, 135, 136, 138, 146, 0};
		gridBagLayout.rowHeights = new int[]{0, 83, 0, 77, -18, 206, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			lblCiudadReal = new JLabel("  Ciudad Real");
			lblCiudadReal.setFont(new Font("Goudy Old Style", Font.ITALIC, 50));
			lblCiudadReal.setForeground(new Color(81, 43, 55));
			GridBagConstraints gbc_lblCiudadReal = new GridBagConstraints();
			gbc_lblCiudadReal.anchor = GridBagConstraints.WEST;
			gbc_lblCiudadReal.insets = new Insets(0, 0, 5, 5);
			gbc_lblCiudadReal.gridx = 0;
			gbc_lblCiudadReal.gridy = 1;
			add(lblCiudadReal, gbc_lblCiudadReal);
		}
		{
			label = new JLabel(" ");
			label.setIcon(new ImageIcon(PanelCiudades.class.getResource("/Presentacion/icons8-usuario-60.png")));
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.anchor = GridBagConstraints.EAST;
			gbc_label.insets = new Insets(0, 0, 5, 5);
			gbc_label.gridx = 3;
			gbc_label.gridy = 1;
			add(label, gbc_label);
		}
		{
			btnnombreusuario = new JButton("@nombreusuario");
			btnnombreusuario.setFont(new Font("Goudy Old Style", Font.BOLD, 17));
			btnnombreusuario.setOpaque(false);
			btnnombreusuario.setBackground(new Color(237, 217, 194));
			GridBagConstraints gbc_btnnombreusuario = new GridBagConstraints();
			gbc_btnnombreusuario.anchor = GridBagConstraints.WEST;
			gbc_btnnombreusuario.insets = new Insets(0, 0, 5, 0);
			gbc_btnnombreusuario.gridx = 4;
			gbc_btnnombreusuario.gridy = 1;
			add(btnnombreusuario, gbc_btnnombreusuario);
		}
		{
			toolBar = new JToolBar();
			GridBagConstraints gbc_toolBar = new GridBagConstraints();
			gbc_toolBar.anchor = GridBagConstraints.WEST;
			gbc_toolBar.gridwidth = 2;
			gbc_toolBar.insets = new Insets(0, 0, 5, 5);
			gbc_toolBar.gridx = 0;
			gbc_toolBar.gridy = 2;
			add(toolBar, gbc_toolBar);
			{
				btnOpiniones = new JButton("Opiniones");
				btnOpiniones.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
				btnOpiniones.setForeground(new Color(81, 43, 55));
				btnOpiniones.setBorder(new RoundedBorder(10));
				toolBar.add(btnOpiniones);
			}
			{
				btnPrecio = new JButton("Precio");
				btnPrecio.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
				btnPrecio.setForeground(new Color(81, 43, 55));
				btnPrecio.setBorder(new RoundedBorder(10));
				toolBar.add(btnPrecio);
			}
			{
				btnFechasDisponibles = new JButton("Fechas Disponibles");
				btnFechasDisponibles.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
				btnFechasDisponibles.setForeground(new Color(81, 43, 55));
				btnFechasDisponibles.setBorder(new RoundedBorder(10));
				toolBar.add(btnFechasDisponibles);
			}
		}
		{
			lblDescripcin = new JLabel("  Descripci\u00F3n:");
			lblDescripcin.setVerticalAlignment(SwingConstants.TOP);
			lblDescripcin.setHorizontalAlignment(SwingConstants.LEFT);
			lblDescripcin.setForeground(new Color(81, 43, 55));
			lblDescripcin.setFont(new Font("Goudy Old Style", Font.BOLD, 26));
			GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
			gbc_lblDescripcin.anchor = GridBagConstraints.SOUTHWEST;
			gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescripcin.gridx = 0;
			gbc_lblDescripcin.gridy = 3;
			add(lblDescripcin, gbc_lblDescripcin);
		}
		{
			txtpnCiudadRealSe = new JTextPane();
			txtpnCiudadRealSe.setOpaque(false);
			txtpnCiudadRealSe.setFont(new Font("Tahoma", Font.PLAIN, 17));
			txtpnCiudadRealSe.setText("\r\nCiudad Real se encuentra en el centro de Espa\u00F1a, al sur de Madrid. La Puerta de Toledo es una de las puertas originales de la ciudad, de estilo mud\u00E9jar. \r\nEl Museo del Quijote est\u00E1 consagrado a la novela cl\u00E1sica de Miguel de Cervantes. \n\r\nLa iglesia g\u00F3tica de San Pedro se caracteriza por sus decoraciones moriscas, mientras que la catedral de Santa Mar\u00EDa del Prado, del siglo XIII, tiene una gran nave y un retablo barroco muy ornamentado.");
			txtpnCiudadRealSe.setSize(new Dimension(8, 8));
			GridBagConstraints gbc_txtpnCiudadRealSe = new GridBagConstraints();
			gbc_txtpnCiudadRealSe.gridwidth = 2;
			gbc_txtpnCiudadRealSe.gridheight = 2;
			gbc_txtpnCiudadRealSe.insets = new Insets(0, 0, 5, 5);
			gbc_txtpnCiudadRealSe.fill = GridBagConstraints.BOTH;
			gbc_txtpnCiudadRealSe.gridx = 0;
			gbc_txtpnCiudadRealSe.gridy = 4;
			add(txtpnCiudadRealSe, gbc_txtpnCiudadRealSe);
		}
		{
			lblFotoAyuntamiento = new JLabel(" ");
			lblFotoAyuntamiento.setIcon(new ImageIcon(PanelCiudades.class.getResource("/Presentacion/ayunta1.png")));
			GridBagConstraints gbc_lblFotoAyuntamiento = new GridBagConstraints();
			gbc_lblFotoAyuntamiento.gridheight = 3;
			gbc_lblFotoAyuntamiento.anchor = GridBagConstraints.NORTHEAST;
			gbc_lblFotoAyuntamiento.gridwidth = 3;
			gbc_lblFotoAyuntamiento.gridx = 2;
			gbc_lblFotoAyuntamiento.gridy = 4;
			add(lblFotoAyuntamiento, gbc_lblFotoAyuntamiento);
		}
		{
			lblMapaCR = new JLabel(" ");
			lblMapaCR.setIcon(new ImageIcon(PanelCiudades.class.getResource("/Presentacion/mapacCR.PNG")));
			GridBagConstraints gbc_lblMapaCR = new GridBagConstraints();
			gbc_lblMapaCR.gridwidth = 2;
			gbc_lblMapaCR.insets = new Insets(0, 0, 0, 5);
			gbc_lblMapaCR.gridx = 0;
			gbc_lblMapaCR.gridy = 6;
			add(lblMapaCR, gbc_lblMapaCR);
		}

	}

}
