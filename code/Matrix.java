import java.util.*;

public class Matrix {
    int m , n;
    int[][] ma = new int [10][10];

    public Matrix(int m , int n) {
        this.m = m;
        this.n = n;
    }

    public void print(){
        for (int i = 0 ; i < this.m ; i++){
            for (int j = 0; j < this.n ; j++ ){
                System.out.print(ma[i][j]+" ");
            }
            System.out.println();
        }
    }

    public Matrix cheng(Matrix a){
        int m0 = this.m;
        int n0 = a.n;
        int [][] ma0 = new int [this.m][a.n];
        for (int i = 0; i < this.m ; i++){
            for(int j = 0; j < a.n ; j++){
                int sum = 0;
                for (int k = 0 ; k < this.n ; k++){
                    sum += this.ma[i][k] * a.ma[k][j];
                }
                ma0[i][j] = sum;
            }
        }
        Matrix mat = new Matrix(m0 , n0);
        mat.ma = ma0;
        return mat;
    }

    public static void main(String[] args) {
        Matrix matr1 = new Matrix(2,3);
        int[][] array1 ={{4,1,5},{2,2,0}};
        matr1.ma = array1;
        System.out.println("array1:");
        matr1.print();
        System.out.println("array2:");
        Matrix matr2 = new Matrix(3,2);
        int[][] array2 ={{5,0},{3,2},{6,6}};
        matr2.ma = array2;
        matr2.print();
        System.out.println("result:");
        matr1 = matr1.cheng(matr2);
        matr1.print();
    }
}