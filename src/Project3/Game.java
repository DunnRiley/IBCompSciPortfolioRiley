package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel{
    JButton[] buttons = new JButton[9];
    private boolean x = true;

    int [][] array = {
            //X,Y grid for the values of buttonClicked.getX() and buttonClicked.gety()
            // [0,1],[95,1],[190,1]
            // [0,88],[95,88],[190,88]
            // [0,175],[95,175],[190,175]
            //{x,y,z} x is the x vale, y is the y value, Z is a variable to do the win function
            {0,1,10},{95,1,11},{190,1,3}, {0,88,4},{95,88,5},{190,88,6},{0,175,7},{95,175,8},{190,175,9}
    };

    public Game(){
        this.setLayout(new GridLayout(3,3));
        for (JButton b : buttons){
            b = new JButton();
            b.addActionListener(new ButtonListener());
            this.add(b);

        }
    }
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttonClicked = (JButton) e.getSource();
            if (x){
                int [][] current = {
                        {buttonClicked.getX(),buttonClicked.getY(),0}
                };
                for (int j = 0; j < 9; j++) {
                    if(array[j][0] == current[0][0]&&array[j][1] == current[0][1]){
                        if(array[j][2]==1||array[j][2]==2){break;}
                        else {
                            array[j][2] = 1;
                            buttonClicked.setText("X");
                            x = false;
                        }
                    }
                }
            } else{
                int [][] current = {
                        {buttonClicked.getX(),buttonClicked.getY(),0}
                };
                for (int j = 0; j < 9; j++) {
                    if(array[j][0] == current[0][0]&&array[j][1] == current[0][1]){
                        if(array[j][2]==1||array[j][2]==2){break;}
                        else {
                            array[j][2] = 2;
                            buttonClicked.setText("O");
                            x = true;
                        }
                    }
                }
            }
            if(array[0][2]==array[1][2] && array[1][2]==array[2][2]){ if(array[0][2]==1){ System.out.println("X wins"); endGame();}else if(array[0][2]==2){ System.out.println("O wins");endGame();}
            }else if(array[3][2]==array[4][2] && array[4][2]==array[5][2]){ if(array[3][2]==1){ System.out.println("X wins");endGame();}else if(array[3][2]==2){ System.out.println("O wins");endGame();}
            }else if(array[6][2]==array[7][2] && array[7][2]==array[8][2]){if(array[6][2]==1){ System.out.println("X wins"); endGame();}else if(array[6][2]==2){ System.out.println("O wins"); endGame();}
            }else if(array[0][2]==array[3][2] && array[3][2]==array[6][2]){ if(array[0][2]==1){ System.out.println("X wins"); endGame();}else if(array[0][2]==2){ System.out.println("O wins"); endGame();}
            }else if(array[1][2]==array[4][2] && array[4][2]==array[7][2]) { if(array[1][2]==1){ System.out.println("X wins");endGame(); }else if(array[1][2]==2){ System.out.println("O wins"); endGame();}
            }else if(array[2][2]==array[5][2] && array[5][2]==array[8][2]) { if(array[2][2]==1){ System.out.println("X wins");endGame(); }else if(array[2][2]==2){ System.out.println("O wins"); endGame();}
            }else if(array[0][2]==array[4][2] && array[4][2]==array[8][2]) { if(array[0][2]==1){ System.out.println("X wins");endGame(); }else if(array[0][2]==2){ System.out.println("O wins"); endGame();}
            }else if(array[2][2]==array[4][2] && array[4][2]==array[6][2]) { if(array[2][2]==1){ System.out.println("X wins"); endGame();}else if(array[2][2]==2){System.out.println("O wins"); endGame(); }
            }else{
                System.out.println("No one wins");
            }
        }
    }
    public void endGame(){

    }
}
