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

public class VentanaUsuario {

	public JFrame frame;
	private JTextField tFBuscar;
	private Localidad localidad;
	private JCalendar calendar_entrada;
	private JCalendar calendar_salida;
	private JTextFieldDateEditor textFieldDateEditor;
	JLabel lblBandera_2 = new JLabel("");
	private boolean spain;
	private Usuario usuario;

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

	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(237, 217, 194));
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que la aplicaci�n finalice al pulsar "x"
		frame.setBounds(0, 0, 516, 394); // Establece posici�n y tama�o de la ventana
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height); // Cambia el tama�o de la ventana
		frame.getContentPane().setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground(new Color(237, 217, 194));
		frame.getContentPane().add(pnlLogin, BorderLayout.NORTH);
		GridBagLayout gbl_pnlLogin = new GridBagLayout();
		gbl_pnlLogin.columnWidths = new int[] { 110, 15, 379, 524, 190, 0 };
		gbl_pnlLogin.rowHeights = new int[] { 13, 76, 0, 0 };
		gbl_pnlLogin.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlLogin.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlLogin.setLayout(gbl_pnlLogin);

		JLabel lblUsuario = new JLabel("");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 1;
		pnlLogin.add(lblUsuario, gbc_lblUsuario);
		lblUsuario.setIcon(new ImageIcon(VentanaUsuario.class.getResource("/Presentacion/icons8-usuario-60.png")));

		JLabel lblMensajeBienvenida = new JLabel("\u00A1Bienvenid@, " + usuario.getNombre() + "!");
		lblMensajeBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblMensajeBienvenida = new GridBagConstraints();
		gbc_lblMensajeBienvenida.anchor = GridBagConstraints.WEST;
		gbc_lblMensajeBienvenida.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensajeBienvenida.gridx = 2;
		gbc_lblMensajeBienvenida.gridy = 1;
		pnlLogin.add(lblMensajeBienvenida, gbc_lblMensajeBienvenida);
		
		lblBandera_2.setIcon(new ImageIcon(VentanaUsuario.class.getResource(this.usuario.getRutaImagenBandera())));
		lblBandera_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridBagConstraints gbc_lblBandera_2 = new GridBagConstraints();
		gbc_lblBandera_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblBandera_2.gridx = 4;
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
		tBOpciones.setToolTipText("");
		frame.getContentPane().add(tBOpciones, BorderLayout.CENTER);
		tBOpciones.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		tBOpciones.setForeground(new Color(81, 43, 55));

		JPanel pnlHistorial = new JPanel();
		pnlHistorial.setBackground(new Color(244, 229, 226));
		pnlHistorial.setName("");
		tBOpciones.addTab("Historial de circuitos", null, pnlHistorial, null);
		GridBagLayout gbl_pnlHistorial = new GridBagLayout();
		gbl_pnlHistorial.columnWidths = new int[] { 104, 423, 550, 48, 0 };
		gbl_pnlHistorial.rowHeights = new int[] { 57, 89, 56, 275, 146, 0, 0 };
		gbl_pnlHistorial.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlHistorial.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		pnlHistorial.setLayout(gbl_pnlHistorial);

		JPanel pnlRutasTematicas = new JPanel();
		pnlRutasTematicas.setBackground(new Color(244, 229, 226));
		tBOpciones.addTab("Rutas tem�ticas", null, pnlRutasTematicas, null);
		pnlRutasTematicas.setLayout(null);
		
		JPanel pnlGruposTuristas = new JPanel();
		pnlGruposTuristas.setBackground(new Color(244, 229, 226));
		tBOpciones.addTab("Grupos de turistas", null, pnlGruposTuristas, null);
		GridBagLayout gbl_pnlGruposTuristas = new GridBagLayout();
		gbl_pnlGruposTuristas.columnWidths = new int[] { 61, 139, 77, 492, 0 };
		gbl_pnlGruposTuristas.rowHeights = new int[] { 46, 0, 0, 37, 0, 84, 72, 0, 78, 0 };
		gbl_pnlGruposTuristas.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlGruposTuristas.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlGruposTuristas.setLayout(gbl_pnlGruposTuristas);

		JPanel pnlGuias = new JPanel();
		pnlGuias.setFocusTraversalPolicyProvider(true);
		pnlGuias.setFocusCycleRoot(true);
		pnlGuias.setBackground(new Color(244, 229, 226));
		pnlGuias.setToolTipText("");
		tBOpciones.addTab("Gu�as", null, pnlGuias, null);
		GridBagLayout gbl_pnlGuias = new GridBagLayout();
		gbl_pnlGuias.columnWidths = new int[] { 43, 283, 496, 266, 0 };
		gbl_pnlGuias.rowHeights = new int[] { 39, 80, 75, 23, 75, 23, 75, 23, 75, 0 };
		gbl_pnlGuias.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlGuias.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlGuias.setLayout(gbl_pnlGuias);

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
}