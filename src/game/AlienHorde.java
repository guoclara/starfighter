package game;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
            aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
            aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
            for(Alien a: aliens){
                a.draw(window);
            }
	}

	public void moveEmAll()
	{
            for(Alien a: aliens){
                if(a.getX() <= 0){
                    a.setY(a.getY()+a.getHeight());
                    a.setSpeed(-a.getSpeed());
                }else if(a.getX()+a.getWidth() >= 800){
                    a.setY(a.getY()+a.getHeight());
                    a.setSpeed(-a.getSpeed());
                }
                if(a.getY() >= 600){
                    a.setY(0);
                }
                a.setX(a.getX()+a.getSpeed());
            }
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
	}

	public String toString()
	{
		return "";
	}
}
