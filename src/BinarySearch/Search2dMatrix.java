package BinarySearch;

public class Search2dMatrix {
    public static void main(String[] args) {
    }

    //search for the target element in a 2-D matrix/array
    public boolean searchMatrix(int[][] matrix, int target){
        int rows = matrix.length; //no. of rows
        int cols = matrix[0].length; //no of columns

        int start = 0;
        int end = rows*cols-1; //last element of the 2D array

        while(start<=end){
            int mid = start + (end-start)/2;

            //converting this mid to [row][col]
            int row = mid/cols;
            int col = mid%cols;

            if(matrix[row][col]==target){
                return true;
            }
            if(target>matrix[row][col]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
