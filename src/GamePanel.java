import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

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
    Random random = new Random();
    this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    this.setBackground(Color.black);
    this.setFocusable(true);
    this.addKeyListener(new MyKeyAdapter());

    startGame();
  }
  public void startGame(){
    newApple();
    boolean running = true;
    Timer timer = new Timer(DELAY, this);
    timer.start();
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    draw(g);
  }
  public void draw(Graphics g){
    for(int i=0; i <SCREEN_HEIGHT/UNIT_SIZE;i++){
      g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
    }
  }
  public void newApple(){

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
