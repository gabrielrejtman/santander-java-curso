package Iphone;

public class Phone {
    protected void call (String number) {
        System.out.println("Calling ".concat(number));
    }

    protected void answer () {
        System.out.println("You've answered the call");
    }

    protected void voicemail () {
        System.out.println("You are listening to your voicemail");
    }
}
