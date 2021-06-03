public class Ball {

    public static final int BALL_DIAMETER = 10;

    private int xCoordinate;
    private int yCoordinate;
    private int speedPerFrame;

    public Ball(int yCoordinate, int speedPerFrame) {
        this.yCoordinate = yCoordinate;
        this.speedPerFrame = speedPerFrame;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void moveRight() {
        this.xCoordinate += this.speedPerFrame;
    }

    public void drawBall(FourBallChallenge fourBallChallenge) {
        fourBallChallenge.ellipse(this.getXCoordinate(), this.getYCoordinate(), BALL_DIAMETER, BALL_DIAMETER);
    }
}
