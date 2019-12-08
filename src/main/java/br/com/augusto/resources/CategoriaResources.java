package br.com.augusto.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.augusto.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {
	
	@GetMapping
	public List<Categoria> listar() {
		
		Categoria infor = new Categoria(1, "Informática");
		Categoria escrit = new Categoria(2, "Escritório"); 
		
		List<Categoria> categorias = new ArrayList<>();
		categorias.add(escrit);
		categorias.add(infor);
		
		
		return categorias;
	}
	
}
