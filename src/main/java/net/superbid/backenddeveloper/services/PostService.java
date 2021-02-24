package net.superbid.backenddeveloper.services;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.superbid.backenddeveloper.domain.Post;
import net.superbid.backenddeveloper.dto.PostDTO;
import net.superbid.backenddeveloper.repositories.PostRepository;
import net.superbid.backenddeveloper.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post find(Integer id) {
		Optional<Post> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Post.class.getName()));
	}
	
	public Post insert(Post obj) {
		obj.setId(null);
		obj.setCreated_at(new Timestamp(System.currentTimeMillis()));
		return repo.save(obj);
	}
	
	public Post update(Post newObj) {
		Post oldObj = find(newObj.getId());
		oldObj.setTitulo((newObj.getTitulo() == null) ? oldObj.getTitulo() : newObj.getTitulo());
		oldObj.setDescricao((newObj.getDescricao() == null) ? oldObj.getDescricao() : newObj.getDescricao());
		//oldObj.setCreated_at(oldObj.getCreated_at());
		oldObj.setUpdated_at(new Timestamp(System.currentTimeMillis()));
		return repo.save(oldObj);
	}
	
	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}
	
	public List<Post> findAll() {
		return repo.findAll();
	}
	
	public Post fromDTO(PostDTO objDto) {
		return new Post(objDto.getId(),objDto.getTitulo(),objDto.getDescricao(),objDto.getCreated_at(),objDto.getUpdated_at());
	}
}
