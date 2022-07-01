package _48_InnerClassPlaylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private Song findSong(String title) {
            for (Song songSearch : songs) {
                if (songSearch.getTitle().equals(title)) {
                    return songSearch;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int songsIndexing = trackNumber -1;
            for (int i = 0; i < songs.size(); i++) {
                if (i == songsIndexing) {
                    return songs.get(i);
                }
            }
            return null;
        }

        private boolean add(Song addThisSongToSongList) {
            if (songs.contains(addThisSongToSongList)) {
                return false;
            }
            songs.add(addThisSongToSongList);
            return true;
        }
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (songs.findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song toAdd = songs.findSong(trackNumber);
        if (toAdd != null) {
            playList.add(toAdd);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}