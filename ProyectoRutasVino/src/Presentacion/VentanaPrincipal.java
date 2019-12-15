package Presentacion;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Dialog.ModalExclusionType;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Point;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JTextArea;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class VentanaPrincipal {

	private JFrame frame;
	private JTextField tFBuscar;
	private JTextField tFNombre;
	private JTextField tFApellidos;
	private JPasswordField pFrContrasena;
	private JTextField tFNombre_1;
	private JTextField tFUsuario;
	private JPasswordField pFContrasena_1;
	private JTextField tFCorreoElectronico;
	private JPasswordField pFContrasena;
	private JTextField tFFechaNacimiento;
	private JTextField tFEmail;
	private JTextField tFAsunto;
	private JTextField tFComentarios;
	private JLabel lblContrasena;
	private JLabel lblMensajes;
	private Button btnEntrar;
	private Color colorBlanco = new Color (255,255,255);
	private Color colorResaltado = new Color (206, 207, 210);
	private final String password = "Lautere";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(237, 217, 194));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que la aplicación finalice al pulsar "x"
		frame.setBounds(0, 0, 516, 394); // Establece posición y tamaño de la ventana
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height); // Cambia el tamaño de la ventana
		frame.getContentPane().setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel pnlLogin = new JPanel();
		pnlLogin.setFocusCycleRoot(true);
		pnlLogin.setFocusTraversalPolicyProvider(true);
		pnlLogin.setBackground(new Color(237, 217, 194));
		pnlLogin.setInheritsPopupMenu(true);
		frame.getContentPane().add(pnlLogin, BorderLayout.NORTH);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 187, 600, 273, 107, 151, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 63, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);

		JLabel lblBandera = new JLabel("");
		lblBandera.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/spain.png")));
		lblBandera.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridBagConstraints gbc_lblBandera = new GridBagConstraints();
		gbc_lblBandera.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBandera.insets = new Insets(0, 0, 0, 5);
		gbc_lblBandera.gridx = 0;
		gbc_lblBandera.gridy = 0;
		pnlLogin.add(lblBandera, gbc_lblBandera);
		lblBandera.setHorizontalAlignment(SwingConstants.CENTER);
		lblBandera.setHorizontalTextPosition(SwingConstants.CENTER);

		JLabel lblFlecha = new JLabel("");
		lblFlecha.setInheritsPopupMenu(false);
		lblFlecha.setAlignmentX(Component.RIGHT_ALIGNMENT);
		GridBagConstraints gbc_lblFlecha = new GridBagConstraints();
		gbc_lblFlecha.anchor = GridBagConstraints.EAST;
		gbc_lblFlecha.insets = new Insets(0, 0, 0, 5);
		gbc_lblFlecha.gridx = 2;
		gbc_lblFlecha.gridy = 0;
		pnlLogin.add(lblFlecha, gbc_lblFlecha);
		lblFlecha.setFocusTraversalPolicyProvider(true);
		lblFlecha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFlecha.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/login.png")));
		
		JButton btnIniciarSesion = new JButton("Iniciar sesi\u00F3n");
		btnIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarSesion.setMargin(new Insets(2, 7, 2, 7));
		btnIniciarSesion.setForeground(new Color(81, 43, 55));
		btnIniciarSesion.setBorder(new RoundedBorder(10));
		btnIniciarSesion.setBackground(new Color(206, 219, 197));
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_btnIniciarSesion = new GridBagConstraints();
		gbc_btnIniciarSesion.anchor = GridBagConstraints.EAST;
		gbc_btnIniciarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnIniciarSesion.gridx = 3;
		gbc_btnIniciarSesion.gridy = 0;
		pnlLogin.add(btnIniciarSesion, gbc_btnIniciarSesion);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrarse.setMargin(new Insets(2, 7, 2, 7));
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.anchor = GridBagConstraints.WEST;
		gbc_btnRegistrarse.gridx = 4;
		gbc_btnRegistrarse.gridy = 0;
		pnlLogin.add(btnRegistrarse, gbc_btnRegistrarse);
		btnRegistrarse.setBorder(new RoundedBorder(10));
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRegistrarse.setPreferredSize(new Dimension(160, 40));
		btnRegistrarse.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegistrarse.setFocusTraversalPolicyProvider(true);
		btnRegistrarse.setForeground(new Color(81, 43, 55));
		btnRegistrarse.setBackground(new Color(206, 219, 197));

		JPanel pnlIdioma = new JPanel();
		pnlIdioma.setBackground(new Color(237, 217, 194));
		pnlIdioma.setFocusTraversalPolicyProvider(true);
		pnlIdioma.setFocusCycleRoot(true);
		frame.getContentPane().add(pnlIdioma, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlIdioma = new GridBagLayout();
		gbl_pnlIdioma.columnWidths = new int[] { 145, 325, 650, 96, 0 };
		gbl_pnlIdioma.rowHeights = new int[] { 58, 0 };
		gbl_pnlIdioma.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlIdioma.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pnlIdioma.setLayout(gbl_pnlIdioma);

		JComboBox cBIdiomas = new JComboBox();
		cBIdiomas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cBIdiomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon imagenSpain = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/spain.png"));
				ImageIcon imagenEnglish = new ImageIcon(
						VentanaPrincipal.class.getResource("/Presentacion/english.png"));
				String idiomaSeleccionado = cBIdiomas.getSelectedItem().toString();

				if (idiomaSeleccionado.contentEquals("Español")) {
					lblBandera.setIcon(imagenSpain);

				} else {
					lblBandera.setIcon(imagenEnglish);
				}

				lblBandera.repaint();
			}
		});
		
		cBIdiomas.setModel(new DefaultComboBoxModel(new String[] { "Espa\u00F1ol", "Ingl\u00E9s" }));
		GridBagConstraints gbc_cBIdiomas = new GridBagConstraints();
		gbc_cBIdiomas.insets = new Insets(0, 0, 0, 5);
		gbc_cBIdiomas.gridx = 0;
		gbc_cBIdiomas.gridy = 0;
		pnlIdioma.add(cBIdiomas, gbc_cBIdiomas);

		JLabel lblLupa = new JLabel("");
		lblLupa.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/lupa.png")));
		lblLupa.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLupa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLupa.setAlignmentY(1.0f);
		lblLupa.setAlignmentX(1.0f);
		GridBagConstraints gbc_lblLupa = new GridBagConstraints();
		gbc_lblLupa.insets = new Insets(0, 0, 0, 5);
		gbc_lblLupa.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblLupa.gridx = 2;
		gbc_lblLupa.gridy = 0;
		pnlIdioma.add(lblLupa, gbc_lblLupa);

		JTextField tFBuscar = new JTextField();
		tFBuscar.setPreferredSize(new Dimension(100, 30));
		GridBagConstraints gbc_tFBuscar = new GridBagConstraints();
		gbc_tFBuscar.anchor = GridBagConstraints.WEST;
		gbc_tFBuscar.gridx = 3;
		gbc_tFBuscar.gridy = 0;
		pnlIdioma.add(tFBuscar, gbc_tFBuscar);
		tFBuscar.setColumns(10);

		JPanel pnlTitulo = new JPanel();
		frame.getContentPane().add(pnlTitulo, BorderLayout.WEST);
		pnlTitulo.setBackground(new Color(237, 217, 194));
		pnlTitulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagLayout gbl_pnlTitulo = new GridBagLayout();
		gbl_pnlTitulo.columnWidths = new int[] { 1257, 0 };
		gbl_pnlTitulo.rowHeights = new int[] { 69, 49, 0, 0, 0, 0 };
		gbl_pnlTitulo.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlTitulo.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlTitulo.setLayout(gbl_pnlTitulo);
		
		JButton btnPrincipal = new JButton("Rutas del Vino");
		btnPrincipal.setBackground(new Color(237, 217, 194));
		btnPrincipal.setOpaque(false);
		btnPrincipal.setFont(new Font("Goudy Old Style", Font.ITALIC, 50));
		btnPrincipal.setForeground(new Color(81, 43, 55));
		GridBagConstraints gbc_btnPrincipal = new GridBagConstraints();
		gbc_btnPrincipal.insets = new Insets(0, 0, 5, 0);
		gbc_btnPrincipal.gridx = 0;
		gbc_btnPrincipal.gridy = 0;
		pnlTitulo.add(btnPrincipal, gbc_btnPrincipal);

		JToolBar toolBar = new JToolBar();
		toolBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.insets = new Insets(0, 0, 5, 0);
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 1;
		pnlTitulo.add(toolBar, gbc_toolBar);

		JButton btnCiudadReal = new JButton("CiudadReal");
		btnCiudadReal.setForeground(new Color(81, 43, 55));
		btnCiudadReal.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnCiudadReal.setBorder(new RoundedBorder(10));
		toolBar.add(btnCiudadReal);

		JButton btnValdepenas = new JButton("Valdepe\u00F1as");
		btnValdepenas.setForeground(new Color(81, 43, 55));
		btnValdepenas.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnValdepenas.setBorder(new RoundedBorder(10));
		toolBar.add(btnValdepenas);

		JButton btnAlmagro = new JButton("Almagro");
		btnAlmagro.setForeground(new Color(81, 43, 55));
		btnAlmagro.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnAlmagro.setBorder(new RoundedBorder(10));
		toolBar.add(btnAlmagro);

		JButton btnAlcazar = new JButton("Alc\u00E1zar de San Juan");
		btnAlcazar.setForeground(new Color(81, 43, 55));
		btnAlcazar.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnAlcazar.setBorder(new RoundedBorder(10));
		toolBar.add(btnAlcazar);

		JButton btnCampo = new JButton("Campo de Criptana");
		btnCampo.setForeground(new Color(81, 43, 55));
		btnCampo.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnCampo.setBorder(new RoundedBorder(10));
		toolBar.add(btnCampo);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setFocusTraversalPolicyProvider(true);
		scrollPane.setFocusCycleRoot(true);
		scrollPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		pnlTitulo.add(scrollPane, gbc_scrollPane);

		JPanel pnlCardInformacion = new JPanel();
		pnlCardInformacion.setFocusTraversalPolicyProvider(true);
		pnlCardInformacion.setFocusCycleRoot(true);
		pnlCardInformacion.setBackground(new Color(206, 219, 197));
		scrollPane.setViewportView(pnlCardInformacion);
		pnlCardInformacion.setLayout(new CardLayout(0, 0));

		JPanel pnlInformacion = new JPanel();
		pnlInformacion.setBackground(new Color(206, 219, 197));
		pnlInformacion.setOpaque(false);
		pnlCardInformacion.add(pnlInformacion, "Principal");
		GridBagLayout gbl_pnlInformacion = new GridBagLayout();
		gbl_pnlInformacion.columnWidths = new int[] { 653, 568, 114, 0 };
		gbl_pnlInformacion.rowHeights = new int[] { 38, 46, 68, 0, 187, 86, 35, 0 };
		gbl_pnlInformacion.columnWeights = new double[] { 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlInformacion.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlInformacion.setLayout(gbl_pnlInformacion);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/molinos.jpeg")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		pnlInformacion.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblTituloQuienes = new JLabel("\u00BFQui\u00E9nes somos?");
		lblTituloQuienes.setForeground(new Color(81, 43, 55));
		lblTituloQuienes.setFont(new Font("Goudy Old Style", Font.ITALIC, 30));
		lblTituloQuienes.setBackground(new Color(206, 219, 197));
		GridBagConstraints gbc_lblTituloQuienes = new GridBagConstraints();
		gbc_lblTituloQuienes.insets = new Insets(0, 0, 5, 5);
		gbc_lblTituloQuienes.gridx = 0;
		gbc_lblTituloQuienes.gridy = 2;
		pnlInformacion.add(lblTituloQuienes, gbc_lblTituloQuienes);

		JLabel lblTituloInformacion = new JLabel("Informaci\u00F3n de contacto");
		lblTituloInformacion.setForeground(new Color(81, 43, 55));
		lblTituloInformacion.setFont(new Font("Goudy Old Style", Font.ITALIC, 30));
		lblTituloInformacion.setBackground(new Color(206, 219, 197));
		GridBagConstraints gbc_lblTituloInformacion = new GridBagConstraints();
		gbc_lblTituloInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblTituloInformacion.gridx = 1;
		gbc_lblTituloInformacion.gridy = 2;
		pnlInformacion.add(lblTituloInformacion, gbc_lblTituloInformacion);

		JButton btnFormulario = new JButton("Formulario de contacto");
		btnFormulario.setForeground(new Color(81, 43, 55));
		btnFormulario.setBackground(new Color(237, 217, 194));
		btnFormulario.setBorder(new RoundedBorder(10));
		btnFormulario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_btnFormulario = new GridBagConstraints();
		gbc_btnFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_btnFormulario.gridx = 1;
		gbc_btnFormulario.gridy = 3;
		pnlInformacion.add(btnFormulario, gbc_btnFormulario);

		JTextPane tPInformacion = new JTextPane();
		tPInformacion.setOpaque(false);
		tPInformacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tPInformacion.setText(
				"Somos una empresa dedicada a la organizaci\u00F3n de Rutas de Vino por la \r\nprovincia de Ciudad real.\r\n\r\nOfrecemos diferentes rutas para nuestros clientes, trabajamos con grupos\r\nde cualquier edad y de 2 a 40 personas.\r\n\r\nOfrecemos un servicio profesional con una calidad excepcional, siempre \r\nmanteniendo una atenci\u00F3n personalizada para que ustedes tengan la mejor experiencia.");
		tPInformacion.setBackground(new Color(206, 219, 197));
		GridBagConstraints gbc_tPInformacion = new GridBagConstraints();
		gbc_tPInformacion.anchor = GridBagConstraints.NORTH;
		gbc_tPInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_tPInformacion.gridx = 0;
		gbc_tPInformacion.gridy = 4;
		pnlInformacion.add(tPInformacion, gbc_tPInformacion);

		JLabel lblDatos = new JLabel(" ");
		lblDatos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatos.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/datos.png")));
		GridBagConstraints gbc_lblDatos = new GridBagConstraints();
		gbc_lblDatos.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatos.gridx = 1;
		gbc_lblDatos.gridy = 4;
		pnlInformacion.add(lblDatos, gbc_lblDatos);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(
				VentanaPrincipal.class.getResource("/Presentacion/WhatsApp Image 2019-10-16 at 19.26.34.jpeg")));
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo.gridx = 0;
		gbc_lblLogo.gridy = 5;
		pnlInformacion.add(lblLogo, gbc_lblLogo);

		JLabel lblMapaCiudadReal = new JLabel("");
		lblMapaCiudadReal.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/mapa.png")));
		GridBagConstraints gbc_lblMapaCiudadReal = new GridBagConstraints();
		gbc_lblMapaCiudadReal.anchor = GridBagConstraints.WEST;
		gbc_lblMapaCiudadReal.insets = new Insets(0, 0, 5, 5);
		gbc_lblMapaCiudadReal.gridx = 1;
		gbc_lblMapaCiudadReal.gridy = 5;
		pnlInformacion.add(lblMapaCiudadReal, gbc_lblMapaCiudadReal);
		
		JPanel pnlRegistro = new JPanel();
		pnlRegistro.setMaximumSize(new Dimension(20000, 30000));
		pnlRegistro.setVisible(false);
		pnlRegistro.setBackground(new Color(244, 229, 226));
		pnlCardInformacion.add(pnlRegistro, "Registro");
		GridBagLayout gbl_pnlRegistro = new GridBagLayout();
		gbl_pnlRegistro.columnWidths = new int[]{73, 301, 556, 456, 0};
		gbl_pnlRegistro.rowHeights = new int[]{60, 40, 40, 40, 40, 40, 40, 40, 0, 0};
		gbl_pnlRegistro.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlRegistro.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlRegistro.setLayout(gbl_pnlRegistro);
		
		JLabel label = new JLabel("\u00BFA\u00FAn no tienes cuenta?");
		label.setForeground(new Color(81, 43, 55));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Goudy Old Style", Font.PLAIN, 30));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.SOUTH;
		gbc_label.fill = GridBagConstraints.HORIZONTAL;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 0;
		pnlRegistro.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("\u00A1Reg\u00EDstrate!");
		label_1.setForeground(new Color(81, 43, 55));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 28));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.NORTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 1;
		pnlRegistro.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("Nombre:");
		label_2.setForeground(new Color(81, 43, 55));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 2;
		pnlRegistro.add(label_2, gbc_label_2);
		
		JTextField tFNombre = new JTextField();
		tFNombre.addFocusListener(new MiFocusListener());
		tFNombre.setFocusTraversalPolicyProvider(true);
		tFNombre.setColumns(10);
		tFNombre.setBackground(Color.WHITE);
		GridBagConstraints gbc_tFNombre = new GridBagConstraints();
		gbc_tFNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tFNombre.gridx = 2;
		gbc_tFNombre.gridy = 2;
		pnlRegistro.add(tFNombre, gbc_tFNombre);
		
		JLabel label_3 = new JLabel("Apellidos:");
		label_3.setForeground(new Color(81, 43, 55));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 3;
		pnlRegistro.add(label_3, gbc_label_3);
		
		JTextField tFApellidos = new JTextField();
		tFApellidos.addFocusListener(new MiFocusListener());
		tFApellidos.setColumns(10);
		GridBagConstraints gbc_tFApellidos = new GridBagConstraints();
		gbc_tFApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_tFApellidos.gridx = 2;
		gbc_tFApellidos.gridy = 3;
		pnlRegistro.add(tFApellidos, gbc_tFApellidos);
		
		JLabel label_4 = new JLabel("Correo electr\u00F3nico:");
		label_4.setForeground(new Color(81, 43, 55));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 4;
		pnlRegistro.add(label_4, gbc_label_4);
		
		JTextField tFCorreoElectronico = new JTextField();
		tFCorreoElectronico.addFocusListener(new MiFocusListener());
		tFCorreoElectronico.setColumns(10);
		GridBagConstraints gbc_tFCorreoElectronico = new GridBagConstraints();
		gbc_tFCorreoElectronico.insets = new Insets(0, 0, 5, 5);
		gbc_tFCorreoElectronico.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFCorreoElectronico.gridx = 2;
		gbc_tFCorreoElectronico.gridy = 4;
		pnlRegistro.add(tFCorreoElectronico, gbc_tFCorreoElectronico);
		
		JLabel label_5 = new JLabel("Fecha de nacimiento:");
		label_5.setForeground(new Color(81, 43, 55));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 5;
		pnlRegistro.add(label_5, gbc_label_5);
		
		JTextField tFFechaNacimiento = new JTextField();
		tFFechaNacimiento.addFocusListener(new MiFocusListener());
		tFFechaNacimiento.setColumns(10);
		GridBagConstraints gbc_tFFechaNacimiento = new GridBagConstraints();
		gbc_tFFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_tFFechaNacimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFechaNacimiento.gridx = 2;
		gbc_tFFechaNacimiento.gridy = 5;
		pnlRegistro.add(tFFechaNacimiento, gbc_tFFechaNacimiento);
		
		JLabel lblCalendario = new JLabel("");
		lblCalendario.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-calendario-30.png")));
		lblCalendario.setOpaque(true);
		lblCalendario.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblCalendario = new GridBagConstraints();
		gbc_lblCalendario.anchor = GridBagConstraints.WEST;
		gbc_lblCalendario.insets = new Insets(0, 0, 5, 0);
		gbc_lblCalendario.gridx = 3;
		gbc_lblCalendario.gridy = 5;
		pnlRegistro.add(lblCalendario, gbc_lblCalendario);
		
		JLabel label_7 = new JLabel("Contrase\u00F1a:");
		label_7.setForeground(new Color(81, 43, 55));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 6;
		pnlRegistro.add(label_7, gbc_label_7);
		
		JPasswordField pFContrasena = new JPasswordField();
		pFContrasena.addFocusListener(new MiFocusListener());
		GridBagConstraints gbc_pFContrasena = new GridBagConstraints();
		gbc_pFContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_pFContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_pFContrasena.gridx = 2;
		gbc_pFContrasena.gridy = 6;
		pnlRegistro.add(pFContrasena, gbc_pFContrasena);
		
		JLabel lblInfo = new JLabel("");
		lblInfo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-ayuda-16.png")));
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.anchor = GridBagConstraints.WEST;
		gbc_lblInfo.insets = new Insets(0, 0, 5, 0);
		gbc_lblInfo.gridx = 3;
		gbc_lblInfo.gridy = 6;
		pnlRegistro.add(lblInfo, gbc_lblInfo);
		
		JLabel label_8 = new JLabel("Repetir contrase\u00F1a:");
		label_8.setForeground(new Color(81, 43, 55));
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 7;
		pnlRegistro.add(label_8, gbc_label_8);
		
		JPasswordField pFrContrasena = new JPasswordField();
		pFrContrasena.addFocusListener(new MiFocusListener());
		GridBagConstraints gbc_pFrContrasena = new GridBagConstraints();
		gbc_pFrContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_pFrContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_pFrContrasena.gridx = 2;
		gbc_pFrContrasena.gridy = 7;
		pnlRegistro.add(pFrContrasena, gbc_pFrContrasena);
		
		JLabel lblInfo2 = new JLabel("");
		lblInfo2.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-ayuda-16.png")));
		lblInfo2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblInfo2 = new GridBagConstraints();
		gbc_lblInfo2.insets = new Insets(0, 0, 5, 0);
		gbc_lblInfo2.anchor = GridBagConstraints.WEST;
		gbc_lblInfo2.gridx = 3;
		gbc_lblInfo2.gridy = 7;
		pnlRegistro.add(lblInfo2, gbc_lblInfo2);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(237, 217, 194));
		btnAceptar.setForeground(new Color(81, 43, 55));
		btnAceptar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnAceptar.setBorder(new RoundedBorder(10));
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 2;
		gbc_btnAceptar.gridy = 8;
		pnlRegistro.add(btnAceptar, gbc_btnAceptar);
		
		JPanel pnlFormulario = new JPanel();
		pnlFormulario.setBackground(new Color(244, 229, 226));
		pnlFormulario.setVisible(false);
		pnlCardInformacion.add(pnlFormulario, "Formulario");
		GridBagLayout gbl_pnlFormulario = new GridBagLayout();
		gbl_pnlFormulario.columnWidths = new int[]{41, 374, 442, 396, 0};
		gbl_pnlFormulario.rowHeights = new int[]{92, 57, 50, 50, 50, 50, 0, 45, 49, 0};
		gbl_pnlFormulario.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFormulario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlFormulario.setLayout(gbl_pnlFormulario);
		
		JLabel lblContacto = new JLabel("Contacto");
		lblContacto.setForeground(new Color(81, 43, 55));
		lblContacto.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacto.setFont(new Font("Goudy Old Style", Font.PLAIN, 35));
		lblContacto.setBackground(SystemColor.menu);
		GridBagConstraints gbc_lblContacto = new GridBagConstraints();
		gbc_lblContacto.insets = new Insets(0, 0, 5, 0);
		gbc_lblContacto.gridx = 2;
		gbc_lblContacto.gridy = 0;
		pnlFormulario.add(lblContacto, gbc_lblContacto);
		
		JTextPane tPTexto = new JTextPane();
		tPTexto.setForeground(new Color(81, 43, 55));
		tPTexto.setOpaque(false);
		tPTexto.setText("Puedes rellenar y enviarnos este formulario para solicitar informaci\u00F3n acerca de nuestras rutas o para realizar una reserva.");
		tPTexto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tPTexto.setBackground(new Color(237, 217, 194));
		GridBagConstraints gbc_tPTexto = new GridBagConstraints();
		gbc_tPTexto.anchor = GridBagConstraints.NORTH;
		gbc_tPTexto.gridwidth = 4;
		gbc_tPTexto.insets = new Insets(0, 0, 5, 0);
		gbc_tPTexto.gridx = 0;
		gbc_tPTexto.gridy = 1;
		pnlFormulario.add(tPTexto, gbc_tPTexto);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(81, 43, 55));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		pnlFormulario.add(lblNombre, gbc_lblNombre);
		
		JTextField tFNombre_1 = new JTextField();
		tFNombre_1.addFocusListener(new MiFocusListener());
		tFNombre_1.setColumns(10);
		GridBagConstraints gbc_tFNombre_1 = new GridBagConstraints();
		gbc_tFNombre_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_tFNombre_1.gridx = 2;
		gbc_tFNombre_1.gridy = 2;
		pnlFormulario.add(tFNombre_1, gbc_tFNombre_1);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(81, 43, 55));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 3;
		pnlFormulario.add(lblEmail, gbc_lblEmail);
		
		JTextField tFEmail = new JTextField();
		tFEmail.addFocusListener(new MiFocusListener());
		tFEmail.setColumns(10);
		GridBagConstraints gbc_tFEmail = new GridBagConstraints();
		gbc_tFEmail.insets = new Insets(0, 0, 5, 5);
		gbc_tFEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFEmail.gridx = 2;
		gbc_tFEmail.gridy = 3;
		pnlFormulario.add(tFEmail, gbc_tFEmail);
		
		JLabel lblAsunto = new JLabel("Asunto:");
		lblAsunto.setForeground(new Color(81, 43, 55));
		lblAsunto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAsunto = new GridBagConstraints();
		gbc_lblAsunto.anchor = GridBagConstraints.EAST;
		gbc_lblAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsunto.gridx = 1;
		gbc_lblAsunto.gridy = 4;
		pnlFormulario.add(lblAsunto, gbc_lblAsunto);
		
		JTextField tFAsunto = new JTextField();
		tFAsunto.addFocusListener(new MiFocusListener());
		tFAsunto.setColumns(10);
		GridBagConstraints gbc_tFAsunto = new GridBagConstraints();
		gbc_tFAsunto.insets = new Insets(0, 0, 5, 5);
		gbc_tFAsunto.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFAsunto.gridx = 2;
		gbc_tFAsunto.gridy = 4;
		pnlFormulario.add(tFAsunto, gbc_tFAsunto);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setForeground(new Color(81, 43, 55));
		lblComentarios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblComentarios = new GridBagConstraints();
		gbc_lblComentarios.anchor = GridBagConstraints.EAST;
		gbc_lblComentarios.fill = GridBagConstraints.VERTICAL;
		gbc_lblComentarios.insets = new Insets(0, 0, 5, 5);
		gbc_lblComentarios.gridx = 1;
		gbc_lblComentarios.gridy = 5;
		pnlFormulario.add(lblComentarios, gbc_lblComentarios);
		
		JTextField tFComentarios = new JTextField();
		tFComentarios.addFocusListener(new MiFocusListener());
		tFComentarios.setColumns(10);
		GridBagConstraints gbc_tFComentarios = new GridBagConstraints();
		gbc_tFComentarios.gridheight = 3;
		gbc_tFComentarios.insets = new Insets(0, 0, 5, 5);
		gbc_tFComentarios.fill = GridBagConstraints.BOTH;
		gbc_tFComentarios.gridx = 2;
		gbc_tFComentarios.gridy = 5;
		pnlFormulario.add(tFComentarios, gbc_tFComentarios);
		
		JButton btnEnviar = new JButton("  Enviar  ");
		btnEnviar.setBackground(new Color(237, 217, 194));
		btnEnviar.setForeground(new Color(81, 43, 55));
		btnCiudadReal.setBorder(new RoundedBorder(10));
		btnEnviar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviar.gridx = 2;
		gbc_btnEnviar.gridy = 8;
		btnEnviar.setBorder(new RoundedBorder(10));
		pnlFormulario.add(btnEnviar, gbc_btnEnviar);
		
		JPanel pnlInicioSesion = new JPanel();
		pnlInicioSesion.setBorder(null);
		pnlInicioSesion.setBackground(new Color(244, 229, 226));
		pnlCardInformacion.add(pnlInicioSesion, "InicioSesion");
		GridBagLayout gbl_pnlInicioSesion = new GridBagLayout();
		gbl_pnlInicioSesion.columnWidths = new int[]{0, 234, 116, 301, 261, 85, 83, 0};
		gbl_pnlInicioSesion.rowHeights = new int[]{142, 50, 50, 67, 55, 0, 0};
		gbl_pnlInicioSesion.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlInicioSesion.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlInicioSesion.setLayout(gbl_pnlInicioSesion);
		
		JLabel lblIniciaSesion = new JLabel("Inicia sesi\u00F3n");
		lblIniciaSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciaSesion.setForeground(new Color(81, 43, 55));
		lblIniciaSesion.setFont(new Font("Goudy Old Style", Font.PLAIN, 35));
		lblIniciaSesion.setBackground(SystemColor.menu);
		GridBagConstraints gbc_lblIniciaSesion = new GridBagConstraints();
		gbc_lblIniciaSesion.gridwidth = 2;
		gbc_lblIniciaSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblIniciaSesion.gridx = 3;
		gbc_lblIniciaSesion.gridy = 0;
		pnlInicioSesion.add(lblIniciaSesion, gbc_lblIniciaSesion);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(81, 43, 55));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		pnlInicioSesion.add(lblUsuario, gbc_lblUsuario);
		
		JTextField tFUsuario = new JTextField();
		tFUsuario.addActionListener(new TFUsuarioActionListener());
		tFUsuario.addFocusListener(new MiFocusListener());
		tFUsuario.setColumns(10);
		GridBagConstraints gbc_tFUsuario = new GridBagConstraints();
		gbc_tFUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_tFUsuario.gridx = 3;
		gbc_tFUsuario.gridy = 1;
		pnlInicioSesion.add(tFUsuario, gbc_tFUsuario);

		JLabel label_9 = new JLabel(" ");
		label_9.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-usuario-masculino-64.png")));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.EAST;
		gbc_label_9.gridheight = 2;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 1;
		pnlInicioSesion.add(label_9, gbc_label_9);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setForeground(new Color(81, 43, 55));
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasena.setEnabled(false);
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.anchor = GridBagConstraints.EAST;
		gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasena.gridx = 2;
		gbc_lblContrasena.gridy = 2;
		pnlInicioSesion.add(lblContrasena, gbc_lblContrasena);
		
		JPasswordField pFContrasena_1 = new JPasswordField();
		pFContrasena_1.addFocusListener(new MiFocusListener());
		pFContrasena_1.setEnabled(false);
		GridBagConstraints gbc_pFContrasena_1 = new GridBagConstraints();
		gbc_pFContrasena_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_pFContrasena_1.insets = new Insets(0, 0, 5, 5);
		gbc_pFContrasena_1.gridx = 3;
		gbc_pFContrasena_1.gridy = 2;
		pnlInicioSesion.add(pFContrasena_1, gbc_pFContrasena_1);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setEnabled(false);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEntrar.setBackground(new Color(237, 217, 194));
		btnEntrar.setForeground(new Color(81, 43, 55));
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.anchor = GridBagConstraints.EAST;
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.gridx = 3;
		gbc_btnEntrar.gridy = 3;
		btnEntrar.setBorder(new RoundedBorder(10));
		pnlInicioSesion.add(btnEntrar, gbc_btnEntrar);
		
		JLabel lblTexto = new JLabel("\u00BFHas olvidado tu contrase\u00F1a?");
		lblTexto.setForeground(new Color(81, 43, 55));
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblTexto = new GridBagConstraints();
		gbc_lblTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblTexto.gridx = 4;
		gbc_lblTexto.gridy = 3;
		pnlInicioSesion.add(lblTexto, gbc_lblTexto);
		
		JLabel lblInfo_1 = new JLabel("");
		lblInfo_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-ayuda-16.png")));
		lblInfo_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblInfo_1 = new GridBagConstraints();
		gbc_lblInfo_1.anchor = GridBagConstraints.WEST;
		gbc_lblInfo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfo_1.gridx = 5;
		gbc_lblInfo_1.gridy = 3;
		pnlInicioSesion.add(lblInfo_1, gbc_lblInfo_1);
		
		JLabel lblMensajes = new JLabel(" ");
		lblMensajes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMensajes.setOpaque(true);
		lblMensajes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajes.setForeground(new Color(81, 43, 55));
		lblMensajes.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMensajes.setBackground(new Color(237, 217, 194));
		GridBagConstraints gbc_lblMensajes = new GridBagConstraints();
		gbc_lblMensajes.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensajes.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMensajes.gridwidth = 4;
		gbc_lblMensajes.gridx = 2;
		gbc_lblMensajes.gridy = 5;
		lblMensajes.setBorder(new RoundedBorder(10));
		pnlInicioSesion.add(lblMensajes, gbc_lblMensajes);
		
		btnFormulario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(pnlCardInformacion.getLayout());
				cl.show(pnlCardInformacion, "Formulario");
			}
		});
		
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(pnlCardInformacion.getLayout());
				cl.show(pnlCardInformacion, "Registro");
			}
		});
		
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(pnlCardInformacion.getLayout());
				cl.show(pnlCardInformacion, "InicioSesion");
			}
		});
		
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(pnlCardInformacion.getLayout());
				cl.show(pnlCardInformacion,"Principal");
			}
		});
		
	}

	private class TFUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblMensajes.setText("Usuario correcto");
			// Activamos los de la contraseña
			lblContrasena.setEnabled(true);
			pFContrasena_1.setEnabled(true);
			// Pasamos el foco (el cursor) al campo de la contraseña
			pFContrasena_1.requestFocus();

		}
	}

	private class MiFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(206, 207, 210));
		}

		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250, 250, 250));
		}
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}
	}

}
