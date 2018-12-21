import javax.swing.*;
import java.awt.*;

/**
 * Created by michael_hopps on 9/25/17.
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Chung Mystery");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 1440;
        int height = 900;
        frame.setPreferredSize(new Dimension(width, height+24));
        //smile smile = new smile(1,1,1, );

        JPanel panel = new GraphicsPanel(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
