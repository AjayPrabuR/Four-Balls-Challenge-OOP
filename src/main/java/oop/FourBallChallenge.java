package oop;

import processing.core.PApplet;

public class FourBallChallenge extends PApplet {

    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;

    private Ball[] balls = new Ball[4];

    public FourBallChallenge() {
        for (int ballIndex = 0; ballIndex < balls.length; ballIndex++) {
            int ballNumber = ballIndex + 1;
            balls[ballIndex] = new Ball(WINDOW_HEIGHT * ballNumber / 5, ballNumber);
        }
    }

    public static void main(String[] args) {
        PApplet.main("oop.FourBallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.drawBall(this);
            ball.moveRight();
        }
    }
}
