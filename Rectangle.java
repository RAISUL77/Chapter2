
class Rectangle {
    int length, width;
    Rectangle(int length, int width) {
        this. length = length;
        this.width = width;
    }
    public float area() {
        int areaOfRectangle;
        areaOfRectangle = this.length * this.width;
        //System.out.println("Area of rectangle with the given input is : " + areaOfRectangle);
        return areaOfRectangle;
    }
    public float perimeter() {
        int  perimeterOfRectangle;
        perimeterOfRectangle = 2 * (this.length + this.width);
        //System.out.println("Perimeter of rectangle with the given input is : " + perimeterOfRectangle);
        return perimeterOfRectangle;
    }
}

