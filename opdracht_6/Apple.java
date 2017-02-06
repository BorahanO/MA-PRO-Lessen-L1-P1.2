import java.awt.Color;
import java.lang.Math;
import javax.swing.Timer;
import java.awt.event.*;
public class Apple {
  int bites;
  int daysOld;
  boolean rotten;
  boolean whole;
  boolean hasWorm;
  Color color;
  Sound coughSound;
  Sound[] crunchSounds;
  public Apple(){
    whole = true;
    rotten = false;
    bites = 6 + (int)Math.round(Math.random()*6);
    daysOld = 0;
    int r = (int)Math.floor(Math.random()*256);
    int g = (int)Math.floor(Math.random()*256);
    color = new Color(r,g,0,1);
    int delay = 5000;
    ActionListener al = new ActionListener(){
      public void actionPerformed(ActionEvent event){
        daysOld++;
      }
    };
    Timer timer = new Timer(delay,al);
    timer.start();
    crunchSounds = new Sound[3];
    crunchSounds[0] = new Sound("crunch1",false);
    crunchSounds[1] = new Sound("crunch2",false);
    crunchSounds[2] = new Sound("crunch3",false);
    coughSound = new Sound("cough",true);
  }
  public void printAppleStatus(){
    System.out.println("The apple has "+bites+" bites left.");
    if(hasWorm){
      System.out.println("Has a worm.... juck!");
    }
    if(daysOld > 1){
      System.out.println("It's "+daysOld+ " days old." );
    }else{
      System.out.println("It's "+daysOld+ " day old." );
    }
    int redness = color.getRed() - color.getGreen();
    String tint;
    if(redness > 100){
      tint = "red";
    }else if(redness < -100){
      tint = "redgreen";
    }else{
      tint = "green";
    }

    String partly = "";
    if(rotten){
      tint = "rotten";
    }
    if(bites == 0){
      partly = "fully eaten";
    }else if(!whole){
      partly = "partly eaten";
    }
    System.out.println("It's a "+partly+" "+tint+" apple. " );
  }
  public void takeBite()
  {
    if(bites > 0){
      bites--;
      whole = false;
      int i = (int)Math.floor(Math.random()*3);
      System.out.println("crunch!!!, smack, smack..");
      crunchSounds[i].play();
      if(daysOld > 21 || !whole){
        float chance = (float)daysOld/100;
        //System.out.println("chance of rot"+chance);
        if(Math.random() < chance || rotten){
            System.out.println("bleegh the apple is rotten..");
            coughSound.play();

            rotten = true;
        }
      }
      if(hasWorm){
        if(Math.random() > 0.5f)
        {
          System.out.println("You just ate a worm! good protein:)");
          hasWorm = false;
          coughSound.play();
        }
      }
    }else{
      System.out.println("You cant'eat this!");
    }
  }
}
