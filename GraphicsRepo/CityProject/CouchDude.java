import java.awt.*;

public class CouchDude
{
    private int n = 3;
    private int[] xpos = {900,1370,1370};
    private int[] ypos = {500,500,600};
    
    private int[] xpos2 = {1110,1400,1400};
    private int[] ypos2 = {525,525,600};
    
    public CouchDude()
    {}

    public void draw(Graphics page)
    {
        page.setColor(new Color(124,159,52));
        page.fillPolygon(xpos,ypos,n);
        
        page.setColor(new Color(86,111,36));
        page.fillPolygon(xpos2,ypos2,n);
        
        page.setColor(new Color(161,109,41));
        page.fillOval(1250,310,75,75);
        
        page.setColor(new Color(80,0,0));
        page.fillRoundRect(1100,375,300,150,25,25);
    }

}
