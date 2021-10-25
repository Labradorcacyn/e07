package com.e07Cynthia.playlist.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
    private String album;
    private String year;

    @Builder.Default
    @OneToMany(mappedBy = "song")
    private List<AddedTo> addedTo = new ArrayList<>();

    //Métodos helpers Artist

    public void addArtist(Artist a){
        this.artist = a;
        a.getSongs().add(this);
    }

    public void removeArtist(Artist a){
        a.getSongs().remove(this);
        this.artist = null;
    }

}
