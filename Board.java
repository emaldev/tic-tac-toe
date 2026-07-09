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
    public  boolean chechWinner(){
        if(board[0][0] == board[0][1] &&
           board[0][1] == board[0][2] &&
           board[0][0] != '-'
        ){
            return true;
        }
                
           if(board[1][0] == board[1][1] &&
              board[1][1] == board[1][2] && 
              board[1][0] != '-'
            ) {
                return true;
            }

              if(board[2][0] == board[2][1] && 
                 board[2][1] == board[2][2] && 
                 board[2][0] != '-'
                ) {
                    return true;
                }

                 if(board[0][0] == board[1][0] && 
                    board[1][0] == board[2][0] && 
                    board[0][0] != '-'
                 ) {
                    return true;
                 }
                 
                 if(board[0][1] == board[1][1] && 
                    board[1][1] == board[2][1] && 
                    board[0][1] != '-'
                   ) {
                    return true;
                   }

                    if(board[0][2] == board[1][2] && 
                       board[1][2] == board[2][2] &&
                       board[1][2] != '-'
                    ) {
                        return true;
                    }

                       
                          
                          if(board[0][0] == board[1][1] && 
                             board[1][1] == board[2][2] && 
                             board[0][0] != '-'
                            ){
                                return true;
                            }

                             if(board[0][2] == board[1][1] && 
                                board[1][1] == board[2][0] && 
                                board[0][2] != '-'
                            )  {
                                return true;
                            }


        
         return false;
    }


    
}