public class Board{
    char[][] board;
    
    // ساختن constractor برای باردر
    public Board(){
        board = new char[3][3];
        // صفحه 3 * 3 برای بازی داریم 
    }
    public void printBoard(){
        for(int i = 0 ; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void fillBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0;  j < 3; j++){
                board[i][j] = '-';
            }
        }
    }
    public void placeSymbol(int row, int col, char symbol){
        if(row >= 0 && row < 3 && col >= 0 && col < 3)
            if(board[row][col] == '-'){
        board[row][col] = symbol;
            }else{
                System.out.println("This place is already occupied.");
            }
    }
    
}