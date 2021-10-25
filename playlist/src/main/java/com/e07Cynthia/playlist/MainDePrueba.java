package com.e07Cynthia.playlist;

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

@Component
@RequiredArgsConstructor
public class MainDePrueba {
    private final SongService songService;
    private final PlaylistService playlistService;
    private final ArtistService artistService;
    private final AddedToService addToService;

    @PostConstruct
    public void test(){

        Artist artist = Artist.builder().name("John Lennon").build();
        artistService.save(artist);

        Song song = Song.builder()
                .title("Imagine")
                .album("Imagine")
                .year("1971")
                .build();
        songService.save(song);

        song.addArtist(artist);

        artistService.findById(1L).orElse(null).getSongs().add(songService.findById(2L).orElse(null));

        Playlist playlist = Playlist.builder()
                .name("Folk Rock")
                .description("El folk rock, en un sentido amplio, es un género musical que combina elementos de la música folk, el blues y el rock.")
                .build();
        playlistService.save(playlist);

        song = addToService.addToPlaylist(song, playlist);
    }
}
