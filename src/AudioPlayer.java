//Implement the MediaPlayer interface in at least three different classes (e.g., AudioPlayer, VideoPlayer, and StreamingPlayer). 
//Each class should provide specific implementations of the interface methods.

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String title){
        System.out.println("Playing audio: " + title);
    }

    @Override
    public void pause(){
        System.out.println("Pausing audio.");
    }

    @Override
    public void stop(){
        System.out.println("Stopping audio.");
    }
}