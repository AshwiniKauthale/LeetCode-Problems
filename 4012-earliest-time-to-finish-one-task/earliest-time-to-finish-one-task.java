class Solution {
    public int earliestTime(int[][] tasks)
    {
        int i = 0; 
        int j = 0;
        int currtime = 0;
        int mintime = Integer.MAX_VALUE;

        for(i = 0; i < tasks.length; i++)
        {
            currtime = 0;
            for(j = 0; j < tasks[0].length; j++)
            {
                currtime = currtime + tasks[i][j];
            }

            mintime = Math.min(currtime,mintime);
        }

        return mintime;
    }
}