package com.e07Cynthia.playlist.service;

import com.e07Cynthia.playlist.model.AddedTo;
import com.e07Cynthia.playlist.model.AddedToPk;
import com.e07Cynthia.playlist.model.Playlist;
import com.e07Cynthia.playlist.model.Song;
import com.e07Cynthia.playlist.repository.AddedToRepository;
import com.e07Cynthia.playlist.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPk, AddedToRepository> {

    public Song addToPlaylist(Song s, Playlist p){
        AddedTo addedTo = AddedTo.builder()
                .song(s)
                .playlist(p)
                .build();
        save(addedTo);
        return s;
    }

}
