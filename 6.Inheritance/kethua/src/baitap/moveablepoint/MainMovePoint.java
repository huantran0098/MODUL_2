package baitap.moveablepoint;

public class MainMovePoint {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(5.6f, 6.7f) ;
        System.out.println(myPoint.toString());
        MoveablePoint moveablePoint = new MoveablePoint(5.5f,6.6f,7.7f,8.8f);
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());

    }
}
