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
import java.awt.Dialog.ModalExclusionType;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Point;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JTextArea;

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
		frame.getContentPane().setBackground(new Color(231, 201, 167));
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
		gbl_pnlLogin.columnWidths = new int[]{187, 795, 76, 135, 0};
		gbl_pnlLogin.rowHeights = new int[]{63, 0};
		gbl_pnlLogin.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLogin.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlLogin.setLayout(gbl_pnlLogin);
		
		JLabel lblBandera = new JLabel("");
		/* lblBandera.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				
				ImageIcon imagenSpain = new
				ImageIcon(VentanaPrincipal.class.getResource("/spain.png"));
				lblBandera.setIcon(imagenSpain);
				
				ImageIcon imagenEnglish = new
				ImageIcon(VentanaPrincipal.class.getResource("/english.png"));
				lblBandera.setIcon(imagenEnglish);
			}
		}); */
		
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
		
		JButton btnRegistrarse = new JButton("Registrarse/ Iniciar sesi\u00F3n");
		btnRegistrarse.setPreferredSize(new Dimension(190, 40));
		btnRegistrarse.setHorizontalTextPosition(SwingConstants.CENTER);
		GridBagConstraints gbc_btnRegistrarse = new GridBagConstraints();
		gbc_btnRegistrarse.anchor = GridBagConstraints.WEST;
		gbc_btnRegistrarse.gridx = 3;
		gbc_btnRegistrarse.gridy = 0;
		pnlLogin.add(btnRegistrarse, gbc_btnRegistrarse);
		btnRegistrarse.setFocusTraversalPolicyProvider(true);
		btnRegistrarse.setForeground(Color.BLACK);
		btnRegistrarse.setBackground(new Color(206, 219, 197));
		
		JPanel pnlIdioma = new JPanel();
		pnlIdioma.setBackground(new Color(237, 217, 194));
		pnlIdioma.setFocusTraversalPolicyProvider(true);
		pnlIdioma.setFocusCycleRoot(true);
		frame.getContentPane().add(pnlIdioma, BorderLayout.SOUTH);
		GridBagLayout gbl_pnlIdioma = new GridBagLayout();
		gbl_pnlIdioma.columnWidths = new int[]{145, 325, 650, 96, 0};
		gbl_pnlIdioma.rowHeights = new int[]{58, 0};
		gbl_pnlIdioma.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlIdioma.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlIdioma.setLayout(gbl_pnlIdioma);
		
		JComboBox cBIdiomas = new JComboBox();
		cBIdiomas.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol", "Ingl\u00E9s"}));
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(231, 201, 167));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setDoubleBuffered(true);
		scrollPane.setFocusTraversalPolicyProvider(true);
		scrollPane.setFocusCycleRoot(true);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel pnlLocalidades = new JPanel();
		pnlLocalidades.setBackground(new Color(231, 201, 167));
		scrollPane.setViewportView(pnlLocalidades);
		GridBagLayout gbl_pnlLocalidades = new GridBagLayout();
		gbl_pnlLocalidades.columnWidths = new int[]{202, 884, 223, 0};
		gbl_pnlLocalidades.rowHeights = new int[]{39, 0, 0};
		gbl_pnlLocalidades.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlLocalidades.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		pnlLocalidades.setLayout(gbl_pnlLocalidades);
		
		JToolBar toolBar = new JToolBar();
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.insets = new Insets(0, 0, 5, 5);
		gbc_toolBar.gridx = 1;
		gbc_toolBar.gridy = 0;
		pnlLocalidades.add(toolBar, gbc_toolBar);
		toolBar.setFocusCycleRoot(true);
		toolBar.setFocusTraversalPolicyProvider(true);
		toolBar.setMargin(new Insets(0, 5, 0, 5));
		toolBar.setBackground(new Color(231, 201, 167));
		toolBar.setRollover(true);
		
		JButton btnCiudadReal = new JButton("Ciudad Real");
		btnCiudadReal.setForeground(new Color(81, 43, 55));
		btnCiudadReal.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		toolBar.add(btnCiudadReal);
		
		JButton btnValdepenas = new JButton("Valdepe\u00F1as");
		btnValdepenas.setForeground(new Color(81, 43, 55));
		btnValdepenas.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		toolBar.add(btnValdepenas);
		
		JButton btnAlmagro = new JButton("Almagro");
		btnAlmagro.setForeground(new Color(81, 43, 55));
		btnAlmagro.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		btnAlmagro.setFocusTraversalPolicyProvider(true);
		btnAlmagro.setFocusCycleRoot(true);
		toolBar.add(btnAlmagro);
		
		JButton btnAlcazar = new JButton("Alc\u00E1zar de San Juan");
		btnAlcazar.setForeground(new Color(81, 43, 55));
		btnAlcazar.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		toolBar.add(btnAlcazar);
		
		JButton btnCampo = new JButton("Campo de Criptana");
		btnCampo.setForeground(new Color(81, 43, 55));
		btnCampo.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
		toolBar.add(btnCampo);
		
		JDesktopPane desktopPane = new JDesktopPane();
		GridBagConstraints gbc_desktopPane = new GridBagConstraints();
		gbc_desktopPane.insets = new Insets(0, 0, 0, 5);
		gbc_desktopPane.fill = GridBagConstraints.BOTH;
		gbc_desktopPane.gridx = 1;
		gbc_desktopPane.gridy = 1;
		pnlLocalidades.add(desktopPane, gbc_desktopPane);
		
		JPanel pnlTitulo = new JPanel();
		pnlTitulo.setBackground(new Color(237, 217, 194));
		pnlTitulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		scrollPane.setColumnHeaderView(pnlTitulo);
		GridBagLayout gbl_pnlTitulo = new GridBagLayout();
		gbl_pnlTitulo.columnWidths = new int[]{403, 459, 0};
		gbl_pnlTitulo.rowHeights = new int[]{60, 0};
		gbl_pnlTitulo.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlTitulo.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlTitulo.setLayout(gbl_pnlTitulo);
		
		JLabel lblRutasdelVino = new JLabel("Rutas del Vino");
		lblRutasdelVino.setMaximumSize(new Dimension(71, 21));
		lblRutasdelVino.setForeground(new Color(81, 43, 55));
		lblRutasdelVino.setFont(new Font("Goudy Old Style", Font.ITALIC, 40));
		GridBagConstraints gbc_lblRutasdelVino = new GridBagConstraints();
		gbc_lblRutasdelVino.gridx = 1;
		gbc_lblRutasdelVino.gridy = 0;
		pnlTitulo.add(lblRutasdelVino, gbc_lblRutasdelVino);
	}
}
