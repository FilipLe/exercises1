package exercises;

import tbs.SimpleGfx;

public class Exercise3 {
	SimpleGfx gfx = SimpleGfx.startup(400, 400);//400px wide x 400px length

	public static void main(String[] args) {
		new Exercise3().question3(); // Write the question you want to test here.
		new Exercise3().question4();
		new Exercise3().question5();
		new Exercise3().question6();
		new Exercise3().question7();
		new Exercise3().question8();
		new Exercise3().question9();
	}
	
	public void question3() {
		gfx.setColour(0xffff00);
		gfx.plot(320, 240);//plot(x,y) -->x-coord,y-coord
	}
	
	public void question4() {
		gfx.setColour(0xffff00);
		for(int x = 0; x < 400; x++)
			gfx.plot(x, 240);
	}

	public void question5() {
		gfx.setColour(0xffff00);
		for(int y = 0; y < 400; y++)
			gfx.plot(320, y);
	}

	public void question6() {
		
	}

	public void question7() {
		
	}

	public void question8() {
		
	}
	public void question9() {
		
	}
}

