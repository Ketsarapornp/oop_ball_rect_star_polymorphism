//ºÍÅÇÔè§áºº Polymorphism
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Ball
{
	public int R,G,B,Size;
	public Vector pos,vel,acc;
	public Ball()
	{
		pos = new Vector();
		vel = new Vector();
		acc = new Vector();
		pos.x = (int)(Math.random()*500);
		pos.y = (int)(Math.random()*500);
		vel.x = (int)(Math.random()*10-5);
		vel.y = (int)(Math.random()*10-5);
		acc.x = 0;
		acc.y = 1;
		R = (int)(Math.random()*250);
		G = (int)(Math.random()*250);
		B = (int)(Math.random()*250);
		Size = (int)(Math.random()*50);
	}
	public void move()
	{
	
		
		JFrame f = new JFrame();
		f.setExtendedState ( f.MAXIMIZED_BOTH );
		//vel = vel.add(acc);
		pos = pos.add(vel);
		if(pos.x + Size>500)
		{
			pos.x = 500 - Size;
			vel.x = vel.x*(-1);
		}
		if(pos.x<0)
		{
			pos.x = 0;
			vel.x = vel.x*(-1);
		}	
		if(pos.y + Size >500)
		{
			pos.y =  500- Size;
			vel.y = vel.y*(-1);
		}	
		if(pos.y<0)
		{
			pos.y = 0;
			vel.y = vel.y*(-1);
		}
	}
	public void draw(Graphics g)
	{
		g.setColor(new Color(R, G, B,190));
		g.fillOval((int)pos.x, (int)pos.y, Size, Size);
	}
}


