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
    
}