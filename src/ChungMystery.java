import java.awt.*;

public class ChungMystery {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private int currentX = 400;
    private int currentY = 400;

    public ChungMystery(int x, int y,int xa, int ya, int xb, int yb, int xc, int yc){
        pointA.setLocation(new Point(xa,ya));
        pointB.setLocation(new Point(xb,yb));
        pointC.setLocation(new Point(xc,yc));
    }
    public void draw(Graphics g2){

        int midX;
        int midY;
        for (int i = 0; i < 1000; i++) {
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
            g2.drawLine(currentX, currentY, currentX + 1, currentY);
        }
    }
}
