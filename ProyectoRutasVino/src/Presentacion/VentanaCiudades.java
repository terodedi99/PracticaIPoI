package Presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class VentanaCiudades {

	public JFrame frame;
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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCiudades window = new VentanaCiudades();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaCiudades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(237, 217, 194));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que la aplicación finalice al pulsar "x"
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height); // Cambia el tamaño de la ventana
		frame.getContentPane().setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{577, 156, 133, 281, 0};
		gridBagLayout.rowHeights = new int[]{63, 99, 77, 45, 0, 171, 306, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		{
			lblCiudadReal = new JLabel("  Ciudad Real");
			lblCiudadReal.setFont(new Font("Goudy Old Style", Font.ITALIC, 50));
			lblCiudadReal.setForeground(new Color(81, 43, 55));
			GridBagConstraints gbc_lblCiudadReal = new GridBagConstraints();
			gbc_lblCiudadReal.anchor = GridBagConstraints.WEST;
			gbc_lblCiudadReal.insets = new Insets(0, 0, 5, 5);
			gbc_lblCiudadReal.gridx = 0;
			gbc_lblCiudadReal.gridy = 1;
			frame.getContentPane().add(lblCiudadReal, gbc_lblCiudadReal);
			
			label = new JLabel(" ");
			label.setIcon(new ImageIcon(VentanaCiudades.class.getResource("/Presentacion/icons8-usuario-60.png")));
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.anchor = GridBagConstraints.EAST;
			gbc_label.insets = new Insets(0, 0, 5, 5);
			gbc_label.gridx = 3;
			gbc_label.gridy = 1;
			frame.getContentPane().add(label, gbc_label);
			
			btnnombreusuario = new JButton("@nombreusuario");
			btnnombreusuario.setFont(new Font("Goudy Old Style", Font.BOLD, 17));
			btnnombreusuario.setOpaque(false);
			btnnombreusuario.setBackground(new Color(237, 217, 194));
			GridBagConstraints gbc_btnnombreusuario = new GridBagConstraints();
			gbc_btnnombreusuario.anchor = GridBagConstraints.WEST;
			gbc_btnnombreusuario.insets = new Insets(0, 0, 5, 0);
			gbc_btnnombreusuario.gridx = 4;
			gbc_btnnombreusuario.gridy = 1;
			frame.getContentPane().add(btnnombreusuario, gbc_btnnombreusuario);
			
			toolBar = new JToolBar();
			GridBagConstraints gbc_toolBar = new GridBagConstraints();
			gbc_toolBar.anchor = GridBagConstraints.WEST;
			gbc_toolBar.gridwidth = 2;
			gbc_toolBar.insets = new Insets(0, 0, 5, 5);
			gbc_toolBar.gridx = 0;
			gbc_toolBar.gridy = 2;
			frame.getContentPane().add(toolBar, gbc_toolBar);
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
				frame.getContentPane().add(lblDescripcin, gbc_lblDescripcin);
				
				txtpnCiudadRealSe = new JTextPane();
				txtpnCiudadRealSe.setOpaque(false);
				txtpnCiudadRealSe.setFont(new Font("Tahoma", Font.PLAIN, 17));
				txtpnCiudadRealSe.setText("\r\nCiudad Real se encuentra en el centro de Espa\u00F1a, al sur de Madrid. La Puerta de Toledo es una de las puertas originales de la ciudad, de estilo mud\u00E9jar. \r\nEl Museo del Quijote est\u00E1 consagrado a la novela cl\u00E1sica de Miguel de Cervantes. \n\r\nLa iglesia g\u00F3tica de San Pedro se caracteriza por sus decoraciones moriscas, mientras que la catedral de Santa Mar\u00EDa del Prado, del siglo XIII, tiene una gran nave y un retablo barroco muy ornamentado.");
				txtpnCiudadRealSe.setSize(new Dimension(8, 8));
				GridBagConstraints gbc_txtpnCiudadRealSe = new GridBagConstraints();
				gbc_txtpnCiudadRealSe.anchor = GridBagConstraints.NORTH;
				gbc_txtpnCiudadRealSe.gridwidth = 2;
				gbc_txtpnCiudadRealSe.gridheight = 2;
				gbc_txtpnCiudadRealSe.insets = new Insets(0, 0, 5, 5);
				gbc_txtpnCiudadRealSe.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtpnCiudadRealSe.gridx = 0;
				gbc_txtpnCiudadRealSe.gridy = 4;
				frame.getContentPane().add(txtpnCiudadRealSe, gbc_txtpnCiudadRealSe);
				
				lblFotoAyuntamiento = new JLabel(" ");
				lblFotoAyuntamiento.setIcon(new ImageIcon(VentanaCiudades.class.getResource("/Presentacion/ayunta1.png")));
				GridBagConstraints gbc_lblFotoAyuntamiento = new GridBagConstraints();
				gbc_lblFotoAyuntamiento.gridheight = 4;
				gbc_lblFotoAyuntamiento.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblFotoAyuntamiento.gridwidth = 3;
				gbc_lblFotoAyuntamiento.gridx = 2;
				gbc_lblFotoAyuntamiento.gridy = 3;
				frame.getContentPane().add(lblFotoAyuntamiento, gbc_lblFotoAyuntamiento);
				
				lblMapaCR = new JLabel(" ");
				lblMapaCR.setIcon(new ImageIcon(VentanaCiudades.class.getResource("/Presentacion/mapacCR1.png")));
				GridBagConstraints gbc_lblMapaCR = new GridBagConstraints();
				gbc_lblMapaCR.anchor = GridBagConstraints.NORTH;
				gbc_lblMapaCR.insets = new Insets(0, 0, 0, 5);
				gbc_lblMapaCR.gridx = 0;
				gbc_lblMapaCR.gridy = 6;
				frame.getContentPane().add(lblMapaCR, gbc_lblMapaCR);
			}
		}
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
