import java.awt.*;

public class Ground
{
    private int n = 4;
    private int[] xpos = {225,125,375,475};
    private int[] ypos = {550,850,850,550};
    
    public Ground()
    {}

    public void draw(Graphics page)
    {
        page.setColor(new Color(6,74,13));
        page.fillRect(0,450,1000,5000);
        
        page.setColor(new Color(1,53,7));
        page.fillPolygon(xpos,ypos,n);
    }
}
