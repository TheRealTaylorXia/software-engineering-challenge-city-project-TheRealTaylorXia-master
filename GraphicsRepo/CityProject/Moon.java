import java.awt.*;

public class Moon
{
    private Color color;
    private int height;
    private int width;
    private int x;
    private int y;
    private Shape oval;

    public Moon(int xpos, int ypos)
    {
        color = Color.white;
        height = 50;
        width = 50;
        x = xpos;
        y = ypos;
    }

    public void draw(Graphics page)
    {
        page.setColor(color);
        //page.fillOval(700,50,height, width);
        page.fillOval(x,y,height, width);
    }
    
    public void move(int xmove, int ymove)
    {
        x += xmove;
        y += ymove;
    }
}
