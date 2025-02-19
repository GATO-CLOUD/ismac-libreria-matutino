package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

@Controller
@RequestMapping("/autores") // URL base para este controlador
public class AutorController {

    @Autowired
    private AutorDAO autorDAO;

    // Mapeo para ver todos los autores
    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<Autor> autores = autorDAO.findAll();
        model.addAttribute("autores", autores);  // Añadir lista de autores al modelo
        return "autores-listar";  // Vista que se debe renderizar
    }

    // Mapeo para ver un autor específico o realizar una acción (añadir/eliminar)
    @GetMapping("/findOne")
    public String findOne(@RequestParam("idAutor") @Nullable Integer idAutor,
                          @RequestParam("opcion") @Nullable Integer opcion,
                          Model model) {
        if (idAutor != null) {
            Autor autor = autorDAO.findOne(idAutor); 
            model.addAttribute("autor", autor);  // Añadir el autor encontrado al modelo
        }

        // Si la opción es 1, se debe redirigir a la vista para agregar, de lo contrario eliminar
        if (opcion == 1) return "autores-add";
        else return "autores-del";
    }

    // Mapeo para agregar o actualizar un autor
    @PostMapping("/add")
    public String add(@RequestParam("idAutor") @Nullable Integer idAutor,
                      @RequestParam("nombre") @Nullable String nombre,
                      @RequestParam("apellido") @Nullable String apellido,
                      @RequestParam("pais") @Nullable String pais,
                      @RequestParam("direccion") @Nullable String direccion,
                      @RequestParam("telefono") @Nullable String telefono,
                      @RequestParam("correo") @Nullable String correo,
                      Model model) {

        // Si idAutor es nulo, es un nuevo autor, si no se actualiza el autor
        if (idAutor == null) {
            Autor autor = new Autor(0, nombre, apellido, pais, direccion, telefono, correo);
            autorDAO.add(autor); 
        } else {
            Autor autor = new Autor(idAutor, nombre, apellido, pais, direccion, telefono, correo);
            autorDAO.up(autor);  // Actualización
        }

        return "redirect:/autores/findAll";  // Redirigir a la lista de autores
    }

    // Mapeo para eliminar un autor
    @GetMapping("/del")
    public String del(@RequestParam("idAutor") @Nullable Integer idAutor) {
        autorDAO.del(idAutor);  // Eliminar el autor
        return "redirect:/autores/findAll";  // Redirigir a la lista de autores
    }
}
