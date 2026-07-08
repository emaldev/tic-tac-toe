public class Main{
    public static void main(String[] args){
        Player player1 = new Player("Emal", 'x');
        Player player2 = new Player("Milad", 'y');


        //creat object in border 
        Board board = new Board();
        board.fillBoard();
        board.printBoard();
    }
}