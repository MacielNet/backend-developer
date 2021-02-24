package net.superbid.backenddeveloper.resources;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.superbid.backenddeveloper.domain.Post;
import net.superbid.backenddeveloper.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	
	@Autowired
	private PostService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Post obj = service.buscar(id);		
		return ResponseEntity.ok().body(obj);
	}
}
