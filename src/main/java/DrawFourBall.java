import processing.core.PApplet;


public class DrawFourBall extends PApplet {
    private static final int DIAMETER = 20;
    private int BALL_NUMBER = 0;
    private int X_AXIS = 0;
    private int Y_AXIS = 0;

    public DrawFourBall(int ball_number, int height) {
        this.BALL_NUMBER = ball_number;
        this.Y_AXIS = height;
    }

    public void drawBall(FourBallOOP fourBallOOP){
        fourBallOOP.ellipse(regulateSpeed(), placeBallOnScreen(), DIAMETER, DIAMETER);
        X_AXIS++;
    }

    private int placeBallOnScreen() {
        return Y_AXIS;
    }

    private int regulateSpeed() {
        return X_AXIS * BALL_NUMBER;
    }
}
