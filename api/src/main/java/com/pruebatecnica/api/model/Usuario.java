package com.pruebatecnica.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;

@Entity
@Table(name="usuario")
@ToString
@EqualsAndHashCode
public class Usuario {

	@Id
	@Getter @Setter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne(targetEntity = Rol.class)
	@Getter @Setter @JoinColumn(name = "id_rol")
	private Rol rol;
	@Getter @Setter @Column(name="nombre")
	private String nombre;
	@Getter @Setter @Column(name="activo")
	private char activo;

	
}
