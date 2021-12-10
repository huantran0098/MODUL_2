package baitap.moveablepoint;

public class MoveablePoint extends MyPoint {
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed ;
        this.ySpeed = ySpeed ;
    }
    public float[] getSpeed(float xSpeed, float ySpeed ){
        return new float[] {getxSpeed(), getySpeed()};
    }
    public void move() {
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
    }
}
