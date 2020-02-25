public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRowPractice(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("}");

    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int [][] mat, int row){
            for (int k : mat[row]) {
                if(k%2 != 0)
                    return false;
            }
        return true;
    }

    //returns true if the sum of the numbers the given col is odd.
    public boolean oddColSum(int[][] nums, int col){
        int colSum = 0;
        for(int i = 0; i < nums.length; i++){
            colSum += nums[i][col];
        }
        return(colSum%2 != 0);
    }

    public int[] minRowPractice(int[][] nums){
        int min = nums[0][0];
        int[] minPos = null;
        for(int i = 0; i < nums.length; i++){
            for(int k = 0; k < nums[i].length; k++){
                if(nums[i][k] < min) {
                    min = nums[i][k];
                    minPos = nums[i];
                }
            }
        }
        return minPos;
    }

    public int minRowAssignment(int[][] nums, int row){
        int min = nums[row][0];
        for(int i : nums[row]){
            if(i < min)
                min = i;
        }
        return min;
    }

    public int[] colMaxs(int[][] matrix){
        int max = 0;
        int[] maxArr = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            max = matrix[i][0];
            for(int k = 0; k < matrix[i].length; k++){
                if(matrix[i][k] > max)
                    max = matrix[i][k];
                maxArr[i] = max;
            }
        }
        return maxArr;
    }

    public int[] allRowSums(int[][] data){
        int rowSum = 0;
        int[] rowSumArr = new int[data.length];
        for(int i = 0; i < data.length; i++){
            rowSum = 0;
            for(int k = 0; k < data[i].length; k++){
                rowSum += data[i][k];
            }
            rowSumArr[i] = rowSum;
        }
        return rowSumArr;
    }

    public double[] averageCol(int[][] nums){
        int colSum = 0;
        double colAvg = 0;
        double[] colAvgArr = new double[nums[0].length];
        for(int i = 0; i < nums[0].length; i++){
            colSum = 0;
            colAvg = 0;
            for(int k = 0; k < nums.length; k++){
                colSum += nums[k][i];
                colAvg = (double) colSum/nums.length;
            }
            colAvgArr[i] = colAvg;
        }
        return colAvgArr;
    }

    public int smallEven(int[][] matrix){
        int result = Integer.MAX_VALUE;
        for(int[] i : matrix){
            for(int k : i){
                if(k < result && k%2 == 0){
                    result = k;
                }
            }
        }
        return result;
    }

    public static int biggestRow(int[][] nums){
        int bigRowIndex = 0;
        int rowSum = 0;
        int rowMax = 0;
        for (int i = 0; i < nums.length; i++) {
            rowSum = 0;
            for (int j = 0; j < nums[i].length ; j++) {
                rowSum += nums[i][j];
            }
            if(rowSum > rowMax){
                rowMax = rowSum;
                bigRowIndex = i;
            }
        }
        return bigRowIndex;
    }









}
