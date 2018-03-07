import java.awt.*;

public class Background
{

    public Background()
    {}

    public void draw(Graphics page)
    {   
        page.setColor(new Color(248,248,248));
        page.fillOval(750,450,300,300);
        
        page.setColor(new Color(231,238,219));
        page.fillRect(750,450,10,20);
        page.fillRect(770,450,15,25);
    }
}
