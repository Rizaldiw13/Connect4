public class Board {
    private static final int rows = 6;
    private static final int cols = 7;
    private final Token[][] board = new Token[rows][cols];
    private boolean isConnected;

    public Board() {
        resetBoard();
        this.isConnected = false;
    }

    public void resetBoard(){
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                board[row][col] = null;
            }
        }
    }

    public void printBoard(){
        for(int row = 0; row < rows; row++){
            System.out.print("|");
            for(int col = 0; col < cols; col++){
                if(board[row][col] == null){
                    System.out.print("_");
                }
                else{
                    System.out.print(board[row][col].getColor());
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean insertToken(Token theToken, int theRow, int theCol){
        boolean result = false;
        if(theCol < cols && theRow < rows) { //Can separate into a different function
            if (board[theRow][theCol] == null) {
                        board[theRow][theCol] = theToken;
                        result = true;
            } else {
                System.out.print("Token can't be inserted. This spot is filled \n");
            }

        }
        return result;
    }

    public boolean isItConnected(){ //check for the winning condition
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                //check if the spot is not empty (i.e: there is a token there)
                if(board[row][col] != null) {
                    //check horizontally
                    if (board[row][col] == board[row][col + 1] && board[row][col + 1] == board[row][col + 2] && board[row][col + 2] == board[row][col + 3]) {
                        isConnected = true;
                    }
                    //check vertically
                    else  {
                        isConnected = false;
                    }
                    //check diagonally
                }
            }
        }
        return isConnected;
    }

}
