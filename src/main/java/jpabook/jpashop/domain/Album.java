package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Album extends Item {

    private String artist;
    private String etc;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public Album(String artist, String etc) {
        this.artist = artist;
        this.etc = etc;
    }
}
