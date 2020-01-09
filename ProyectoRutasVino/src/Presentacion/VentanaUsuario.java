package Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JTextFieldDateEditor;

import Dominio.Localidad;
import Dominio.Usuario;

import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JSpinner;
import java.awt.FlowLayout;
import javax.swing.SpinnerNumberModel;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.ListSelectionModel;
import javax.swing.SingleSelectionModel;

import java.awt.Component;

public class VentanaUsuario {

	public JFrame frame;
	private JTextField tFBuscar;
	private Localidad localidad;
	private JCalendar calendar_entrada;
	private JCalendar calendar_salida;
	private JTextFieldDateEditor textFieldDateEditor;
	private JLabel lblAlmagro;
	private JLabel lblCampoDeCriptana;
	JLabel lblBandera_2 = new JLabel("");
	private boolean spain;
	private Usuario usuario;
	private JTable tabla_Guias;
	private JTextField taFilaSeleccionada;
	private JLabel lblFotoGuia;
	private JLabel lblUsuario;
	private JScrollPane scrollPaneGuias;
	private JScrollPane scrollPaneHistorial;
	private JPanel pnl1Historial;
	private JPanel pnl1Guias;
	private JTable tabla_Historial;
	private JTable tabla_Historial_1;
	private JTextField tFFilaHistorialSeleccionada;
	private JTable tabla_GruposTuristas;
	private JTextField tFGruposGuiasSeleccionada;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaUsuario window = new VentanaUsuario();
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

	public VentanaUsuario() {
		initialize();
	}

	public VentanaUsuario(Usuario usuario, boolean spain) {
		this.spain = spain;
		this.usuario = usuario;

		ImageIcon imagenSpain = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/spain.png"));
		ImageIcon imagenEnglish = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/english.png"));

		if (spain) {
			this.usuario.setRutaImagenBandera("/Presentacion/spain.png");
			lblBandera_2.setIcon(imagenSpain);
			lblBandera_2.repaint();
			spain = false;
		} else {
			this.usuario.setRutaImagenBandera("/Presentacion/english.png");
			lblBandera_2.setIcon(imagenEnglish);
			lblBandera_2.repaint();
			spain = true;

		}

		initialize();
		this.lblUsuario.setText(usuario.getNombre());

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
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground(new Color(237, 217, 194));
		frame.getContentPane().add(pnlLogin, BorderLayout.NORTH);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 110, 15, 140, 124, 524, 275, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 13, 76, 0, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);

		JLabel lblIcono = new JLabel("");
		GridBagConstraints gbc_lblIcono = new GridBagConstraints();
		gbc_lblIcono.anchor = GridBagConstraints.EAST;
		gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
		gbc_lblIcono.gridx = 0;
		gbc_lblIcono.gridy = 1;
		pnlLogin.add(lblIcono, gbc_lblIcono);
		lblIcono.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-usuario-60.png")));

		JLabel lblMensajeBienvenida = new JLabel(MessagesVentanaUsuario.getString("VentanaUsuario.lblMensajeBienvenida.text")); //$NON-NLS-1$
		lblMensajeBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblMensajeBienvenida = new GridBagConstraints();
		gbc_lblMensajeBienvenida.anchor = GridBagConstraints.EAST;
		gbc_lblMensajeBienvenida.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensajeBienvenida.gridx = 2;
		gbc_lblMensajeBienvenida.gridy = 1;
		pnlLogin.add(lblMensajeBienvenida, gbc_lblMensajeBienvenida);

		lblUsuario = new JLabel("<dynamic>");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 3;
		gbc_lblUsuario.gridy = 1;
		pnlLogin.add(lblUsuario, gbc_lblUsuario);

		lblBandera_2.setIcon(new ImageIcon(VentanaUsuario.class.getResource(this.usuario.getRutaImagenBandera())));
		lblBandera_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridBagConstraints gbc_lblBandera_2 = new GridBagConstraints();
		gbc_lblBandera_2.anchor = GridBagConstraints.EAST;
		gbc_lblBandera_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblBandera_2.gridx = 5;
		gbc_lblBandera_2.gridy = 1;
		pnlLogin.add(lblBandera_2, gbc_lblBandera_2);

		JPanel pnlBuscar = new JPanel();
		pnlBuscar.setBackground(new Color(237, 217, 194));
		frame.getContentPane().add(pnlBuscar, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlBuscar = new GridBagLayout();
		gbl_pnlBuscar.columnWidths = new int[] { 44, 680, 341, 118, 109, 0, 0 };
		gbl_pnlBuscar.rowHeights = new int[] { 50, 0 };
		gbl_pnlBuscar.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlBuscar.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pnlBuscar.setLayout(gbl_pnlBuscar);

		JButton btnHome = new JButton("");
		btnHome.setBackground(new Color(237, 217, 194));
		btnHome.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/home.png")));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.anchor = GridBagConstraints.WEST;
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 1;
		gbc_btnHome.gridy = 0;
		pnlBuscar.add(btnHome, gbc_btnHome);

		JLabel lblLupa = new JLabel("");
		lblLupa.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/lupa.png")));
		lblLupa.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLupa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLupa.setAlignmentY(1.0f);
		lblLupa.setAlignmentX(1.0f);
		GridBagConstraints gbc_lblLupa = new GridBagConstraints();
		gbc_lblLupa.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblLupa.insets = new Insets(0, 0, 0, 5);
		gbc_lblLupa.gridx = 3;
		gbc_lblLupa.gridy = 0;
		pnlBuscar.add(lblLupa, gbc_lblLupa);

		tFBuscar = new JTextField();
		tFBuscar.setPreferredSize(new Dimension(100, 30));
		tFBuscar.setColumns(10);
		GridBagConstraints gbc_tFBuscar = new GridBagConstraints();
		gbc_tFBuscar.insets = new Insets(0, 0, 0, 5);
		gbc_tFBuscar.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFBuscar.gridx = 4;
		gbc_tFBuscar.gridy = 0;
		pnlBuscar.add(tFBuscar, gbc_tFBuscar);

		JTabbedPane tBOpciones = new JTabbedPane(JTabbedPane.TOP);
		tBOpciones.setBackground(new Color(244, 229, 226));
		tBOpciones.setToolTipText(MessagesVentanaUsuario.getString("VentanaUsuario.tBOpciones.toolTipText")); //$NON-NLS-1$
		frame.getContentPane().add(tBOpciones, BorderLayout.CENTER);
		tBOpciones.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		tBOpciones.setForeground(new Color(81, 43, 55));

		JPanel pnlHistorial = new JPanel();
		pnlHistorial.setBackground(new Color(244, 229, 226));
		pnlHistorial.setName("");
		tBOpciones.addTab("Historial de circuitos", null, pnlHistorial, null);
		pnlHistorial.setLayout(new BorderLayout(0, 0));

		JToolBar tBHistorial = new JToolBar();
		tBHistorial.setBackground(new Color(206, 219, 197));
		pnlHistorial.add(tBHistorial, BorderLayout.NORTH);

		JButton btnAnadirHistorial = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnAnadirHistorial.text")); //$NON-NLS-1$
		btnAnadirHistorial.addActionListener(new BtnAnadirHistorialActionListener_1());
		btnAnadirHistorial.setBackground(new Color(206, 219, 197));
		btnAnadirHistorial.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-add-24.png")));
		btnAnadirHistorial.setBorder(new RoundedBorder(10));
		tBHistorial.add(btnAnadirHistorial);

		JButton btnModificarHistorial = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnModificarHistorial.text")); //$NON-NLS-1$
		btnModificarHistorial.setBackground(new Color(206, 219, 197));
		btnModificarHistorial
				.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-edit-file-24.png")));
		btnModificarHistorial.setBorder(new RoundedBorder(10));
		tBHistorial.add(btnModificarHistorial);

		JButton btnEliminarHistorial = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnEliminarHistorial.text")); //$NON-NLS-1$
		btnEliminarHistorial.addActionListener(new BtnEliminarHistorialActionListener());
		btnEliminarHistorial.setBackground(new Color(206, 219, 197));
		btnEliminarHistorial
				.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-delete-24.png")));
		btnEliminarHistorial.setBorder(new RoundedBorder(10));
		tBHistorial.add(btnEliminarHistorial);

		TablaHistorial tabHistorial = new TablaHistorial();

		Object[] fila1_hist = { "Alcazar de San Juan", "11", "Marta", "275", true };
		tabHistorial.anadirFila(fila1_hist);
		Object[] fila2_hist = { "Almagro", "Fernandez Gamero", "Jesús", "1140", true };
		tabHistorial.anadirFila(fila2_hist);
		Object[] fila3_hist = { "Alcazar de San Juan", "Granados Velasco", "Jesús", "50", false };
		tabHistorial.anadirFila(fila3_hist);
		Object[] fila4_hist = { "Ciudad Real", "Peco Lozano", "Marta", "210", false };
		tabHistorial.anadirFila(fila4_hist);
		Object[] fila5_hist = { "Valdepeñas", "Harris", "Gaby", "50", true };
		tabHistorial.anadirFila(fila5_hist);

		JScrollPane scrollPaneHistorial_1 = new JScrollPane();
		scrollPaneHistorial_1.setBackground(new Color(244, 229, 226));
		pnlHistorial.add(scrollPaneHistorial_1, BorderLayout.CENTER);

		tabla_Historial_1 = new JTable();
		scrollPaneHistorial_1.setViewportView(tabla_Historial_1);
		tabla_Historial_1.setBackground(new Color(244, 229, 226));
		tabla_Historial_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListSelectionModel rowSM_historial = tabla_Historial_1.getSelectionModel();
		rowSM_historial.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {

					TablaHistorial modeloTablaHistorial = (TablaHistorial) tabla_Historial_1.getModel();
					int n = tabla_Historial_1.getSelectedRow();
					if (n != -1) {
						String contenidoHistorial = "Circuito: " + modeloTablaHistorial.getValueAt(n, 0) + "\n"
								+ "Nº de personas: " + modeloTablaHistorial.getValueAt(n, 1) + "\n" + "Coste (€): "
								+ modeloTablaHistorial.getValueAt(n, 3) + "\n";
						contenidoHistorial += (Boolean) modeloTablaHistorial.getValueAt(n, 4) ? "Realizado "
								: "No realizado\n";

						tFFilaHistorialSeleccionada.setText(contenidoHistorial);
					}
				}
			}

		});

		tabla_Historial_1.setModel(tabHistorial);
		tabla_Historial_1.setRowHeight(35);

		JPanel pnl1Historial_1 = new JPanel();
		pnl1Historial_1.setBackground(new Color(244, 229, 226));
		pnlHistorial.add(pnl1Historial_1, BorderLayout.SOUTH);
		pnl1Historial_1.setLayout(new GridLayout(1, 2, 0, 0));

		tFFilaHistorialSeleccionada = new JTextField();
		tFFilaHistorialSeleccionada.setColumns(10);
		pnl1Historial_1.add(tFFilaHistorialSeleccionada);

		JPanel pnlRutasTematicas = new JPanel();
		pnlRutasTematicas.setBackground(new Color(244, 229, 226));
		tBOpciones.addTab("Rutas temáticas", null, pnlRutasTematicas, null);
		GridBagLayout gbl_pnlRutasTematicas = new GridBagLayout();
		gbl_pnlRutasTematicas.columnWidths = new int[] { 332, 298, 361, 351, 0 };
		gbl_pnlRutasTematicas.rowHeights = new int[] { 20, 78, 312, 110, 0 };
		gbl_pnlRutasTematicas.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlRutasTematicas.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlRutasTematicas.setLayout(gbl_pnlRutasTematicas);

		lblAlmagro = new JLabel("Almagro");
		lblAlmagro.setForeground(new Color(81, 43, 55));
		lblAlmagro.setFont(new Font("Goudy Old Style", Font.ITALIC, 40));
		GridBagConstraints gbc_lblAlmagro = new GridBagConstraints();
		gbc_lblAlmagro.anchor = GridBagConstraints.SOUTH;
		gbc_lblAlmagro.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlmagro.gridx = 0;
		gbc_lblAlmagro.gridy = 1;
		pnlRutasTematicas.add(lblAlmagro, gbc_lblAlmagro);

		lblCampoDeCriptana = new JLabel("Campo de Criptana");
		lblCampoDeCriptana.setForeground(new Color(81, 43, 55));
		lblCampoDeCriptana.setFont(new Font("Goudy Old Style", Font.PLAIN, 40));
		GridBagConstraints gbc_lblCampoDeCriptana = new GridBagConstraints();
		gbc_lblCampoDeCriptana.anchor = GridBagConstraints.SOUTH;
		gbc_lblCampoDeCriptana.insets = new Insets(0, 0, 5, 5);
		gbc_lblCampoDeCriptana.gridx = 2;
		gbc_lblCampoDeCriptana.gridy = 1;
		pnlRutasTematicas.add(lblCampoDeCriptana, gbc_lblCampoDeCriptana);

		JLabel lblFotoAlm = new JLabel(" ");
		lblFotoAlm.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/RutaAlm.png")));
		GridBagConstraints gbc_lblFotoAlm = new GridBagConstraints();
		gbc_lblFotoAlm.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoAlm.gridx = 0;
		gbc_lblFotoAlm.gridy = 2;
		pnlRutasTematicas.add(lblFotoAlm, gbc_lblFotoAlm);

		JTextPane txtpnPasaUnaAnimada = new JTextPane();
		txtpnPasaUnaAnimada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPasaUnaAnimada.setOpaque(false);
		txtpnPasaUnaAnimada.setText(
				MessagesVentanaUsuario.getString("VentanaUsuario.txtpnPasaUnaAnimada.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtpnPasaUnaAnimada = new GridBagConstraints();
		gbc_txtpnPasaUnaAnimada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnPasaUnaAnimada.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnPasaUnaAnimada.gridx = 1;
		gbc_txtpnPasaUnaAnimada.gridy = 2;
		pnlRutasTematicas.add(txtpnPasaUnaAnimada, gbc_txtpnPasaUnaAnimada);

		JLabel lblFotoCamp = new JLabel(" ");
		lblFotoCamp.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/RutaCamp.png")));
		GridBagConstraints gbc_lblFotoCamp = new GridBagConstraints();
		gbc_lblFotoCamp.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCamp.gridx = 2;
		gbc_lblFotoCamp.gridy = 2;
		pnlRutasTematicas.add(lblFotoCamp, gbc_lblFotoCamp);

		JTextPane txtpnEstaEscapadaEn = new JTextPane();
		txtpnEstaEscapadaEn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnEstaEscapadaEn.setOpaque(false);
		txtpnEstaEscapadaEn.setText(
				MessagesVentanaUsuario.getString("VentanaUsuario.txtpnEstaEscapadaEn.text")); //$NON-NLS-1$
		GridBagConstraints gbc_txtpnEstaEscapadaEn = new GridBagConstraints();
		gbc_txtpnEstaEscapadaEn.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnEstaEscapadaEn.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnEstaEscapadaEn.gridx = 3;
		gbc_txtpnEstaEscapadaEn.gridy = 2;
		pnlRutasTematicas.add(txtpnEstaEscapadaEn, gbc_txtpnEstaEscapadaEn);

		JPanel pnlGruposTuristas = new JPanel();
		pnlGruposTuristas.setBackground(new Color(244, 229, 226));
		tBOpciones.addTab("Grupos de turistas", null, pnlGruposTuristas, null);
		pnlGruposTuristas.setLayout(new BorderLayout(0, 0));

		JToolBar tBGruposTuristas = new JToolBar();
		tBGruposTuristas.setBackground(new Color(206, 219, 197));
		pnlGruposTuristas.add(tBGruposTuristas, BorderLayout.NORTH);

		JButton btnAnadirGruposTuristas = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnAnadirGruposTuristas.text")); //$NON-NLS-1$
		btnAnadirGruposTuristas.addActionListener(new BtnAnadirGruposTuristasActionListener_1());
		btnAnadirGruposTuristas.setBackground(new Color(206, 219, 197));
		btnAnadirGruposTuristas
				.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-add-24.png")));
		btnAnadirGruposTuristas.setBorder(new RoundedBorder(10));
		tBGruposTuristas.add(btnAnadirGruposTuristas);

		JButton btnModificarGruposTuristas = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnModificarGruposTuristas.text")); //$NON-NLS-1$
		btnModificarGruposTuristas.setBackground(new Color(206, 219, 197));
		btnModificarGruposTuristas
				.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-edit-file-24.png")));
		btnModificarGruposTuristas.setBorder(new RoundedBorder(10));
		tBGruposTuristas.add(btnModificarGruposTuristas);

		JButton btnEliminarGruposTuristas = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnEliminarGruposTuristas.text")); //$NON-NLS-1$
		btnEliminarGruposTuristas.addActionListener(new BtnEliminarGruposTuristasActionListener());
		btnEliminarGruposTuristas.setBackground(new Color(206, 219, 197));
		btnEliminarGruposTuristas
				.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-delete-24.png")));
		btnEliminarGruposTuristas.setBorder(new RoundedBorder(10));
		tBGruposTuristas.add(btnEliminarGruposTuristas);

		TablaGruposTuristas tabGruposGuias = new TablaGruposTuristas();

		Object[] fila1_gg = { "Alcazar de San Juan", "11", "Marta (español)", "275", true };
		tabGruposGuias.anadirFila(fila1_gg);
		Object[] fila2_gg = { "Almagro", "18", "Jesús (francés)", "1140", true };
		tabGruposGuias.anadirFila(fila2_gg);
		Object[] fila3_gg = { "Alcazar de San Juan", "8", "Rosa (chino)", "50", true };
		tabGruposGuias.anadirFila(fila3_gg);
		Object[] fila4_gg = { "Ciudad Real", "6", "Marta (inglés)", "210", false };
		tabGruposGuias.anadirFila(fila4_gg);
		Object[] fila5_gg = { "Valdepeñas", "4", "Gaby (español)", "50", false };
		tabGruposGuias.anadirFila(fila5_gg);

		JScrollPane scrollPaneGruposTuristas = new JScrollPane();
		scrollPaneGruposTuristas.setBackground(new Color(244, 229, 226));
		pnlGruposTuristas.add(scrollPaneGruposTuristas, BorderLayout.CENTER);

		tabla_GruposTuristas = new JTable();
		scrollPaneGruposTuristas.setViewportView(tabla_GruposTuristas);
		tabla_GruposTuristas.setBackground(new Color(244, 229, 226));
		tabla_GruposTuristas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListSelectionModel rowSM_gg = tabla_GruposTuristas.getSelectionModel();
		rowSM_gg.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {

					TablaGruposTuristas modeloTablaGruposGuias = (TablaGruposTuristas) tabla_GruposTuristas.getModel();
					int n = tabla_GruposTuristas.getSelectedRow();
					if (n != -1) {
						String contenidoGruposGuias = "Circuito: " + modeloTablaGruposGuias.getValueAt(n, 0) + "\n"
								+ "Nº de personas: " + modeloTablaGruposGuias.getValueAt(n, 1) + "\n" + "Coste (€): "
								+ modeloTablaGruposGuias.getValueAt(n, 3) + "\n";
						contenidoGruposGuias += (Boolean) modeloTablaGruposGuias.getValueAt(n, 4) ? "Realizado "
								: "No realizado\n";

						tFGruposGuiasSeleccionada.setText(contenidoGruposGuias);
					}
				}
			}

		});

		tabla_GruposTuristas.setModel(tabGruposGuias);
		tabla_GruposTuristas.setRowHeight(35);

		JPanel pnl1GruposTuristas = new JPanel();
		pnlGruposTuristas.add(pnl1GruposTuristas, BorderLayout.SOUTH);
		GridBagLayout gbl_pnl1GruposTuristas = new GridBagLayout();
		gbl_pnl1GruposTuristas.columnWidths = new int[] { 0, 0 };
		gbl_pnl1GruposTuristas.rowHeights = new int[] { 0, 0 };
		gbl_pnl1GruposTuristas.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pnl1GruposTuristas.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pnl1GruposTuristas.setLayout(gbl_pnl1GruposTuristas);

		tFGruposGuiasSeleccionada = new JTextField();
		GridBagConstraints gbc_tFGruposGuiasSeleccionada = new GridBagConstraints();
		gbc_tFGruposGuiasSeleccionada.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGruposGuiasSeleccionada.gridx = 0;
		gbc_tFGruposGuiasSeleccionada.gridy = 0;
		pnl1GruposTuristas.add(tFGruposGuiasSeleccionada, gbc_tFGruposGuiasSeleccionada);
		tFGruposGuiasSeleccionada.setColumns(10);

		JPanel pnlGuias = new JPanel();
		pnlGuias.setFocusTraversalPolicyProvider(true);
		pnlGuias.setFocusCycleRoot(true);
		pnlGuias.setBackground(new Color(244, 229, 226));
		pnlGuias.setToolTipText(MessagesVentanaUsuario.getString("VentanaUsuario.pnlGuias.toolTipText")); //$NON-NLS-1$
		tBOpciones.addTab("Guías", null, pnlGuias, null);
		pnlGuias.setLayout(new BorderLayout(0, 0));

		JToolBar tBGuias = new JToolBar();
		tBGuias.setBackground(new Color(206, 219, 197));
		pnlGuias.add(tBGuias, BorderLayout.NORTH);

		JButton btnAadir = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnAadir.text")); //$NON-NLS-1$
		btnAadir.setBackground(new Color(206, 219, 197));
		btnAadir.addActionListener(new BtnAadirActionListener());
		btnAadir.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-add-24.png")));
		btnAadir.setBorder(new RoundedBorder(10));
		tBGuias.add(btnAadir);

		JButton btnModificar = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnModificar.text")); //$NON-NLS-1$
		btnModificar.setBackground(new Color(206, 219, 197));
		btnModificar.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-edit-file-24.png")));
		btnModificar.setBorder(new RoundedBorder(10));
		tBGuias.add(btnModificar);

		JButton btnEliminar = new JButton(MessagesVentanaUsuario.getString("VentanaUsuario.btnEliminar.text")); //$NON-NLS-1$
		btnEliminar.setBackground(new Color(206, 219, 197));
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		btnEliminar.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-delete-24.png")));
		btnEliminar.setBorder(new RoundedBorder(10));
		tBGuias.add(btnEliminar);

		TablaGuias tabGuias = new TablaGuias();

		Object[] fila1 = { "Marta", "Lopez Canales",
				new ImageIcon(getClass().getClassLoader().getResource("Presentacion/foto1.jpg")), "Español-Inglés",
				true };
		tabGuias.aniadeFila(fila1);
		Object[] fila2 = { "Jesus", "Fernandez Gamero",
				new ImageIcon(getClass().getClassLoader().getResource("Presentacion/foto3.jpg")), "Español-Francés",
				true };
		tabGuias.aniadeFila(fila2);
		Object[] fila3 = { "Julia", "Granados Velasco",
				new ImageIcon(getClass().getClassLoader().getResource("Presentacion/foto2.jpg")), "Español-Chino",
				false };
		tabGuias.aniadeFila(fila3);
		Object[] fila4 = { "Raul", "Peco Lozano",
				new ImageIcon(getClass().getClassLoader().getResource("Presentacion/foto4.jpg")), "Español", false };
		tabGuias.aniadeFila(fila4);
		Object[] fila5 = { "Stephanie", "Harris",
				new ImageIcon(getClass().getClassLoader().getResource("Presentacion/foto5.jpg")), "Inglés-Italiano",
				true };
		tabGuias.aniadeFila(fila5);

		JScrollPane scrollPane_1;
		scrollPaneGuias = new JScrollPane();
		scrollPaneGuias.setBackground(new Color(244, 229, 226));
		pnlGuias.add(scrollPaneGuias, BorderLayout.CENTER);

		tabla_Guias = new JTable();
		tabla_Guias.setBackground(new Color(244, 229, 226));
		tabla_Guias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListSelectionModel rowSM_guias = tabla_Guias.getSelectionModel();
		rowSM_guias.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {

					TablaGuias modeloTabla = (TablaGuias) tabla_Guias.getModel();
					int n = tabla_Guias.getSelectedRow();
					if (n != -1) {
						String contenido = "Nombre: " + modeloTabla.getValueAt(n, 0) + "\n" + "Apellidos: "
								+ modeloTabla.getValueAt(n, 1) + "\n" + "Idiomas: " + modeloTabla.getValueAt(n, 3)
								+ "\n";
						contenido += (Boolean) modeloTabla.getValueAt(n, 4) ? "Disponible " : "No Disponible\n";
						taFilaSeleccionada.setText(contenido);
						lblFotoGuia.setIcon((ImageIcon) modeloTabla.getValueAt(n, 2));
					}
				}
			}

		});

		tabla_Guias.setModel(tabGuias);
		TableColumn columnaFoto_guias = tabla_Guias.getColumnModel().getColumn(2);
		columnaFoto_guias.setCellEditor(new ColumnaFotoEditor());
		tabla_Guias.setRowHeight(40);

		scrollPaneGuias.setViewportView(tabla_Guias);

		JPanel pnl1Guias;
		pnl1Guias = new JPanel();
		pnl1Guias.setBackground(new Color(244, 229, 226));
		pnlGuias.add(pnl1Guias, BorderLayout.SOUTH);
		pnl1Guias.setLayout(new GridLayout(1, 2, 0, 0));

		lblFotoGuia = new JLabel(" ");
		pnl1Guias.add(lblFotoGuia);

		taFilaSeleccionada = new JTextField();
		pnl1Guias.add(taFilaSeleccionada);
		taFilaSeleccionada.setColumns(10);

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario(lblUsuario.getText());
				VentanaPrincipal principal = new VentanaPrincipal(usuario);
				principal.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblBandera_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ImageIcon imagenSpain = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/spain.png"));
				ImageIcon imagenEnglish = new ImageIcon(
						VentanaPrincipal.class.getResource("/Presentacion/english.png"));

				if (spain) {
					lblBandera_2.setIcon(imagenSpain);
					lblBandera_2.repaint();
					spain = false;
				} else {
					lblBandera_2.setIcon(imagenEnglish);
					lblBandera_2.repaint();
					spain = true;

				}
			}
		});
	}

	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			TablaGuias tab = (TablaGuias) tabla_Guias.getModel();
			Object[] nuevaFila = { "...", "...",
					new ImageIcon(getClass().getClassLoader().getResource("Presentacion/user24.png")), "...", false };
			tab.aniadeFila(nuevaFila);
			tab.fireTableDataChanged();
		}
	}

	private class BtnAnadirHistorialActionListener_1 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			TablaHistorial tabTablaHistorial = (TablaHistorial) tabla_Historial_1.getModel();
			Object[] nuevaFila_hist = { "...", "...", "...", "...", false };
			tabTablaHistorial.anadirFila(nuevaFila_hist);
			tabTablaHistorial.fireTableDataChanged();
		}
	}

	private class BtnAnadirGruposTuristasActionListener_1 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			TablaGruposTuristas tabTablaGruposTuristas = (TablaGruposTuristas) tabla_GruposTuristas.getModel();
			Object[] nuevaFila_gg = { "...", "...", "...", "...", false };
			tabTablaGruposTuristas.anadirFila(nuevaFila_gg);
			tabTablaGruposTuristas.fireTableDataChanged();

		}
	}

	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TablaGuias tab = (TablaGuias) tabla_Guias.getModel();
			int n = tabla_Guias.getSelectedRow();
			if (n != -1)
				tab.eliminaFila(tabla_Guias.getSelectedRow());
			tab.fireTableDataChanged();
		}
	}

	private class BtnEliminarHistorialActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TablaHistorial tabHistorial = (TablaHistorial) tabla_Historial_1.getModel();
			int n = tabla_Historial_1.getSelectedRow();
			if (n != -1)
				tabHistorial.eliminaFila(tabla_Historial_1.getSelectedRow());
			tabHistorial.fireTableDataChanged();
		}
	}

	private class BtnEliminarGruposTuristasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TablaGruposTuristas tabGruposTuristas = (TablaGruposTuristas) tabla_GruposTuristas.getModel();
			int n = tabla_GruposTuristas.getSelectedRow();
			if (n != -1)
				tabGruposTuristas.eliminaFila(tabla_GruposTuristas.getSelectedRow());
			tabGruposTuristas.fireTableDataChanged();
		}
	}

}
