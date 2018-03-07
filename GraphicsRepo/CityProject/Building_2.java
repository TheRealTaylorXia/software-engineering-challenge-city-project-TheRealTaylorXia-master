import java.awt.*;

public class Building_2
{
    private int[] xpos1 = {150,200,200,150};
    private int[] ypos1 = {200,150,1000,1000};
    private int n = 4;
    
    private int[] xpos2 = {150,200,0,0};
    private int[] ypos2 = {200,150,150,200};
    
    
    public Building_2()
    {}
    
    public void draw(Graphics page)
    {
        page.setColor(new Color(50,50,50));
        page.fill3DRect(0,200,150,500,true);
        
        page.setColor(new Color(70,70,70));
        page.fillPolygon(xpos1,ypos1,n);
        
        page.setColor(new Color(90,90,90));
        page.fillPolygon(xpos2,ypos2,n);
        
        page.setColor(new Color(12,12,12));
        page.fillRect(40,300,50,70);
        page.fillRect(40,500,50,70);
        page.fillRect(40,600,50,70);
        
        page.setColor(new Color(205,220,105));
        page.fillRect(40,400,50,70);
    }
}
