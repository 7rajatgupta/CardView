package com.rajatpunkstaa.cardview;

/**
 * Created by Rajat Gupta on 18/05/16.
 */
public class Album {
    private String name;
    private Boolean isFavorite;
    private int numOfSongs;
    private int thumbnail;

    public Album() {
    }

    public Album(String name, int numOfSongs, int thumbnail) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
    public boolean isFavorite(){
      return isFavorite;
    }

    public void setFavorite(boolean favorite){
      isFavorite = favorite
    }
}
