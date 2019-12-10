package Presentacion;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaLogin {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblEstado;
	private JLabel lblLogo;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField txtUsuario;
	private JButton btnEntrar;
	private final String password = "Lautere";
	private final String usuario = "User";
	private JPasswordField passwordField;
	private JLabel lblhasOlvidadoTu;
	private JLabel lblHelp;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
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
	public VentanaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(new Color(244, 229, 226));
			panel.setBorder(new TitledBorder(null, "Inicio sesi\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(0, 0, 434, 261);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			{
				lblEstado = new JLabel("Mensajes de aviso");
				lblEstado.setOpaque(true);
				lblEstado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				lblEstado.setForeground(SystemColor.desktop);
				lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
				lblEstado.setBackground(new Color(206, 207, 210));
				lblEstado.setBounds(10, 213, 414, 37);
				panel.add(lblEstado);
			}
			{
				lblLogo = new JLabel(" ");
				lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
				lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Presentacion/icons8-usuario-masculino-64.png")));
				lblLogo.setBounds(0, 32, 135, 110);
				panel.add(lblLogo);
			}
			{
				lblUsuario = new JLabel("Usuario:");
				lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblUsuario.setBounds(155, 34, 74, 14);
				panel.add(lblUsuario);
			}
			{
				lblPassword = new JLabel("Password:");
				lblPassword.setEnabled(false);
				lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblPassword.setBounds(155, 68, 74, 14);
				panel.add(lblPassword);
			}
			{
				txtUsuario = new JTextField();
				txtUsuario.addMouseListener(new TxtUsuarioMouseListener());
				txtUsuario.addActionListener(new TxtUsuarioActionListener());
				txtUsuario.setBounds(239, 32, 145, 20);
				panel.add(txtUsuario);
				txtUsuario.setColumns(10);
			}
			{
				btnEntrar = new JButton("Entrar");
				btnEntrar.addActionListener(new BtnEntrarActionListener());
				btnEntrar.setEnabled(false);
				btnEntrar.setBounds(200, 105, 108, 37);
				panel.add(btnEntrar);
			}
			{
				passwordField = new JPasswordField();
				passwordField.addActionListener(new PasswordFieldActionListener());
				passwordField.setEnabled(false);
				passwordField.setBounds(239, 66, 145, 20);
				panel.add(passwordField);
			}
			{
				lblhasOlvidadoTu = new JLabel("\u00BFHas olvidado tu password?");
				lblhasOlvidadoTu.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblhasOlvidadoTu.setBounds(174, 153, 161, 25);
				panel.add(lblhasOlvidadoTu);
			}
			{
				lblHelp = new JLabel("");
				lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
				lblHelp.setIcon(new ImageIcon(VentanaLogin.class.getResource("/Presentacion/icons8-ayuda-16.png")));
				lblHelp.setBounds(332, 153, 25, 20);
				panel.add(lblHelp);
			}
		}
	}
	private class TxtUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			//Para que se active el campo de password tiene que introducirse el usuario por defecto
			if(String.valueOf(txtUsuario.getText()).equals(usuario)) {
				lblPassword.setEnabled(true);
				passwordField.setEnabled(true);
				passwordField.requestFocus();
			}
		}
	}
	private class PasswordFieldActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblEstado.setText("Evento de Acción: ActionPerformed" + e.getActionCommand());
			// obtenemos la contraseña introducida
			if (String.valueOf(passwordField.getPassword()).equals(password)) {
				lblEstado.setBackground(Color.GREEN);
				lblEstado.setText("Contraseña correcta. Puede entrar");
				lblEstado.setVisible(true);
				btnEntrar.setEnabled(true);
				lblPassword.setEnabled(false);
				passwordField.setEnabled(false);
			} else {
				lblEstado.setBackground(Color.RED);
				lblEstado.setText("Contraseña incorrecta. Vuelva a intentarlo");
				lblEstado.setVisible(true);
				btnEntrar.setEnabled(false);
			}
		}
	}
	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	private class TxtUsuarioMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent arg0) {
			
		}
	}
}
