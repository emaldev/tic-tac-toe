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
        Player currentPlayer = player1;
        
        board.placeSymbol(row, col, player1.symbol);
        board.printBoard();
        while(true){
            System.out.println(currentPlayer.name + "s Turn");
         System.out.print("Enter row: ");
         row = input.nextInt();
        System.out.print("Enter column: ");
         col = input.nextInt();
        if(board.placeSymbol(row, col, currentPlayer.symbol)){
          board.printBoard();
        
        

        if(board.chechWinner()){
            System.out.println(currentPlayer.name + "Wins!");
            break;
            

        }
        if(board.isBoardFull()){
            System.out.println("Draw!");
            break;
        }
        
        if(currentPlayer == player1){
            currentPlayer = player2;
        }else{
            currentPlayer = player1;
        }

        }
    }
    
    
       
    }
}