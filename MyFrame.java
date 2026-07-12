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
        });
            this.add(buttons[index]);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700, 700);

        this.setVisible(true);
    }
    
}
