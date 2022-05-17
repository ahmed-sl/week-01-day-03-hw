import java.util.ArrayList;
import java.util.List;

public class PolyLine {

    private List<MyPoint> points;

    public PolyLine() {
        points = new ArrayList<MyPoint>();
    }
    public PolyLine(List<MyPoint> points) {
        this.points = points;
    }

    public void appendPoint(int x, int y) {
        MyPoint newPoint = new MyPoint(x, y);
        points.add(newPoint);
    }

    public void appendPoint(MyPoint point) {
        points.add(point);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (MyPoint aPoint : points) {
            sb.append(aPoint.toString());
        }
        sb.append("}");
        return sb.toString();
    }


    public double getLength() {
        return 0.0;
    }
}
