interface Playable {
    void play();
    void stop();
}

class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3Player is playing music.");
    }

    @Override
    public void stop() {
        System.out.println("MP3Player stopped playing music.");
    }
}

class Radio implements Playable {
    @Override
    public void play() {
        System.out.println("Radio is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Radio stopped.");
    }
}

public class TASK_5_Music_player
{
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        Radio radio = new Radio();

        System.out.println("MP3Player:");
        mp3Player.play();
        mp3Player.stop();

        System.out.println("\nRadio:");
        radio.play();
        radio.stop();
    }
}
