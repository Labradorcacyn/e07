package com.e07Cynthia.playlist.repository;

import com.e07Cynthia.playlist.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository <Playlist, Long>{
}
