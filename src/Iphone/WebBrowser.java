package Iphone;

public class WebBrowser {
    protected void showWebPage (String url) {
        System.out.println("Showing web page " + url);
    }

    protected void newTab () {
        System.out.println("Opened a new tab");
    }

    protected void refreshPage () {
        System.out.println("Refreshing...");
    }


}
