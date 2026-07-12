import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    JButton[] buttons = new JButton[9];
    boolean xTurn = true;
    MyFrame(){

        
        for(int i = 0; i < 9; i++){
            int index = i;
            buttons[index] = new JButton();
            int row = index / 3;
            int col = index % 3;
            
            int x = 100 + col * 100;
            int y = 100 + row * 100;

            buttons[index].setBounds(x, y, 100, 100);
            buttons[index].addActionListener(e -> {
                if (!buttons[index].getText().equals("")) {
                return;
                    }
                if(xTurn){
                    buttons[index].setText("X");
                xTurn = false;

            }else{
                buttons[index].setText("O");
                xTurn = true;
            }
             checkWinner();
        });

            this.add(buttons[index]);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700, 700);

        this.setVisible(true);
    }

    public void checkWinner(){
        

        if(!buttons[0].getText().equals("")&&
            buttons[0].getText().equals(buttons[1].getText())&&
             buttons[1].getText().equals(buttons[2].getText())){
                System.out.println(buttons[0].getText() + "Wins!");
             }

             if(!buttons[3]. getText().equals("") &&
                 buttons[3].getText().equals(buttons[4].getText()) && 
                buttons[4]. getText().equals(buttons[5].getText())){
                    System.out.println(buttons[3].getText() + "Wins!");
                }

                if(!buttons[6].getText().equals("") && 
                    buttons[6].getText().equals(buttons[7].getText()) && 
                     buttons[7].getText().equals(buttons[8].getText())){
                        System.out.println(buttons[6].getText() + "Wins!");
                     }

        

    }
    
}
