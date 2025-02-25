Matrix Multiplication in Java

Authors:

Gavin Katz, Rohith Gajula, Lalar Rajpurohit, Anish Ummadi

Description:

This Java program defines a Matrix class that provides a method to multiply two matrices. It checks if the multiplication is valid ( and performs the matrix multiplication using triple nested loops.

How It Works:

Matrix Validation: The method first checks whether the matrices can be multiplied. If not, it throws an IllegalArgumentException.
Matrix Initialization: A new matrix is created to store the result with appropriate dimensions.
Multiplication Process:
Each element in the result matrix is computed as the dot product of a row from the first matrix and a column from the second matrix.
This is done using three nested loops:
The outer loop iterates over rows of the first matrix.
The middle loop iterates over columns of the second matrix.
The inner loop performs the dot product operation.
Returns the Result: The computed matrix is returned as a Double[][] array.


Error Handling:

If the number of columns in the first matrix is not equal to the number of rows in the second matrix, an error is thrown.
Usage:

