import javax.swing.*;

public class PongWindow extends JFrame {
    Menu menu = new Menu();
    Game game = new Game();


    public PongWindow() {
        GameController.addPanel(menu,"menu");
        GameController.addPanel(game,"game");
        menu.mainFrame = this;
        setTitle("Pong");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 200, Consts.WIDTH / 2, Consts.HEIGHT / 2);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        add(menu);

    }

    public void startGame() {
        getContentPane().remove(menu);
        getContentPane().add(game);
        validate();
    }
}
