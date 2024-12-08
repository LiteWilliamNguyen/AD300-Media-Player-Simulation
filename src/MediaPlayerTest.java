import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

//Default constructor for test class MediaPlayer
class MediaPlayerTest {

    @Test
    void testAudioPlayerNormal() {
        MediaPlayer audioPlayer = new AudioPlayer();
        assertDoesNotThrow(() -> {
            audioPlayer.play("My Favorite Song");
            audioPlayer.pause();
            audioPlayer.stop();
        });
    }

    @Test
    void testVideoPlayerNormal() {
        MediaPlayer videoPlayer = new VideoPlayer();
        assertDoesNotThrow(() -> {
            videoPlayer.play("My Favorite Movie");
            videoPlayer.pause();
            videoPlayer.stop();
        });
    }

    @Test
    void testStreamingPlayerNormal() {
        MediaPlayer streamingPlayer = new StreamingPlayer();
        assertDoesNotThrow(() -> {
            streamingPlayer.play("Live News Stream");
            streamingPlayer.pause();
            streamingPlayer.stop();
        });
    }

    @Test
    void testAudioPlayerEdge() {
        MediaPlayer audioPlayer = new AudioPlayer();
        assertDoesNotThrow(() -> {
            audioPlayer.play("");
            audioPlayer.pause();
            audioPlayer.stop();
        });
    }

    @Test
    void testVideoPlayerEdge() {
        MediaPlayer videoPlayer = new VideoPlayer();
        assertDoesNotThrow(() -> {
            videoPlayer.play(null);
            videoPlayer.pause();
            videoPlayer.stop();
        });
    }

    @Test
    void testStreamingPlayerEdge() {
        MediaPlayer streamingPlayer = new StreamingPlayer();
        assertDoesNotThrow(() -> {
            streamingPlayer.play("   ");
            streamingPlayer.pause();
            streamingPlayer.stop();
        });
    }


}