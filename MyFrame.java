import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JOptionPane;

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

        JLabel title = new JLabel("TIC TAC TOE");
        title.setBounds(180, 20, 400, 50);
        title.setFont(new Font("Arial", Font.BOLD, 35));
        title.setForeground(Color.BLUE);

        this.getContentPane().setBackground(new Color(230,240,255));
         this.add(title);
        this.setVisible(true);
    }

    public void checkWinner(){
        

        if(!buttons[0].getText().equals("")&&
            buttons[0].getText().equals(buttons[1].getText())&&
             buttons[1].getText().equals(buttons[2].getText())){
               winner(buttons[0].getText());
             }

             if(!buttons[3]. getText().equals("") &&
                 buttons[3].getText().equals(buttons[4].getText()) && 
                buttons[4]. getText().equals(buttons[5].getText())){
                   winner(buttons[3].getText());
                }

                if(!buttons[6].getText().equals("") && 
                    buttons[6].getText().equals(buttons[7].getText()) && 
                     buttons[7].getText().equals(buttons[8].getText())){
                        winner(buttons[6].getText());
                     }
                     if(!buttons[0].getText().equals("") && 
                         buttons[0].getText().equals(buttons[3].getText()) && 
                        buttons[3].getText().equals(buttons[6].getText())){
                           winner(buttons[0].getText());
                        }
                     if(!buttons[1].getText().equals("") && 
                       buttons[1].getText().equals(buttons[4].getText()) && 
                       buttons[4].getText().equals(buttons[7].getText())){
                        winner(buttons[1].getText());
                     }

                     if(!buttons[2].getText().equals("") && 
                         buttons[2].getText().equals(buttons[5].getText()) && 
                          buttons[5].getText().equals(buttons[8].getText())){
                            winner(buttons[2].getText());
                          }
                          // قطر اصلی
                             if(!buttons[0].getText().equals("") &&
                               buttons[0].getText().equals(buttons[4].getText()) &&
                                 buttons[4].getText().equals(buttons[8].getText())){

                                    winner(buttons[0].getText());
                                      }

// قطر دوم
                                    if(!buttons[2].getText().equals("") &&
                                         buttons[2].getText().equals(buttons[4].getText()) &&
                                         buttons[4].getText().equals(buttons[6].getText())){

                                          winner(buttons[2].getText());
                                              }

                     

                     

        

    }
  public void winner(String player){

    JOptionPane.showMessageDialog(this, player + " Wins!");

    for(int i = 0; i < 9; i++){
        buttons[i].setEnabled(false);
    }

    int choice = JOptionPane.showConfirmDialog(
            this,
            "Play Again?",
            "Restart",
            JOptionPane.YES_NO_OPTION
    );

    if(choice == JOptionPane.YES_OPTION){

        for(int i = 0; i < 9; i++){
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }

        xTurn = true;
    }else{
        System.exit(0);
    }
}
}
