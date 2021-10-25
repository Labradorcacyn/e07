package com.e07Cynthia.playlist;

import com.e07Cynthia.playlist.model.Artist;
import com.e07Cynthia.playlist.model.Playlist;
import com.e07Cynthia.playlist.model.Song;
import com.e07Cynthia.playlist.service.ArtistService;
import com.e07Cynthia.playlist.service.PlaylistService;
import com.e07Cynthia.playlist.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {
    private final SongService songService;
    private final PlaylistService playlistService;
    private final ArtistService artistService;

    @PostConstruct
    public void test(){

        artistService.save(Artist.builder().name("John Lennon").build());

        songService.save(Song.builder()
                .title("Imagine")
                .artist(artistService.findById(1L).orElse(null))
                .album("Imagine")
                .year("1971")
                .build());
    }

}
