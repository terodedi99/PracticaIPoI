package Dominio;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String correo_electronico;
	private String fecha_nacimiento;
	private String contrasena;
	private String ruta_imagen_bandera;
	
	public Usuario(String nombre) {
		if (nombre.equals("Teresa")) {
			this.nombre = "Teresa";
			this.apellidos = "Rodriguez de Dios";
			this.correo_electronico = "Teresa.Rodriguez4@alu.uclm.es";
			this.fecha_nacimiento = "07/04/1999";
			this.contrasena = "T1234";
		
		} else if (nombre.equals("Laura")) {
			this.nombre = "Laura";
			this.apellidos = "Munoz Javega";
			this.correo_electronico = "Laura.Munoz5@alu.uclm.es";
			this.fecha_nacimiento = "15/10/1999";
			this.contrasena = "L1234";
					
		} else if (nombre.equals("Guia")) {
			this.nombre = "Guia";
			this.apellidos = "Guia";
			this.correo_electronico = "guia_turistic0@rutasdelvino.com";
			this.fecha_nacimiento = "16/12/1992";
			this.contrasena = "1234";
		}		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String getRutaImagenBandera() {
		return ruta_imagen_bandera;
	}

	public void setRutaImagenBandera(String ruta_imagen_bandera) {
		this.ruta_imagen_bandera = ruta_imagen_bandera;
	}

}
