package com.pruebatecnica.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.pruebatecnica.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query(value = "SELECT * FROM usuario  WHERE nombre LIKE ?1%",nativeQuery = true)

	public List<Usuario> findSysUserByUserName(String nombre);

	public List<Usuario> findByNombre(String nombre);

	public List<Usuario> findAllByOrderByIdAsc();
}
