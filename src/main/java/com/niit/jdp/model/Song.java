/*
 * Author Name: Rohit
 * Date: 20-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp.model;

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


}
