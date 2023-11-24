
package Assignment_06;

public class MyClass_02 {
    public static void main(String[] args) {
       
        int myArray[]=new int[7];
        
        try {
            System.out.println(myArray[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
         
    }
}
