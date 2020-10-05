package exercises;

import tbs.SimpleGfx;

public class Exercise3 {
	SimpleGfx gfx = SimpleGfx.startup(400, 400);//400px wide x 400px length

	public static void main(String[] args) {
		//new Exercise3().question3(); // Write the question you want to test here.
		//new Exercise3().question4();
		//new Exercise3().question5();
		//new Exercise3().question6();
		//new Exercise3().question7();
		//new Exercise3().question8();
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
		//Horizontal line 1
		gfx.setColour(0x000000);
		for(int x1 = 100; x1 < 200; x1++)
			gfx.plot(x1, 100);
		
		//Horizontal line 2
		gfx.setColour(0x000000);
		for(int x2 = 100; x2 < 200; x2++)
			gfx.plot(x2, 200);
		
		//Vertical line 1
		gfx.setColour(0x000000);
		for(int y1 = 100; y1 < 200; y1++)
			gfx.plot(100, y1);
		
		//Vertical line 2
		gfx.setColour(0x000000);
		for(int y2 = 100; y2 < 200; y2++)
			gfx.plot(200, y2);
	}

	public void question7() {
		//Diagonal line 1
		//if points positive -->(0,0),(1,1),... -->line goes upwards
		//however, in 2D (not 3D) computer graphics, y-coord is inverted
		//that's why here line goes downwards
		gfx.setColour(0x000000);
		for(int x1 = 0; x1 < 100; x1++)
			gfx.plot(x1, x1);
		
		//Diagonal line 1
		gfx.setColour(0x000000);
		for(int x1 = 0; x1 < 100; x1++)
			//to make it go upwards, invert the y-axis
			gfx.plot(x1, -x1+100);
	}

	public void question8() {
		//Draw 11 Horizontal lines
		for(int y = 10; y < 21; y++){
			gfx.setColour(0x000000);
			for(int x = 100; x < 200; x++)
				gfx.plot(x, y*10);
		}
		//Draw 11 vertical lines
		for(int x = 10; x < 21; x++){
			gfx.setColour(0x000000);
			for(int y = 100; y < 200; y++)
				gfx.plot(x*10, y);
		}
	}
	public void question9() {
		int h = 20;
		int k = 20;
		int x;
		int y;
		int radius = 20;
		for(int theta=0;theta<361;theta++){
			x = (int)(h + radius*Math.cos(theta));
			y = (int)(k + radius*Math.sin(theta));
			gfx.plot(x, y);
		}
	}
}

