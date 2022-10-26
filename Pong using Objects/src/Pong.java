//currently everything works except for the point system for player 1
//will increment by 1 whenever paddle 1 is below half of the y-axis and by 3 when it is above it

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Pong extends JPanel implements KeyListener, ActionListener {

    Timer t;

           
    /* paint is getting called roughly 60x per second */
    public void paint(Graphics g) {
        super.paintComponent(g);
       
    }
   
   
    public void keyPressed(KeyEvent arg0) {
        System.out.println(arg0.getKeyCode());
        
    }


    public void keyReleased(KeyEvent arg0) {
        System.out.println(arg0.getKeyCode());
       
      
    }


    public void keyTyped(KeyEvent arg0) {
       
       
    }
    
    
    
    //Frame Setup code below ---------------------------------
    public static void main(String[] arg) {
    	Pong p = new Pong();
    }
    
    public Pong() {
    	//Name of title bar of the GUI
    			JFrame f = new JFrame("Pong");
    			
    			//makes sure that the program stops when the window is close
    			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //don't delete
    			
    			//GUI dimensions - width - height
    			f.setSize(800,600);
    			
    			
    			f.add(this);
    			f.addKeyListener(this);
    			
    			t = new Timer(16, this);
    			t.start();
    			f.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
   
}