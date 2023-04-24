public class Main {
    public static void main(String[] args) {
        PongWindow window =  new PongWindow();
        GameController.setMainWindow(window);
        window.setVisible(true);
    }
}
