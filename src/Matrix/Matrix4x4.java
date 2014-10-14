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
public class Matrix4x4 {
        private Matrix2x2[][] m;
        private static int SIZE = 4;
        public Matrix4x4 ()
        {
            m = new Matrix2x2[SIZE][SIZE];
            for (int i = 0 ; i < SIZE ; i++ )
            {
                for (int j = 0 ; j < SIZE ; j++ )
                    m[i][j] = new Matrix2x2();
            }
        }
        public Matrix4x4 (Matrix2x2[][] input)
        {
            m = input;
        }
         public Matrix2x2 getValue(int i,int j)
        {
            return m[i][j];
        }
         public void setValue (int i, int j,Matrix2x2 input)
         {
             m[i][j] = input;
         }
        public Matrix4x4 add (Matrix4x4 other)
        {
            Matrix4x4 ans = new Matrix4x4();
            for (int i = 0 ; i < SIZE ; i++ )
            {
                for (int j = 0 ; j < SIZE ; j++ )
                {
                    ans.setValue(i, j,(m[i][j].add(other.getValue(i,j))));
                }
            }
            return ans;
        }
        public Matrix4x4 sub (Matrix4x4 other)
        {
            Matrix4x4 ans = new Matrix4x4();
            for (int i = 0 ; i < SIZE ; i++ )
            {
                for (int j = 0 ; j < SIZE ; j++ )
                {
                    ans.setValue(i, j,(m[i][j].sub(other.getValue(i,j))));
                }
            }
            return ans;
        }
        public String toString ()
        {
            for (int i = 0 ; i < SIZE ; i++ )
            {
                for(int row=0; row<2; row++ )
                {
                    for (int j = 0 ; j < SIZE ; j++ )
                    {
                        m[i][j].printRow(row);
                    }
                System.out.println("");
                }
                System.out.println("");
            }
            return "";
        }
}
