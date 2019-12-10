package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaRegistro {

	private JFrame frame;
	private JPanel pnlRegistro;
	private JLabel lblTitulo;
	private JLabel lblSubtitulo;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel lblFecha;
	private JTextField txtNacimiento;
	private JLabel lblCalendario;
	private JLabel lblContrasea;
	private JPasswordField passwordField;
	private JLabel lblRepetirContrasea;
	private JPasswordField passwordField1;
	private JLabel lblInfo;
	private JLabel lblInfo1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro window = new VentanaRegistro();
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
	public VentanaRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 485, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			pnlRegistro = new JPanel();
			pnlRegistro.setBackground(new Color(244, 229, 226));
			pnlRegistro.setBounds(0, 0, 469, 514);
			frame.getContentPane().add(pnlRegistro);
			pnlRegistro.setLayout(null);
			{
				lblTitulo = new JLabel("\u00BFA\u00FAn no tienes cuenta?");
				lblTitulo.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
				lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
				lblTitulo.setBounds(127, 11, 217, 44);
				pnlRegistro.add(lblTitulo);
			}
			{
				lblSubtitulo = new JLabel("\u00A1Reg\u00EDstrate!");
				lblSubtitulo.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
				lblSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);
				lblSubtitulo.setBounds(168, 54, 108, 25);
				pnlRegistro.add(lblSubtitulo);
			}
			{
				lblNombre = new JLabel("Nombre:");
				lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblNombre.setBounds(37, 103, 60, 25);
				pnlRegistro.add(lblNombre);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBackground(new Color(255, 255, 255));
				txtNombre.addMouseListener(new TxtNombreMouseListener());
				txtNombre.setFocusTraversalPolicyProvider(true);
				txtNombre.setBounds(37, 124, 202, 25);
				pnlRegistro.add(txtNombre);
				txtNombre.setColumns(10);
			}
			{
				lblApellidos = new JLabel("Apellidos:");
				lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblApellidos.setBounds(37, 160, 60, 25);
				pnlRegistro.add(lblApellidos);
			}
			{
				txtApellidos = new JTextField();
				txtApellidos.setBounds(37, 184, 202, 25);
				pnlRegistro.add(txtApellidos);
				txtApellidos.setColumns(10);
			}
			{
				lblEmail = new JLabel("Correo electr\u00F3nico:");
				lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblEmail.setBounds(37, 229, 146, 14);
				pnlRegistro.add(lblEmail);
			}
			{
				txtEmail = new JTextField();
				txtEmail.setBounds(37, 244, 228, 25);
				pnlRegistro.add(txtEmail);
				txtEmail.setColumns(10);
			}
			{
				lblFecha = new JLabel("Fecha de nacimiento:");
				lblFecha.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblFecha.setBounds(37, 280, 125, 20);
				pnlRegistro.add(lblFecha);
			}
			{
				txtNacimiento = new JTextField();
				txtNacimiento.setBounds(37, 300, 125, 25);
				pnlRegistro.add(txtNacimiento);
				txtNacimiento.setColumns(10);
			}
			{
				lblCalendario = new JLabel("");
				lblCalendario.setHorizontalAlignment(SwingConstants.CENTER);
				lblCalendario.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Presentacion/icons8-calendario-30.png")));
				lblCalendario.setBounds(163, 294, 38, 36);
				pnlRegistro.add(lblCalendario);
			}
			{
				lblContrasea = new JLabel("Contrase\u00F1a:");
				lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblContrasea.setBounds(37, 331, 73, 20);
				pnlRegistro.add(lblContrasea);
			}
			{
				passwordField = new JPasswordField();
				passwordField.setBounds(37, 354, 202, 25);
				pnlRegistro.add(passwordField);
			}
			{
				lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a:");
				lblRepetirContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblRepetirContrasea.setBounds(37, 391, 125, 14);
				pnlRegistro.add(lblRepetirContrasea);
			}
			{
				passwordField1 = new JPasswordField();
				passwordField1.setBounds(37, 409, 202, 25);
				pnlRegistro.add(passwordField1);
			}
			{
				lblInfo = new JLabel("");
				lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
				lblInfo.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Presentacion/icons8-informaci\u00F3n-24.png")));
				lblInfo.setBounds(241, 354, 24, 20);
				pnlRegistro.add(lblInfo);
			}
			{
				lblInfo1 = new JLabel("");
				lblInfo1.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/Presentacion/icons8-informaci\u00F3n-24.png")));
				lblInfo1.setHorizontalAlignment(SwingConstants.CENTER);
				lblInfo1.setBounds(241, 414, 24, 20);
				pnlRegistro.add(lblInfo1);
			}
		}
	}
	private class TxtNombreMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			txtNombre.setBackground(new Color(180, 186, 191));
			
		}
	}
}
