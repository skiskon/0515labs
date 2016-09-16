/**
 * Created by liveuser on 16.09.16.
 */
package Balls;
import java.lang.*;

public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setXYSpeed(double speed){
        this.x = x*speed;
        this.y = y*speed;
    }

    public void move(double xDisp, double yDisp){
        this.x = x + xDisp;
        this.y = y + yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ (" + x +", " + y + ")";
    }
}
