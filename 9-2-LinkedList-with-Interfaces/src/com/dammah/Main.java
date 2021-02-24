package com.dammah;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Storm bringer", "Deep Purple");
        album.addSong("Storm bringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.31);
        album.addSong("Let's go", 4.11);
        album.addSong("Snowballed", 6.32);

        albums.add(album);

        List<Song> playlist = new ArrayList<>();
        albums.get(0).addToPlaylist("Storm bringer", playlist);
        albums.get(0).addToPlaylist("Holy Man", playlist);
        albums.get(0).addToPlaylist("You can't do it right", playlist);
        albums.get(0).addToPlaylist("Dealer", playlist); // Does not exist
        albums.get(0).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(22, playlist);
        albums.get(1).addToPlaylist(1, playlist);

        play(playlist);
    }

    public static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> songListIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in the playlist.");
            return;
        } else {
            System.out.println("Now playing -> " + songListIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        forward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing -> " + songListIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing -> " + songListIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Now replaying -> " + songListIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist.");
                        }
                    } else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Now replaying -> " + songListIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        songListIterator.remove();
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing -> " + songListIterator.next().toString());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing -> " + songListIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - To quit");
        System.out.println("1 - To play next song");
        System.out.println("2 - To play previous song");
        System.out.println("3 - To replay current song");
        System.out.println("4 - To list songs in the playlist");
        System.out.println("5 - To print available actions");
        System.out.println("6 - To delete current song from playlist");
    }

    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("===============================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===============================");
    }
}
