package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);


	}

	public void draw()
	{	
		background(255,0,0);
		
		fill(255, 255, 0);
		circle(250, 250, 420);

		fill(0, 0, 180);
		triangle(250, 15, 50, 450, 450, 450);

		fill(255, 255, 255);
		ellipse(250, 180, 100, 50);

		fill(0, 0, 0);
		circle(250, 180, 15);
		/*
		stroke(0);
		background(255, 255, 0); // greyscale

		line(10, 10, 200, 200); // x1, y1, x2, y2

		fill(0, 0, 255);
		noFill();
		noStroke();

		circle(200, 250, 50); // cx, cy, r
		ellipse(50, 200, 90, 200); // cx, cy, w, h
		
		rectMode(CENTER);
		rect(300, 20, 100, 20); // rx, ry, w, l
				
		rectMode(CENTER);
		rect(300, 20, 100, 20); // rx, ry, w, l

		point(20, 300);
		
		triangle(10, 400, 50, 450, 300, 200); // x1, y1, x2, y2, x3, y3
		*/
	}
}
