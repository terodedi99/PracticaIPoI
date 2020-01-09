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

public class VentanaLocalidades {

	public JFrame frame;
	private JTextField tFBuscar;
	public Localidad localidad;
	private JLabel lblFechaEntrada;
	private JDateChooser dateChooser; // Añadir el calendario
	private JDateChooser dateChooser_1;
	private JLabel lblFechaDeSalida;
	private JCalendar calendar_entrada;
	private JCalendar calendar_salida;
	private JTextFieldDateEditor textFieldDateEditor;
	JLabel lblBandera_2 = new JLabel("");
	private boolean spain;
	private JLabel lblNumPersonas;
	private JSpinner spinnerPersonas;
	private JButton btnBorrarCambios;
	private JButton btnGuardarCambios;
	private Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLocalidades window = new VentanaLocalidades();
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
	public VentanaLocalidades() {
		initialize();
	}

	

	public VentanaLocalidades(Localidad localidad, boolean spain, Usuario usuario) {
		this.localidad = localidad;
		this.spain = spain;
		this.usuario = usuario;
		ImageIcon imagenSpain = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/spain.png"));
		ImageIcon imagenEnglish = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/english.png"));

		if (spain) {
			this.localidad.setRutaImagen("/Presentacion/spain.png");
			lblBandera_2.setIcon(imagenSpain);
			lblBandera_2.repaint();
			spain = false;
		} else {
			this.localidad.setRutaImagen("/Presentacion/english.png");
			lblBandera_2.setIcon(imagenEnglish);
			lblBandera_2.repaint();
			spain = true;
			
		}

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
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground(new Color(237, 217, 194));
		frame.getContentPane().add(pnlLogin, BorderLayout.NORTH);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 195, 379, 405, 151, 155, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 15, 48, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);

		lblBandera_2.setIcon(new ImageIcon(VentanaLocalidades.class.getResource(this.localidad.getRutaImagen())));
		lblBandera_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBandera_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBandera_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridBagConstraints gbc_lblBandera_2 = new GridBagConstraints();
		gbc_lblBandera_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblBandera_2.gridx = 0;
		gbc_lblBandera_2.gridy = 1;
		pnlLogin.add(lblBandera_2, gbc_lblBandera_2);

		if (this.usuario != null) {
			JLabel lblUsuario = new JLabel("");
			lblUsuario.setIcon(
					new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/icons8-usuario-60.png")));
			GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
			gbc_lblUsuario.anchor = GridBagConstraints.SOUTHEAST;
			gbc_lblUsuario.insets = new Insets(0, 0, 0, 5);
			gbc_lblUsuario.gridx = 3;
			gbc_lblUsuario.gridy = 1;
			pnlLogin.add(lblUsuario, gbc_lblUsuario);
		}
		JButton btnUsuario;
		if (this.usuario != null) {
			btnUsuario = new JButton("   " + this.usuario.getNombre() + "   ");
			btnUsuario.setBackground(new Color(237, 217, 194));
			GridBagConstraints gbc_btnUsuario = new GridBagConstraints();
			gbc_btnUsuario.anchor = GridBagConstraints.WEST;
			gbc_btnUsuario.gridx = 4;
			gbc_btnUsuario.gridy = 1;
			pnlLogin.add(btnUsuario, gbc_btnUsuario);
			btnUsuario.setBorder(new RoundedBorder(10));
			btnUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VentanaUsuario usuario = new VentanaUsuario(new Usuario(btnUsuario.getText().replace(" ", "")),
							!spain);
					usuario.frame.setVisible(true);
					frame.dispose();
				}
			});
		}

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
		btnHome.setIcon(new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/home.png")));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.anchor = GridBagConstraints.WEST;
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 1;
		gbc_btnHome.gridy = 0;
		pnlBuscar.add(btnHome, gbc_btnHome);

		JLabel lblLupa = new JLabel("");
		lblLupa.setIcon(new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/lupa.png")));
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
		tBOpciones.setToolTipText(MessagesVentanaLocalidades.getString("VentanaLocalidades.tBOpciones.toolTipText")); //$NON-NLS-1$
		frame.getContentPane().add(tBOpciones, BorderLayout.CENTER);
		tBOpciones.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		tBOpciones.setForeground(new Color(81, 43, 55));

		JPanel pnlLocalidad = new JPanel();
		pnlLocalidad.setBackground(new Color(244, 229, 226));
		pnlLocalidad.setName("");
		tBOpciones.addTab("Localidad", null, pnlLocalidad, null);
		GridBagLayout gbl_pnlLocalidad = new GridBagLayout();
		gbl_pnlLocalidad.columnWidths = new int[] { 104, 423, 550, 48, 0 };
		gbl_pnlLocalidad.rowHeights = new int[] { 57, 89, 56, 275, 146, 0, 0 };
		gbl_pnlLocalidad.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlLocalidad.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlLocalidad.setLayout(gbl_pnlLocalidad);

		JLabel lblLocalidad = new JLabel(this.localidad.getNombre());
		lblLocalidad.setForeground(new Color(81, 43, 55));
		lblLocalidad.setFont(new Font("Goudy Old Style", Font.PLAIN, 50));
		GridBagConstraints gbc_lblLocalidad = new GridBagConstraints();
		gbc_lblLocalidad.anchor = GridBagConstraints.WEST;
		gbc_lblLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalidad.gridx = 1;
		gbc_lblLocalidad.gridy = 1;
		pnlLocalidad.add(lblLocalidad, gbc_lblLocalidad);

		JLabel lblDescripcion = new JLabel(MessagesVentanaLocalidades.getString("VentanaLocalidades.lblDescripcion.text")); //$NON-NLS-1$
		lblDescripcion.setForeground(new Color(81, 43, 55));
		lblDescripcion.setFont(new Font("Goudy Old Style", Font.PLAIN, 35));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.NORTH;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 2;
		pnlLocalidad.add(lblDescripcion, gbc_lblDescripcion);

		JTextPane txtpnTextoDescripcion = new JTextPane();
		txtpnTextoDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnTextoDescripcion.setOpaque(false);
		txtpnTextoDescripcion.setText(this.localidad.getDescripcion());
		GridBagConstraints gbc_txtpnTextoDescripcion = new GridBagConstraints();
		gbc_txtpnTextoDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnTextoDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtpnTextoDescripcion.gridx = 1;
		gbc_txtpnTextoDescripcion.gridy = 3;
		pnlLocalidad.add(txtpnTextoDescripcion, gbc_txtpnTextoDescripcion);

		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(VentanaLocalidades.class.getResource(this.localidad.getRutaImagenLocalidad())));
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.anchor = GridBagConstraints.WEST;
		gbc_lblImagen.gridheight = 3;
		gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblImagen.gridx = 2;
		gbc_lblImagen.gridy = 2;
		pnlLocalidad.add(lblImagen, gbc_lblImagen);

		JPanel pnlFechas = new JPanel();
		pnlFechas.setBackground(new Color(244, 229, 226));
		tBOpciones.addTab("Fechas disponibles", null, pnlFechas, null);
		pnlFechas.setLayout(null);

		JLabel lblFechasDisponibles = new JLabel(MessagesVentanaLocalidades.getString("VentanaLocalidades.lblFechasDisponibles.text")); //$NON-NLS-1$
		lblFechasDisponibles.setBounds(30, 42, 360, 61);
		lblFechasDisponibles.setForeground(new Color(81, 43, 55));
		lblFechasDisponibles.setFont(new Font("Goudy Old Style", Font.PLAIN, 50));
		pnlFechas.add(lblFechasDisponibles);

		JPanel pnlCalendario = new JPanel();
		pnlCalendario.setBounds(30, 114, 1280, 440);
		pnlCalendario.setOpaque(false);
		pnlFechas.add(pnlCalendario);
		GridBagLayout gbl_pnlCalendario = new GridBagLayout();
		gbl_pnlCalendario.columnWidths = new int[] { 49, 226, 240, 171, 240, 0, 0 };
		gbl_pnlCalendario.rowHeights = new int[] { 67, 35, 0, 202, 0, 0 };
		gbl_pnlCalendario.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlCalendario.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlCalendario.setLayout(gbl_pnlCalendario);
		{
			lblNumPersonas = new JLabel(MessagesVentanaLocalidades.getString("VentanaLocalidades.lblNumPersonas.text")); //$NON-NLS-1$
			lblNumPersonas.setForeground(new Color(81, 43, 55));
			lblNumPersonas.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_lblNumPersonas = new GridBagConstraints();
			gbc_lblNumPersonas.anchor = GridBagConstraints.EAST;
			gbc_lblNumPersonas.insets = new Insets(0, 0, 5, 5);
			gbc_lblNumPersonas.gridx = 1;
			gbc_lblNumPersonas.gridy = 0;
			pnlCalendario.add(lblNumPersonas, gbc_lblNumPersonas);
		}
		{
			spinnerPersonas = new JSpinner();
			spinnerPersonas.setModel(new SpinnerNumberModel(2, 2, 40, 1)); // Valor máximo de 40 personas
			GridBagConstraints gbc_spinnerPersonas = new GridBagConstraints();
			gbc_spinnerPersonas.anchor = GridBagConstraints.WEST;
			gbc_spinnerPersonas.insets = new Insets(0, 0, 5, 5);
			gbc_spinnerPersonas.gridx = 2;
			gbc_spinnerPersonas.gridy = 0;
			pnlCalendario.add(spinnerPersonas, gbc_spinnerPersonas);
		}

		lblFechaEntrada = new JLabel(MessagesVentanaLocalidades.getString("VentanaLocalidades.lblFechaEntrada.text")); //$NON-NLS-1$
		lblFechaEntrada.setForeground(new Color(81, 43, 55));
		lblFechaEntrada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFechaEntrada = new GridBagConstraints();
		gbc_lblFechaEntrada.anchor = GridBagConstraints.EAST;
		gbc_lblFechaEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaEntrada.gridx = 1;
		gbc_lblFechaEntrada.gridy = 1;
		pnlCalendario.add(lblFechaEntrada, gbc_lblFechaEntrada);

		// Instanciar Componente calendario, con máscara para que el usuario pueda
		// meterlo de forma manual si quiere
		// Se pondrá en rojo si el usuario mete una fecha inválida
		dateChooser = new JDateChooser("dd/MM/yyyy", "##/##/####", '_');
		dateChooser.getCalendarButton()
				.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-calendario-24.png")));
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 1;
		pnlCalendario.add(dateChooser, gbc_dateChooser);

		lblFechaDeSalida = new JLabel(MessagesVentanaLocalidades.getString("VentanaLocalidades.lblFechaDeSalida.text")); //$NON-NLS-1$
		lblFechaDeSalida.setForeground(new Color(81, 43, 55));
		lblFechaDeSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFechaDeSalida = new GridBagConstraints();
		gbc_lblFechaDeSalida.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeSalida.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeSalida.gridx = 3;
		gbc_lblFechaDeSalida.gridy = 1;
		pnlCalendario.add(lblFechaDeSalida, gbc_lblFechaDeSalida);

		dateChooser_1 = new JDateChooser("dd/MM/yyyy", "##/##/####", '_');
		dateChooser_1.getCalendarButton()
				.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-calendario-24.png")));
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_1.gridx = 4;
		gbc_dateChooser_1.gridy = 1;
		pnlCalendario.add(dateChooser_1, gbc_dateChooser_1);

		{
		}
		{
			btnBorrarCambios = new JButton(MessagesVentanaLocalidades.getString("VentanaLocalidades.btnBorrarCambios.text")); //$NON-NLS-1$
			btnBorrarCambios.setOpaque(false);
			btnBorrarCambios.setBackground(new Color(244, 229, 226));
			btnBorrarCambios.addActionListener(new BtnBorrarCambiosActionListener());
			{
				btnGuardarCambios = new JButton(MessagesVentanaLocalidades.getString("VentanaLocalidades.btnGuardarCambios.text")); //$NON-NLS-1$
				btnGuardarCambios.setBackground(new Color(244, 229, 226));
				btnGuardarCambios.addActionListener(new BtnGuardarCambiosActionListener());
				btnGuardarCambios.setOpaque(false);
				btnGuardarCambios.setForeground(new Color(81, 43, 55));
				btnGuardarCambios.setBorder(new RoundedBorder(10));
				btnGuardarCambios.setFont(new Font("Tahoma", Font.PLAIN, 15));
				GridBagConstraints gbc_btnGuardarCambios = new GridBagConstraints();
				gbc_btnGuardarCambios.anchor = GridBagConstraints.EAST;
				gbc_btnGuardarCambios.insets = new Insets(0, 0, 0, 5);
				gbc_btnGuardarCambios.gridx = 2;
				gbc_btnGuardarCambios.gridy = 4;
				pnlCalendario.add(btnGuardarCambios, gbc_btnGuardarCambios);

			}
			btnBorrarCambios.setForeground(new Color(81, 43, 55));
			btnBorrarCambios.setBorder(new RoundedBorder(10));
			btnBorrarCambios.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GridBagConstraints gbc_btnBorrarCambios = new GridBagConstraints();
			gbc_btnBorrarCambios.anchor = GridBagConstraints.WEST;
			gbc_btnBorrarCambios.insets = new Insets(0, 0, 0, 5);
			gbc_btnBorrarCambios.gridx = 3;
			gbc_btnBorrarCambios.gridy = 4;
			pnlCalendario.add(btnBorrarCambios, gbc_btnBorrarCambios);
		}

		JPanel pnlPrecio = new JPanel();
		pnlPrecio.setBackground(new Color(244, 229, 226));
		tBOpciones.addTab("Precio", null, pnlPrecio, null);
		GridBagLayout gbl_pnlPrecio = new GridBagLayout();
		gbl_pnlPrecio.columnWidths = new int[] { 61, 139, 77, 492, 0 };
		gbl_pnlPrecio.rowHeights = new int[] { 46, 0, 0, 37, 0, 84, 72, 0, 78, 0 };
		gbl_pnlPrecio.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlPrecio.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlPrecio.setLayout(gbl_pnlPrecio);

		JLabel lblPrecio = new JLabel(MessagesVentanaLocalidades.getString("VentanaLocalidades.lblPrecio.text")); //$NON-NLS-1$
		lblPrecio.setForeground(new Color(81, 43, 55));
		lblPrecio.setFont(new Font("Goudy Old Style", Font.PLAIN, 50));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 1;
		pnlPrecio.add(lblPrecio, gbc_lblPrecio);

		JLabel lblIconoPersona = new JLabel("");
		lblIconoPersona.setIcon(new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/iconoPersona.png")));
		GridBagConstraints gbc_lblIconoPersona = new GridBagConstraints();
		gbc_lblIconoPersona.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconoPersona.gridx = 2;
		gbc_lblIconoPersona.gridy = 3;
		pnlPrecio.add(lblIconoPersona, gbc_lblIconoPersona);

		JLabel lblPrecioxPersona = new JLabel(this.localidad.getPrecioPersona());
		lblPrecioxPersona.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_lblPrecioxPersona = new GridBagConstraints();
		gbc_lblPrecioxPersona.anchor = GridBagConstraints.WEST;
		gbc_lblPrecioxPersona.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrecioxPersona.gridx = 3;
		gbc_lblPrecioxPersona.gridy = 3;
		pnlPrecio.add(lblPrecioxPersona, gbc_lblPrecioxPersona);

		JLabel lblIconoGrupos = new JLabel("");
		lblIconoGrupos.setIcon(new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/iconoGrupo.png")));
		GridBagConstraints gbc_lblIconoGrupos = new GridBagConstraints();
		gbc_lblIconoGrupos.gridheight = 2;
		gbc_lblIconoGrupos.insets = new Insets(0, 0, 5, 5);
		gbc_lblIconoGrupos.gridx = 2;
		gbc_lblIconoGrupos.gridy = 5;
		pnlPrecio.add(lblIconoGrupos, gbc_lblIconoGrupos);

		JLabel lblPrecioxGrupos_1 = new JLabel(this.localidad.getPrecioGrupo1());
		lblPrecioxGrupos_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_lblPrecioxGrupos_1 = new GridBagConstraints();
		gbc_lblPrecioxGrupos_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblPrecioxGrupos_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrecioxGrupos_1.gridx = 3;
		gbc_lblPrecioxGrupos_1.gridy = 5;
		pnlPrecio.add(lblPrecioxGrupos_1, gbc_lblPrecioxGrupos_1);

		JLabel lblPrecioxGrupos_2 = new JLabel(this.localidad.getPrecioGrupo2());
		lblPrecioxGrupos_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_lblPrecioxGrupos_2 = new GridBagConstraints();
		gbc_lblPrecioxGrupos_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPrecioxGrupos_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrecioxGrupos_2.gridx = 3;
		gbc_lblPrecioxGrupos_2.gridy = 6;
		pnlPrecio.add(lblPrecioxGrupos_2, gbc_lblPrecioxGrupos_2);

		JLabel lblIconoRuta = new JLabel("");
		lblIconoRuta.setIcon(
				new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/iconoPersonalizarRuta.png")));
		GridBagConstraints gbc_lblIconoRuta = new GridBagConstraints();
		gbc_lblIconoRuta.insets = new Insets(0, 0, 0, 5);
		gbc_lblIconoRuta.gridx = 2;
		gbc_lblIconoRuta.gridy = 8;
		pnlPrecio.add(lblIconoRuta, gbc_lblIconoRuta);

		JButton btnPersonalizarRuta = new JButton(MessagesVentanaLocalidades.getString("VentanaLocalidades.btnPersonalizarRuta.text")); //$NON-NLS-1$
		btnPersonalizarRuta.addActionListener(new BtnPersonalizarRutaActionListener());
		btnPersonalizarRuta.setBackground(new Color(244, 229, 226));
		btnPersonalizarRuta.setBorder(new RoundedBorder(10));
		btnPersonalizarRuta.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_btnPersonalizarRuta = new GridBagConstraints();
		gbc_btnPersonalizarRuta.anchor = GridBagConstraints.WEST;
		gbc_btnPersonalizarRuta.gridx = 3;
		gbc_btnPersonalizarRuta.gridy = 8;
		pnlPrecio.add(btnPersonalizarRuta, gbc_btnPersonalizarRuta);

		JPanel pnlOpiniones = new JPanel();
		pnlOpiniones.setFocusTraversalPolicyProvider(true);
		pnlOpiniones.setFocusCycleRoot(true);
		pnlOpiniones.setBackground(new Color(244, 229, 226));
		pnlOpiniones.setToolTipText(MessagesVentanaLocalidades.getString("VentanaLocalidades.pnlOpiniones.toolTipText")); //$NON-NLS-1$
		tBOpciones.addTab("Opiniones", null, pnlOpiniones, null);
		GridBagLayout gbl_pnlOpiniones = new GridBagLayout();
		gbl_pnlOpiniones.columnWidths = new int[] { 43, 283, 496, 266, 0 };
		gbl_pnlOpiniones.rowHeights = new int[] { 39, 80, 75, 23, 75, 23, 75, 23, 75, 0 };
		gbl_pnlOpiniones.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlOpiniones.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlOpiniones.setLayout(gbl_pnlOpiniones);

		JLabel lblOpiniones = new JLabel(MessagesVentanaLocalidades.getString("VentanaLocalidades.lblOpiniones.text")); //$NON-NLS-1$
		lblOpiniones.setForeground(new Color(81, 43, 55));
		lblOpiniones.setFont(new Font("Goudy Old Style", Font.PLAIN, 50));
		GridBagConstraints gbc_lblOpiniones = new GridBagConstraints();
		gbc_lblOpiniones.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpiniones.gridx = 1;
		gbc_lblOpiniones.gridy = 1;
		pnlOpiniones.add(lblOpiniones, gbc_lblOpiniones);

		JLabel lblUsuario_1 = new JLabel("");
		lblUsuario_1.setIcon(new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/iconoPersona.png")));
		GridBagConstraints gbc_lblUsuario_1 = new GridBagConstraints();
		gbc_lblUsuario_1.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_1.gridx = 1;
		gbc_lblUsuario_1.gridy = 2;
		pnlOpiniones.add(lblUsuario_1, gbc_lblUsuario_1);

		JLabel lblOpinion_1 = new JLabel(this.localidad.generarOpiniones());
		lblOpinion_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_lblOpinion_1 = new GridBagConstraints();
		gbc_lblOpinion_1.anchor = GridBagConstraints.WEST;
		gbc_lblOpinion_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpinion_1.gridx = 2;
		gbc_lblOpinion_1.gridy = 2;
		pnlOpiniones.add(lblOpinion_1, gbc_lblOpinion_1);

		JLabel lblUsuario_2 = new JLabel("");
		lblUsuario_2.setIcon(new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/iconoPersona.png")));
		GridBagConstraints gbc_lblUsuario_2 = new GridBagConstraints();
		gbc_lblUsuario_2.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_2.gridx = 1;
		gbc_lblUsuario_2.gridy = 4;
		pnlOpiniones.add(lblUsuario_2, gbc_lblUsuario_2);

		JLabel lblOpinion_2 = new JLabel(this.localidad.generarOpiniones());
		lblOpinion_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_lblOpinion_2 = new GridBagConstraints();
		gbc_lblOpinion_2.anchor = GridBagConstraints.WEST;
		gbc_lblOpinion_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpinion_2.gridx = 2;
		gbc_lblOpinion_2.gridy = 4;
		pnlOpiniones.add(lblOpinion_2, gbc_lblOpinion_2);

		JLabel lblUsuario_3 = new JLabel("");
		lblUsuario_3.setIcon(new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/iconoPersona.png")));
		GridBagConstraints gbc_lblUsuario_3 = new GridBagConstraints();
		gbc_lblUsuario_3.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_3.gridx = 1;
		gbc_lblUsuario_3.gridy = 6;
		pnlOpiniones.add(lblUsuario_3, gbc_lblUsuario_3);

		JLabel lblOpinion_3 = new JLabel(this.localidad.generarOpiniones());
		lblOpinion_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_lblOpinion_3 = new GridBagConstraints();
		gbc_lblOpinion_3.anchor = GridBagConstraints.WEST;
		gbc_lblOpinion_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblOpinion_3.gridx = 2;
		gbc_lblOpinion_3.gridy = 6;
		pnlOpiniones.add(lblOpinion_3, gbc_lblOpinion_3);

		JLabel lblUsuario_4 = new JLabel("");
		lblUsuario_4.setIcon(new ImageIcon(VentanaLocalidades.class.getResource("/Presentacion/iconoPersona.png")));
		GridBagConstraints gbc_lblUsuario_4 = new GridBagConstraints();
		gbc_lblUsuario_4.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblUsuario_4.gridx = 1;
		gbc_lblUsuario_4.gridy = 8;
		pnlOpiniones.add(lblUsuario_4, gbc_lblUsuario_4);

		JLabel lblOpinion_4 = new JLabel(this.localidad.generarOpiniones());
		lblOpinion_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_lblOpinion_4 = new GridBagConstraints();
		gbc_lblOpinion_4.anchor = GridBagConstraints.WEST;
		gbc_lblOpinion_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblOpinion_4.gridx = 2;
		gbc_lblOpinion_4.gridy = 8;
		pnlOpiniones.add(lblOpinion_4, gbc_lblOpinion_4);

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal principal = new VentanaPrincipal();
				principal.frame.setVisible(true);
				frame.dispose();
			}
		});

		lblBandera_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ImageIcon imagenSpain = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/spain.png"));
				ImageIcon imagenEnglish = new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/english.png"));

				if (spain) {
					lblBandera_2.setIcon(imagenSpain);
					lblBandera_2.repaint();
					MessagesVentanaLocalidades.setIdioma("inglés");
					VentanaLocalidades localidadES = new VentanaLocalidades(new Localidad(lblLocalidad.getText()), !spain, usuario);
					localidadES.frame.setVisible(true);
					frame.dispose();
					spain = false;
				
				} else {
					lblBandera_2.setIcon(imagenEnglish);
					lblBandera_2.repaint();
					MessagesVentanaLocalidades.setIdioma("es");
					VentanaLocalidades localidadIN = new VentanaLocalidades(new Localidad(lblLocalidad.getText()), !spain, usuario);
					localidadIN.frame.setVisible(true);
					frame.dispose();
					spain = true;

				}
			}
		});
	}

	private class BtnPersonalizarRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaPersonalizarRuta personalizar = new VentanaPersonalizarRuta();
			personalizar.frame.setVisible(true);
		}
	}

	private class BtnBorrarCambiosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			spinnerPersonas.setModel(new SpinnerNumberModel(0, 0, 40, 1));
			dateChooser.setDate(null);
			dateChooser_1.setDate(null);

		}
	}

	private class BtnGuardarCambiosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			VentanaPrincipal ppal = new VentanaPrincipal();
			ppal.frame.setVisible(true);
		}
	}
}
