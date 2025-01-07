class Solution {
    public boolean canMakeSquare(char[][] grid) {
        
        int n = grid.length-1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int count  = 1;

                if (grid[i][j]==grid[i][j+1]) count++;
                if (grid[i][j]==grid[i+1][j]) count++;
                if (grid[i][j]==grid[i+1][j+1]) count++;

                if (count==1 || count==3 || count==4) return true;
            }
        }
        return false;
    }
}