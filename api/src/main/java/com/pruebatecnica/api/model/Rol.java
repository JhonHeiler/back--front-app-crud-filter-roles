package com.pruebatecnica.api.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rol {

	@Id
	@Getter @Setter @Column(name="id_rol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Getter @Setter @Column(name="nombre")
	private String nombre;



}
