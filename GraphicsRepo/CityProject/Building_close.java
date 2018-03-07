import java.awt.*;

public class Building_close
{
    private Color color;
    private int height;
    private int width;
    private int[] xpos = {900,1370,1370,900};
    private int[] ypos = {100,150,600,500};
    private int n = 4;
    
    public Building_close()
    {
        color = new Color(70,70,70);
        height = 1000;
        width = 1000;
    }
    
    public void draw(Graphics page)
    {
        page.setColor(color);
        page.fill3DRect(850, 0, height, width, true);
        
        page.setColor(new Color(43,40,31));
        page.fillPolygon(xpos,ypos,n);
    }
}
