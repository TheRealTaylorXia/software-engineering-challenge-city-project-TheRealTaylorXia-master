import java.applet.*;
import java.awt.*;

public class City extends Applet
{
   private Color sky = new Color(12,12,12);
   private Color tv2 = new Color(250,250,250);
   private Moon moon;
   private Building_close building1;
   private Building_2 building2; 
   private Building_3 building3;
   private Ground grass;
   private TVScreen screen;
   private Road road;
   private CouchDude furniture;
   
   public void init()
   {
       moon = new Moon(700,50);   
       building1 = new Building_close();
       building2 = new Building_2();
       building3 = new Building_3();
       grass = new Ground();
       screen = new TVScreen();
       road = new Road();
       furniture = new CouchDude();
       setBackground(sky);
   }
   
   public void paint(Graphics page)
   {
       moon.draw(page);
       grass.draw(page);
       road.draw(page);
       building1.draw(page);
       building2.draw(page);
       building3.draw(page);
       screen.draw(page,new Color(206,206,206));
       furniture.draw(page);
       
       
       try
       {
           Thread.sleep(1000);
       }
       catch (InterruptedException e){}
       
       screen.draw(page,new Color(97,223,198));
       furniture.draw(page);
       
       try
       {
           Thread.sleep(1000);
       }
       catch (InterruptedException e){}
       
       screen.draw(page,new Color(211,223,97));
       furniture.draw(page);
       
       try
       {
           Thread.sleep(1000);
       }
       catch (InterruptedException e){}
       
       screen.draw(page,new Color(249,120,120));
       furniture.draw(page);
       moon.move(1,1);
       
       repaint();
   }
}
