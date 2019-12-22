package Dominio;

import javax.swing.ImageIcon;

public class Localidad {
	private String nombre;
	private String descripcion;
	private String ruta_imagen;
	private String ruta_imagen_localidad;
	private String[] opiniones;
	private String precio_persona;
	private String precio_grupo1;
	private String precio_grupo2;
	private int[] opiniones_usuarios;
	private int i;

	public Localidad(String name) {
		if (name.equals("Ciudad Real")) {
			this.nombre = "Ciudad Real";
			this.descripcion = "\r\n"
					+ "Ciudad Real se encuentra en el centro de España, al sur de Madrid. La Puerta de Toledo es una de las puertas originales de la ciudad, de estilo mudéjar. \r\n"
					+ "El Museo del Quijote está consagrado a la novela clásica de Miguel de Cervantes. \r\n" + "\r\n"
					+ "La iglesia gótica de San Pedro se caracteriza por sus decoraciones moriscas, mientras que la catedral de Santa María del Prado, del siglo XIII, tiene una gran nave y un retablo barroco muy ornamentado.";
			this.ruta_imagen_localidad = "/Presentacion/ayunta1.png";
			this.precio_persona = "Precio por persona = 35€";
			this.precio_grupo1 = "Precio para grupos entre 10 - 20 personas = 30€ por persona";
			this.precio_grupo2 = "Precio para grupos entre 20 - 40 personas = 25€ por persona";
					
		} else if (name.equals("Valdepeñas")) {
			this.nombre = "Valdepeñas";
			this.descripcion = "Valdepeñas es una de las ciudades más importante de la provincia de Ciudad Real, está situada al sudeste y cerca de Sierra Morena. A su término municipal se anexionó en 1949 la pedanía llamada Consolación.\r\n"
					+ " En suma cuenta con más de 30.000 habitantes. \r\n"
					+ "Haciendo honor a su rica historia, el municipio cuenta con varios focos de interés para sus visitantes dominados por la gran belleza y valor patrimonial de sus edificios religiosos, de los que destacaremos algunos; sin olvidar su conjunto urbano con la Plaza de España como núcleo de la vida y el comercio de la ciudad.";
			this.ruta_imagen_localidad = "/Presentacion/ayunta1.png";
			this.precio_persona = "Precio por persona = 25€";
			this.precio_grupo1 = "Precio para grupos entre 10 - 20 personas = 20€ por persona"; 
			this.precio_grupo2 = "Precio para grupos entre 20 - 40 personas = 18€ por persona";
					
		} else if (name.equals("Almagro")) {
			this.nombre = "Almagro";
			this.descripcion = "Almagro, en el Campo de Calatrava, en el centro mismo de la provincia, cuenta con una posición estratégica en su entorno físico y cultural. La ciudad del teatro de corral, alberga el único Corral de Comedias que se ha mantenido intacto y en activo desde principios del siglo XVII hasta nuestros días, y que es, en buena parte, el emblema de la ciudad.\r\n" + 
					"Mantiene todas sus partes: zaguán, alojería, patio, cazuela, galerías y tablado, así como una intensa actividad que hace crecer la ciudad, especialmente durante el Festival Internacional de Teatro Clásico.";
			this.ruta_imagen_localidad = "/Presentacion/ayunta1.png";
			this.precio_persona = "Precio por persona = 30€";
			this.precio_grupo1 = "Precio para grupos entre 10 - 20 personas = 25€ por persona";
			this.precio_grupo2 = "Precio para grupos entre 20 - 40 personas = 20€ por persona";
					
			
		} else if (name.equals("Alcázar de San Juan")) {
			this.nombre = "Alcázar de San Juan";
			this.descripcion = "Este municipio rivaliza con Alcalá de Henares por ser el lugar de nacimiento del célebre autor del Quijote, desde que en 1748 fue encontrada en la iglesia de Santa María la Mayor la partida de bautismo de \"Miguel de Cervantes Saavedra\". Esto hace que la ciudad esté impregnada de la presencia cervantina.  \r\n" + 
					" \r\n" + 
					"La visita a Alcázar de San Juan está llena de lugares de interés turístico y patrimonial como las calles del casco antiguo que nos llevarán a la Plaza de Santa María, presidida por una estatua de Miguel de Cervantes.Se conservan también viejas construcciones y casonas de piedra rosada como la Posada de Santo Domingo o el Palacio del Gran Prior, construido entre 1235 y 1237.";
			this.ruta_imagen_localidad = "/Presentacion/ayunta1.png";
			this.precio_persona = "Precio por persona = 25€";
			this.precio_grupo1 = "Precio para grupos entre 10 - 20 personas = 20€ por persona";
			this.precio_grupo2 = "Precio para grupos entre 20 - 40 personas = 18€ por persona";
					
			
		
		} else if (name.equals("Campo de Criptana")) {
			this.nombre = "Campo de Criptana";
			this.descripcion = "Campo de Criptana es un municipio español perteneciente a la provincia de Ciudad Real, en la comunidad autónoma de Castilla-La Mancha. Está situado en la comarca natural de La Mancha,1​ dentro de la subcomarca denominada Mancha Alta. Forma parte de la mancomunidad de Promancha.\r\n" + 
					" \r\n" + 
					"En la localidad se conserva una amplia muestra de los típicos molinos contra los que luchó Don Quijote en el capítulo VIII del libro universal de Cervantes, convertidos así en seña de identidad de La Mancha. De un total de diez molinos, tres datan del siglo XVI: Molino Burleta, Molino Infanto y Molino Sardinero.​\r\n" + 
					" \r\n" + 
					"Es el lugar de nacimiento de la actriz y cantante Sara Montiel (1928-2013).";
			this.ruta_imagen_localidad = "/Presentacion/ayunta1.png";
			this.precio_persona = "Precio por persona = 30€";
			this.precio_grupo1 = "Precio para grupos entre 10 - 20 personas = 25€ por persona";
			this.precio_grupo2 = "Precio para grupos entre 20 - 40 personas = 20€ por persona";
					
		}

		opiniones = new String[10];
		opiniones[0] = "María: \r\n" + 
				"Excelente trato y una experiencia genia!! (****)";
		opiniones[1] = "Juan: \r\n" + 
				"Volvería a repetir sin duda. (****)";
		opiniones[2] = "Pedro: \r\n" + 
				"Una visita muy interesante y un trato estupendo.(****)";
		opiniones[3] = "Sofía: \r\n" + 
				"Teresa y Laura nos organizaron una ruta maravillosa, volveremos a repetir!!! (****)";
		opiniones[4] = "Alejandro: \r\n" + 
				"De las mejores rutas que he hecho sin duda!! (***)";
		opiniones[5] = "Arturo: \r\n" + 
				"Excelentes vinos!!! (*****)";
		opiniones[6] = "Cristina: \r\n" + 
				"Una visita muy interesante, me ha gustado. (**)";
		opiniones[7] = "Lucía: \r\n" + 
				"Volveré a repetir sin duda, excelente trato. (*****)";
		opiniones[8] = "César: \r\n" + 
				"Hicimos dos rutas, y ambas genial. Repetiremos. (***)";
		opiniones[9] = "Noelia: \r\n" + 
				"Una experiencia genia!! (****F)";

		opiniones_usuarios = new int[4];
		opiniones_usuarios[0] = -1;
		opiniones_usuarios[1] = -1;
		opiniones_usuarios[2] = -1;
		opiniones_usuarios[3] = -1;
		i = 0;

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRutaImagen() {
		return ruta_imagen;
	}

	public void setRutaImagen(String ruta_imagen) {
		this.ruta_imagen = ruta_imagen;
	}
	
	public String getRutaImagenLocalidad() {
		return ruta_imagen_localidad;
	}

	public void setRutaImagenLocalidad(String ruta_imagen) {
		this.ruta_imagen_localidad = ruta_imagen_localidad;
	}

	public String[] getOpiniones() {
		return opiniones;
	}

	public void setOpiniones(String[] opiniones) {
		this.opiniones = opiniones;
	}

	public String getPrecioPersona() {
		return precio_persona;
	}

	public String getPrecioGrupo1() {
		return precio_grupo1;
	}
	
	public String getPrecioGrupo2() {
		return precio_grupo2;
	}

	public String generarOpiniones() {
		int aleatorio = (int) Math.floor(Math.random()*10);
		boolean posible = false;
		String devolder = "none";
		
		while(!posible) {
			if(comprobarResenya(aleatorio)){
				devolder = opiniones[aleatorio];
				opiniones_usuarios[i] = aleatorio;
				posible = true;
			}else{
				aleatorio = (int) Math.floor(Math.random()*10);
			}
		}
		
		
		i++;
		return devolder;
		
	}

	private boolean comprobarResenya(int aleatorio) {
		// TODO Auto-generated method stub
		for(int i = 0; i<opiniones_usuarios.length; i++) {
			if(aleatorio == opiniones_usuarios[i])
				return false;
		}
		
		return true;
	}

}
