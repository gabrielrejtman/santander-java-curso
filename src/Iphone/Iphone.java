package Iphone;

public abstract class Iphone {
    protected MusicPlayer musicPlayer;
    protected Phone phone;
    protected WebBrowser webBrowser;

    public Iphone() {
        this.musicPlayer = new MusicPlayer();
        this.phone = new Phone();
        this.webBrowser = new WebBrowser();
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public WebBrowser getWebBrowser() {
        return webBrowser;
    }

    public Phone getPhone() {
        return phone;

    }
}
