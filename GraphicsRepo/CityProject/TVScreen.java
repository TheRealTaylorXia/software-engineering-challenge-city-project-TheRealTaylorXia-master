import java.awt.*;

public class TVScreen
{
    private Color screenColor;
    
    public TVScreen()
    {}

    public void draw(Graphics page,Color screen)
    {
        screenColor = screen;
        
        page.setColor(new Color(12,12,12));
        page.fillRect(975,175,350,250);
        
        page.setColor(screenColor);
        page.fillRect(1000,200,300,200);
    }

}
