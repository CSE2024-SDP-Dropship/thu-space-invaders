package engine;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;
import java.net.URL;


public class Sound {

    public static void playSound(String sound){
        try {
            AudioInputStream stream_itemEffect = AudioSystem.getAudioInputStream(new File(sound).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(stream_itemEffect);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();}
    }
}
