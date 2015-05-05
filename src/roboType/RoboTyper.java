/**
 * @author sn0w
 */

package roboType;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class RoboTyper
{
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		boolean roboRun = true;
		
        Random random = new Random();
        
        @SuppressWarnings("rawtypes")
		ArrayList keys = new ArrayList();
        keys.add(KeyEvent.VK_0);
        keys.add(KeyEvent.VK_1);
        keys.add(KeyEvent.VK_2);
        keys.add(KeyEvent.VK_3);
        keys.add(KeyEvent.VK_4);
        keys.add(KeyEvent.VK_5);
        keys.add(KeyEvent.VK_6);
        keys.add(KeyEvent.VK_7);
        keys.add(KeyEvent.VK_8);
        keys.add(KeyEvent.VK_9);
        keys.add(KeyEvent.VK_A);
        keys.add(KeyEvent.VK_B);
        keys.add(KeyEvent.VK_C);
        keys.add(KeyEvent.VK_D);
        keys.add(KeyEvent.VK_E);
        keys.add(KeyEvent.VK_F);
        keys.add(KeyEvent.VK_G);
        keys.add(KeyEvent.VK_H);
        keys.add(KeyEvent.VK_I);
        keys.add(KeyEvent.VK_J);
        keys.add(KeyEvent.VK_K);
        keys.add(KeyEvent.VK_L);
        keys.add(KeyEvent.VK_M);
        keys.add(KeyEvent.VK_N);
        keys.add(KeyEvent.VK_O);
        keys.add(KeyEvent.VK_P);
        keys.add(KeyEvent.VK_Q);
        keys.add(KeyEvent.VK_R);
        keys.add(KeyEvent.VK_S);
        keys.add(KeyEvent.VK_T);
        keys.add(KeyEvent.VK_U);
        keys.add(KeyEvent.VK_V);
        keys.add(KeyEvent.VK_W);
        keys.add(KeyEvent.VK_X);
        keys.add(KeyEvent.VK_Y);
        keys.add(KeyEvent.VK_Z);
        keys.add(KeyEvent.VK_ENTER);
        keys.add(KeyEvent.VK_SPACE);
        keys.add(KeyEvent.VK_BACK_SPACE);
        
        while(roboRun)
        {
		   	try 
			{
		   	
		   	/*Creates a new robot object*/
		    Robot robot = new Robot();
		    /*Sets the delay of the program*/
		    int delay = random.nextInt(10000)+4000;
		    /*Sleeps the thread to cause the delay*/
		    Thread.sleep(delay);
		
		    /*Choose a random key from the arraylist and press it up and release*/
		    int randomKey = random.nextInt(keys.size());
		    robot.keyPress((int) keys.get(randomKey));
		    robot.keyRelease((int) keys.get(randomKey));
		    
			}
			catch (AWTException | InterruptedException e) 
			{
		        e.printStackTrace();
			}
        }
	}
}
