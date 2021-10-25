package com.e07Cynthia.playlist.service;

import com.e07Cynthia.playlist.model.Playlist;
import com.e07Cynthia.playlist.repository.PlaylistRepository;
import com.e07Cynthia.playlist.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist, Long, PlaylistRepository> {
}
