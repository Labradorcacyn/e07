package com.e07Cynthia.playlist.repository;

import com.e07Cynthia.playlist.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository <Song, Long>{
}
