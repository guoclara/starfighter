package game;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
            this(100,100,10,10,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
            this(x, y, 10, 10, 10);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
            this(x, y, 10, 10, s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/game/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
            speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		//add code here
            direction = direction.toLowerCase();
            if(direction.equals("left")){
                if(getX()>0)
                    setX(getX()-speed);
            }else if(direction.equals("right")){
                if(getX()<730)
                    setX(getX()+speed);
            }else if(direction.equals("up")){
                if(getY()>0)
                    setY(getY()-speed);
            }else if(direction.equals("down")){
                if(getY()<500)
                    setY(getY()+speed);
            }
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
