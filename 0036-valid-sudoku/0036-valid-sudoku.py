class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        def val(board, a, b, c):
            cnt=0
            for i in range(0,9):
                if board[a][i] == c:
                    cnt=cnt+1
                if board[i][b] == c:
                    cnt=cnt+1
                if board[3 * (a // 3) + i // 3][3 * (b // 3) + i % 3] == c:
                    cnt=cnt+1
            return cnt==3

        for i in range(9):
            for j in range(9):
                if board[i][j] != '.':
                    k = board[i][j]
                    if not val(board, i, j, k):
                        return False
        return True
