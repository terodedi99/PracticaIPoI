package Presentacion;

import java.awt.BorderLayout;
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

public class VentanaPrincipal {

	private JFrame frame;
	private JTextField tFBuscar;

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
		gbl_pnlLogin.columnWidths = new int[] { 187, 795, 62, 199, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 63, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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

		JPanel pnlCardLogin = new JPanel();
		pnlCardLogin.setBackground(new Color(237, 217, 194));
		GridBagConstraints gbc_pnlCardLogin = new GridBagConstraints();
		gbc_pnlCardLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_pnlCardLogin.gridx = 3;
		gbc_pnlCardLogin.gridy = 0;
		pnlLogin.add(pnlCardLogin, gbc_pnlCardLogin);

		JButton btnRegistrarse = new JButton("Registrarse/ Iniciar sesi\u00F3n");
		pnlCardLogin.add(btnRegistrarse);
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarse.setBorder(new RoundedBorder(10));
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRegistrarse.setPreferredSize(new Dimension(190, 40));
		btnRegistrarse.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegistrarse.setFocusTraversalPolicyProvider(true);
		btnRegistrarse.setForeground(Color.BLACK);
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

		tFBuscar = new JTextField();
		tFBuscar.setPreferredSize(new Dimension(100, 30));
		GridBagConstraints gbc_tFBuscar = new GridBagConstraints();
		gbc_tFBuscar.anchor = GridBagConstraints.WEST;
		gbc_tFBuscar.gridx = 3;
		gbc_tFBuscar.gridy = 0;
		pnlIdioma.add(tFBuscar, gbc_tFBuscar);
		tFBuscar.setColumns(10);

		JPanel pnlTitulo = new JPanel();
		frame.getContentPane().add(pnlTitulo, BorderLayout.EAST);
		pnlTitulo.setBackground(new Color(237, 217, 194));
		pnlTitulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagLayout gbl_pnlTitulo = new GridBagLayout();
		gbl_pnlTitulo.columnWidths = new int[] { 1282, 0 };
		gbl_pnlTitulo.rowHeights = new int[] { 69, 49, 0, 0, 0, 0 };
		gbl_pnlTitulo.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pnlTitulo.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlTitulo.setLayout(gbl_pnlTitulo);

		JLabel lblRutasdelVino = new JLabel("Rutas del Vino");
		lblRutasdelVino.setMaximumSize(new Dimension(71, 21));
		lblRutasdelVino.setForeground(new Color(81, 43, 55));
		lblRutasdelVino.setFont(new Font("Goudy Old Style", Font.ITALIC, 50));
		GridBagConstraints gbc_lblRutasdelVino = new GridBagConstraints();
		gbc_lblRutasdelVino.insets = new Insets(0, 0, 5, 0);
		gbc_lblRutasdelVino.gridx = 0;
		gbc_lblRutasdelVino.gridy = 0;
		pnlTitulo.add(lblRutasdelVino, gbc_lblRutasdelVino);

		JToolBar toolBar = new JToolBar();
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
		pnlCardInformacion.add(pnlInformacion, "name_783381932718400");
		GridBagLayout gbl_pnlInformacion = new GridBagLayout();
		gbl_pnlInformacion.columnWidths = new int[] { 653, 568, 0 };
		gbl_pnlInformacion.rowHeights = new int[] { 38, 46, 68, 0, 187, 86, 35, 0 };
		gbl_pnlInformacion.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_pnlInformacion.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlInformacion.setLayout(gbl_pnlInformacion);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/molinos.jpeg")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
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
		gbc_lblTituloInformacion.insets = new Insets(0, 0, 5, 0);
		gbc_lblTituloInformacion.gridx = 1;
		gbc_lblTituloInformacion.gridy = 2;
		pnlInformacion.add(lblTituloInformacion, gbc_lblTituloInformacion);

		JButton btnFormulario = new JButton("Formulario de contacto");
		btnFormulario.setForeground(new Color(81, 43, 55));
		btnFormulario.setBackground(new Color(237, 217, 194));
		btnFormulario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFormulario.setBorder(new RoundedBorder(10));
		btnFormulario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_btnFormulario = new GridBagConstraints();
		gbc_btnFormulario.insets = new Insets(0, 0, 5, 0);
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
		gbc_lblDatos.insets = new Insets(0, 0, 5, 0);
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
		gbc_lblMapaCiudadReal.insets = new Insets(0, 0, 5, 0);
		gbc_lblMapaCiudadReal.gridx = 1;
		gbc_lblMapaCiudadReal.gridy = 5;
		pnlInformacion.add(lblMapaCiudadReal, gbc_lblMapaCiudadReal);

	}

}
