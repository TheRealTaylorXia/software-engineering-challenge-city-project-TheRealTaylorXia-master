import java.awt.*;

public class Building_3
{
    private int n = 4;
    private int[] xpos = {475,475,525,525};
    private int[] ypos = {0,550,475,0};
    
    public Building_3()
    {}

    public void draw(Graphics page)
    {
        page.setColor(new Color(50,50,50));
        page.fill3DRect(225,0,250,550,true);
        
        page.setColor(new Color(70,70,70));
        page.fillPolygon(xpos,ypos,n);
        
        page.setColor(new Color(12,12,12));
        page.fillRect(250,300,50,75);
        page.fillRect(325,300,50,75);
        page.fillRect(400,300,50,75);
        
        page.fillRect(250,200,50,75);
        page.fillRect(400,200,50,75);
        
        page.fillRect(325,100,50,75);
        page.fillRect(400,100,50,75);
        
        page.fillRect(250,0,50,75);
        page.fillRect(400,0,50,75);
        
        page.setColor(new Color(205,220,105));
        page.fillRect(325,200,50,75);
        page.fillRect(250,100,50,75);
        page.fillRect(325,0,50,75);
    }

}
