package net.superbid.backenddeveloper.resources;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.superbid.backenddeveloper.domain.Post;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Post> listar() {
		
		Post p1 = new Post(null, 
						   "Post#001 - Primeiro Post", "Olá, este é o primeiro post da API.", 
						   timestamp, null); 
		Post p2 = new Post(null, 
						   "Post#002 - Segundo Post", "Então, aqui temos outro post!", 
						   timestamp, null);
		
		List<Post> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		
		return lista;
	}
}
