package _46_Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String titleOfSong) {
        for (Song searchSong : songs) {
            if (searchSong.getTitle().equals(titleOfSong)) {
                return searchSong;
            }
        }
        return null;
    }

    public boolean addSong(String titleOfSong, double songDuration) {
        if (findSong(titleOfSong) == null) {
            songs.add(new Song(titleOfSong, songDuration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int indexOfTrackNumber = trackNumber -1;
        if (0 <= indexOfTrackNumber && indexOfTrackNumber < songs.size()) {
            playList.add(songs.get(indexOfTrackNumber));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {
        Song searchSong = findSong(titleOfSong);
        if (searchSong != null) {
            playList.add(searchSong);
            return true;
        }
        return false;
    }
}
