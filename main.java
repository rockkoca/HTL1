
import java.awt.*;
import javax.swing.*;
import Engine.GameWindow;
import HTLProceduralAPI.*;

/**
 * Class Main - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
@SuppressWarnings("serial")
public class Main extends GameWindow
{

      public Main()
  {
    setRunner(new Sample());
    
  }

  public static void main(String[] args)
  {
       
      (new Main()).startProgram();
  }
}
