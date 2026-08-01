class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c)
    {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        
        int matrix[][] = new int[r][c];

        int i = 0; int j = 0;

        List<Integer>list  = new ArrayList<>();

        for(i = 0; i <= mat.length - 1; i++)
        {
            for(j = 0; j <= mat[i].length - 1; j++)
            {
                list.add(mat[i][j]);
            }
        }
        i = 0;
        j = 0;
        int k = 0;
        
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix[i][j] = list.get(k);
                k++;
            }
        }

        return matrix;

    }
}