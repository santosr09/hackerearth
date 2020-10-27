package com.citi.hackathon.dao;

import java.util.List;

import com.citi.hackathon.entity.Categoria;

public interface CategoriaDAO {
	
	public void addCategoria(Categoria c);
	public void updateCategoria(Categoria c);
	public List<Categoria> listCategoria();
	public Categoria getCategoria(long id);
	public void removeCategoria(long id);
	
}
