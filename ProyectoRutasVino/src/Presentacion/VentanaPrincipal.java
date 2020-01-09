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
import java.util.Timer;
import java.util.TimerTask;
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

import com.toedter.calendar.JDateChooser;

import Dominio.Localidad;
import Dominio.Usuario;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaPrincipal {

	JFrame frame;
	private JPanel pnlLogin;
	private JPanel pnlBuscar;
	private JPanel pnlTitulo;
	private JPanel pnlCardInformacion;
	private JPanel pnlInformacion;
	private JPanel pnlRegistro;
	private JPanel pnlFormulario;
	private JPanel pnlInicioSesion;
	private JPasswordField pwdfRContrasenaRegistro;
	private JPasswordField pwdfContrasenaRegistro;
	private JPasswordField pwdfContrasenaInicioSesion;
	private JTextField tFBuscar;
	private JTextField tFNombreRegistro;
	private JTextField tFApellidosRegistro;
	private JTextField tFNombreFormulario;
	private JTextField tFUsuarioInicioSesion;
	private JTextField tFCorreoElectronicoRegistro;
	private JTextField tFFechaNacimientoRegistro;
	private JTextField tFCorreoElectronicoFormulario;
	private JTextField tFAsuntoFormulario;
	private JTextField tFComentariosFormulario;
	private JTextPane tPInformacion;
	private JTextPane tPTextoFormulario;
	private JLabel lblContrasenaInicioSesion;
	private JLabel lblMensajesInicioSesion;
	private JLabel lblUsuarioInicioSesion;
	private JLabel lblTextoInicioSesion;
	private JLabel lblInfoInicioSesion;
	private JLabel lblIniciaSesion;
	private JLabel lblIconoInicioSesion;
	private JLabel lblBandera;
	private JLabel lblFlecha;
	private JLabel lblLupa;
	private JLabel lblNewLabel;
	private JLabel lblTituloQuienes;
	private JLabel lblTituloInformacion;
	private JLabel lblDatos;
	private JLabel lblLogo;
	private JLabel lblMapaCiudadReal;
	private JLabel lblTitulo1Registro;
	private JLabel lblTitulo2Registro;
	private JLabel lblNombreRegistro;
	private JLabel lblApellidosRegistro;
	private JLabel lblCorreoElectronicoRegistro;
	private JLabel lblFechaNacimientoRegistro;
	private JLabel lblContrasenaRegistro;
	private JLabel lblInfoRegistro;
	private JLabel lblInfo2Registro;
	private JLabel lblRContrasenaRegistro;
	private JLabel lblContactoFormulario;
	private JLabel lblNombreFormulario;
	private JLabel lbCorreoElectronicoFormulario;
	private JLabel lblAsuntoFormulario;
	private JLabel lblComentariosFormulario;
	private JButton btnEntrarInicioSesion;
	private JButton btnIniciarSesion;
	private JButton btnRegistrarse;
	private JButton btnPrincipal;
	private JButton btnCiudadReal;
	private JButton btnValdepenas;
	private JButton btnAlcazar;
	private JButton btnCampo;
	private JButton btnAlmagro;
	private JButton btnFormulario;
	private JButton btnAceptarRegistro;
	private JButton btnEnviarFormulario;
	private JToolBar toolBar;
	private JScrollPane scrollPane;
	private JButton btnLimpiarCamposRegistro;
	private JButton btnLimpiarCamposInicioSesion;
	private JDateChooser dateChooser; // Añadir el calendario
	private boolean spain;
	private Usuario usuario;
	private JFormattedTextField formattedTextField;

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
	
	public VentanaPrincipal(boolean spain) {
		this.spain = spain;
		
		ImageIcon imagenSpain = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/spain.png"));
		ImageIcon imagenEnglish = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/english.png"));

		if (spain) {
			lblBandera.setIcon(imagenSpain);;
			lblBandera.repaint();
			spain = false;
			 
		} else {
			lblBandera.setIcon(imagenEnglish);
			lblBandera.repaint();
			spain = true;

		}
		
		initialize();
	}
	
	public VentanaPrincipal(Usuario usuario) {
		this.usuario = usuario;
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(237, 217, 194));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que la aplicación finalice al pulsar "x"
		frame.setBounds(0, 0, 770, 770); // Establece posición y tamaño de la ventana
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height); // Cambia el tamaño de la ventana
		frame.getContentPane().setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		pnlLogin = new JPanel();
		pnlLogin.setFocusCycleRoot(true);
		pnlLogin.setFocusTraversalPolicyProvider(true);
		pnlLogin.setBackground(new Color(237, 217, 194));
		pnlLogin.setInheritsPopupMenu(true);
		frame.getContentPane().add(pnlLogin, BorderLayout.NORTH);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 190, 600, 273, 107, 151, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 63, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);

		lblBandera = new JLabel("");
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

		lblFlecha = new JLabel("");
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

		btnIniciarSesion = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnIniciarSesion.text")); //$NON-NLS-1$
		btnIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarSesion.setMargin(new Insets(2, 7, 2, 7));
		btnIniciarSesion.setForeground(new Color(81, 43, 55));
		btnIniciarSesion.setBorder(new RoundedBorder(10));
		btnIniciarSesion.setBackground(new Color(206, 219, 197));
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_btnIniciarSesion = new GridBagConstraints();
		gbc_btnIniciarSesion.anchor = GridBagConstraints.EAST;
		gbc_btnIniciarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnIniciarSesion.gridx = 3;
		gbc_btnIniciarSesion.gridy = 0;
		pnlLogin.add(btnIniciarSesion, gbc_btnIniciarSesion);

		btnRegistrarse = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnRegistrarse.text")); //$NON-NLS-1$
		btnRegistrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrarse.setMargin(new Insets(2, 7, 2, 7));
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.anchor = GridBagConstraints.WEST;
		gbc_btnRegistrarse.gridx = 4;
		gbc_btnRegistrarse.gridy = 0;
		pnlLogin.add(btnRegistrarse, gbc_btnRegistrarse);
		btnRegistrarse.setBorder(new RoundedBorder(10));
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRegistrarse.setPreferredSize(new Dimension(160, 40));
		btnRegistrarse.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegistrarse.setFocusTraversalPolicyProvider(true);
		btnRegistrarse.setForeground(new Color(81, 43, 55));
		btnRegistrarse.setBackground(new Color(206, 219, 197));

		pnlBuscar = new JPanel();
		pnlBuscar.setBackground(new Color(237, 217, 194));
		pnlBuscar.setFocusTraversalPolicyProvider(true);
		pnlBuscar.setFocusCycleRoot(true);
		frame.getContentPane().add(pnlBuscar, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlBuscar = new GridBagLayout();
		gbl_pnlBuscar.columnWidths = new int[] { 145, 325, 650, 96, 0 };
		gbl_pnlBuscar.rowHeights = new int[] { 58, 0 };
		gbl_pnlBuscar.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlBuscar.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pnlBuscar.setLayout(gbl_pnlBuscar);

		lblLupa = new JLabel("");
		lblLupa.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/lupa.png")));
		lblLupa.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLupa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLupa.setAlignmentY(1.0f);
		lblLupa.setAlignmentX(1.0f);
		GridBagConstraints gbc_lblLupa = new GridBagConstraints();
		gbc_lblLupa.insets = new Insets(0, 0, 0, 5);
		gbc_lblLupa.anchor = GridBagConstraints.EAST;
		gbc_lblLupa.gridx = 2;
		gbc_lblLupa.gridy = 0;
		pnlBuscar.add(lblLupa, gbc_lblLupa);

		tFBuscar = new JTextField();
		tFBuscar.setPreferredSize(new Dimension(100, 30));
		GridBagConstraints gbc_tFBuscar = new GridBagConstraints();
		gbc_tFBuscar.anchor = GridBagConstraints.WEST;
		gbc_tFBuscar.gridx = 3;
		gbc_tFBuscar.gridy = 0;
		pnlBuscar.add(tFBuscar, gbc_tFBuscar);
		tFBuscar.setColumns(10);

		pnlTitulo = new JPanel();
		frame.getContentPane().add(pnlTitulo, BorderLayout.WEST);
		pnlTitulo.setBackground(new Color(237, 217, 194));
		pnlTitulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagLayout gbl_pnlTitulo = new GridBagLayout();
		gbl_pnlTitulo.columnWidths = new int[] { 1280, 0 };
		gbl_pnlTitulo.rowHeights = new int[] { 69, 49, 0, 0, 0, 0 };
		gbl_pnlTitulo.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlTitulo.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlTitulo.setLayout(gbl_pnlTitulo);

		btnPrincipal = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnPrincipal.text")); //$NON-NLS-1$
		btnPrincipal.setBackground(new Color(237, 217, 194));
		btnPrincipal.setOpaque(false);
		btnPrincipal.setFont(new Font("Goudy Old Style", Font.ITALIC, 50));
		btnPrincipal.setForeground(new Color(81, 43, 55));
		GridBagConstraints gbc_btnPrincipal = new GridBagConstraints();
		gbc_btnPrincipal.insets = new Insets(0, 0, 5, 0);
		gbc_btnPrincipal.gridx = 0;
		gbc_btnPrincipal.gridy = 0;
		pnlTitulo.add(btnPrincipal, gbc_btnPrincipal);

		toolBar = new JToolBar();
		toolBar.setBackground(new Color(244, 229, 226));
		toolBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.insets = new Insets(0, 0, 5, 0);
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 1;
		pnlTitulo.add(toolBar, gbc_toolBar);

		btnCiudadReal = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnCiudadReal.text")); //$NON-NLS-1$
		btnCiudadReal.setBackground(new Color(244, 229, 226));
		btnCiudadReal.setForeground(new Color(81, 43, 55));
		btnCiudadReal.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnCiudadReal.setBorder(new RoundedBorder(10));
		toolBar.add(btnCiudadReal);

		btnValdepenas = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnValdepenas.text")); //$NON-NLS-1$
		btnValdepenas.setBackground(new Color(244, 229, 226));
		btnValdepenas.setForeground(new Color(81, 43, 55));
		btnValdepenas.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnValdepenas.setBorder(new RoundedBorder(10));
		toolBar.add(btnValdepenas);

		btnAlmagro = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnAlmagro.text")); //$NON-NLS-1$
		btnAlmagro.setBackground(new Color(244, 229, 226));
		btnAlmagro.setForeground(new Color(81, 43, 55));
		btnAlmagro.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnAlmagro.setBorder(new RoundedBorder(10));
		toolBar.add(btnAlmagro);

		btnAlcazar = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnAlcazar.text")); //$NON-NLS-1$
		btnAlcazar.setBackground(new Color(244, 229, 226));
		btnAlcazar.setForeground(new Color(81, 43, 55));
		btnAlcazar.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnAlcazar.setBorder(new RoundedBorder(10));
		toolBar.add(btnAlcazar);

		btnCampo = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnCampo.text")); //$NON-NLS-1$
		btnCampo.setBackground(new Color(244, 229, 226));
		btnCampo.setForeground(new Color(81, 43, 55));
		btnCampo.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnCampo.setBorder(new RoundedBorder(10));
		toolBar.add(btnCampo);

		scrollPane = new JScrollPane();
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

		pnlCardInformacion = new JPanel();
		pnlCardInformacion.setFocusTraversalPolicyProvider(true);
		pnlCardInformacion.setFocusCycleRoot(true);
		pnlCardInformacion.setBackground(new Color(206, 219, 197));
		scrollPane.setViewportView(pnlCardInformacion);
		pnlCardInformacion.setLayout(new CardLayout(0, 0));

		pnlInformacion = new JPanel();
		pnlInformacion.setBackground(new Color(206, 219, 197));
		pnlInformacion.setOpaque(false);
		pnlCardInformacion.add(pnlInformacion, "Principal");
		GridBagLayout gbl_pnlInformacion = new GridBagLayout();
		gbl_pnlInformacion.columnWidths = new int[] { 622, 635, 0 };
		gbl_pnlInformacion.rowHeights = new int[] { 38, 46, 68, 0, 187, 86, 35, 0 };
		gbl_pnlInformacion.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_pnlInformacion.rowWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlInformacion.setLayout(gbl_pnlInformacion);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/molinos.jpeg")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		pnlInformacion.add(lblNewLabel, gbc_lblNewLabel);

		lblTituloQuienes = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblTituloQuienes.text")); //$NON-NLS-1$
		lblTituloQuienes.setForeground(new Color(81, 43, 55));
		lblTituloQuienes.setFont(new Font("Goudy Old Style", Font.ITALIC, 30));
		lblTituloQuienes.setBackground(new Color(206, 219, 197));
		GridBagConstraints gbc_lblTituloQuienes = new GridBagConstraints();
		gbc_lblTituloQuienes.insets = new Insets(0, 0, 5, 5);
		gbc_lblTituloQuienes.gridx = 0;
		gbc_lblTituloQuienes.gridy = 2;
		pnlInformacion.add(lblTituloQuienes, gbc_lblTituloQuienes);

		lblTituloInformacion = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblTituloInformacion.text")); //$NON-NLS-1$
		lblTituloInformacion.setForeground(new Color(81, 43, 55));
		lblTituloInformacion.setFont(new Font("Goudy Old Style", Font.ITALIC, 30));
		lblTituloInformacion.setBackground(new Color(206, 219, 197));
		GridBagConstraints gbc_lblTituloInformacion = new GridBagConstraints();
		gbc_lblTituloInformacion.insets = new Insets(0, 0, 5, 0);
		gbc_lblTituloInformacion.gridx = 1;
		gbc_lblTituloInformacion.gridy = 2;
		pnlInformacion.add(lblTituloInformacion, gbc_lblTituloInformacion);

		btnFormulario = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnFormulario.text")); //$NON-NLS-1$
		btnFormulario.setForeground(new Color(81, 43, 55));
		btnFormulario.setBackground(new Color(237, 217, 194));
		btnFormulario.setBorder(new RoundedBorder(10));
		btnFormulario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnFormulario = new GridBagConstraints();
		gbc_btnFormulario.insets = new Insets(0, 0, 5, 0);
		gbc_btnFormulario.gridx = 1;
		gbc_btnFormulario.gridy = 3;
		pnlInformacion.add(btnFormulario, gbc_btnFormulario);

		tPInformacion = new JTextPane();
		tPInformacion.setOpaque(false);
		tPInformacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tPInformacion.setText(
				MessagesVentanaPrincipal.getString("VentanaPrincipal.tPInformacion.text")); //$NON-NLS-1$
		tPInformacion.setBackground(new Color(206, 219, 197));
		GridBagConstraints gbc_tPInformacion = new GridBagConstraints();
		gbc_tPInformacion.anchor = GridBagConstraints.NORTH;
		gbc_tPInformacion.insets = new Insets(0, 0, 5, 5);
		gbc_tPInformacion.gridx = 0;
		gbc_tPInformacion.gridy = 4;
		pnlInformacion.add(tPInformacion, gbc_tPInformacion);

		lblDatos = new JLabel(" ");
		lblDatos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatos.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/datos.png")));
		GridBagConstraints gbc_lblDatos = new GridBagConstraints();
		gbc_lblDatos.insets = new Insets(0, 0, 5, 0);
		gbc_lblDatos.gridx = 1;
		gbc_lblDatos.gridy = 4;
		pnlInformacion.add(lblDatos, gbc_lblDatos);

		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(
				VentanaPrincipal.class.getResource("/Presentacion/WhatsApp Image 2019-10-16 at 19.26.34.jpeg")));
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo.gridx = 0;
		gbc_lblLogo.gridy = 5;
		pnlInformacion.add(lblLogo, gbc_lblLogo);

		lblMapaCiudadReal = new JLabel("");
		lblMapaCiudadReal.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/mapa.png")));
		GridBagConstraints gbc_lblMapaCiudadReal = new GridBagConstraints();
		gbc_lblMapaCiudadReal.insets = new Insets(0, 0, 5, 0);
		gbc_lblMapaCiudadReal.gridx = 1;
		gbc_lblMapaCiudadReal.gridy = 5;
		pnlInformacion.add(lblMapaCiudadReal, gbc_lblMapaCiudadReal);

		pnlRegistro = new JPanel();
		pnlRegistro.setMaximumSize(new Dimension(20000, 30000));
		pnlRegistro.setVisible(false);
		pnlRegistro.setBackground(new Color(244, 229, 226));
		pnlCardInformacion.add(pnlRegistro, "Registro");
		GridBagLayout gbl_pnlRegistro = new GridBagLayout();
		gbl_pnlRegistro.columnWidths = new int[] { 73, 301, 215, 227, 100, 93, 287, 0 };
		gbl_pnlRegistro.rowHeights = new int[] { 60, 40, 40, 40, 40, 40, 40, 40, 0, 0, 0 };
		gbl_pnlRegistro.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlRegistro.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		pnlRegistro.setLayout(gbl_pnlRegistro);

		lblTitulo1Registro = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblTitulo1Registro.text")); //$NON-NLS-1$
		lblTitulo1Registro.setForeground(new Color(81, 43, 55));
		lblTitulo1Registro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo1Registro.setFont(new Font("Goudy Old Style", Font.PLAIN, 30));
		GridBagConstraints gbc_lblTitulo1Registro = new GridBagConstraints();
		gbc_lblTitulo1Registro.anchor = GridBagConstraints.SOUTH;
		gbc_lblTitulo1Registro.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTitulo1Registro.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo1Registro.gridx = 3;
		gbc_lblTitulo1Registro.gridy = 0;
		pnlRegistro.add(lblTitulo1Registro, gbc_lblTitulo1Registro);

		lblTitulo2Registro = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblTitulo2Registro.text")); //$NON-NLS-1$
		lblTitulo2Registro.setForeground(new Color(81, 43, 55));
		lblTitulo2Registro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo2Registro.setFont(new Font("Goudy Old Style", Font.PLAIN, 28));
		GridBagConstraints gbc_lblTitulo2Registro = new GridBagConstraints();
		gbc_lblTitulo2Registro.anchor = GridBagConstraints.NORTH;
		gbc_lblTitulo2Registro.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo2Registro.gridx = 3;
		gbc_lblTitulo2Registro.gridy = 1;
		pnlRegistro.add(lblTitulo2Registro, gbc_lblTitulo2Registro);

		tFNombreRegistro = new JTextField();
		tFNombreRegistro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char nombre = e.getKeyChar();
				if((nombre<'a' || nombre>'z') && (nombre<'A' || nombre>'Z'))
					e.consume();
			}
		});
		tFNombreRegistro.addFocusListener(new MiFocusListener());

		lblNombreRegistro = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblNombreRegistro.text")); //$NON-NLS-1$
		lblNombreRegistro.setForeground(new Color(81, 43, 55));
		lblNombreRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombreRegistro = new GridBagConstraints();
		gbc_lblNombreRegistro.anchor = GridBagConstraints.EAST;
		gbc_lblNombreRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRegistro.gridx = 2;
		gbc_lblNombreRegistro.gridy = 2;
		pnlRegistro.add(lblNombreRegistro, gbc_lblNombreRegistro);
		tFNombreRegistro.setFocusTraversalPolicyProvider(true);
		tFNombreRegistro.setColumns(10);
		tFNombreRegistro.setBackground(Color.WHITE);
		GridBagConstraints gbc_tFNombreRegistro = new GridBagConstraints();
		gbc_tFNombreRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNombreRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_tFNombreRegistro.gridx = 3;
		gbc_tFNombreRegistro.gridy = 2;
		pnlRegistro.add(tFNombreRegistro, gbc_tFNombreRegistro);

		tFApellidosRegistro = new JTextField();
		tFApellidosRegistro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char apellidos = e.getKeyChar();
				if((apellidos<'a' || apellidos>'z') && (apellidos<'A' || apellidos>'Z'))
					e.consume();
			}
		});
		tFApellidosRegistro.addFocusListener(new MiFocusListener());

		lblApellidosRegistro = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblApellidosRegistro.text")); //$NON-NLS-1$
		lblApellidosRegistro.setForeground(new Color(81, 43, 55));
		lblApellidosRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblApellidosRegistro = new GridBagConstraints();
		gbc_lblApellidosRegistro.anchor = GridBagConstraints.EAST;
		gbc_lblApellidosRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidosRegistro.gridx = 2;
		gbc_lblApellidosRegistro.gridy = 3;
		pnlRegistro.add(lblApellidosRegistro, gbc_lblApellidosRegistro);
		tFApellidosRegistro.setColumns(10);
		GridBagConstraints gbc_tFApellidosRegistro = new GridBagConstraints();
		gbc_tFApellidosRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFApellidosRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_tFApellidosRegistro.gridx = 3;
		gbc_tFApellidosRegistro.gridy = 3;
		pnlRegistro.add(tFApellidosRegistro, gbc_tFApellidosRegistro);

		lblCorreoElectronicoRegistro = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblCorreoElectronicoRegistro.text")); //$NON-NLS-1$
		lblCorreoElectronicoRegistro.setForeground(new Color(81, 43, 55));
		lblCorreoElectronicoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCorreoElectronicoRegistro = new GridBagConstraints();
		gbc_lblCorreoElectronicoRegistro.anchor = GridBagConstraints.EAST;
		gbc_lblCorreoElectronicoRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectronicoRegistro.gridx = 2;
		gbc_lblCorreoElectronicoRegistro.gridy = 4;
		pnlRegistro.add(lblCorreoElectronicoRegistro, gbc_lblCorreoElectronicoRegistro);

		tFCorreoElectronicoRegistro = new JTextField();
		tFCorreoElectronicoRegistro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char email = e.getKeyChar();
				if((email<'a' || email>'z') && (email<'A' || email>'Z') && (email<'0'|| email>'9' && email<'@'))
					e.consume();
			}
		});
		tFCorreoElectronicoRegistro.addFocusListener(new MiFocusListener());
		tFCorreoElectronicoRegistro.setColumns(10);
		GridBagConstraints gbc_tFCorreoElectronicoRegistro = new GridBagConstraints();
		gbc_tFCorreoElectronicoRegistro.gridwidth = 2;
		gbc_tFCorreoElectronicoRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_tFCorreoElectronicoRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFCorreoElectronicoRegistro.gridx = 3;
		gbc_tFCorreoElectronicoRegistro.gridy = 4;
		pnlRegistro.add(tFCorreoElectronicoRegistro, gbc_tFCorreoElectronicoRegistro);

		// Instanciar Componente calendario, con máscara para que el usuario pueda
		// meterlo de forma manual si quiere
		// Se pondrá en rojo si el usuario mete una fecha inválida
		dateChooser = new JDateChooser("dd/MM/yyyy", "##/##/####", '_');
		dateChooser.getCalendarButton().setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-calendario-24.png")));
		
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 1;
		gbc_formattedTextField.gridy = 5;
		lblFechaNacimientoRegistro = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblFechaNacimientoRegistro.text")); //$NON-NLS-1$
		lblFechaNacimientoRegistro.setForeground(new Color(81, 43, 55));
		lblFechaNacimientoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFechaNacimientoRegistro = new GridBagConstraints();
		gbc_lblFechaNacimientoRegistro.anchor = GridBagConstraints.EAST;
		gbc_lblFechaNacimientoRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNacimientoRegistro.gridx = 2;
		gbc_lblFechaNacimientoRegistro.gridy = 5;
		pnlRegistro.add(lblFechaNacimientoRegistro, gbc_lblFechaNacimientoRegistro);

		// dateChooser.setColumns(10);
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.gridx = 3;
		gbc_dateChooser.gridy = 5;
		pnlRegistro.add(dateChooser, gbc_dateChooser);

		pwdfContrasenaRegistro = new JPasswordField();
		pwdfContrasenaRegistro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int limite = 15;
				{
					if (pwdfContrasenaRegistro.getText().length() == limite)
				     e.consume();
				}
			}
		});
		pwdfContrasenaRegistro.addFocusListener(new MiFocusListener());

		lblContrasenaRegistro = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblContrasenaRegistro.text")); //$NON-NLS-1$
		lblContrasenaRegistro.setForeground(new Color(81, 43, 55));
		lblContrasenaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblContrasenaRegistro = new GridBagConstraints();
		gbc_lblContrasenaRegistro.anchor = GridBagConstraints.EAST;
		gbc_lblContrasenaRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasenaRegistro.gridx = 2;
		gbc_lblContrasenaRegistro.gridy = 6;
		pnlRegistro.add(lblContrasenaRegistro, gbc_lblContrasenaRegistro);
		GridBagConstraints gbc_pwdfContrasenaRegistro = new GridBagConstraints();
		gbc_pwdfContrasenaRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_pwdfContrasenaRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwdfContrasenaRegistro.gridx = 3;
		gbc_pwdfContrasenaRegistro.gridy = 6;
		pnlRegistro.add(pwdfContrasenaRegistro, gbc_pwdfContrasenaRegistro);

		lblInfoRegistro = new JLabel("");
		lblInfoRegistro.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-ayuda-16.png")));
		lblInfoRegistro.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblInfoRegistro = new GridBagConstraints();
		gbc_lblInfoRegistro.anchor = GridBagConstraints.WEST;
		gbc_lblInfoRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfoRegistro.gridx = 4;
		gbc_lblInfoRegistro.gridy = 6;
		pnlRegistro.add(lblInfoRegistro, gbc_lblInfoRegistro);

		pwdfRContrasenaRegistro = new JPasswordField();
		pwdfRContrasenaRegistro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int limite = 15;
				{
					if (pwdfContrasenaRegistro.getText().length() == limite)
				     e.consume();
				}
			}
		});
		pwdfRContrasenaRegistro.addFocusListener(new MiFocusListener());

		lblRContrasenaRegistro = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblRContrasenaRegistro.text")); //$NON-NLS-1$
		lblRContrasenaRegistro.setForeground(new Color(81, 43, 55));
		lblRContrasenaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblRContrasenaRegistro = new GridBagConstraints();
		gbc_lblRContrasenaRegistro.anchor = GridBagConstraints.EAST;
		gbc_lblRContrasenaRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_lblRContrasenaRegistro.gridx = 2;
		gbc_lblRContrasenaRegistro.gridy = 7;
		pnlRegistro.add(lblRContrasenaRegistro, gbc_lblRContrasenaRegistro);
		GridBagConstraints gbc_pwdfRContrasenaRegistro = new GridBagConstraints();
		gbc_pwdfRContrasenaRegistro.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwdfRContrasenaRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_pwdfRContrasenaRegistro.gridx = 3;
		gbc_pwdfRContrasenaRegistro.gridy = 7;
		pnlRegistro.add(pwdfRContrasenaRegistro, gbc_pwdfRContrasenaRegistro);

		lblInfo2Registro = new JLabel("");
		lblInfo2Registro.setVerticalAlignment(SwingConstants.TOP);
		lblInfo2Registro
				.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-ayuda-16.png")));
		lblInfo2Registro.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblInfo2Registro = new GridBagConstraints();
		gbc_lblInfo2Registro.anchor = GridBagConstraints.WEST;
		gbc_lblInfo2Registro.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfo2Registro.gridx = 4;
		gbc_lblInfo2Registro.gridy = 7;
		pnlRegistro.add(lblInfo2Registro, gbc_lblInfo2Registro);

		btnAceptarRegistro = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnAceptarRegistro.text")); //$NON-NLS-1$
		btnAceptarRegistro.setBackground(new Color(237, 217, 194));
		btnAceptarRegistro.setForeground(new Color(81, 43, 55));
		btnAceptarRegistro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAceptarRegistro.setBorder(new RoundedBorder(10));
		GridBagConstraints gbc_btnAceptarRegistro = new GridBagConstraints();
		gbc_btnAceptarRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptarRegistro.gridx = 3;
		gbc_btnAceptarRegistro.gridy = 8;
		pnlRegistro.add(btnAceptarRegistro, gbc_btnAceptarRegistro);

		btnLimpiarCamposRegistro = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnLimpiarCamposRegistro.text")); //$NON-NLS-1$
		btnLimpiarCamposRegistro.setForeground(new Color(81, 43, 55));
		btnLimpiarCamposRegistro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLimpiarCamposRegistro.setBorder(new RoundedBorder(10));
		btnLimpiarCamposRegistro.setBackground(new Color(237, 217, 194));
		GridBagConstraints gbc_btnLimpiarCamposRegistro = new GridBagConstraints();
		gbc_btnLimpiarCamposRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarCamposRegistro.gridx = 4;
		gbc_btnLimpiarCamposRegistro.gridy = 8;
		pnlRegistro.add(btnLimpiarCamposRegistro, gbc_btnLimpiarCamposRegistro);

		pnlFormulario = new JPanel();
		pnlFormulario.setBackground(new Color(244, 229, 226));
		pnlFormulario.setVisible(false);
		pnlCardInformacion.add(pnlFormulario, "Formulario");
		GridBagLayout gbl_pnlFormulario = new GridBagLayout();
		gbl_pnlFormulario.columnWidths = new int[] { 41, 374, 442, 396, 0 };
		gbl_pnlFormulario.rowHeights = new int[] { 92, 57, 50, 50, 50, 50, 0, 45, 49, 0 };
		gbl_pnlFormulario.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlFormulario.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlFormulario.setLayout(gbl_pnlFormulario);

		lblContactoFormulario = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblContactoFormulario.text")); //$NON-NLS-1$
		lblContactoFormulario.setForeground(new Color(81, 43, 55));
		lblContactoFormulario.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactoFormulario.setFont(new Font("Goudy Old Style", Font.PLAIN, 35));
		lblContactoFormulario.setBackground(SystemColor.menu);
		GridBagConstraints gbc_lblContactoFormulario = new GridBagConstraints();
		gbc_lblContactoFormulario.insets = new Insets(0, 0, 5, 0);
		gbc_lblContactoFormulario.gridx = 2;
		gbc_lblContactoFormulario.gridy = 0;
		pnlFormulario.add(lblContactoFormulario, gbc_lblContactoFormulario);

		tPTextoFormulario = new JTextPane();
		tPTextoFormulario.setForeground(new Color(81, 43, 55));
		tPTextoFormulario.setOpaque(false);
		tPTextoFormulario.setText(
				MessagesVentanaPrincipal.getString("VentanaPrincipal.tPTextoFormulario.text")); //$NON-NLS-1$
		tPTextoFormulario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tPTextoFormulario.setBackground(new Color(237, 217, 194));
		GridBagConstraints gbc_tPTextoFormulario = new GridBagConstraints();
		gbc_tPTextoFormulario.anchor = GridBagConstraints.NORTH;
		gbc_tPTextoFormulario.gridwidth = 4;
		gbc_tPTextoFormulario.insets = new Insets(0, 0, 5, 0);
		gbc_tPTextoFormulario.gridx = 0;
		gbc_tPTextoFormulario.gridy = 1;
		pnlFormulario.add(tPTextoFormulario, gbc_tPTextoFormulario);

		lblNombreFormulario = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblNombreFormulario.text")); //$NON-NLS-1$
		lblNombreFormulario.setForeground(new Color(81, 43, 55));
		lblNombreFormulario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombreFormulario = new GridBagConstraints();
		gbc_lblNombreFormulario.anchor = GridBagConstraints.EAST;
		gbc_lblNombreFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreFormulario.gridx = 1;
		gbc_lblNombreFormulario.gridy = 2;
		pnlFormulario.add(lblNombreFormulario, gbc_lblNombreFormulario);

		tFNombreFormulario = new JTextField();
		tFNombreFormulario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char nombreF = e.getKeyChar();
				if((nombreF<'a' || nombreF>'z') && (nombreF<'A' || nombreF>'Z'))
					e.consume();
			}
		});
		tFNombreFormulario.addFocusListener(new MiFocusListener());
		tFNombreFormulario.setColumns(10);
		GridBagConstraints gbc_tFNombreFormulario = new GridBagConstraints();
		gbc_tFNombreFormulario.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNombreFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_tFNombreFormulario.gridx = 2;
		gbc_tFNombreFormulario.gridy = 2;
		pnlFormulario.add(tFNombreFormulario, gbc_tFNombreFormulario);

		lbCorreoElectronicoFormulario = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lbCorreoElectronicoFormulario.text")); //$NON-NLS-1$
		lbCorreoElectronicoFormulario.setForeground(new Color(81, 43, 55));
		lbCorreoElectronicoFormulario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lbCorreoElectronicoFormulario = new GridBagConstraints();
		gbc_lbCorreoElectronicoFormulario.anchor = GridBagConstraints.EAST;
		gbc_lbCorreoElectronicoFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_lbCorreoElectronicoFormulario.gridx = 1;
		gbc_lbCorreoElectronicoFormulario.gridy = 3;
		pnlFormulario.add(lbCorreoElectronicoFormulario, gbc_lbCorreoElectronicoFormulario);

		tFCorreoElectronicoFormulario = new JTextField();
		tFCorreoElectronicoFormulario.addFocusListener(new MiFocusListener());
		tFCorreoElectronicoFormulario.setColumns(10);
		GridBagConstraints gbc_tFCorreoElectronicoFormulario = new GridBagConstraints();
		gbc_tFCorreoElectronicoFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_tFCorreoElectronicoFormulario.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFCorreoElectronicoFormulario.gridx = 2;
		gbc_tFCorreoElectronicoFormulario.gridy = 3;
		pnlFormulario.add(tFCorreoElectronicoFormulario, gbc_tFCorreoElectronicoFormulario);

		lblAsuntoFormulario = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblAsuntoFormulario.text")); //$NON-NLS-1$
		lblAsuntoFormulario.setForeground(new Color(81, 43, 55));
		lblAsuntoFormulario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAsuntoFormulario = new GridBagConstraints();
		gbc_lblAsuntoFormulario.anchor = GridBagConstraints.EAST;
		gbc_lblAsuntoFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsuntoFormulario.gridx = 1;
		gbc_lblAsuntoFormulario.gridy = 4;
		pnlFormulario.add(lblAsuntoFormulario, gbc_lblAsuntoFormulario);

		tFAsuntoFormulario = new JTextField();
		tFAsuntoFormulario.addFocusListener(new MiFocusListener());
		tFAsuntoFormulario.setColumns(10);
		GridBagConstraints gbc_tFAsuntoFormulario = new GridBagConstraints();
		gbc_tFAsuntoFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_tFAsuntoFormulario.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFAsuntoFormulario.gridx = 2;
		gbc_tFAsuntoFormulario.gridy = 4;
		pnlFormulario.add(tFAsuntoFormulario, gbc_tFAsuntoFormulario);

		lblComentariosFormulario = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblComentariosFormulario.text")); //$NON-NLS-1$
		lblComentariosFormulario.setForeground(new Color(81, 43, 55));
		lblComentariosFormulario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblComentariosFormulario = new GridBagConstraints();
		gbc_lblComentariosFormulario.anchor = GridBagConstraints.EAST;
		gbc_lblComentariosFormulario.fill = GridBagConstraints.VERTICAL;
		gbc_lblComentariosFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_lblComentariosFormulario.gridx = 1;
		gbc_lblComentariosFormulario.gridy = 5;
		pnlFormulario.add(lblComentariosFormulario, gbc_lblComentariosFormulario);

		tFComentariosFormulario = new JTextField();
		tFComentariosFormulario.addFocusListener(new MiFocusListener());
		tFComentariosFormulario.setColumns(10);
		GridBagConstraints gbc_tFComentariosFormulario = new GridBagConstraints();
		gbc_tFComentariosFormulario.gridheight = 3;
		gbc_tFComentariosFormulario.insets = new Insets(0, 0, 5, 5);
		gbc_tFComentariosFormulario.fill = GridBagConstraints.BOTH;
		gbc_tFComentariosFormulario.gridx = 2;
		gbc_tFComentariosFormulario.gridy = 5;
		pnlFormulario.add(tFComentariosFormulario, gbc_tFComentariosFormulario);

		btnEnviarFormulario = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnEnviarFormulario.text")); //$NON-NLS-1$
		btnEnviarFormulario.setBackground(new Color(237, 217, 194));
		btnEnviarFormulario.setForeground(new Color(81, 43, 55));
		btnCiudadReal.setBorder(new RoundedBorder(10));
		btnEnviarFormulario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEnviarFormulario = new GridBagConstraints();
		gbc_btnEnviarFormulario.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviarFormulario.gridx = 2;
		gbc_btnEnviarFormulario.gridy = 8;
		btnEnviarFormulario.setBorder(new RoundedBorder(10));
		pnlFormulario.add(btnEnviarFormulario, gbc_btnEnviarFormulario);

		pnlInicioSesion = new JPanel();
		pnlInicioSesion.setBorder(null);
		pnlInicioSesion.setBackground(new Color(244, 229, 226));
		pnlCardInformacion.add(pnlInicioSesion, "InicioSesion");
		GridBagLayout gbl_pnlInicioSesion = new GridBagLayout();
		gbl_pnlInicioSesion.columnWidths = new int[] { 0, 234, 116, 301, 261, 85, 83, 0 };
		gbl_pnlInicioSesion.rowHeights = new int[] { 142, 50, 50, 67, 55, 0, 0 };
		gbl_pnlInicioSesion.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlInicioSesion.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlInicioSesion.setLayout(gbl_pnlInicioSesion);

		lblIniciaSesion = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblIniciaSesion.text")); //$NON-NLS-1$
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

		lblUsuarioInicioSesion = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblUsuarioInicioSesion.text")); //$NON-NLS-1$
		lblUsuarioInicioSesion.setForeground(new Color(81, 43, 55));
		lblUsuarioInicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblUsuarioInicioSesion = new GridBagConstraints();
		gbc_lblUsuarioInicioSesion.anchor = GridBagConstraints.EAST;
		gbc_lblUsuarioInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuarioInicioSesion.gridx = 2;
		gbc_lblUsuarioInicioSesion.gridy = 1;
		pnlInicioSesion.add(lblUsuarioInicioSesion, gbc_lblUsuarioInicioSesion);

		tFUsuarioInicioSesion = new JTextField();
		tFUsuarioInicioSesion.addActionListener(new TFUsuarioActionListener(this.usuario));
		// tFUsuarioInicioSesion.addFocusListener(new MiFocusListener());
		tFUsuarioInicioSesion.setColumns(10);
		GridBagConstraints gbc_tFUsuarioInicioSesion = new GridBagConstraints();
		gbc_tFUsuarioInicioSesion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFUsuarioInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_tFUsuarioInicioSesion.gridx = 3;
		gbc_tFUsuarioInicioSesion.gridy = 1;
		pnlInicioSesion.add(tFUsuarioInicioSesion, gbc_tFUsuarioInicioSesion);

		lblIconoInicioSesion = new JLabel(" ");
		lblIconoInicioSesion.setIcon(
				new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-usuario-masculino-64.png")));
		lblIconoInicioSesion.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblIconoInicioSesion = new GridBagConstraints();
		gbc_lblIconoInicioSesion.anchor = GridBagConstraints.EAST;
		gbc_lblIconoInicioSesion.gridheight = 2;
		gbc_lblIconoInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconoInicioSesion.gridx = 1;
		gbc_lblIconoInicioSesion.gridy = 1;
		pnlInicioSesion.add(lblIconoInicioSesion, gbc_lblIconoInicioSesion);

		lblContrasenaInicioSesion = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblContrasenaInicioSesion.text")); //$NON-NLS-1$
		lblContrasenaInicioSesion.setForeground(new Color(81, 43, 55));
		lblContrasenaInicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasenaInicioSesion.setEnabled(false);
		GridBagConstraints gbc_lblContrasenaInicioSesion = new GridBagConstraints();
		gbc_lblContrasenaInicioSesion.anchor = GridBagConstraints.EAST;
		gbc_lblContrasenaInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasenaInicioSesion.gridx = 2;
		gbc_lblContrasenaInicioSesion.gridy = 2;
		pnlInicioSesion.add(lblContrasenaInicioSesion, gbc_lblContrasenaInicioSesion);

		pwdfContrasenaInicioSesion = new JPasswordField();
		pwdfContrasenaInicioSesion.addActionListener(new PwdfContrasenaActionListener(this.usuario));
		pwdfContrasenaInicioSesion.addFocusListener(new MiFocusListener());
		pwdfContrasenaInicioSesion.setEnabled(false);
		GridBagConstraints gbc_pwdfContrasenaInicioSesion = new GridBagConstraints();
		gbc_pwdfContrasenaInicioSesion.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwdfContrasenaInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_pwdfContrasenaInicioSesion.gridx = 3;
		gbc_pwdfContrasenaInicioSesion.gridy = 2;
		pnlInicioSesion.add(pwdfContrasenaInicioSesion, gbc_pwdfContrasenaInicioSesion);

		btnLimpiarCamposInicioSesion = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnLimpiarCamposInicioSesion.text")); //$NON-NLS-1$
		btnLimpiarCamposInicioSesion.setForeground(new Color(81, 43, 55));
		btnLimpiarCamposInicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLimpiarCamposInicioSesion.setBorder(new RoundedBorder(10));
		btnLimpiarCamposInicioSesion.setBackground(new Color(237, 217, 194));
		GridBagConstraints gbc_btnLimpiarCamposInicioSesion = new GridBagConstraints();
		gbc_btnLimpiarCamposInicioSesion.gridheight = 2;
		gbc_btnLimpiarCamposInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiarCamposInicioSesion.gridx = 4;
		gbc_btnLimpiarCamposInicioSesion.gridy = 1;
		pnlInicioSesion.add(btnLimpiarCamposInicioSesion, gbc_btnLimpiarCamposInicioSesion);

		btnEntrarInicioSesion = new JButton(MessagesVentanaPrincipal.getString("VentanaPrincipal.btnEntrarInicioSesion.text")); //$NON-NLS-1$
		btnEntrarInicioSesion.setEnabled(false);
		btnEntrarInicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEntrarInicioSesion.setBackground(new Color(237, 217, 194));
		btnEntrarInicioSesion.setForeground(new Color(81, 43, 55));
		GridBagConstraints gbc_btnEntrarInicioSesion = new GridBagConstraints();
		gbc_btnEntrarInicioSesion.anchor = GridBagConstraints.EAST;
		gbc_btnEntrarInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrarInicioSesion.gridx = 3;
		gbc_btnEntrarInicioSesion.gridy = 3;
		btnEntrarInicioSesion.setBorder(new RoundedBorder(10));
		pnlInicioSesion.add(btnEntrarInicioSesion, gbc_btnEntrarInicioSesion);

		lblTextoInicioSesion = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblTextoInicioSesion.text")); //$NON-NLS-1$
		lblTextoInicioSesion.setForeground(new Color(81, 43, 55));
		lblTextoInicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblTextoInicioSesion = new GridBagConstraints();
		gbc_lblTextoInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextoInicioSesion.gridx = 4;
		gbc_lblTextoInicioSesion.gridy = 3;
		pnlInicioSesion.add(lblTextoInicioSesion, gbc_lblTextoInicioSesion);

		lblInfoInicioSesion = new JLabel("");
		lblInfoInicioSesion.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-ayuda-16.png")));
		lblInfoInicioSesion.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblInfoInicioSesion = new GridBagConstraints();
		gbc_lblInfoInicioSesion.anchor = GridBagConstraints.WEST;
		gbc_lblInfoInicioSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblInfoInicioSesion.gridx = 5;
		gbc_lblInfoInicioSesion.gridy = 3;
		pnlInicioSesion.add(lblInfoInicioSesion, gbc_lblInfoInicioSesion);

		lblMensajesInicioSesion = new JLabel(MessagesVentanaPrincipal.getString("VentanaPrincipal.lblMensajesInicioSesion.text")); //$NON-NLS-1$
		lblMensajesInicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMensajesInicioSesion.setOpaque(true);
		lblMensajesInicioSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajesInicioSesion.setForeground(new Color(81, 43, 55));
		lblMensajesInicioSesion.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMensajesInicioSesion.setBackground(new Color(237, 217, 194));
		GridBagConstraints gbc_lblMensajesInicioSesion = new GridBagConstraints();
		gbc_lblMensajesInicioSesion.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensajesInicioSesion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMensajesInicioSesion.gridwidth = 4;
		gbc_lblMensajesInicioSesion.gridx = 2;
		gbc_lblMensajesInicioSesion.gridy = 5;
		lblMensajesInicioSesion.setBorder(new RoundedBorder(10));
		pnlInicioSesion.add(lblMensajesInicioSesion, gbc_lblMensajesInicioSesion);

		btnFormulario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (pnlCardInformacion.getLayout());
				cl.show(pnlCardInformacion, "Formulario");
			}
		});

		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (pnlCardInformacion.getLayout());
				cl.show(pnlCardInformacion, "Registro");
			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (pnlCardInformacion.getLayout());
				cl.show(pnlCardInformacion, "InicioSesion");
			}
		});

		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (pnlCardInformacion.getLayout());
				cl.show(pnlCardInformacion, "Principal");
			}
		});

		btnLimpiarCamposInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetearInicioSesion();
			}
		});

		lblBandera.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ImageIcon imagenSpain = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/spain.png"));
				ImageIcon imagenEnglish = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/english.png"));
				
				if (spain) {
					lblBandera.setIcon(imagenSpain);
					lblBandera.repaint();
					MessagesVentanaPrincipal.setIdioma("ingles");
					VentanaPrincipal principalES = new VentanaPrincipal(!spain);
					principalES.frame.setVisible(true);
					frame.dispose();
					spain = false;
				
				} else {
					lblBandera.setIcon(imagenEnglish);
					lblBandera.repaint();
					MessagesVentanaPrincipal.setIdioma("es");
					VentanaPrincipal principalIN = new VentanaPrincipal(!spain);
					principalIN.frame.setVisible(true);
					frame.dispose();
					spain = true;

				}

			}
		});

		btnCiudadReal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLocalidades ciudad = new VentanaLocalidades(new Localidad("Ciudad Real"), !spain, usuario);
				ciudad.frame.setVisible(true);
				frame.dispose();
			}

		});

		btnValdepenas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLocalidades ciudad = new VentanaLocalidades(new Localidad("Valdepeñas"), !spain, usuario);
				ciudad.frame.setVisible(true);
				frame.dispose();
			}
		});

		btnAlmagro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLocalidades ciudad = new VentanaLocalidades(new Localidad("Almagro"), !spain, usuario);
				ciudad.frame.setVisible(true);
				frame.dispose();
			}
		});

		btnAlcazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLocalidades ciudad = new VentanaLocalidades(new Localidad("Alcázar de San Juan"), !spain,
						usuario);
				ciudad.frame.setVisible(true);
				frame.dispose();
			}
		});

		btnCampo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLocalidades ciudad = new VentanaLocalidades(new Localidad("Campo de Criptana"), !spain, usuario);
				ciudad.frame.setVisible(true);
				frame.dispose();
			}
		});

		btnLimpiarCamposRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetearRegistro();
			}
		});

		btnEntrarInicioSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaUsuario usuario = new VentanaUsuario(new Usuario(tFUsuarioInicioSesion.getText()), !spain);
				usuario.frame.setVisible(true);
				frame.dispose();
			}
		});
	}

	private class TFUsuarioActionListener implements ActionListener {
		private Usuario usuario;

		public TFUsuarioActionListener(Usuario usuario) {
			this.usuario = usuario;
		}

		public void actionPerformed(ActionEvent e) {
			if (new Usuario().checkUsuario(tFUsuarioInicioSesion.getText())) {
				lblMensajesInicioSesion.setBackground(new Color(151, 168, 142));
				lblMensajesInicioSesion.setForeground(Color.WHITE);
				lblMensajesInicioSesion.setText("Usuario correcto, introduzca la contraseña");
				// Activamos los de la contraseña
				lblContrasenaInicioSesion.setEnabled(true);
				pwdfContrasenaInicioSesion.setEnabled(true);
				// Pasamos el foco (el cursor) al campo contraseña
				pwdfContrasenaInicioSesion.requestFocus();

			} else {
				lblMensajesInicioSesion.setBackground(new Color(130, 46, 59));
				lblMensajesInicioSesion.setForeground(Color.WHITE);
				lblMensajesInicioSesion.setText("Usuario incorrecto, inténtelo de nuevo.");
				tFUsuarioInicioSesion.setText(null);

				// Temporizador para borrar los campos a los 10 segundos si el usuario no vuelve
				// a intentarlo
				Timer timer = new Timer();
				TimerTask task = new TimerTask() {
					public void run() {
						resetearInicioSesion();
					}
				};

				timer.schedule(task, 10000);

			}
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

	private class PwdfContrasenaActionListener implements ActionListener {
		private Usuario usuario;
		private boolean posible;

		public PwdfContrasenaActionListener(Usuario usuario) {
			this.usuario = usuario;
		}

		// Obtener contraseña introducida
		public void actionPerformed(ActionEvent arg0) {
			Timer timer;
			TimerTask task;
			if (new Usuario().checkContrasena(pwdfContrasenaInicioSesion.getText())) {
				lblMensajesInicioSesion.setBackground(new Color(151, 168, 142));
				lblMensajesInicioSesion.setForeground(Color.WHITE);
				lblMensajesInicioSesion.setText("Contraseña correcta, ¡bienvenido!");
				btnEntrarInicioSesion.setEnabled(true);

				// Temporizador para borrar los campos a los 3,5 segundos una vez haya entrado
				// el usuario

				posible = false;

			} else {
				lblMensajesInicioSesion.setBackground(new Color(130, 46, 59));
				lblMensajesInicioSesion.setForeground(Color.WHITE);
				lblMensajesInicioSesion.setText("Contraseña incorrecta, inténtelo de nuevo.");
				btnEntrarInicioSesion.setEnabled(false);
				pwdfContrasenaInicioSesion.setText(null);

				// Temporizador para borrar los campos a los 10 segundos si el usuario no vuelve
				// a intentarlo

				posible = true;

			}

			timer = new Timer();
			task = new TimerTask() {
				public void run() {
					resetearInicioSesion();
				}
			};
			if (posible)
				timer.schedule(task, 10000);
			else
				timer.schedule(task, 3500);
		}

	}

	public void resetearInicioSesion() {
		lblContrasenaInicioSesion.setEnabled(false);
		pwdfContrasenaInicioSesion.setEnabled(false);
		tFUsuarioInicioSesion.setText(null);
		pwdfContrasenaInicioSesion.setText(null);
		lblMensajesInicioSesion.setBackground(new Color(237, 217, 194));
		lblMensajesInicioSesion.setForeground(new Color(81, 43, 55));
		lblMensajesInicioSesion.setText("Mensajes del sistema");
		lblMensajesInicioSesion.setVisible(true);
	}

	public void resetearRegistro() {
		tFNombreRegistro.setText(null);
		tFApellidosRegistro.setText(null);
		tFCorreoElectronicoRegistro.setText(null);
		pwdfContrasenaRegistro.setText(null);
		pwdfRContrasenaRegistro.setText(null);
		dateChooser.setDate(null);

	}
}
