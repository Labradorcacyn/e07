package com.e07Cynthia.playlist.service;

import com.e07Cynthia.playlist.model.Song;
import com.e07Cynthia.playlist.repository.SongRepository;
import com.e07Cynthia.playlist.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
