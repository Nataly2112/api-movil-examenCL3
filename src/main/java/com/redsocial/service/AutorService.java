package com.redsocial.service;

import java.util.List;

import com.redsocial.Entity.Autor;

public interface AutorService {

	public List<Autor> listaAutor();
	public List<Autor> listaAutorPorNombre(String filtro);
}
