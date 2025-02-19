package com.distribuida.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;

@Controller
@RequestMapping("/libros")
public class LibroController {

	
	
	@Autowired
	private LibroDAO libroDAO;
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	private AutorDAO autorDAO;

	
	
	@GetMapping("/findAll")
	public String findAll(ModelMap modelMap) {
		
		List<Libro> Libros = libroDAO.findAll();
		modelMap.addAttribute("Libros", Libros);
		
		return "libros-listar";
	}
	
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idLibro")@Nullable Integer idLibro
			,@RequestParam("opcion") @Nullable Integer opcion
			, ModelMap modelMap
			) {
		
		if(idLibro != null) {
			Libro libro = libroDAO.findOne(idLibro);
			modelMap.addAttribute("libro", libro);
		}
		
		modelMap.addAttribute("autores", autorDAO.findAll());
		modelMap.addAttribute("categorias", categoriaDAO.findAll());
		
		if(opcion == 1) return "libros-add";
		else return "libros-del";
	}
//	/**
//	 * @param idLibro
//	 * @param titulo
//	 * @param editorial
//	 * @param num_paginas
//	 * @param edicion
//	 * @param idioma
//	 * @param fecha_publicacion
//	 * @param descripcion
//	 * @param tipo_pasta
//	 * @param iSBN
//	 * @param num_ejemplares
//	 * @param portada
//	 * @param presentacion
//	 * @param precio
//	 * @param id_categoria
//	 * @param id_autor
//	 * @param factura
//	 * @param libro
//	 */
	@PostMapping("/add")
	public String add(@RequestParam("idLibro")@Nullable Integer idLibro
			,@RequestParam("titulo")@Nullable String titulo
			,@RequestParam("editorial")@Nullable String editorial
			,@RequestParam("num_paginas")@Nullable Integer num_paginas
			,@RequestParam("edicion")@Nullable String edicion
			,@RequestParam("idioma")@Nullable String idioma
			,@RequestParam("fechaPublicacion")@Nullable Date fechaPublicacion
			,@RequestParam("descripcion")@Nullable String descripcion
			,@RequestParam("tipo_pasta")@Nullable String tipo_pasta
			,@RequestParam("iSBN")@Nullable String iSBN
			,@RequestParam("num_ejemplares")@Nullable Integer num_ejemplares
			,@RequestParam("portada")@Nullable String portada
			,@RequestParam("presentacion")@Nullable String presentacion
			,@RequestParam("precio")@Nullable Double precio
			,@RequestParam("idCategoria")@Nullable Integer idCategoria
			,@RequestParam("idAutor")@Nullable Integer idAutor
			, ModelMap modelMap	
			){
				
		if(idLibro == null) {
			Libro libro = new Libro(0,titulo, editorial, num_paginas, edicion, idioma, fechaPublicacion, descripcion, tipo_pasta, iSBN, num_ejemplares, portada, presentacion, precio, categoriaDAO.findOne(idCategoria)
					,autorDAO.findOne(idAutor));
			libroDAO.add(libro);
		}else {
			Libro libro2 = new Libro(idLibro,titulo, editorial, num_paginas, edicion, idioma, fechaPublicacion, descripcion, tipo_pasta, iSBN, num_ejemplares, portada, presentacion, precio, categoriaDAO.findOne(idCategoria)
					,autorDAO.findOne(idAutor));

			libroDAO.up(libro2);
		
			}
		return "redirect:/libros/findAll";

	}
	
	
	
	@GetMapping("/del")
	public String del(@RequestParam("idLibro")@Nullable Integer idLibro) {
		libroDAO.delete(idLibro);
		return "redirect:/libros/findAll";
 
	}
	
}
