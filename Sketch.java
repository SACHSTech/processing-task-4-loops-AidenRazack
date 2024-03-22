import processing.core.PApplet;
 /**
  * A program that draws 4 quadrants one with lines, one with circles, one with a gradient, and one with a flower that can adjust to any window size
  * @author: A. Razack
  */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Quadrant 1 lines
    for (int i = 1; i <= 10; i++) {
      stroke(0, 0, 0);
      int lineX = i * height/20;
      line(lineX, 0, lineX, height/2);
    }

    for (int i = 1; i <= 10; i++) {
      int lineY = i * width/20;
      stroke(0, 0, 0);
      line(0, lineY, width/2, lineY);
    }

  // Quadrant 3 gradient
    for (int intGradient = 0; intGradient <= width / 2; intGradient++){
      stroke((int)(intGradient * 255 * 2 / width));
      line(intGradient, height / 2, intGradient, height);
    }

  // Quadrant 4 flower
    for (int intPetals = 0; intPetals < 8; intPetals++){
      fill(199, 80, 0);
      pushMatrix();
      translate((float)(0.75 * width), (float)(height * 0.75));
      rotate (-intPetals * PI / 4);
      translate ((float)(width / 12), 0);
      strokeWeight(2);
      ellipse(0, 0, (float)(width / 6), (float)(height / 22));
      popMatrix();
    }

    strokeWeight(0);
    fill(32, 92, 34);
    ellipse((width / 4) * 3, (height / 4) * 3, width / 10, width / 10);

  // Quadrant 2 circles
    for (int rowY = height * 30 / 400; rowY <= width * 180 / 400; rowY += height / (float)(2) / (float)(5.5)) {
      stroke(0, 0, 0);
      fill(204, 0, 102);
      drawCircleRow(rowY);
    }
  }
  
  void drawCircleRow(int rowY) {
    for (int circleX = height * 228 / 400; circleX <= width * 380 / 400; circleX += width / (float)(2) / (float)(5.5)) {
      stroke(0, 0, 0);
      ellipse(circleX, rowY, height/20, width/20);
      fill(204, 0, 102);
    }
  }
}
