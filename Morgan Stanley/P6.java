// Set Matrix Zeroes

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        
        HashSet<Integer> rows = new HashSet<Integer>();
        HashSet<Integer> cols = new HashSet<Integer>();
        
        for(int i=0; i<rowLen; i++)
        {
            for(int j=0; j<colLen; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        for(int i=0; i<rowLen; i++)
        {
            for(int j=0; j<colLen; j++)
            {
                if(rows.contains(i) || cols.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}

// Better Approach without extra space
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        boolean isCol = false;
        
        for(int i = 0; i < rowLen; i++)
        {
            // Check if the first column contains 0 
            if(matrix[i][0] == 0)
            {
                isCol = true;
            }
            
            for(int j = 1; j < colLen; j++)
            {
                // If an elements has 0 then mark its row and column by 0 in their respective first row and column
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        // Update rows and columns
        for(int i = 1; i < rowLen; i++)
        {
            for(int j = 1; j < colLen; j++)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // First row can only be entirely 0 if the [0][0] index is 0
        if(matrix[0][0] == 0) 
        {
            for(int j = 0; j < colLen; j++)
            {
                matrix[0][j] = 0;
            }
        }
        
        // Make first column 0 if isCol is true
        if(isCol)
        {
            for(int i = 0; i < rowLen; i++)
            {
                matrix[i][0] = 0;
            }
        }
        
    }
}