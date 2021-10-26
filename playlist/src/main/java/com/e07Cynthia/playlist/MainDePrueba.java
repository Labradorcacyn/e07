package com.e07Cynthia.playlist;

import com.e07Cynthia.playlist.model.AddedTo;
import com.e07Cynthia.playlist.model.Artist;
import com.e07Cynthia.playlist.model.Playlist;
import com.e07Cynthia.playlist.model.Song;
import com.e07Cynthia.playlist.service.AddedToService;
import com.e07Cynthia.playlist.service.ArtistService;
import com.e07Cynthia.playlist.service.PlaylistService;
import com.e07Cynthia.playlist.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class MainDePrueba {
    private final SongService songService;
    private final PlaylistService playlistService;
    private final ArtistService artistService;
    private final AddedToService addToService;

    @PostConstruct
    public void test(){

        Artist artist = Artist.builder().name("John Lennon").songs(new ArrayList<>()).build();
        artistService.save(artist);

        Song song = Song.builder()
                .title("Imagine")
                .album("Imagine")
                .year("1971")
                .build();

        //Agregamos el artista en canción y la canción en artista

        song.addArtist(artist);
        songService.save(song);

        /* Borrar Canción de artista y artista de canción
        song.removeArtist(artist);
        songService.save(song);*/

        Playlist playlist = Playlist.builder()
                .name("Folk Rock")
                .description("El folk rock, en un sentido amplio, es un género musical que combina elementos de la música folk, el blues y el rock.")
                .build();
        playlistService.save(playlist);

        song = addToService.addToPlaylist(song, playlist);
        songService.save(song);
    }
}
