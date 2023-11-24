
package Assignment_03;

public class Pattern8_14 {
    public static void main(String args[]){
        
      byte i,j;
      char ch='E';
      
      for(i=5;i>=1;i--){
          
          for(j=1;j<=i;j++){
              System.out.print(ch);
          }
          System.out.println("");
         ch--;
      }
        
        
        
    }
}
