/**
 * Created by liveuser on 16.09.16.
 */
package Balls;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(3.4, 5.3);
        Ball b3 = new Ball();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        b3.setXY(2, 3);
        System.out.println(b1.toString());
        b2.move(50, 10);
        System.out.println(b3.toString());
        System.out.println(b2.toString());
    }
}
