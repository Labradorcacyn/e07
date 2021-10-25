package com.e07Cynthia.playlist.repository;

import com.e07Cynthia.playlist.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long>{
}
