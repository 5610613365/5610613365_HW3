/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

import java.util.Scanner;

/**
 *
 * @author poom
 */
public class Matrix2x2 {
    public static int SIZE = 2; //default 
    private int[][] a;
    private static int c = 0;
    //private int[][] b = new int[SIZE][SIZE];
    public static Matrix2x2 mul(Matrix2x2 a,Matrix2x2 b){
        return a.mul(b);
    }
    public Matrix2x2(int[][] val){
        SIZE = val.length;
        a = new int[SIZE][SIZE];
       for(int i=0;i<val.length;i++){
           for(int j=0;j<val.length;j++){
               a[i][j] = val[i][j];
           }        
        }
    }
    
    public Matrix2x2(){
        a = new int[SIZE][SIZE];
        
        for (int i = 0 ; i<a.length; i++ )
            for (int j = 0 ; j < a[i].length; j++)
                a[i][j] = c++;
    }

    public void setE(int i,int j, int val){        
        a[i][j]= val;
    }
    public int getE(int i,int j){
        return a[i][j];
    }
    public void scanInput(){
        System.out.println("Enter Element");
        Scanner s = new Scanner(System.in);
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               System.out.println("Enter Value at [" + i + "][" + j +"] : " );
               a[i][j] = s.nextInt();
           }
       }
   }
   
   public Matrix2x2 add(Matrix2x2 b){
       
       int [][] temp = new int[SIZE][SIZE];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               temp[i][j] = a[i][j]+b.getE(i, j);
           }
       }
       return new Matrix2x2(temp);
   }
   public Matrix2x2 sub(Matrix2x2 b){
       
       int [][] temp = new int[SIZE][SIZE];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               temp[i][j] = a[i][j]-b.getE(i, j);
           }
       }
       return new Matrix2x2(temp);
   }
   public Matrix2x2 transpose (Matrix2x2 b)
   {
       Matrix2x2 c =new Matrix2x2();
       for(int i = 0; i<a.length;i++){
           for(int j = 0; j<a.length;j++){
              c.setE(j, i, b.getE(i, j));
           }
       }
       return c;
   }
   private int vmul(int i,int j,Matrix2x2 b){
       int sum = 0;
       for(int x=0;x<a.length;x++){
           sum+=this.getE(i, x)*b.getE(x, j);
       }
       return sum;
   }
   public Matrix2x2 mul(Matrix2x2 b){
       int [][] temp = new int[SIZE][SIZE];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               temp[i][j] = vmul(i,j,b);
           }
       }
       return new Matrix2x2(temp);
         
   }
  
   public void printMatrix(){
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println("");
       }
   }

   public void printRow(int i){
           System.out.print("[ ");
       for(int j=0; j<SIZE; j++)
       {
           System.out.print(a[i][j]+" ");
       }
           System.out.print("]");
   }
   
   public String toString ()
   {
       for (int i = 0 ; i < SIZE ; i++ )
       {
           for (int j = 0 ; j < SIZE ; j++ )
           {
               //System.out.print("[" + i + "][" + j + "]");
               System.out.print(a[i][j] + " ");
           }
           System.out.print(" ");
       }
       return "";
   }
}
