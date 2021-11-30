import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.*;
import java.awt.event.*;

public class KeyTrapper extends Canvas implements KeyListener
{
	private String key;
	private Map<String, GuitarString> note;
	
		//this is the constructor
	public KeyTrapper( )
	{	
		note = new HashMap<String,GuitarString>();
		String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
		String[] temp = keyboard.split("",0);
		for(int i=0;i<37;i++)
		{
			note.put(temp[i],new GuitarString(440*Math.pow(1.05956, i-24)));
		}
		
		
		key = "NO VALUE YET";
		addKeyListener( this );
		setFocusable( true );
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.fillRect(0,0,800,600);

		window.setColor(Color.WHITE);		
		window.drawString( key, 250, 250 );
		
		window.setColor(Color.RED);
		window.fillRect(0,450,800,2);

		window.setColor(Color.WHITE);
		window.fillRect(0,400,800,5);
		
		window.setColor(Color.WHITE);
		window.fillRect(0,500,800,5);
			
	}
	
	public void keyTyped(KeyEvent e)
	{
		key=  ""+e.getKeyChar();
		GuitarString f = note.get(key);
		f.pluck();
		for(int i=0;i<25000;i++)
		{
			double x = f.sample();
			StdAudio.play(x);
			f.tic();
		}
		key=  "KEY PRESSED "+e.getKeyChar();
		repaint();
	}
	
	
		
	public void keyPressed(KeyEvent e)
	{				
	}
				
	public void keyReleased(KeyEvent e)
	{
	}
	

}
