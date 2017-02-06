import java.net.URL;
import javax.sound.sampled.*;
public class Sound{
  private Clip clip;
  private boolean waitForEnd;
  public Sound(String file, boolean waitForEnd){
    this.waitForEnd = waitForEnd;
    try{
      URL url = (URL) this.getClass().getResource("media/"+file+".wav");
      AudioInputStream input = AudioSystem.getAudioInputStream(url);
      DataLine.Info info = new DataLine.Info(Clip.class, input.getFormat());
      clip = (Clip) AudioSystem.getLine(info);
      clip.open(input);

    }catch (Exception e) {
      System.out.println(e.toString());
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
