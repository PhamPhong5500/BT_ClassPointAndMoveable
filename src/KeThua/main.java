package KeThua;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());

        MoveablePoint mp = new MoveablePoint();
        mp.setSpeed(10.5f, 10.5f);
        System.out.println(mp.toString());
        System.out.println(mp.move());
    }
}
