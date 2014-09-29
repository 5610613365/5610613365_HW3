/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

import Complex.Complex;

/**
 *
 * @author poom
 */
public class ComplexMatrix {
    private int SIZE = 2; //default 
    protected Complex[][] a = new Complex[SIZE][SIZE];
    //private int[][] b = new int[SIZE][SIZE];
    public static ComplexMatrix mul(ComplexMatrix a,ComplexMatrix b){
        return a.mul(b);
    }
    public ComplexMatrix(Complex[][] val){
        SIZE = val.length;
        a = new Complex[SIZE][SIZE];
       for(int i=0;i<val.length;i++){
           for(int j=0;j<val.length;j++){
               a[i][j] = val[i][j];
           }        
        }
    }
    
    public ComplexMatrix(){
        for (int i = 0 ; i< SIZE ; i++)
            for (int j = 0 ; j < SIZE ; j++)
                a[i][j] = new Complex(12,12);
    }
    public ComplexMatrix(int size){
        SIZE = size;
        a = new Complex[SIZE][SIZE];
    }
    
    public void setE(int i,int j, Complex val){        
        a[i][j]= val;
    }
    public Complex getE(int i,int j){
        return a[i][j];
    }
    /*public void scanInput(){
        System.out.println("Enter Element");
        Scanner s = new Scanner(System.in);
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               a[i][j] = s.nextInt();
           }
       }
   }*/
   
   public ComplexMatrix add(ComplexMatrix b){
       
       Complex [][] temp = new Complex[SIZE][SIZE];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               temp[i][j] = a[i][j].add(b.getE(i, j));
           }
       }
       return new ComplexMatrix(temp);
   }
   
   private Complex vmul(int i,int j,ComplexMatrix b){
       Complex sum = new Complex();
       for(int x=0;x<a.length;x++){
           sum = sum.add(this.getE(i, x).mul(b.getE(x, j)));
       }
       return sum;
   }
   public ComplexMatrix mul(ComplexMatrix b){
       Complex [][] temp = new Complex[SIZE][SIZE];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
               temp[i][j] = vmul(i,j,b);
           }
       }
       return new ComplexMatrix(temp);
         
   }
   
   public void printMatrix(){
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
                System.out.print(a[i][j].getReal() + "+" + a[i][j].getImagination() + "i" + "  ");
       }
           System.out.println("");
   }
}
}
