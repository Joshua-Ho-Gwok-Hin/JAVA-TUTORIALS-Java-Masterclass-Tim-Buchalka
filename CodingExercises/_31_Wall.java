public class _31_Wall {

    private double width;
    private double height;

    public _31_Wall(double width, double height) {

        if (width<0){
            this.width = 0;
        }else {
            this.width = width;
        }

        if (height<0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public _31_Wall() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getArea(){
        return width * height;
    }

    public static void main(String[] args) {
        _31_Wall wall = new _31_Wall(5,4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}
