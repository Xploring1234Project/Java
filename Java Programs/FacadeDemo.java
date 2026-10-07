// 1. Subsystem Component: TV
class Television {
    public void on() { System.out.println("TV is ON"); }
    public void setInput() { System.out.println("TV input set to HDMI 1"); }
}

// 2. Subsystem Component: Soundbar
class Soundbar {
    public void on() { System.out.println("Soundbar is ON"); }
    public void setVolume(int level) { System.out.println("Volume set to " + level); }
}

// 3. Subsystem Component: Streaming Player
class StreamingPlayer {
    public void play(String movie) { System.out.println("Now playing: " + movie); }
}

// 4. The Facade Class
// This simplifies the interaction for the user.
class HomeTheaterFacade {
    private Television tv;
    private Soundbar sound;
    private StreamingPlayer player;

    public HomeTheaterFacade(Television tv, Soundbar sound, StreamingPlayer player) {
        this.tv = tv;
        this.sound = sound;
        this.player = player;
    }

    // This is the "One-Button" method
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        tv.on();
        tv.setInput();
        sound.on();
        sound.setVolume(20);
        player.play(movie);
    }
}

// 5. Main Class
public class FacadeDemo {
    public static void main(String[] args) {
        // Create the complex subsystem components
        Television myTv = new Television();
        Soundbar mySound = new Soundbar();
        StreamingPlayer myPlayer = new StreamingPlayer();

        // Create the Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(myTv, mySound, myPlayer);

        // Use the simplified interface!
        homeTheater.watchMovie("Inception");
    }
}