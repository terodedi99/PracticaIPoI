package Presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Formulario extends JPanel {
	private JLabel lblContacto;
	private JTextPane txtTexto;
	private JLabel lblNombre;
	private JLabel lblEmail;
	private JLabel lblAsunto;
	private JLabel lblComentarios;
	private JTextField textNombre;
	private JTextField textEmail;
	private JTextField textAsunto;
	private JTextField textComentarios;
	private JButton btnEnviar;
	private Color colorBlanco = new Color (255,255,255);
	private Color colorResaltado = new Color (206, 207, 210);

	/**
	 * Create the panel.
	 */
	public Formulario() {
		setBackground(new Color(237, 217, 194));
		setLayout(null);
		{
			lblContacto = new JLabel("Contacto");
			lblContacto.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
			lblContacto.setBounds(20, 26, 171, 43);
			add(lblContacto);
		}
		{
			txtTexto = new JTextPane();
			txtTexto.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
			txtTexto.setBackground(new Color(237, 217, 194));
			txtTexto.setText("Puedes rellenar y enviarnos este formulario para solicitar informaci\u00F3n acerca de nuestras rutas o para realizar una reserva.");
			txtTexto.setBounds(20, 66, 406, 34);
			add(txtTexto);
		}
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
			lblNombre.setBounds(57, 120, 48, 34);
			add(lblNombre);
		}
		{
			lblEmail = new JLabel("Email:");
			lblEmail.setBounds(57, 162, 48, 14);
			lblEmail.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
			add(lblEmail);
		}
		{
			lblAsunto = new JLabel("Asunto:");
			lblAsunto.setBounds(57, 195, 48, 14);
			lblAsunto.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
			add(lblAsunto);
		}
		{
			lblComentarios = new JLabel("Comentarios:");
			lblComentarios.setBounds(57, 229, 70, 14);
			lblComentarios.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
			add(lblComentarios);
		}
		{
			textNombre = new JTextField();
			textNombre.setBounds(137, 128, 171, 20);
			textNombre.addFocusListener(new MifocusListener());
			add(textNombre);
			textNombre.setColumns(10);
		}
		{
			textEmail = new JTextField();
			textEmail.setBounds(137, 160, 171, 20);
			textEmail.addFocusListener(new MifocusListener());
			add(textEmail);
			textEmail.setColumns(10);
		}
		{
			textAsunto = new JTextField();
			textAsunto.setBounds(137, 193, 173, 20);
			textAsunto.addFocusListener(new MifocusListener());
			add(textAsunto);
			textAsunto.setColumns(10);
		}
		{
			textComentarios = new JTextField();
			textComentarios.setBounds(137, 227, 171, 139);
			textComentarios.addFocusListener(new MifocusListener());
			add(textComentarios);
			textComentarios.setColumns(10);
		}
		{
			btnEnviar = new JButton("Enviar");
			btnEnviar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
			btnEnviar.setBounds(181, 377, 89, 23);
			add(btnEnviar);
		}

	}
	
	private class MifocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(colorResaltado);
		}

		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(colorBlanco);
		}
	}
}
