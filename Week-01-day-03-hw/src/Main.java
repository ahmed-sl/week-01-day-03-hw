public class Main {
    public static void main(String[] args) {

        //1
        div(1,0);

        //2
        try {
            calculateTax(100);
        }catch (Exception e){
            System.out.println(e);
        }

        //3
        Circle circle = new Circle(3.0);
        System.out.println("the radius of "+circle.getRadius()+" and area = "+circle.getArea());

        //4
        Customer customer = new Customer(1,"ahmed",'m');
        System.out.println(customer);

        //5

        PolyLine l1 = new PolyLine();

        l1.appendPoint(new MyPoint(2, 4));
        l1.appendPoint(3, 4);
        System.out.println(l1);

        // Test constructor 2
        List<MyPoint> points = new ArrayList<MyPoint>();
        points.add(new MyPoint(11, 12));
        PolyLine l2 = new PolyLine(points);
        System.out.println(l2);
    }


    public static void div(int num1, int num2) throws Exception{

        if (num2 == 0){
            throw new Exception("Can't div by 0");
        }
        System.out.println(num1/num2);
    }
    public static void calculateTax(int price)throws Exception{

        if(price<100 || price>500){
            throw new Exception("Price out of range");

        }
        System.out.println("The Tax = "+price*15/100);
    }
}