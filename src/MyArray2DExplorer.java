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
        int maxArr []
    }









}
