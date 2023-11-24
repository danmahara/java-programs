
package Assignment_06;

public class ArrayIndexOutOfBoundsException_06 {
    public static void main(String[] args) {
        int array[]=new int[10];
        
        try{
            System.out.println(array[-1]);
            System.out.println(array[12]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e); 
        }        
    }
}
 