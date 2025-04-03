# Snake Game

A simple Snake game implemented in Java using Swing for the graphical user interface. The game allows the player to control a snake that grows longer each time it eats an apple, while avoiding collisions with the snake's body or the walls.

## Features

- **Snake Movement**: The snake moves in four directions (Up, Down, Left, Right) using arrow keys.
- **Growing Snake**: Each time the snake eats an apple, it grows longer.
- **Game Over**: The game ends when the snake collides with its own body or the wall.
- **Score Display**: The number of apples eaten (score) is displayed at the top.
- **Apple Generation**: Random placement of apples on the screen.

## Requirements

- Java Development Kit (JDK) 8 or higher
- A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)

## How to Run

1. **Clone the repository** (if hosted on a version control platform like GitHub) or simply download the files.

   ```bash
      git clone https://github.com/111morris/snake-game-java.git
      ```
2. **Compile** the Java files:
    - If using an IDE, just open the project and run it.
    - If using the terminal, run the following commands:

      ```bash
      cd snake-game-java/src/
      ```
      ```bash
      javac SnakeGame.java
      java SnakeGame
      ```
3. The game window will appear, and you can start playing by using the arrow keys to control the snake.

## Code Breakdown

### `GameFrame.java`
This class is responsible for setting up the main game window. It inherits from `JFrame` and adds the `GamePanel` to the window. It also configures the window's title, close operation, and visibility.

```java
import javax.swing.*;

public class GameFrame extends JFrame {
  GameFrame(){
     this.add(new GamePanel());
     this.setTitle("Snake");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(false);
     this.pack();
     this.setVisible(true);
     this.setLocationRelativeTo(null);
  }
}
