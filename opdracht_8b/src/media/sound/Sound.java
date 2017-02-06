package media.sound;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.File;
public class Sound{
  private Clip clip;
  private boolean waitForEnd;
  public Sound(String file, boolean waitForEnd){
    this.waitForEnd = waitForEnd;

    try{
      URL url = (URL) this.getClass().getResource("../../resources/"+file+".wav");
      // how to get resources outside of the classpath root?

      try{
        AudioInputStream input = AudioSystem.getAudioInputStream(url);//file of url
        DataLine.Info info = new DataLine.Info(Clip.class, input.getFormat());
        clip = (Clip) AudioSystem.getLine(info);
        clip.open(input);

      }catch (Exception e) {

        System.out.println(e.toString());
      }

    }catch(Exception e){
      System.out.println("resource not found");
    }



  }
  public void play(){

    try{
      clip.setFramePosition(0);
      clip.start();
      if(waitForEnd){
        int ms = ((int) clip.getMicrosecondLength())/1000;
        Thread.sleep(ms);
      }
    }catch (Exception e) {
      System.out.println(e.toString());
    }

  }
}
