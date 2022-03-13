import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallOOP extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Y_AXIS = HEIGHT / 5;
    public static ArrayList<DrawFourBall> balls = new ArrayList<>();

    public static void main(String[] args) {
        createBalls();
        System.out.println(balls);
        PApplet.main("FourBallOOP",args);
    }

    public static void createBalls(){
        for(int ball_number = 1;ball_number<=4;ball_number++){
            balls.add(new DrawFourBall(ball_number,Y_AXIS * ball_number));
        }
    }

    @Override
    public void draw() {
        for(int i=0;i<balls.size();i++){
            balls.get(i).drawBall(this);
        }
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
}
