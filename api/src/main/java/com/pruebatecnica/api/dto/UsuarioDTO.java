package com.pruebatecnica.api.dto;

import lombok.Getter;
import lombok.Setter;

public class UsuarioDTO {
	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private Integer id_rol;
	@Getter @Setter
	private String nombre;
	@Getter @Setter
	private char activo;

	
	
}
