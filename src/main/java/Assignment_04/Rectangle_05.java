
package Assignment_04;

public class Rectangle_05 {

    float length, breadth, area;

    float computeArea(int l, int b) {
        length = l;
        breadth = b;
        area = length * breadth;
        return area;
    }

    void displayArea() {
        System.out.println("Area is "+area);
//        System.out.println();

    }

    public static  void main(String[] args) {

        Rectangle_05 r1 = new Rectangle_05();
//        r1.computeArea(5, 6);
//        float area1 = r1.area;

        float area1 = r1.computeArea(3, 4);

        Rectangle_05 r2 = new Rectangle_05();
//        r2.computeArea(10, 5);
//        float area2 = r2.area;

        float area2 = r2.computeArea(5, 6);

        if (area1 > area2) {
            r1.displayArea();
        } else {
            r2.displayArea();
        }
        
        // incase if length is asked to user
//        else{
//            System.out.println("Both have same area : "+area1);
//        }

    } 

}
