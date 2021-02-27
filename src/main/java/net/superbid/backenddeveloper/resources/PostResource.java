package net.superbid.backenddeveloper.resources;

import java.net.URI;
import java.sql.Timestamp;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.superbid.backenddeveloper.domain.Post;
import net.superbid.backenddeveloper.dto.PostDTO;
import net.superbid.backenddeveloper.dto.PostDTOupd;
import net.superbid.backenddeveloper.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	
	@Autowired
	private PostService service;
	
	@ApiOperation(value="Busca Post por ID")
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Post> find(@PathVariable Integer id) {
		Post obj = service.find(id);		
		return ResponseEntity.ok().body(obj);
	}
	
	@ApiOperation(value="Cria novo Post")
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody PostDTO objeto){
		Post obj = service.fromDTO(objeto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@ApiOperation(value="Atualiza Post por ID")
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody PostDTOupd objeto, @PathVariable Integer id) {
		objeto.setId(id);
		Post obj = service.fromDTOupd(objeto);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation(value="Deleta Post por ID")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Objeto não encontrado") })
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation(value="Retorna todos os Posts")
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Post>> findAll() {
		List<Post> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
