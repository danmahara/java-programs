
package Assignment_04;
class Sum{
    
    static int setData(int a,int b){
        return a+b;
    }
    
    static int setData(int x,int y,int z){

        return x+y+z;
    }

}

public class MethodOverloading2 {

    public static void main(String[] args) {
     
        System.out.println("Sum1 is "+Sum.setData(1,4));
        System.out.println("Sum2 is " +Sum.setData(10,5,5));  
    }
}
