/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

/**
 *
 * @author poom
 */
public class BinaryMatrix extends Matrix{
    
    
    public BinaryMatrix(int[][] val){
        super (val);
    }
    public BinaryMatrix(){
        super ();
    }
    public BinaryMatrix(int size){      
        super (size);
       
    }
    private static String toBinary2(int number)
    {
        String r = "";
        int[] b= new int[16];
        int j=0;
        for(int i=number; i >= 1 ;i /= 2)
        {
            b[j++]= i % 2; 
        }
        for (int i = j-1 ; i >= 0 ; i--)
        {
            r = r.concat(Integer.toString(b[i]));
        }
        return r;
    } 
   
      public void printMatrix(){
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               System.out.print(toBinary2(a[i][j]) + " ");
           }
           System.out.println("");
       }
   }
   
}
