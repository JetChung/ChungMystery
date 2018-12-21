import javax.swing.*;
import java.awt.*; 

public class GraphicsPanel extends JPanel{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private int currentX = 400;
    private int currentY = 400;
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

       // ChungMystery chungMystery = new ChungMystery(10,50,500,300,180,12,15,89);

        //chungMystery.draw(g2);
        Point pointA = new Point(100,800);
        Point pointB = new Point(1340,800);
        Point pointC = new Point(720, 50);

        //    Point pointC = new Point((int)(Math.random())*1440,(int)(Math.random())*900);

            int midX;
            int midY;
            for (int i = 0; i < 10000; i++) {
                double x = Math.random();
                if (x <= 1.0 / 3) {
                    midX = (currentX + pointA.x) / 2;
                    midY = (currentY + pointA.y) / 2;

                } else if (x < 2.0 / 3 && x > 1.0 / 3) {
                    midX = (currentX + pointB.x) / 2;
                    midY = (currentY + pointB.y) / 2;
                } else {
                    midX = (currentX + pointC.x) / 2;
                    midY = (currentY + pointC.y) / 2;
                }
                currentX = midX;
                currentY = midY;
                int intensity = (int)(Math.random()*255);
                g2.setColor(getRandomColor(intensity));
                g2.drawLine(currentX, currentY, currentX , currentY+1);
            }
        }



    public GraphicsPanel(int width, int height){
        setSize(width,height);


    }

    public Color getRandomColor(int intensity){

        int red = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        Color color = new Color(red,blue,green,intensity);
        return color;
    }



}