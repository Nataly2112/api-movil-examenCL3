package com.redsocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.Entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

	@Query("Select x from Autor x where x.nombres like :var_fil")
	public List<Autor> listaPorNombre(@Param("var_fil") String filtro);
}
