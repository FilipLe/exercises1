package exercises;

import tbs.FrameListener;
import tbs.SimpleGfx;

public class Exercise4 implements FrameListener {
	SimpleGfx gfx = SimpleGfx.startup(400, 400).addFrameListener(this);
	
	public static void main(String args[]) {
		new Exercise4();
	}
	
	public void onFrame() {
		question1(); // Write the question you want to test here.
	}
	
	public void question1() {
		gfx.setColour(0x000000);
		gfx.clear();		
	}
	
	public void question2() {
	}
	
	public void question3() {
	}
	
	public void question4() {
	}
	
	public void question5() {
	}
}
