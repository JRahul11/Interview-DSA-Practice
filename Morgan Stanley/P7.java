// 4 4  No of users and no of relations
// 1 2
// 2 3
// 2 4
// 3 4
// Return the no of users which could isolate atleast one other user when removed


class P7 {

    public static void main(String[] args)
    {
        int users = 4;
        int[][] matrix={{0, 1, 0, 0},
                        {1, 0, 1, 1}, 
                        {0, 1, 0, 1},
                        {0, 1, 1, 0}};
        
        int count = 0;
        
        for(int k=0; k<users; k++)
        {
            int sum = 0;
            for(int i=0; i<users; i++)
            {
                sum = 0;
                for(int j=0; j<users; j++)
                {
                    if (i == k)
                        break;
                    if (j != k)
                        sum = sum + matrix[i][j];
                }
                if(sum == 0 && i != k)
                    count++;
            }
        }
        System.out.println(count);
    }
}