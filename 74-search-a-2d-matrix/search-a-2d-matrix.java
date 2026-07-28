class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        boolean bFlag = false;
        int i = 0;
        int j = 0;

        for(i = 0; i < matrix.length; i++)
        {
            for(j = 0; j < matrix[i].length && bFlag == false; j++)
            {
                if(matrix[i][j] == target)
                {
                    bFlag = true;
                    break;
                }
            }
        }   

        return bFlag; 
    }
}