// A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

import java.io.*;

class P3 
{

    static int[][] makeMatrix(Console c, int row, int col)
    {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                matrix[i][j] = Integer.parseInt(c.readLine("Enter Number: "));
            }
        }
        return matrix;
    }
    
    static int maxRow(int[][] matrix, int row, int col) 
    {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < row; i++)
        {
            int count = 0;
            for(int j = 0; j < col; j++)
            {
                if (matrix[i][j] == 1) 
                {
                    count++;
                }
            }
            if (count > max)
            {
                max = count;
                index = i;
            }
        }
        return index + 1;
    }

    public static void main(String args[])
    {
        Console c = System.console();

        int row = Integer.parseInt(c.readLine("Enter Number of Rows: "));
        int col = Integer.parseInt(c.readLine("Enter Number of Columns: "));

        int[][] parkingLot = makeMatrix(c, row, col);

        int index = maxRow(parkingLot, row, col);

        System.out.print(index);
    }    
}
