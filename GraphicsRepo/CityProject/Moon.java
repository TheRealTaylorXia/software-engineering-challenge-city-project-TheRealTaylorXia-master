import java.awt.*;

public class Moon
{
    private Color color;
    private int height;
    private int width;
    private int x;
    private int y;
    private Shape oval;

    public Moon()
    {
        color = Color.white;
        height = 50;
        width = 50;
    }

    public void draw(Graphics page)
    {
        page.setColor(color);
        page.fillOval(700,50,height, width);
    }
}
