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
  public String[] printStatus(){

    String[] output = new String[5];

    String name = this.getClass().getSimpleName();
    //output += "The "+name+" has "+bites+" bites left. \n";
    if(hasWorm){
      System.out.println("Has a worm.... juck!");
    }
    if(daysOld > 1){
      //output += "It's "+daysOld+ " days old. \n";
    }else{
      //output += "It's "+daysOld+ " day old. \n";
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

    output[0] = name;
    output[1] = bites + "";
    output[2] = daysOld + "";
    output[3] = partly;
    output[4] = tint;

    return output;
  }

  public String getType() {
    //System.out.println(this.getClass().getSimpleName());
    return this.getClass().getSimpleName();
  }

  public String takeBite()
  {

    String output = "";

    if(bites > 0){
      bites--;
      whole = false;
      int i = (int)Math.floor(Math.random()*3);
      output += "crunch!!!, smack, smack.. \n";
      crunchSounds[i].play();
      if(daysOld > 21 || !whole){
        float chance = (float)daysOld/100;
        //System.out.println("chance of rot"+chance);
        if(Math.random() < chance || rotten){
            output += "bleegh the apple is rotten.. \n";
            coughSound.play();

            rotten = true;
        }
      }
      if(hasWorm){
        if(Math.random() > 0.5f)
        {
          output += "You just ate a worm! good protein :) \n";
          hasWorm = false;
          coughSound.play();
        }
      }
    }else{
      output += "You cant'eat this! \n";
    }

    return output;
  }
}
