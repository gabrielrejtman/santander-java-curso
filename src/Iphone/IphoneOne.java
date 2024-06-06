package Iphone;

public class IphoneOne extends  Iphone{
    public IphoneOne () {
        super();
    }
    public static void main(String[] args) {
        IphoneOne myIphone = new IphoneOne();
        myIphone.getWebBrowser().showWebPage("youtube.com");
        myIphone.getPhone().call("40028922");
        myIphone.getMusicPlayer().selectSong("Darude Sandstorm");
    }
}
