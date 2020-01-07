package Presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class VentanaPersonalizarRuta {

	public JFrame frame;
	private JLabel lblPersonalizar;
	private JLabel lblTexto;
	private JToolBar tBarraDibujo;
	private JButton btnLugar;
	private JButton btnRestaurante;
	private JButton btnParque;
	private JButton btnMonumento;
	private JLabel lblMapa;
	// Area de dibujo personalizada (creada extendiendo de JLabel)
	private AreaDibujo areaDibujo;
	// Imagen en la que se cargará el fichero seleccionado por el usuario
	private ImageIcon imagen;
	int modo = -1;
	private final int LUGAR = 1;
	private final int RESTAURANTE = 2;
	private final int PARQUE = 3;
	private final int MONUMENTO = 4;

	// Cursores e imágenes
	private Toolkit toolkit;
	private Image imagLugar;
	private Image imagRestaurante;
	private Image imagParque;
	private Image imagMonumento;

	private Cursor cursorLugar;
	private Cursor cursorRestaurante;
	private Cursor cursorParque;
	private Cursor cursorMonumento;

	// Variables para almacenar las coordenadas.
	private int x, y;
	private JPanel pnlBotones;
	private JButton btnSalir;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPersonalizarRuta window = new VentanaPersonalizarRuta();
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
	public VentanaPersonalizarRuta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(237, 217, 194));
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que la
		// aplicación finalice al pulsar "x"
		frame.setBounds(0, 0, 516, 394); // Establece posición y tamaño de la ventana
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height); // Cambia el tamaño de la ventana
		frame.getContentPane().setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 1153, 16, 0 };
		gridBagLayout.rowHeights = new int[] { 78, 44, 32, 487, 79, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);
		{
			lblPersonalizar = new JLabel("  Personaliza tu ruta");
			lblPersonalizar.setForeground(new Color(81, 43, 55));
			lblPersonalizar.setFont(new Font("Goudy Old Style", Font.PLAIN, 50));
			GridBagConstraints gbc_lblPersonalizar = new GridBagConstraints();
			gbc_lblPersonalizar.anchor = GridBagConstraints.SOUTH;
			gbc_lblPersonalizar.insets = new Insets(0, 0, 5, 5);
			gbc_lblPersonalizar.gridx = 0;
			gbc_lblPersonalizar.gridy = 0;
			frame.getContentPane().add(lblPersonalizar, gbc_lblPersonalizar);
		}
		{
			lblTexto = new JLabel(
					"  Utiliza los iconos para elegir restaurantes, lugares de inter\u00E9s como parques o monumentos.");
			lblTexto.setIcon(
					new ImageIcon(VentanaPersonalizarRuta.class.getResource("/Presentacion/icons8-idea-16.png")));
			lblTexto.setFont(new Font("Goudy Old Style", Font.PLAIN, 17));
			GridBagConstraints gbc_lblTexto = new GridBagConstraints();
			gbc_lblTexto.insets = new Insets(0, 0, 5, 5);
			gbc_lblTexto.gridx = 0;
			gbc_lblTexto.gridy = 1;
			frame.getContentPane().add(lblTexto, gbc_lblTexto);
		}
		{
			tBarraDibujo = new JToolBar();
			tBarraDibujo.setBackground(new Color(244, 229, 226));
			tBarraDibujo.setForeground(Color.LIGHT_GRAY);
			GridBagConstraints gbc_tBarraDibujo = new GridBagConstraints();
			gbc_tBarraDibujo.anchor = GridBagConstraints.NORTH;
			gbc_tBarraDibujo.insets = new Insets(0, 0, 5, 5);
			gbc_tBarraDibujo.gridx = 0;
			gbc_tBarraDibujo.gridy = 2;
			frame.getContentPane().add(tBarraDibujo, gbc_tBarraDibujo);
			{
				btnLugar = new JButton(" ");
				btnLugar.addActionListener(new BtnLugarActionListener());
				btnLugar.setBackground(Color.WHITE);
				btnLugar.setIcon(new ImageIcon(
						VentanaPersonalizarRuta.class.getResource("/Presentacion/icons8-marcador-30.png")));
				btnLugar.setBorder(new RoundedBorder(10));
				tBarraDibujo.add(btnLugar);
			}
			{
				btnRestaurante = new JButton(" ");
				btnRestaurante.addActionListener(new BtnRestauranteActionListener());
				btnRestaurante.setBackground(Color.WHITE);
				btnRestaurante.setIcon(new ImageIcon(
						VentanaPersonalizarRuta.class.getResource("/Presentacion/icons8-restaurante-30.png")));
				btnRestaurante.setBorder(new RoundedBorder(10));
				tBarraDibujo.add(btnRestaurante);
			}
			{
				btnParque = new JButton(" ");
				btnParque.addActionListener(new BtnParqueActionListener());
				btnParque.setBackground(Color.WHITE);
				btnParque.setIcon(
						new ImageIcon(VentanaPersonalizarRuta.class.getResource("/Presentacion/icons8-bosque-30.png")));
				btnParque.setBorder(new RoundedBorder(10));
				tBarraDibujo.add(btnParque);
			}
			{
				btnMonumento = new JButton(" ");
				btnMonumento.addActionListener(new BtnMonumentoActionListener());
				btnMonumento.setBackground(Color.WHITE);
				btnMonumento.setIcon(new ImageIcon(
						VentanaPersonalizarRuta.class.getResource("/Presentacion/icons8-arco-del-triunfo-30.png")));
				btnMonumento.setBorder(new RoundedBorder(10));
				tBarraDibujo.add(btnMonumento);
			}
			{
				
			}
		}
		{
			// lblMapa = new JLabel(" ");
			// lblMapa.setIcon(new
			// ImageIcon(VentanaPersonalizarRuta.class.getResource("/Presentacion/mapa.png")));
			// GridBagConstraints gbc_lblMapa = new GridBagConstraints();
			// gbc_lblMapa.insets = new Insets(0, 0, 5, 5);
			// gbc_lblMapa.gridx = 0;
			// gbc_lblMapa.gridy = 3;
			// frame.getContentPane().add(lblMapa, gbc_lblMapa);

			areaDibujo = new AreaDibujo();
			areaDibujo.addMouseListener(new AreaDibujoMouseListener());
			imagen = new ImageIcon(VentanaPersonalizarRuta.class.getResource("/Presentacion/mapaCalleMudo1.jpg"));
			areaDibujo.setIcon(
					new ImageIcon(VentanaPersonalizarRuta.class.getResource("/Presentacion/mapaCalleMudo1.jpg")));
			GridBagConstraints gbc_areaDibujo = new GridBagConstraints();
			gbc_areaDibujo.insets = new Insets(0, 0, 5, 5);
			gbc_areaDibujo.gridx = 0;
			gbc_areaDibujo.gridy = 3;
			frame.getContentPane().add(areaDibujo, gbc_areaDibujo);
			{
				pnlBotones = new JPanel();
				pnlBotones.setOpaque(false);
				GridBagConstraints gbc_pnlBotones = new GridBagConstraints();
				gbc_pnlBotones.insets = new Insets(0, 0, 0, 5);
				gbc_pnlBotones.fill = GridBagConstraints.BOTH;
				gbc_pnlBotones.gridx = 0;
				gbc_pnlBotones.gridy = 4;
				frame.getContentPane().add(pnlBotones, gbc_pnlBotones);
				{
					btnGuardar = new JButton("Guardar");
					btnGuardar.addActionListener(new BtnSalir());
					pnlBotones.add(btnGuardar);
					btnGuardar.setBackground(new Color(237, 217, 194));
					btnGuardar.setForeground(new Color(81, 43, 55));
					btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 17));
					btnGuardar.setBorder(new RoundedBorder(10));
				}
				{
					btnSalir = new JButton("Salir");
					btnSalir.addActionListener(new BtnSalir());
					pnlBotones.add(btnSalir);
					btnSalir.setBackground(new Color(237, 217, 194));
					btnSalir.setForeground(new Color(81, 43, 55));
					btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 17));
					btnSalir.setBorder(new RoundedBorder(10));
				}
			}

			// Creación de imágenes y cursores
			toolkit = Toolkit.getDefaultToolkit();
			imagLugar = toolkit
					.getImage(getClass().getClassLoader().getResource("Presentacion/icons8-marcador-30.png"));
			imagRestaurante = toolkit
					.getImage(getClass().getClassLoader().getResource("Presentacion/icons8-restaurante-30.png"));
			imagParque = toolkit.getImage(getClass().getClassLoader().getResource("Presentacion/icons8-bosque-30.png"));
			imagMonumento = toolkit
					.getImage(getClass().getClassLoader().getResource("Presentacion/icons8-arco-del-triunfo-30.png"));
			
			// Creación de los cursores
			cursorLugar = toolkit.createCustomCursor(imagLugar, new Point(0, 0), "CURSOR_LUGAR");
			cursorRestaurante = toolkit.createCustomCursor(imagRestaurante, new Point(0, 0), "CURSOR_RESTAURANTE");
			cursorParque = toolkit.createCustomCursor(imagParque, new Point(0, 0), "CURSOR_PARQUE");
			cursorMonumento = toolkit.createCustomCursor(imagMonumento, new Point(0, 0), "CURSOR_MONUMENTO");
		
		}

	}

	private class BtnLugarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			modo = LUGAR;
			frame.setCursor(cursorLugar);
		}
	}

	private class BtnRestauranteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = RESTAURANTE;
			frame.setCursor(cursorRestaurante);
		}
	}

	private class BtnParqueActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = PARQUE;
			frame.setCursor(cursorParque);
		}
	}

	private class BtnMonumentoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modo = MONUMENTO;
			frame.setCursor(cursorMonumento);
		}
	}

	private class AreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			if (imagen != null) {
				switch (modo) {
				case LUGAR:
					areaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagLugar));
					areaDibujo.repaint();
					break;
				case RESTAURANTE:
					areaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagRestaurante));
					areaDibujo.repaint();
					break;
				case PARQUE:
					areaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagParque));
					areaDibujo.repaint();
					break;
				case MONUMENTO:
					areaDibujo.addObjetoGrafico(new ImagenGrafico(x, y, imagMonumento));
					areaDibujo.repaint();
					break;
				}
			}

		}
	}

	private class BtnSalir implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	}
}
