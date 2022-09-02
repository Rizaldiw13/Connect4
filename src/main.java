public class main {
    public static void main(String[] args) {
        System.out.println("---------------CONNECT FOUR----------------");
        System.out.println("Creating a new board");
        Board connect4 = new Board();
        Token red1 = new Token("red");
        connect4.printBoard();
        System.out.println();
        System.out.println("Adding a red token to row 0, column 0");
        connect4.insertToken(red1,0,0);
        connect4.printBoard();
        System.out.println();
        System.out.println("Adding a red token to row 0, column 1");
        connect4.insertToken(red1,0,1);
        connect4.printBoard();
        System.out.println();
        System.out.println("Adding a red token to row 0, column 2");
        connect4.insertToken(red1,0,2);
        connect4.printBoard();
        System.out.println();
        System.out.println("Adding another red token to row 0, column 0");
        connect4.insertToken(red1,0,0);
        connect4.printBoard();
        System.out.println();
        System.out.println("Adding another red token to row 0, column 3");
        connect4.insertToken(red1,0,3);
        connect4.printBoard();
        System.out.println("Checking if red is connected");
        System.out.println(connect4.isItConnected());

    }

}
