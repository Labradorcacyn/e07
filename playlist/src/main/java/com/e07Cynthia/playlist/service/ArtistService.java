package com.e07Cynthia.playlist.service;

import com.e07Cynthia.playlist.model.Artist;
import com.e07Cynthia.playlist.repository.ArtistRepository;
import com.e07Cynthia.playlist.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist, Long, ArtistRepository> {
}
