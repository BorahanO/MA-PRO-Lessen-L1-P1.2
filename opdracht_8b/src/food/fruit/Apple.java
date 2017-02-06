package food.fruit;
import java.lang.Math;
public class Apple extends Fruit {
  public Apple(){
      setColor(0.3f+((float)Math.random()*0.7f), 0.3f+((float)Math.random()*0.7f),0 );
  }
}
