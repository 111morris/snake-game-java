import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.random.*;

public class GamePanel extends JPanel implements ActionListener {
  static final int SCREEN_WIDTH = 600;
  static final int SCREEN_HEIGHT = 600;
  static final int UNIT_SIZE = 25;
  static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
  static final int DELAY = 75;

  final int x[] = new int[GAME_UNITS];
  final int y[] = new int[GAME_UNITS];
  int bodyParts = 6;
  int appleX;
  int appleY;
  char direction = 'R';

  GamePanel(){
    random = new Random();
    this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    this.setBackground(Color.black);
    this.setFocusable(true);
    this.addKeyListener(new MyKeyAdapter());

    startGame();
  }
  public void startGame(){

  }
  public void paintComponent(Graphics g){

  }
  public void draw(){

  }
  public void move() {

  }
  public void checApple(){

  }
  public void checkCollisions(){

  }
  public void gameOver(ActionEvent e){

  }
  @Override
  public void actionPerformed(ActionEvent actionEvent) {

  }

  public class MyKeyAdapter extends KeyAdapter{

    @Override
    public void keyPressed(KeyEvent e) {

    }
  }
}
