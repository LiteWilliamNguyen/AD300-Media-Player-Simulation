//Main.java
//Create a main class to demonstrate using instances of each player type.
public class Main {
    public static void main(String[] args){
        //creating instance of each player
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer videoPlayer = new VideoPlayer();
        MediaPlayer streamingPlayer = new StreamingPlayer();

        //demonstrate using instances of each player type.
        audioPlayer.play("Monster by BigBang");
        audioPlayer.pause();
        audioPlayer.stop();

        videoPlayer.play("Dune");
        videoPlayer.pause();
        videoPlayer.stop();

        streamingPlayer.play("Youtube");
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}