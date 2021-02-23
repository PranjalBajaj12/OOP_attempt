import processing.core.PApplet;
public class Ballprocessing extends PApplet
{

    public static final int HEIGHT = 680;
    public static final int WIDTH = 840;
    public static final int DIAMETER = 10;
    public static final int INT = 5;

    public static void main(String[] args) {
        PApplet.main("Ballprocessing", args);
    }
//OOP-Encapsulation concept : class Ball
    public class Ball
    {
        float x,y;                               // ball coordinates
        int diameter;                            // ball diameter
        int speed;                               // ball speed

        public Ball(float x, float y, int diameter, int speed)
        {
            this.x = x;
            this.y = y;
            this.diameter = diameter;
            this.speed = speed;
        }

        public void drawballs()
        {
            ellipse(x,y,diameter,diameter); // to draw a ball
            x+=speed;                       // update ball x coordinate wrt it's speed
        }
    }
    Ball b1=new Ball(0, HEIGHT *1/INT, DIAMETER,1); // ball1 as object of class ball
    Ball b2=new Ball(0,HEIGHT*2/INT,DIAMETER,2);   // ball2
    Ball b3=new Ball(0,HEIGHT*3/INT,DIAMETER,3);   // ball3
    Ball b4=new Ball(0,HEIGHT*4/INT,DIAMETER,4);   // ball4

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);  //sketch size
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        b1.drawballs();
        b2.drawballs();
        b3.drawballs();
        b4.drawballs();
    }
}
