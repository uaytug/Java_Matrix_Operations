import java.util.Scanner;
public class Group21 {
    public static void menu(){

    }
    public static void addition(){

    }
    public static void subtraction(){

    }
    public static void multiplication(){

    }
    public static void division(){

    }
    public static void scalarMultiplication(){

    }
    public static void transpose(){

    }
    public static void inverse(){

    }
    public static void trace(){

    }
    public static void adjoint(){

    }
    /* An orthogonal matrix is a specially defined square matrix such as, 2x2, 3x3, 4x4 etc. . */
    public static boolean orthogonal(int [][]matrix, int rowNumber, int columnNumber){
        // firstly, we should check row and column numbers. If there is no equality, this means the matrix is not orthogonal.
        if (rowNumber != columnNumber)
        {
            return false;
        }

        
		
		// Secondly, we should create nested for loop to find the transpose of the matrix.
		int [][]transpose = new int[columnNumber][rowNumber];
		for (int i = 0; i < columnNumber; i++)
        {
            for (int j = 0; j < rowNumber; j++)
            {
                transpose[i][j] = matrix[j][i];
            }
        }


        /* -- TODO -- : We should compare the equality of the inverse matrix and transpose matrix */
			
		
		/* To find the product of the input matrix and its transpose, we coded this 3 for loops. */
        // We declared new matrix that is called product in order to store product results.
		int [][]product = new int[rowNumber][columnNumber];
        
		for (int i = 0; i < rowNumber; i++) 
		{
            
			for (int j = 0; j < columnNumber; j++) 
			{
		
				int sum = 0; // we declared a variable for the sum of the products. In every iterations, it will start from zero.
				for (int k = 0; k < columnNumber; k++) 
				{
					// To multiply the input matrix and its transpose, we created this operation.
					sum += (matrix[i][k] * transpose[k][j]);
				}
			
				product[i][j] = sum;
			}
		}
		
		/* Now we should check our product matrix. If it is identity matrix, our main matrix must be orthogonal. If not, it cannot be an orthogonal matrix. To check the product matrix, we should create a nested for loop again. */ 
		for (int i = 0; i < rowNumber; i++) 
		{
			for (int j = 0; j < columnNumber; j++) 
			{
				if (i != j && product[i][j] != 0)
                {
                    return false;
                }else if (i == j && product[i][j] != 1)
                {
                    return false;
                }	
			}
		}
		
        // If there is no problem until this code line, our input matrix must be an orthogonal matrix.
		return true;

    }
    public static void clearTerminal(){

    }
    public static void main(String[] args) {

    }
    // _____________________
    // |Group 21           |
    // |Başar Çelebi       |
    // |Emircan Çapkan     |
    // |Göktuğ Ateş        |
    // |Umut Aytuğ Semerci |
    // |___________________|
}
