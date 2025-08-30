class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isRowsValid(board) && isColsValid(board) && isSquareValid(board);
    }

    public boolean isRowsValid(char[][]board){
        HashSet <Character> values= new HashSet <Character>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(Character.isDigit(board[i][j]) && values.contains(board[i][j])){
                    return false;
                }
                values.add(board[i][j]);
                
            }
            values.clear();
        }
        return true;
    }

    public boolean isColsValid(char [][] board){
        HashSet <Character> values= new HashSet <Character>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(Character.isDigit(board[j][i]) && values.contains(board[j][i])){
                    return false;
                }
                values.add(board[j][i]);
            }
            values.clear();
        }
        return true;
    }

    public boolean isSquareValid(char [][] board){
        
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                if(!testGrid(i, j, board)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean testGrid(int row, int col, char [][]board){
        HashSet <Character> values= new HashSet <Character>();
        for(int i=row; i< row+3; i++){
            for(int j=col; j< col+3; j++){
                if(Character.isDigit(board[i][j]) && values.contains(board[i][j])){
                    return false;
                }
                values.add(board[i][j]);
            }
        }
        return true;
    }
}