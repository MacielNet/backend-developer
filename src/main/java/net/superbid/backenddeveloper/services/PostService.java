package net.superbid.backenddeveloper.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.superbid.backenddeveloper.domain.Post;
import net.superbid.backenddeveloper.repositories.PostRepository;
import net.superbid.backenddeveloper.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post buscar(Integer id) {
		Optional<Post> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Post.class.getName()));
	}

}
