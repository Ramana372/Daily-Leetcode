class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) board[i][j] = '.';
        }
        boolean[] cols = new boolean[n];
        boolean[] diag = new boolean[2 * n - 1];
        boolean[] anti = new boolean[2 * n - 1];
        backtrack(0, n, board, cols, diag, anti, result);
        return result;
    }

    private void backtrack(int row, int n, char[][] board,
                           boolean[] cols, boolean[] diag, boolean[] anti,
                           List<List<String>> result) {
        if (row == n) {
            result.add(constructBoard(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            int d = row - col + n - 1;
            int a = row + col;
            if (cols[col] || diag[d] || anti[a]) continue;
            board[row][col] = 'Q';
            cols[col] = true;
            diag[d] = true;
            anti[a] = true;
            backtrack(row + 1, n, board, cols, diag, anti, result);
            board[row][col] = '.';
            cols[col] = false;
            diag[d] = false;
            anti[a] = false;
        }
    }

    private List<String> constructBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) res.add(new String(row));
        return res;
    }
}
