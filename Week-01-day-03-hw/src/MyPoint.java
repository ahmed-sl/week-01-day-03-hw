public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x, y};
    }
    public void setXY(int x, int y){


    }

    @Override
    public String toString() {
        return x+" "+ y;
    }
    public double distance(int x, int y){
        return ((this.x-x)*2)-((this.y-y)*2);
    }
    public double distanc2(MyPoint another){
        return this.x - this.y;

    }
    public double distance(){
        return distance(x,y) - distance(x,y);
    }
}
