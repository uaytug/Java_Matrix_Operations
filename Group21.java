import java.util.Scanner;
public class Group21 {
    public static void asciiArt(){
        System.out.println("\n" + //
                "\n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                                                                                                                          \n" + //
                "                                                                                                 : .-:-:.:::                                                                                              \n" + //
                "                                                                                              :.   .   ....:..                                                                                            \n" + //
                "                                                                                           ::.....::...    .. .                                                                                           \n" + //
                "                                                                                         :. :::..::::--::::::.  .:                                                                                        \n" + //
                "                                                                                          :::::.:----===-:::::::.. :                                                                                      \n" + //
                "                                                                                           .:.:::::::::::::::::::.:.::                                                                                    \n" + //
                "                                                                                      .:::...:::::::::::::::..:....::.=::. ::.                                                                            \n" + //
                "                                                                                 .:-:.-+=.: :::.::::::::::::::::.:::+=-=-:. ==:.                                                                          \n" + //
                "                                                                               .:=*=:-*= :*#%%%+--=*%%%%*+:.:--::::=+*=:=-::. ==:                                                                         \n" + //
                "                                                                             .:-* :==*:::++#*%%%::+%%@@%%%%*::-::::===#=-==:::.-==:.                                                                      \n" + //
                "                                                                           .-+*#::-=-.:=:+@*#*#::=+=+**#%@%%#::::-===**#=::*-=:.:.::..                                                                    \n" + //
                "                                                                       .:::::::::+#::-+=::::::--+:+=:::::::::::--=+**==-==--::..:---...                                                                   \n" + //
                "                                                                    ...:::-::::.:.::*#.: ...:%@%@@%=::......:-==:-#%*. -::#::::::::::....                                                                 \n" + //
                "                                                                  ...:::-:::-:.:::..::::::-=::+***+=:+-:--=-===+=***%%#+-::::::::::::::.:.                                                                \n" + //
                "                                                                ...::::-::.......:::::*:=-*--+++*+=+*+===**++**+*=%%=#=  :--:::....:::::::.                                                               \n" + //
                "                                                               .::::::...........::-+# :=:=#@=@@@@@%@%*-=********#*=:+=  =-::........:::--=::. :                                                          \n" + //
                "                                                            :  ::-::.........:.:--+*%  =-:=::=+**+=====--++*+**#*==*+*    =:::.......:-+*==::-:=:::.:                                                     \n" + //
                "                                                        :      ::::::::::::::::::++  :::==.::-==::----:**#**##%%@#=:::::::::::::::::--==:::-=::-:==:::=-::                                                \n" + //
                "                                                    :::.:. .....:--++=-=======-::::::-=*++:.:::-:::--=**#%%%%%%%=#%%%#*+-::=-==--====#%+=+=#**-=-==---=:::-.:-.:                                          \n" + //
                "                                                :.:.::-:=::..::::=***##***************# %#*+**#%%%%%%%%%%%%@%%%+-        %######%%%%%%%%#%%##=#*#+=+=====++==:--:-:: :                                    \n" + //
                "                                             ...:.::==-:#*=::-==+==**                     #%@@@@@@@@@@@@@@@@%#+=                         %%%%@@%%%%#*======--:===:::::::- :                               \n" + //
                "                                         :..:::::::--*=**#%++======                        =#%%%%%@@@@@@@@%%#+=-                               @@@@@%%###+*==+:::-==--::::.-.:.                           \n" + //
                "                                      ..-=:===:+=*+#*%%%%%%**+=                            ==+*%%@@%@@%%%%%#*==-                                   @@@%@%%%#*=-=::=-:::=:-:::::::..                       \n" + //
                "                                   ..::=.:::-==*+*%%##%%#***                              =-===**%%@%%%#%#**+=--                                        @%%%%*===++**+==--:---::::::.:                    \n" + //
                "                                ...:::-:-==***#*%%#%****                                  ---=--=+*##*+-**++==-=                                           %%%%%##***-==-==--====---.:::                  \n" + //
                "                             -.....:-:-==+*##%%###****                                    -::---=-:=+***+=====-::                                            @@%%%%%%%%#******+++++*-----.                \n" + //
                "                           :..::-:=-+-=**+*#%%%#%%%%#         -::::::::::::::::::*: : :.::::::---=*#****=====-=*+**=+       ++*++********+*******************%=**#%@@%#*+#****++###*#*=-*+-               \n" + //
                "                        ...:::::=+=*=+*%%%%%%@%+=-:==::-::::::::::::::::::::::::::=::=--:=%+:::-=+*##*=-=+*#%%%%#%%@%**#%*#*****+***********#*%**************:::::::-:-+*%%%%#%%%***##=+#+                \n" + //
                "                       -::--:==-==***%%%@@%-:-::::::::::::::::::::::::::::::::-::::%%%=-:%%%%%%@@@@@@@@@@@@@@@@%%%%%+++**##*************##*%%#**************#::-==-++:=-::***#%%%%%*%#%%#                 \n" + //
                "                        :::::===*+*%@%#+=::::::::::::::::::-::-:::::::::::::::::::%=::::*%%%%%%@@@@%@@@@@@@%%#****%%%*****#%%%********###*@#********##*#****#=:-====+===+++**#%%%*#*%@@@                  \n" + //
                "                        =-=====--:**+=*=:=-==:::::::::::--:::::-:::::::-=:::::::*::===++*++===-*#########*#=:*@%%@%**#%%%%%%%##****###%#%@**#***#####%%%%@@@%***#%%%%**+*##%@@%%%%@@@%                    \n" + //
                "                         +*#**==***+**+*#***+===+===-:::::=:::::-::::::=++**++===--:-:::---*-==#%%%%%%%%%%%%@@%-%:@@%%%%%%%%%%%%#**##%#%%**#*##%%*%%%%%%@@@@@%%%%%%%##%%%%%%%%@@@%                        \n" + //
                "                          %%%#%%%%%%%%%%#%%%%+*+==*--+-:-===-:::::::::::-====+******+=-----*=-=*%%%%%%%%%%%%@@@:*#%%@%%%%%%%#%###%%%%%%%%##*%#%%%@@@%#@@@@@@@%@@%@%%%%%%%%@@@@%                           \n" + //
                "                             %%%%%@%%%%%%%%%%***#*==*--*-:--=::::::-:::::::---:----==%=++==:=::+***#***##%%@%#%%%#:%###*#**#**#%%%%%%%%%###%#@%%@@@%%@@@@@@@@%%%%%%%@@%@%@%                               \n" + //
                "                                  %%%%%%%%%%%#####%*=**-=+---=-::--:::::::::--:=##+---++===++*+*%%%%##*#*####+:###.-*********%%%%%%%%%%%%%%%@%@@@@%@@@@@@@%%@@@@%@@@%%                                    \n" + //
                "                                       %@%%%%%##%%#%%#+**=*=-==---:::::--::-#*+::::::::::::--:-:*##%%%%%%%#*#*====********#%%%%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@%%%                                        \n" + //
                "                                             %%%%%%%%%%%#*#+*+==--:::::::--::::::::::::::::::::-************#*#%%#**#***#%%%%%%%%%@%%%%@@@@@@@@@@@@@@@@@@@@@@@@@%                                         \n" + //
                "                                                    #%%%%%%##**==-::-::::::-:::::::::::::--::::*********#*************%%%%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@                                                 \n" + //
                "                                                           %%%#+===--::::::::-::::::::::::::---#####*#*****#*******##%%#%%%%%%%%@@@%@@@@@@@@@@@@@                                                         \n" + //
                "                                                                ==----:::-::::::::::::::::-::-:#####*********#**###%#%%%%%%%%%%@@@@@@@@@@@@@                                                              \n" + //
                "                                                                 ==----:::-:::::::::::::---:--:   .**##****###*###%%%%%%%%%%%%@@@@@@@@@@@@                                                                \n" + //
                "                                                                  ==----:--:-::-**+*+***:       :#************#%%%%%%%%%%%%%@@@@@@@@@@@@@@                                                                \n" + //
                "                                                                  =-==-----:::=***-:-=----===-=#####***##****%%%%%%%%%%%%%%@%@@@@@@@@@@@@                                                                 \n" + //
                "                                                                   -==-=-----:=#######%%=#**=-=%%##*#%#######%%%%%%%%%%%%%%@@@@@@@@@@@@@                                                                  \n" + //
                "                                                                    -====-:--------=#%##%%%%=-%###%##%%#%%%%%%%%%%%%%%%%%%@@@@@@@@@@@@@#                                                                  \n" + //
                "                                                                    --===-----%%%%=+%%#%*#%%+%%%%##%%%%%%%%%%%%%%%%%%%%%@@@@@@@@@@@%%%#                                                                   \n" + //
                "                                                                     =---------*%%%#*=--------#%%%##%%%%%%%%%%%%%%%%%%%@@@@@@@@@@%%%##                                                                    \n" + //
                "                                                                     -=------------#*%*=%*%=#-###%%%%%%%%%%%%%%%%%%%%%%%@@@@@@@@%@%%#                                                                     \n" + //
                "                                                                     --=----------=====-=-----%%%#%%%%%%%%%%%%%%%@%%%@@@@@@@@%@%#@##                                                                      \n" + //
                "\n" + //
                "");
    }
    public static void menu(){
        asciiArt();
        System.out.println("Welcome to Matrix Operations App");
        System.out.println("By: Başar Çelebi, Emircan Çapkan, Göktuğ Ateş & Umut Aytuğ Semerci ");
        System.out.println("\nChoose an option: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Scalar Multiplication");
        System.out.println("6. Transpose of a matrix");
        System.out.println("7. Inverse of a matrix");
        System.out.println("8. Trace of a matrix");
        System.out.println("9. Adjoint of a matrix");
        System.out.println("10. Orthogonal matrix");
        System.out.println("11. Exit");
        System.out.print("Your choice: ");
        try(Scanner input = new Scanner(System.in)){
            if (input.hasNextInt()) {
                int choice = input.nextInt();
                if(check_is_numeric(choice)){
                switch (choice) {
                case 1:
                    clearTerminal();
                    addition();
                    break;
                case 2:
                    clearTerminal();
                    subtraction();
                    break;
                case 3:
                    clearTerminal();
                    multiplication();
                    break;
                case 4:
                    clearTerminal();
                    division();
                    break;
                case 5:
                    clearTerminal();             
                    // code for scalar multiplication
                    returnMenu();
                    break;
                case 6:
                    clearTerminal();
                    // code for transpose
                    returnMenu();
                    break;
                case 7:
                    clearTerminal();
                    inverse();
                    returnMenu();
                    break;
                case 8:
                    clearTerminal();
                    trace();
                    returnMenu();
                    break;
                case 9:
                    clearTerminal();
                    // code for adjoint
                    returnMenu();
                    break;
                case 10:
                    clearTerminal();
                    orthogonal();
                    returnMenu();
                    break;
                case 11:
                    clearTerminal();
                    System.out.println("Exiting...");
                    System.exit(0);
                    input.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
                }

            } else {
                System.err.println("An input error occurred, please enter a number value!");
                menu();
            }         
            
        }    
    }
    public static void returnMenu(){
        System.out.println("What do you want to do next?");
        System.out.println("1. Return to main menu");
        System.out.println("2. Exit");
        System.out.print("Your choice: ");
        try(Scanner input = new Scanner(System.in)){
            int choice = input.nextInt();
            if(check_is_one_or_two(choice)){
                switch (choice) {
                    case 1:
                        menu();
                        break;
                    case 2:
                        clearTerminal();
                        System.out.println("Exiting...");
                        System.exit(0);
                        input.close();
                        break;
                }
            }
            else{
                System.out.println("Invalid choice. Please try again.");
                returnMenu();
            }
        }
    }
    public static boolean check_is_numeric(int a){
        if(a >= 1 && a <= 11){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean check_is_one_or_two(int a){
        if(a == 1 || a == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean check_matrix_limits(Integer a, Integer b){
        if(a >= 2 && a <= 5 && b >= 2 && b <= 5){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void addition(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = input.nextInt();
        if(!check_is_numeric(rows)){
            System.out.println("Invalid input. Please try again.");
            addition();
        }
        System.out.print("Enter the number of columns of the matrices: ");
        int columns = input.nextInt();
        if(!check_is_numeric(columns)){
            System.out.println("Invalid input. Please try again.");
            addition();
        }
        if(check_matrix_limits(rows, columns)){
            double[][] matrix1 = new double[rows][columns];
            double[][] matrix2 = new double[rows][columns];
            double[][] resultMatrix = new double[rows][columns];
            System.out.println("Enter the elements of the first matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    matrix1[i][j] = input.nextDouble();
                }
            }
            System.out.println("Enter the elements of the second matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    matrix2[i][j] = input.nextDouble();
                }
            }
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("The result of the addition is: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The size of the matrix has to be between 2x2 and 5x5");
        }
        returnMenu();
    }
    public static void subtraction(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = input.nextInt();
        if(!check_is_numeric(rows)){
            System.out.println("Invalid input. Please try again.");
            subtraction();
        }
        System.out.print("Enter the number of columns of the matrices: ");
        int columns = input.nextInt();
        if(!check_is_numeric(columns)){
            System.out.println("Invalid input. Please try again.");
            subtraction();
        }
        if(check_matrix_limits(rows, columns)){
            double[][] matrix1 = new double[rows][columns];
            double[][] matrix2 = new double[rows][columns];
            double[][] resultMatrix = new double[rows][columns];
            System.out.println("Enter the elements of the first matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    matrix1[i][j] = input.nextDouble();
                }
            }
            System.out.println("Enter the elements of the second matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    matrix2[i][j] = input.nextDouble();
                }
            }
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            System.out.println("The result of the subtraction is: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The size of the matrix has to be between 2x2 and 5x5");
        }
        returnMenu();
    }
    public static void multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = input.nextInt();
        if(!check_is_numeric(rows)){
            System.out.println("Invalid input. Please try again.");
            multiplication();
        }
        System.out.print("Enter the number of columns of the matrices: ");
        int columns = input.nextInt();
        if(!check_is_numeric(columns)){
            System.out.println("Invalid input. Please try again.");
            multiplication();
        }
        if(check_matrix_limits(rows, columns)){
            double[][] matrix1 = new double[rows][columns];
            double[][] matrix2 = new double[rows][columns];
            double[][] resultMatrix = new double[rows][columns];
            System.out.println("Enter the elements of the first matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    matrix1[i][j] = input.nextDouble();
                }
            }
            System.out.println("Enter the elements of the second matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    matrix2[i][j] = input.nextDouble();
                }
            }
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    resultMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
                }
            }
            System.out.println("The result of the multiplication is: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
        }}else{
            System.out.println("The size of the matrix has to be between 2x2 and 5x5");
        }
        returnMenu();
    }
    public static void division(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of rows of the matrices: ");
            int rows = input.nextInt();
            if(!check_is_numeric(rows)){
                System.out.println("Invalid input. Please try again.");
                division();
            }
            System.out.print("Enter the number of columns of the matrices: ");
            int columns = input.nextInt();
            if(!check_is_numeric(columns)){
                System.out.println("Invalid input. Please try again.");
                division();
            }
            if(check_matrix_limits(rows, columns)){
                double[][] matrix1 = new double[rows][columns];
                double[][] matrix2 = new double[rows][columns];
                double[][] resultMatrix = new double[rows][columns];
                System.out.println("Enter the elements of the first matrix: ");
                for(int i=0; i<rows; i++){
                    for(int j=0; j<columns; j++){
                        matrix1[i][j] = input.nextDouble();
                    }
                }
                System.out.println("Enter the elements of the second matrix: ");
                for(int i=0; i<rows; i++){
                    for(int j=0; j<columns; j++){
                        matrix2[i][j] = input.nextDouble();
                    }
                }
                for(int i=0; i<rows; i++){
                    for(int j=0; j<columns; j++){
                        resultMatrix[i][j] = matrix1[i][j] / matrix2[i][j];
                    }
                }
                System.out.println("The result of the division is: ");
                for(int i=0; i<rows; i++){
                    for(int j=0; j<columns; j++){
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println();
            }} else{
                System.out.println("The size of the matrix has to be between 2x2 and 5x5");
            }
            returnMenu();
    }
	
    public static void scalarMultiplication(){

    }
	
    public static void transpose(){
	    Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns of the matrices: ");
        int columns = input.nextInt();
        System.out.println("Enter the elements of the first matrix: ");
        double matrix[][] = new double[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                matrix[i][j] = input.nextDouble();
            }
        }
        double temp[][] = new double[columns][rows];
        for(int i = 0; i < columns; i++)
        {
            for(int j = 0; j < rows; j++)
            {
                temp[i][j] = matrix[j][i];
            }
        }

        printResult(matrix, rows, columns);
        System.out.println();
        printResult(temp, columns, rows);
    }
    public static void printResult(double[][] matrix, int rows, int columns){
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
/*-------------------------------------------------------------------------------------------------------------------------------------*/
    public static void inverse(){
    	//In order to take inverse a matrix, it has to be square!
        Scanner input=new Scanner(System.in);
        int rows;
        int columns;
        //If the rows and columns not the same, ask to the user to enter the size again.
        do{
            System.out.print("Enter the number of rows of the matrices: ");
            rows = input.nextInt();
            System.out.print("Enter the number of columns of the matrices: ");
            columns = input.nextInt();
            if(rows!=columns){
                System.out.println("The matrix has to be square like 2x2, 3x3 etc.\n");
            }
        }while(rows!=columns);
        System.out.printf("The size is %dx%d\n\n",rows,columns);
        double [][]matrix=new double[rows][columns];
        System.out.println("Please enter the values to the matrix:\n");
        //Entering the values
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("Row %d",i+1);
                System.out.printf(" - Column %d :\n",j+1);
                matrix[i][j]=input.nextDouble();
            }
            System.out.println();
        }
        int n = matrix.length;
        double[][] augmentedMatrix = new double[n][2*n];
        
        // Create an augmented matrix [matrix | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatrix[i][j] = matrix[i][j];
                augmentedMatrix[i][j+n] = (i == j) ? 1 : 0;
            }
        }
        // Apply Gauss-Jordan elimination
        for (int i = 0; i < n; i++) {
            double pivot = augmentedMatrix[i][i];
            for (int j = 0; j < 2*n; j++) {
                augmentedMatrix[i][j] /= pivot;
            }
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmentedMatrix[k][i];
                    for (int j = 0; j < 2*n; j++) {
                        augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
                    }
                }
            }
        }
        // Extract the inverse matrix
        double[][] inverseMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverseMatrix[i][j] = augmentedMatrix[i][j+n];
            }
        }
        System.out.printf("You have entered the following matrix:\n");     
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("%.1f\t", matrix[i][j]);
            }
            System.out.println("\n");
        }
        System.out.printf("The inverse of a matrix is:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.1f\t", inverseMatrix[i][j]);
            }
            System.out.println("\n");
        }
    }
/*-------------------------------------------------------------------------------------------------------------------------------------*/
    public static void trace(){
	//The trace of a square matrix is the sum of its diagonal entries.
        Scanner input=new Scanner(System.in);
        int rows;
        int columns;
        //If the rows and columns not the same, ask to the user to enter the size again.
        do{
            System.out.print("Enter the number of rows of the matrices: ");
            rows = input.nextInt();
            System.out.print("Enter the number of columns of the matrices: ");
            columns = input.nextInt();
            if(rows!=columns){
                System.out.println("The matrix has to be square like 2x2, 3x3 etc.\n");
            }
        }while(rows!=columns);
        System.out.printf("The size is %dx%d\n\n",rows,columns);
        //Creating matrix
        double [][]matrix=new double[rows][columns];
        System.out.println("Please enter the values to the matrix:\n");
        //Entering the values
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("Row %d",i+1);
                System.out.printf(" - Column %d :\n",j+1);
                matrix[i][j]=input.nextDouble();
            }
            System.out.println();
        }
        //Printing matrix
        System.out.println("You have entered the following matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("%.1f\t", matrix[i][j]);
            }
            System.out.println("\n");
        }
        //Calculating the trace.
        double sum=0;
        for(int i=0;i<rows;i++){
            sum+=matrix[i][i];
        }
        System.out.printf("The trace of the matrix is: %.2f\n\n",sum);
    }
    public static void adjoint(){
    }
    /* An orthogonal matrix is a specially defined square matrix such as, 2x2, 3x3, 4x4 etc. . */
    public static void orthogonal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns of the matrices: ");
        int columns = input.nextInt();
        System.out.print("Enter the elements of the matrix: ");
        double matrix[][] = new double[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                matrix[i][j] = input.nextDouble();
            }
        }
        // firstly, we should check row and column numbers. If there is no equality, this means the matrix is not orthogonal.
        if (rows != columns)
        {
            System.out.println("The matrix is not an orthogonal matrix!");
            return;
        }
		// Secondly, we should create nested for loop to find the transpose of the matrix.
		double [][]transpose = new double[columns][rows];
		for (int i = 0; i < columns; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                transpose[i][j] = matrix[j][i];
            }
        }
        /* -- TODO -- : We should compare the equality of the inverse matrix and transpose matrix */
        int n = matrix.length;
        double[][] augmentedMatrix = new double[n][2*n];
        // Create an augmented matrix [matrix | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatrix[i][j] = matrix[i][j];
                augmentedMatrix[i][j+n] = (i == j) ? 1 : 0;
            }
        }
        // Apply Gauss-Jordan elimination
        for (int i = 0; i < n; i++) {
            double pivot = augmentedMatrix[i][i];
            for (int j = 0; j < 2*n; j++) {
                augmentedMatrix[i][j] /= pivot;
            }
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmentedMatrix[k][i];
                    for (int j = 0; j < 2*n; j++) {
                        augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
                    }
                }
            }
        }
        // Extract the inverse matrix
        double[][] inverseMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverseMatrix[i][j] = augmentedMatrix[i][j+n];
            }
        }
        if(inverseMatrix == transpose)
        {
            System.out.println("The matrix is an orthogonal matrix!");
            return;
        }
		/* To find the product of the input matrix and its transpose, we coded this 3 for loops. */
        // We declared new matrix that is called product in order to store product results.
		double [][]product = new double[rows][columns];
		for (int i = 0; i < rows; i++) 
		{
            
			for (int j = 0; j < columns; j++) 
			{
		
				int sum = 0; // we declared a variable for the sum of the products. In every iterations, it will start from zero.
				for (int k = 0; k < columns; k++) 
				{
					// To multiply the input matrix and its transpose, we created this operation.
					sum += (matrix[i][k] * transpose[k][j]);
				}
			
				product[i][j] = sum;
			}
		}
		/* Now we should check our product matrix. If it is identity matrix, our main matrix must be orthogonal. If not, it cannot be an orthogonal matrix. To check the product matrix, we should create a nested for loop again. */ 
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++) 
			{
				if (i != j && product[i][j] != 0)
                {
                    System.out.println("The matrix is not an orthogonal matrix!");
                    return;
                }else if (i == j && product[i][j] != 1)
                {
                    System.out.println("The matrix is not an orthogonal matrix!");
                    return;
                }	
			}
		}
        // If there is no problem until this code line, our input matrix must be an orthogonal matrix.
		System.out.println("The matrix is an orthogonal matrix!");
    }
    public static void clearTerminal(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
            }
        } catch (Exception ex) {
            System.out.println("Error while clearing terminal: " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        menu();
    }
    // _____________________
    // |Group 21           |
    // |Başar Çelebi       |
    // |Emircan Çapkan     |
    // |Göktuğ Ateş        |
    // |Umut Aytuğ Semerci |
    // |___________________|
}
