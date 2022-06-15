public class _32_Point {

    private int x;
    private int y;

    public _32_Point() {
        this(0, 0);
    }

    public _32_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(((getX())*(getX()))+(getY())*(getY()));
    }

    public double distance(_32_Point nextPoint){
        return distance(nextPoint.x, nextPoint.y);
    }

    public double distance(int x, int y){
        return Math.sqrt(((getX()-x)*(getX()-x))+((getY()-y)*(getY()-y)));
    }

    public static void main(String[] args) {
//        Point newPoint = new Point(6,5);
//        System.out.println(newPoint.distance(2,2));
//        System.out.println(newPoint.getX() + "," + newPoint.getY());
//        Point emptyPoint = new Point();
//        System.out.println(emptyPoint.getX() + "," + emptyPoint.getY());

        _32_Point first = new _32_Point(6,5);
        _32_Point second = new _32_Point(3, 1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        _32_Point point = new _32_Point();
        System.out.println("distance() = " + point.distance());
    }
}
