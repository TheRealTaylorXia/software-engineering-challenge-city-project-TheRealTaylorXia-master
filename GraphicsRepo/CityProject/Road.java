import java.awt.*;

public class Road
{
    private int n = 4;
    private int[] xpos = {600,750,800,750};
    private int[] ypos = {600,450,450,700};

    public Road()
    {}

    public void draw(Graphics page)
    {
        page.setColor(new Color(63,76,81));
        page.fillRect(0,600,700,100);
        
        page.fillPolygon(xpos,ypos,n);
    }

}
