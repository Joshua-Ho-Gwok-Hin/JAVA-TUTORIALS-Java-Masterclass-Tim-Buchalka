package _46_Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        System.out.println("Testing");

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean pointingForward = true;

        ListIterator<Song> songIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("There is no song in this playlist");
        } else {
            System.out.println("Now playing " + songIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int userSelect = scanner.nextInt();
            scanner.nextLine();

            switch (userSelect) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!pointingForward) {
                        if (songIterator.hasNext()) {
                            songIterator.next();
                        }
                        pointingForward = true;
                    }
                    if (songIterator.hasNext()) {
                        System.out.println("Now playing " + songIterator.next().toString());
                    } else {
                        System.out.println("You have reached the end of the playlist");
                    }
                    break;
                case 2:
                    if (pointingForward) {
                        if (songIterator.hasPrevious()) {
                            songIterator.previous();
                        }
                        pointingForward = false;
                    }
                    if (songIterator.hasPrevious()) {
                        System.out.println("Now playing " + songIterator.previous());
                    }else
                        System.out.println("You have reached the beginning of the playlist");
                    break;
                case 3:
                    if (pointingForward) {
                        songIterator.previous();
                        System.out.println("Now replaying " + songIterator.next().toString());
                    } else {
                        songIterator.next();
                        System.out.println("Now replaying " + songIterator.previous().toString());
                    }
                    break;
                case 4:
                    System.out.println("Songs in the playlist:");
                    for (Song eachSong : playlist)
                        System.out.println(eachSong.toString());
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (0 < playlist.size()) {
                        songIterator.remove();
                        if (songIterator.hasNext()) {
                            System.out.println("Now playing " + songIterator.next().toString());
                        }else if (songIterator.hasPrevious()) {
                            System.out.println("Now playing " + songIterator.previous().toString());
                        }
                    }else
                        System.out.println("Playlist is empty.");
                    break;
            }
        }
    }
}
