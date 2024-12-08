import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

//Default constructor for test class MediaPlayer
class MediaPlayerTest {

    private MediaPlayer audioPlayer;
    private MediaPlayer videoPlayer;
    private MediaPlayer streamingPlayer;


    //Sets up the test fixture.
    //Called before every test case method.
    @BeforeEach
    void setUp() {

        videoPlayer = new VideoPlayer();
        streamingPlayer = new StreamingPlayer();
    }
    //Tears down the test fixture.
    // Called after every test case method.

    @AfterEach
    void tearDown() {
    }

    // Normal test case
    @Test
    void testAudioPlayerFile(){
        audioPlayer.play("Keep Your Head Down by TVXQ");
        assertEquals("Playing audio: Keep Your Head Down by TVXQ",audioPlayer.play("Keep Your Head Down by TVXQ"));
    }
    @Test
    void testAudioPlayerStop(){
        audioPlayer.stop();
        assertEquals("Stopping audio", audioPlayer.stop());
    }
    @Test
    void testVideoPlayerFile(){
        videoPlayer.play("Game of Throne");
        assertEquals("Playing Video: Game of Throne", videoPlayer.play("Game of Throne"));
    }
    //Edge test case
    @Test
    void testAudioPlayerEmptyFile(){
        assertEquals("Playing audio:",audioPlayer.play(""));
    }



}