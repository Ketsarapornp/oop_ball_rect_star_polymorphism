//∫Õ≈«‘Ëß·∫∫ Polymorphism
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel
{
	Ball balls[];
	public GUI()
	{
		balls = new Ball[30];
		for(int i=0;i<balls.length;i++)
		{
			balls[i] = new Ball();
		}
		for(int i=10;i<balls.length;i++)
		{
			balls[i] = new Rect();
		}
		for(int i=20;i<balls.length;i++)
		{
			balls[i] = new Star();
		}
		
		Thread t = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				while(true)
				{
					//Thread.sleep(40); // press on red cross front and choose Surround with try/catch
					try
					{
						Thread.sleep(35);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					
					for(int i=0;i<balls.length;i++)
					{
						balls[i].move();
					}
					
					repaint(); //to draw again
				}
				
			}
		});
		
		t.start();
		
		JFrame f = new JFrame();
		//f.setExtendedState ( f.MAXIMIZED_BOTH );
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setVisible(true);	
	}
	
	public void paint(Graphics g)
	{
		super.paint(g); // If no this line balls stars rectangle will move with extension...try beautiful
		for(int i=0;i<balls.length;i++)
		{
			balls[i].draw(g);
		}
	}
	
	public static void main(String[] args)
	{
		new GUI();
	}

}

