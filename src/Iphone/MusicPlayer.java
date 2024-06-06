package Iphone;

public class MusicPlayer {
    protected void play () {
        System.out.println("Playing music");
    }

    protected void pause () {
        System.out.println("Paused the song");
    }

    protected void selectSong (String song) {
        System.out.println("Current song: ".concat(song));
    }
}
