import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public  class GameController {
    static JFrame mainWindow;
    public static JFrame getMainWindow() {
        return mainWindow;
    }

    public static void setMainWindow(JFrame window ) {
      mainWindow = window;
    }


    static Map<String, JPanel> panels = new HashMap<>();

    public static void addPanel(JPanel jPanel,String id){
        panels.put(id,jPanel);
    }

    public static JPanel getPanel(String id){
        return panels.get(id);
    }
}
