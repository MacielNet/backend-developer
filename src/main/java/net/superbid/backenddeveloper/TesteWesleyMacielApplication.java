package net.superbid.backenddeveloper;

import java.sql.Timestamp;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.superbid.backenddeveloper.domain.Post;
import net.superbid.backenddeveloper.repositories.PostRepository;

@SpringBootApplication
public class TesteWesleyMacielApplication implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteWesleyMacielApplication.class, args);
	}

	// Instance data in POST Table Database H2 //
	@Override
	public void run(String... args) throws Exception {
		Post p1 = new Post(null, "Post#001 - Primeiro Post", "Olá, este é o primeiro post da API.", 
						   new Timestamp(System.currentTimeMillis()),null); 
		Post p2 = new Post(null, "Post#002 - Segundo Post", "Então, aqui temos outro post!", 
						   new Timestamp(System.currentTimeMillis()),null);
		postRepository.saveAll(Arrays.asList(p1,p2));
		
	}
}
