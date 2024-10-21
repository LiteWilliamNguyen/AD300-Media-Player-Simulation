//Implement the StreamingPlayer interface in at least three different classes (e.g., AudioPlayer, VideoPlayer, and StreamingPlayer). 
//Each class should provide specific implementations of the interface methods.

public class StreamingPlayer implements MediaPlayer {

    @Override
    public void play(String title){
        System.out.println("Playing Stream: " + title);
    }

    @Override
    public void pause(){
        System.out.println("Pausing Stream.");
    }

    @Override
    public void stop(){
        System.out.println("Stopping Stream.");

    }
}
