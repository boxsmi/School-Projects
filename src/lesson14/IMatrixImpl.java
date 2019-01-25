/*
Created by Aleksandr
                    Smirnov*/
package lesson14;

import Interfaces.IMatrix;

public class IMatrixImpl implements IMatrix {
    private int numOfRow;
    private int numOfCol;
    private double[][] matrix;

    IMatrixImpl() {
        int DEFAULT_MATRIX_SIZE = 1;
        double[][] matrix = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    IMatrixImpl(int numOfRow, int numOfCol) {
        double[][] matrix = new double[numOfRow][numOfCol];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        try {
            double element = matrix[rowIndex][colIndex];
            return element;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Wrong rowIndex and colIndex");
        }
        return 0;
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        try {
            matrix[rowIndex][colIndex] = value;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Wrong rowIndex and colIndex");
        }
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix.getRows() != this.matrix.length && otherMatrix.getColumns() != this.matrix[0].length)
            throw new IllegalArgumentException("Wrong numrer of Rows or Columns!!!");
        if (otherMatrix == null)
            throw new NumberFormatException("Argument is NULL!!!");
        IMatrix newMatrix = new IMatrixImpl();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                newMatrix.setValueAt(i, j, this.matrix[i][j] + otherMatrix.getValueAt(i, j));
            }
        }
        return newMatrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix.getRows() != this.matrix.length && otherMatrix.getColumns() != this.matrix[0].length)
            throw new IllegalArgumentException("Wrong numrer of Rows or Columns!!!");
        if (otherMatrix == null)
            throw new NumberFormatException("Argument is NULL!!!");
        IMatrix newMatrix = new IMatrixImpl();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                newMatrix.setValueAt(i, j, this.matrix[i][j] - otherMatrix.getValueAt(i, j));
            }
        }
        return newMatrix;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix.getRows() != this.matrix.length && otherMatrix.getColumns() != this.matrix[0].length)
            throw new IllegalArgumentException("Wrong numrer of Rows or Columns!!!");
        if (otherMatrix == null)
            throw new NumberFormatException("Argument is NULL!!!");
        IMatrix newMatrix = new IMatrixImpl();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                newMatrix.setValueAt(i, j, (this.matrix[i][j] * otherMatrix.getValueAt(i, j) + this.matrix[i][j + 1] * otherMatrix.getValueAt(i + 1, j)));
            }
        }
        return newMatrix;
    }

    @Override
    public IMatrix mul(double value) {
        IMatrix newMatrix = new IMatrixImpl();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                newMatrix.setValueAt(i, j, this.matrix[i][j] * value);
            }
        }
        return newMatrix;
    }

    @Override
    public IMatrix transpose() {
        IMatrix newMatrix = new IMatrixImpl();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix.setValueAt(j, i, matrix[i][j]);
            }
        }
        return newMatrix;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                matrix[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        int countOfOne = 0;     //счетчик единиц в матрице
        int countOfZero = 0;    //счетчик нулей в матрице
        int countOfElements = matrix.length * matrix[0].length;   //общее кол-во элементов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] == 1)
                    countOfOne++;
                if (i != j && matrix[i][j] == 0)
                    countOfZero++;
            }
        }
        //проверяем,что кол-во 1 в диагонали равно кол-ву элементов строки и что остальные элементы нули
        if (countOfOne == matrix[0].length && countOfZero == (countOfElements - countOfOne)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length == matrix[i].length)
                continue;
            else
                return false;
        }
        return true;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
