package lesson10.matrix;

public class Main1 {
    public static void main(String[] args) {
        double[][] num1 = {{2, 5, 6, 5},
                           {4, 6, 7, 8},
                           {2, 5, 7, 8}};
        Matrix matrix1 = new Matrix(num1);

        double[][] num2 = {{2, 1, 1, 7},
                            {6, 7, 8, 9},
                            {1, 2, 3, 4}};
        Matrix matrix2 = new Matrix(num2);

        // matrix1.printToConsole();
        //  System.out.println(matrix2.getValueAt(0, 20));
//        matrix2.setValueAt(0, 0, 444);
//        matrix2.printToConsole();

        // явный параметр - matrix2
        // не явный параметр - matrix1

//        IMatrix resultAdd = matrix1.add(matrix2);
//        resultAdd.printToConsole();

//         matrix1.isSquareMatrix();

//        matrix1.isIdentityMatrix();

//        matrix1.isNullMatrix();

//        IMatrix resultAdd = matrix1.add(matrix2);
//          resultAdd.printToConsole();

//          IMatrix resultSub = matrix1.sub(matrix2);
//          resultSub.printToConsole();

        IMatrix resultMul = matrix1.mul(matrix2);
        resultMul.printToConsole();

//         matrix1.mul1(matrix2).printToConsole();

//        matrix1.transpose().printToConsole();




    }
}
