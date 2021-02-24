package net.superbid.backenddeveloper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.superbid.backenddeveloper.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	
}
