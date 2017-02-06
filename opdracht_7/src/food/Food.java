package food;

import java.lang.Math;
import javax.swing.Timer;
import java.awt.event.*;
import media.sound.Sound;
public class Food {
  private int bites;
  private int daysOld;
  private boolean rotten;
  private boolean whole;
  private boolean hasWorm;
  private Sound coughSound;
  private Sound[] crunchSounds;
  private String tint;
  public Food(){
    whole = true;
    rotten = false;
    bites = 6 + (int)Math.round(Math.random()*6);
    daysOld = 0;
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
  protected void setColor(float r,float g,float b){

    tint = "";
    if(r > 0.5f){
      tint += "red";
    }
    if(g > 0.5f){
      tint += "green";
    }
    if(b > 0.5f){
      tint += "blue";
    }
    if(tint.length() == 0)
    {
      tint = "dark";
    }
  }
  protected void setColor(String tint){
    this.tint = tint;

  }
  public void printStatus(){
    String name = this.getClass().getSimpleName();
    System.out.println("The "+name+" has "+bites+" bites left.");
    if(hasWorm){
      System.out.println("Has a worm.... juck!");
    }
    if(daysOld > 1){
      System.out.println("It's "+daysOld+ " days old." );
    }else{
      System.out.println("It's "+daysOld+ " day old." );
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
    System.out.println("It's a "+partly+" "+tint+" "+name+"."  );
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
