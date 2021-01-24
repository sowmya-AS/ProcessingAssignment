package Procedural;

import processing.core.PApplet;

public class MovingBallsProcedural extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int[] heightOfBalls = new int[4];
    private final int[] speedOfBalls = new int[4];
    private final int[] positionOfBalls = new int[4];
    public static final int DIAMETER = 10;

    public static void main(String[] args) {

        PApplet.main("MovingBallsProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    private void setHeightOfBalls() {
        for (int i = 0; i < 4; i++) {
            heightOfBalls[i] = HEIGHT * (i + 1) / 5;
        }
    }

    private void setPositionOfBalls() {
        for (int i = 0; i < 4; i++) {
            positionOfBalls[i] = 0;
        }
    }

    private void setSpeedOfBalls() {
        for (int i = 0; i < 4; i++) {
            speedOfBalls[i] = i + 1;
        }
    }

    @Override
    public void setup() {
        setHeightOfBalls();
        setPositionOfBalls();
        setSpeedOfBalls();
    }

    @Override
    public void draw() {
        sketchBalls();
        moveBalls();
    }

    private void sketchBalls() {
        for (int i = 0; i < 4; i++) {
            ellipse(positionOfBalls[i], heightOfBalls[i], DIAMETER, DIAMETER);
        }
    }

    private void moveBalls() {
        for (int i = 0; i < 4; i++) {
            positionOfBalls[i] += speedOfBalls[i];
        }
    }
}