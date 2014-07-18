import java.applet.*;
import java.awt.*;

public class Beginning extends Applet
{
	
	Image bckground,upper;
	TextField name;
	Font f=new Font("SANS_SERIF",1,20);
	public void init()
    {
		
		setSize(1900,1000);
		
		bckground=getImage(getDocumentBase(),"dond1.jpg");
		upper=getImage(getDocumentBase(),"upper.jpg");
    }

//This method gets called when the applet is terminated
//That's when the user goes to another page or exits the browser.
	public void stop()
    {
 // no actions needed here now.
    }
	public void addfield()
	{
		name=new TextField();
		name.setBounds(550, 185, 250, 21);
		name.setBackground(Color.yellow);
		name.setForeground(Color.black);
		add(name);
	}
//The standard method that you have to use to paint things on screen
	public void paint(Graphics g)
    {
		
		
		g.drawImage(bckground, 0, 0, this);
		g.drawImage(upper, 770, 1, this);
		g.setColor(Color.RED);
		g.setFont(f);
		g.drawString("Welcome Player! Please enter your name!", 100, 200);
		addfield();
		
    }
}
