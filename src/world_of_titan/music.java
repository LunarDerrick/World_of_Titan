
package world_of_titan;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class music {
    
    void playMusic(String location){
        
        try{
          File musicPath = new File(location);
          
          if(musicPath.exists()){
             AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath); 
             Clip clip = AudioSystem.getClip();
             clip.open(audioInput);
             clip.start();
             clip.loop(Clip.LOOP_CONTINUOUSLY);
          }else{
              System.out.println("Can't find file");
          }
        }catch(Exception e){
        e.printStackTrace();
    }
    }
    
}
