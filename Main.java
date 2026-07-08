import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = input.nextInt();
        System.out.print("Enter column: ");
        int col = input.nextInt();
        Player player1 = new Player("Emal", 'x');
        Player player2 = new Player("Milad", 'y');


        //creat object in border 
        Board board = new Board();
        board.fillBoard();
        
        board.placeSymbol(row, col, player1.symbol);
        board.printBoard();
        
         System.out.print("Enter row: ");
         row = input.nextInt();
        System.out.print("Enter column: ");
         col = input.nextInt();
        board.placeSymbol(row, col, player2.symbol);
        board.printBoard();
       
    }
}