package com.e07Cynthia.playlist.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
@EntityListeners(AuditingEntityListener.class)
public class AddedTo implements Serializable {

    @Builder.Default
    @EmbeddedId
    private AddedToPk id = new AddedToPk();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name = "song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    @CreatedDate
    private LocalDateTime datetime;

    @Column(name = "orden")
    private String order;

    //Métodos Helpers

    public void addToSong(Song s){
        song = s;
        s.getAddedTo().add(this);
    }

    public void removeFromSong(Song s){
        s.getAddedTo().remove(this);
        song = null;
    }

    public void addToPlaylist(Playlist p){
        playlist = p;
        p.getAddedTo().add(this);
    }

    public void removeFromPlaylist(Playlist p){
        p.getAddedTo().remove(this);
        playlist = null;
    }
}
