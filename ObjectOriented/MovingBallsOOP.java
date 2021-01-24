package ObjectOriented;

import processing.core.PApplet;

class Balls {
    private final int heightOfBalls;
    private final int speedOfBalls;
    private final int diameter;
    private final processing.core.PApplet PApplet;
    private int positionOfBalls;

    public Balls(int heightOfBalls, int speedOfBalls, int diameter, PApplet PApplet) {
        this.heightOfBalls = heightOfBalls;
        this.speedOfBalls = speedOfBalls;
        this.diameter = diameter;
        this.positionOfBalls = 0;
        this.PApplet = PApplet;
    }

    public void draw() {
        PApplet.ellipse(positionOfBalls, heightOfBalls, diameter, diameter);
    }

    public void move() {
        positionOfBalls += speedOfBalls;
    }
}

public class MovingBallsOOP extends PApplet {

    private static final int HEIGHT = 480;
    private static final int WIDTH = 640;
    private static final int DIAMETER = 10;
    private static final Balls[] balls = new Balls[4];

    public static void main(String[] args) {
        PApplet.main("objectOriented.MovingBallsOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 0; i < 4; i++) {
            balls[i] = new Balls(HEIGHT * (i + 1) / 5, i + 1, DIAMETER, this);
        }
    }

    @Override
    public void draw() {
        sketchBalls();
        moveBalls();
    }

    private void sketchBalls() {
        for (int i = 0; i < 4; i++) {
            balls[i].draw();
        }
    }

    private void moveBalls() {
        for (int i = 0; i < 4; i++) {
            balls[i].move();
        }
    }
}

