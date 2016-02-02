/*
 * ******************************************************
 *  * Copyright (C) 2016 SchawnnDev <contact@schawnndev.fr>
 *  *
 *  * This file (fr.schawnndev.projectmaker.math.Matrice) is part of ProjectMaker.
 *  * Imported from ProjectMaker to JMaths
 *  *
 *  * Created by SchawnnDev on 09/01/16 17:19.
 *  *
 *  * ProjectMaker can not be copied and/or distributed without the express
 *  * permission of SchawnnDev.
 *  ******************************************************
 */

package fr.schawnndev.maths;

public class Matrix {

    private int[][] values; // [ligne] [colonne]

    public Matrix() {
        this.values = new int[0][0];
    }

    public Matrix(int[][] values) {
        this.values = values;
    }

    public Matrix subtract(Matrix matrix) {

        if (getDimension() != matrix.getDimension()) {
            System.err.println("Impossible de soustraire deux matrices si les dimensions de A ne sont pas égales au dimensions de B");
            return this;
        }

        for (int i = 0; i < getLinesCount(); i++)
            for (int c = 0; c < getColumnCount(); c++)
                values[i][c] -= matrix.getValues()[i][c];

        return this;
    }

    public Matrix add(Matrix matrix) {

        if (getDimension() != matrix.getDimension()) {
            System.err.println("Impossible d'additionner deux matrices si les dimensions de A ne sont pas égales au dimensions de B");
            return this;
        }

        for (int i = 0; i < getLinesCount(); i++)
            for (int c = 0; c < getColumnCount(); c++)
                values[i][c] += matrix.getValues()[i][c];

        return this;
    }

    public Matrix multiply(Matrix matrix) {

        if (getColumnCount() != matrix.getLinesCount()) {
            System.err.println("Impossible de multiplier deux matrices si le nombre de colonnes de A n'est pas égal au nombre de lignes de B");
            return this;
        }

        int[][] newMatrix = new int[getLinesCount()][matrix.getColumnCount()];

        for (int i = 0; i < getLinesCount(); i++) {
            for (int s = 0; s < matrix.getColumnCount(); s++) {
                int product = 0;
                for (int x = 0; x < getColumnCount(); x++)
                    product += values[i][x] * matrix.getColumn(s)[x];
                newMatrix[i][s] = product;
            }
        }

        this.values = newMatrix;

        return this;
    }

    public int[] getColumn(int number) {
        int[] column = new int[getLinesCount()];

        for (int i = 0; i < column.length; i++)
            column[i] = getValues()[i][number];

        return column;
    }

    public int[][] getValues() {
        return values;
    }

    public void setValues(int[][] values) {
        this.values = values;
    }

    public int getLinesCount() {
        return values.length;
    }

    public int getColumnCount() {
        return values[0].length;
    }

    public int getDimension() {
        return getLinesCount() * getColumnCount();
    }

    @Override
	public Matrix clone() {
        return new Matrix(values);
    }

    @Override
    public String toString() {

        String finalString = "";

        try {

            for (int i = 0; i < getLinesCount(); i++) {

                for (int j = 0; j < getColumnCount(); j++) {

                    finalString += "" + values[i][j] + " ";

                    if (j == getColumnCount() - 1)
                        finalString += "\n";

                }

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            return "Une erreur est survenue: " + e.toString();
        }

        return finalString;

    }

}