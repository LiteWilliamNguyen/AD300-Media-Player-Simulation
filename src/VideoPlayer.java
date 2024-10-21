//Implement the Video Player interface in at least three different classes (e.g., AudioPlayer, VideoPlayer, and StreamingPlayer). 
//Each class should provide specific implementations of the interface methods.

public class VideoPlayer implements MediaPlayer {

    @Override
    public void play(String title){
        System.out.println("Playing Video: " + title);
    }

    @Override
    public void pause(){
        System.out.println("Pausing Video.");
    }

    @Override
    public void stop(){
        System.out.println("Stopping Video.");

    }
}