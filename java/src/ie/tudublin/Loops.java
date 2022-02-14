package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{


	int mode = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		
	}

	public void keyPressed()
	{
		if (key >= '0' && key <='9')
		{
			mode = key - '0';
		}
		println(mode);
	}

	
	public void draw()
	{
		background(0);
		
		switch(mode)	
		{
			case 0:
			{
				
				float bars = (mouseX / 20.0f);
				float w = width / bars;

				for(int i=0; i<bars; i++)
				{
					noStroke();
					fill(map(i, 0, bars, 0, 255), 255, 255);
					rect(map(i, 0, bars, 0, 500), 0, w, height);
				}
				/*
					map(a,b,c,d,e)
					a = input val
					b - c -> start and end of first range
					d, e -> start and end of the range

					return (a-b) / r1 * r2 
					
					(r1 = c-b)
					(r2 = e-d)

					map(-2, 10, 90, 200, 233);
					r1 = (90 - 10) = 80
					r2 = (233 - 200) = 33

					200 + (-12 / 80) * 33 = 195.05
				
				*/
				//map(-2, 10, 90, 200, 233);
				break;
			}
			case 1:
			{
				noStroke();
				
				
				break;
			}
		}

	}
}
