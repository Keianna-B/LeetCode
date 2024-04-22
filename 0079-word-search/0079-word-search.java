public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] wordArr = word.toCharArray();
        boolean[][] visited = new boolean[m][n];
        boolean result = false;
         for(int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if(backtrack(board,wordArr,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean backtrack(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        if(row < 0 || col < 0 || row >= board.length | col >= board[0].length || board[row][col] != word[index] || board[row][col] == ' ' ) {
            return false;
        }
        char curr = board[row][col];
        board[row][col] = ' ';
        boolean up = backtrack(board, word, row + 1, col, index + 1);
        boolean down = backtrack(board, word, row - 1, col, index + 1);
        boolean right = backtrack(board, word, row, col + 1 , index + 1);
        boolean left = backtrack(board, word, row, col - 1, index + 1);
        board[row][col] = curr;
        return up || down || right || left;
}
