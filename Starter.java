import java.util.Scanner;
public class Starter
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter an odd number for the row/column dimensions");
        int dimension = read.nextInt();
        
    }
    public static void printMagic(int dimension)
    {
        int [][] board = new int [dimension] [dimension];
        int row = 0;
        int column = (dimension/2);
        board [0][column] = 1;
        for(int i = 2; i <= dimension*dimension; i++)
        {            
            column++;
            row--;            
            if(column>dimension-1) column = 0;//if too far to right, wraps back to left
            if (row < 0)  row = dimension-1;//if too far up, wraps back to bottom
            if (board[row][column] == 0)  board[row][column] = i;   
            else
            {
                row++;
                column--;
                if (row < 0) row = dimension -1;
                if (row > dimension -1) row = 0;
                row++;
                if (column < 0) column = dimension -1;
                board[row][column] = i;
            }

        }
        for (int x = 0; x < dimension; x++)
        {
            System.out.println("");
            for (int j = 0; j<dimension; j++)
            {
                System.out.print(board[x] [j]);   
                System.out.print(" ");
            }
        }
    }
}
