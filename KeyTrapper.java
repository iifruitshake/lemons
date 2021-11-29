import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.*;
import java.awt.event.*;

public class KeyTrapper extends Canvas implements KeyListener
{
	private String key;
	private Map<String,GuitarString> note;
		//this is the constructor
	public KeyTrapper( )
	{	
		note= new HashMap<String,GuitarString>();
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
		window.setColor(Color.WHITE);
		window.fillRect(0,0,800,600);

		window.setColor(Color.BLACK);		
		window.drawString( key, 250, 250 );
			
	}
	
	public void keyTyped(KeyEvent e)
	{
		if( e.getKeyCode()  == KeyEvent.VK_SPACE )
		{
			key = "Key pressed " + e.getKeyCode();
			repaint();
		}
		if( e.getKeyCode()  == KeyEvent.VK_X )
		{
			key = "Key pressed " + e.getKeyCode();
			repaint();
		}				
	}
		
	public void keyPressed(KeyEvent e)
	{
		if( e.getKeyCode()  == KeyEvent.VK_SPACE )
		{
			key = "Key pressed " + e.getKeyCode();
			repaint();
		}
		if( e.getKeyCode()  == KeyEvent.VK_X )
		{
			key = "Key pressed " + e.getKeyCode();
			repaint();
		}					
	}
				
	public void keyReleased(KeyEvent e)
	{
	}
	

}
