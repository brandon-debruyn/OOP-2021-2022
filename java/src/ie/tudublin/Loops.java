package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {
		if (key >= '0' && key <= '9') {
			mode = key - '0';
		}
		println(mode);
	}

	float offset = 0;


	/*
		Draws a rectangle to the screen. A rectangle is a four-sided shape with every angle at ninety degrees. 
		By default, the first two parameters set the location of the upper-left corner, the third sets the width, and the fourth 
		sets the height.
	*/
	public void draw() {
		switch (mode) {
			case 0: {
				background(0);
				noStroke();
				float squares = (mouseX / 20.0f);
				
				for(int i = 0; i < squares; i++)
				{
					fill(map(i, 0, squares, 0, 255), 255, 255);
					rect(map(i, 0, squares, 0, height), 0, width, height);
				}

				break;
			}
			case 1: {
				background(0);
				float squares = mouseX / 20.0f;
				float h = height / squares;
				for(int i=0; i<squares; i++)
				{
					noStroke();
					fill(map(i, 0, squares, 0, 255), 255, 255);
					float x = map(i, 0, squares, 0, width);
					rect(x, x, h, h);
					
					
				}

				break;
			}
			case 2:
			{
				background(0);
			}
			case 3:
			{
				background(0);
				
			}
		}

	}
}
