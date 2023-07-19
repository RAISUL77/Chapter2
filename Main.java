public class Main {
    public static void main(String args[]) {
        Rectangle rect_obj = new Rectangle(10,5);
        System.out.println("Length = " + rect_obj.length);
        System.out.println("Width = " + rect_obj.width);
        rect_obj.area();
        rect_obj.perimeter();
        System.out.println("Area:"+rect_obj.area());
        System.out.println("perimeter:"+rect_obj.perimeter());
    }
}




