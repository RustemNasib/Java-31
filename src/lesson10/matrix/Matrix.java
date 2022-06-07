package lesson10.matrix;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int rows, int cols) {

        numbers = new double[rows][cols];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }


    @Override
    public int getRows() {

        return numbers.length;
    }

    @Override
    public int getColumns() {

        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!!! " + rowIndex);
            return 0;
        }

        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!!! " + colIndex);
            return 0;
        }

        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!!! " + rowIndex);
            return;
        }

        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!!! " + colIndex);
            return;
        }

        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // явный параметр - otherMatrix
        // не явный параметр - this

        if (otherMatrix.getRows() != this.getRows()) {
            System.out.println("Строки матриц не совпадают!!!");
            return null;
        }

        if (otherMatrix.getColumns() != this.getColumns()) {
            System.out.println("Колонки матриц не совпадают!!!");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix.getRows() != this.getRows()) {
            System.out.println("Строки матриц не совпадают!!!");
            return null;
        }

        if (otherMatrix.getColumns() != this.getColumns()) {
            System.out.println("Колонки матриц не совпадают!!!");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix.getRows() != this.getRows()) {
            System.out.println("Строки матриц не совпадают!!!");
            return null;
        }

        if (otherMatrix.getColumns() != this.getColumns()) {
            System.out.println("Колонки матриц не совпадают!!!");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                for (int k = 0; k < result.getColumns(); k++) {

                    result.setValueAt(i, j, this.getValueAt(i, k) * otherMatrix.getValueAt(k, j));
                }
            }
        }

        return result;
    }

    @Override
    public IMatrix mul1(double value) {

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns() - 1; j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;

    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {


        return 0;

//        public static double matrixDeterminant (double[][] matrix) {
//            double temporary[][];
//            double result = 0;
//
//            if (matrix.length == 1) {
//                result = matrix[0][0];
//                return (result);
//            }
//
//            if (matrix.length == 2) {
//                result = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
//                return (result);
//            }
//
//            for (int i = 0; i < matrix[0].length; i++) {
//                temporary = new double[matrix.length - 1][matrix[0].length - 1];
//
//                for (int j = 1; j < matrix.length; j++) {
//                    for (int k = 0; k < matrix[0].length; k++) {
//                        if (k < i) {
//                            temporary[j - 1][k] = matrix[j][k];
//                        } else if (k > i) {
//                            temporary[j - 1][k - 1] = matrix[j][k];
//                        }
//                    }
//                }
//
//                result += matrix[0][i] * Math.pow (-1, (double) i) * matrixDeterminant (temporary);
//            }
//            return (result);

    }




    @Override
    public boolean isNullMatrix() {

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i,j)!= 0) {
                    return false;

                }
            }
        }
        return true;
    }

    @Override
    public boolean isNullMatrix(int rowIndex) {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (this.getValueAt(i,j) !=1) {
                        return false;
                    }
                } else {
                    if (this.getValueAt(i,j) !=0) {
                        return false;
                    }
                }

            }

        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {

        if (getRows() == getColumns()) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}


