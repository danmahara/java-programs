
package Assignment_03;
public class EvenAndOddSum_02 {
    public static void main(String[] args) {
        short i;
        int even=0,odd=0;
        
        for(i=1;i<=100;i++){
            if(i%2==0){
           even+=i;
                
            }
            else{
                odd+=i;    
            }
            
        }
            System.out.println("Sum of even is: "+even);
            System.out.println("Sum of odd is: "+odd);
           
            
        
        
    }
}
