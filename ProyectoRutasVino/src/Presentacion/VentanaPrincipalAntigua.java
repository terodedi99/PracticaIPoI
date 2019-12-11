package Presentacion;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JToolBar;
import java.awt.ComponentOrientation;
import javax.swing.JTextArea;

public class VentanaPrincipalAntigua {

	private JFrame frame;
	private final JLabel lblLupa = new JLabel("");
	private final JTextField txtBuscador = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipalAntigua window = new VentanaPrincipalAntigua();
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
	public VentanaPrincipalAntigua() {
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
		
		JPanel pnlIdioma = new JPanel();
		pnlIdioma.setBackground(new Color(231, 201, 167));
		frame.getContentPane().add(pnlIdioma);
		pnlIdioma.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(206, 207, 210));
		comboBox.setBounds(10, 27, 170, 24);
		pnlIdioma.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol", "Ingl\u00E9s"}));
		txtBuscador.setBounds(1100, 26, 170, 26);
		pnlIdioma.add(txtBuscador);
		txtBuscador.setColumns(10);
		lblLupa.setBounds(1040, 11, 50, 50);
		pnlIdioma.add(lblLupa);
		lblLupa.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblLupa.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblLupa.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLupa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLupa.setIcon(new ImageIcon(VentanaPrincipalAntigua.class.getResource("/Presentacion/lupa.png")));
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground(new Color(231, 201, 167));
		frame.getContentPane().add(pnlLogin);
		pnlLogin.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setIcon(new ImageIcon(VentanaPrincipalAntigua.class.getResource("/Presentacion/login.png")));
		pnlLogin.add(lblLogin);
		
		JButton btnLogin = new JButton("Registrarse/ Iniciar sesi\u00F3n");
		btnLogin.setOpaque(false);
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(new Color(206, 207, 210));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pnlLogin.add(btnLogin);
		
		JPanel pnlLocalidades = new JPanel();
		pnlLocalidades.setBackground(new Color(231, 201, 167));
		frame.getContentPane().add(pnlLocalidades);
		pnlLocalidades.setLayout(null);
		
		JToolBar tBLocalidades = new JToolBar();
		tBLocalidades.setFloatable(false);
		tBLocalidades.setRollover(true);
		tBLocalidades.setOpaque(false);
		tBLocalidades.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tBLocalidades.setToolTipText("");
		tBLocalidades.setBounds(387, 85, 632, 64);
		pnlLocalidades.add(tBLocalidades);
		
		JButton btnCiudadReal = new JButton("Ciudad Real");
		btnCiudadReal.setForeground(new Color(117, 55, 64));
		btnCiudadReal.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		tBLocalidades.add(btnCiudadReal);
		
		JButton btnValdepenas = new JButton("Valdepe\u00F1as");
		btnValdepenas.setForeground(new Color(117, 55, 64));
		btnValdepenas.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		tBLocalidades.add(btnValdepenas);
		
		JButton btnAlmagro = new JButton("Almagro");
		btnAlmagro.setForeground(new Color(117, 55, 64));
		btnAlmagro.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		tBLocalidades.add(btnAlmagro);
		
		JButton btnAlcazar = new JButton("Alc\u00E1zar de San Juan");
		btnAlcazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlcazar.setForeground(new Color(117, 55, 64));
		btnAlcazar.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		tBLocalidades.add(btnAlcazar);
		
		JButton btnCampo = new JButton("Campo de Criptana");
		btnCampo.setForeground(new Color(117, 55, 64));
		btnCampo.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		tBLocalidades.add(btnCampo);
		
		JLabel lblRutasdelVino = new JLabel("Rutas del Vino");
		lblRutasdelVino.setBounds(518, 11, 343, 75);
		pnlLocalidades.add(lblRutasdelVino);
		lblRutasdelVino.setForeground(new Color(117, 55, 64));
		lblRutasdelVino.setHorizontalAlignment(SwingConstants.CENTER);
		lblRutasdelVino.setFont(new Font("Segoe UI Historic", Font.PLAIN, 40));
		frame.pack();
		frame.setVisible(true);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
	}
}
