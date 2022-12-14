/*
 * Author Name: Rohit
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp.model;

import java.util.Objects;

public class Song {

    private String songName;
    private int songId;
    private String artistName;
    private String genre;
    private String albumName;
    private long songDuration;

    public Song() {
    }

    public Song(String songName, int songId, String artistName, String genre, String albumName, long songDuration) {
        this.songName = songName;
        this.songId = songId;
        this.artistName = artistName;
        this.genre = genre;
        this.albumName = albumName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public long getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(long songDuration) {
        this.songDuration = songDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songId == song.songId && songDuration == song.songDuration && songName.equals(song.songName) && artistName.equals(song.artistName) && genre.equals(song.genre) && albumName.equals(song.albumName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songName, songId, artistName, genre, albumName, songDuration);
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", songId=" + songId +
                ", artistName='" + artistName + '\'' +
                ", genre='" + genre + '\'' +
                ", albumName='" + albumName + '\'' +
                ", songDuration=" + songDuration +
                '}';
    }
}
