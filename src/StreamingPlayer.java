//Implement the StreamingPlayer interface in at least three different classes (e.g., AudioPlayer, VideoPlayer, and StreamingPlayer). 
//Each class should provide specific implementations of the interface methods.

public class StreamingPlayer implements MediaPlayer {

    @Override
    public char play(String title){
        System.out.println("Playing Stream: " + title);
        return 0;
    }

    @Override
    public void pause(){
        System.out.println("Pausing Stream.");
    }

    @Override
    public char stop(){
        System.out.println("Stopping Stream.");

        return 0;
    }
}
