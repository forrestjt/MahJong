import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class BambooTile extends RankTile {

    ArrayList<Bamboo> bambooFigures;

    public BambooTile(int rank)
    {
        super(rank);
        bambooFigures = new ArrayList<>();

        Color red = new Color(236, 84, 81);
        Color green = new Color(66, 195, 108);
        Color blue = new Color(71, 68, 203);

        switch(rank)
        {
            case 2:
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/2, (tileSize/3)-2, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/2, (2*tileSize/3)+2, tileSize/4, green));
                break;
            case 3:
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/2, (tileSize/3)-2, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (2*tileSize/3)+2, tileSize/4, green));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (2*tileSize/3)+2, tileSize/4, green));
                break;
            case 4:
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (tileSize/3)-2, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (tileSize/3)-2, tileSize/4, green));

                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (2*tileSize/3)+2, tileSize/4, green));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (2*tileSize/3)+2, tileSize/4, blue));
                break;
            case 5:
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/5, (tileSize/3)-2, tileSize/4, green));
                bambooFigures.add(new Bamboo(tilePerspective + 4*tileSize/5, (tileSize/3)-2, tileSize/4, blue));

                bambooFigures.add(new Bamboo(tilePerspective + tileSize/5, (2*tileSize/3)+2, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 4*tileSize/5, (2*tileSize/3)+2, tileSize/4, green));

                bambooFigures.add(new Bamboo(tilePerspective + tileSize/2, tileSize/2, tileSize/4, red));
                break;

            case 6:
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (tileSize/3)-2, tileSize/4, green));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/4, (tileSize/3)-2, tileSize/4, green));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (tileSize/3)-2, tileSize/4, green));

                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (2*tileSize/3)+2, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/4, (2*tileSize/3)+2, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (2*tileSize/3)+2, tileSize/4, blue));
                break;
            case 7:
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (2*tileSize/4), tileSize/4, green));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/4, (2*tileSize/4), tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (2*tileSize/4), tileSize/4, green));

                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (3*tileSize/4)+4, tileSize/4, green));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/4, (3*tileSize/4)+4, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (3*tileSize/4)+4, tileSize/4, green));


                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/4, (tileSize/4)-4, tileSize/4, red));
                break;
            case 8:
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/5-4, (tileSize/3)-2, tileSize/4, green));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/5-4, (tileSize/3)-2, tileSize/4, green, Math.PI/4));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/5+4, (tileSize/3)-2, tileSize/4, green, -Math.PI/4));
                bambooFigures.add(new Bamboo(tilePerspective + 4*tileSize/5+4, (tileSize/3)-2, tileSize/4, green));

                bambooFigures.add(new Bamboo(tilePerspective + tileSize/5-4, (2*tileSize/3)+2, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/5-4, (2*tileSize/3)+2, tileSize/4, blue, -Math.PI/4));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/5+4, (2*tileSize/3)+2, tileSize/4, blue, Math.PI/4));
                bambooFigures.add(new Bamboo(tilePerspective + 4*tileSize/5+4, (2*tileSize/3)+2, tileSize/4, blue));
                break;
            case 9:
                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (2*tileSize/4), tileSize/4, red));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/4, (2*tileSize/4), tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (2*tileSize/4), tileSize/4, green));

                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (3*tileSize/4)+4, tileSize/4, red));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/4, (3*tileSize/4)+4, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (3*tileSize/4)+4, tileSize/4, green));

                bambooFigures.add(new Bamboo(tilePerspective + tileSize/4, (tileSize/4)-4, tileSize/4, red));
                bambooFigures.add(new Bamboo(tilePerspective + 2*tileSize/4, (tileSize/4)-4, tileSize/4, blue));
                bambooFigures.add(new Bamboo(tilePerspective + 3*tileSize/4, (tileSize/4)-4, tileSize/4, green));
                break;
        }
        setToolTipText(toString());
    }

    public String toString()
    {
        return "Bamboo "+rank;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for(Bamboo b : bambooFigures)
        {
            b.draw(g);
        }
    }

    public static void main(String[] args)
    {
        JFrame	frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bamboo Tiles");

        frame.add(new BambooTile(2));
        frame.add(new BambooTile(3));
        frame.add(new BambooTile(4));
        frame.add(new BambooTile(5));
        frame.add(new BambooTile(6));
        frame.add(new BambooTile(7));
        frame.add(new BambooTile(8));
        frame.add(new BambooTile(9));

        frame.pack();
        frame.setVisible(true);
    }

    class Bamboo
    {
        int x, y, h;
        Color color;
        double rotation;

        public Bamboo(int x, int y, int h, Color color)
        {
            this(x, y, h, color, 0);
        }

        public Bamboo(int x, int y, int h, Color color, double rotation)
        {
            this.x = x; this.y = y; this.color = color;
            this.h = h; this.rotation = rotation;
        }

        public void draw(Graphics g)
        {
            int w = Math.round(h/4), rx = Math.round(x - (w / 2)), ry = Math.round(y - (h/2));
            int a = Math.round(h/8), ha = Math.round(a/2);

            Graphics2D g2 = (Graphics2D)g;
            g2.rotate(rotation, x, y);

            g.setColor(color);
            System.out.println("a is "+a);
            g.fillRect(rx, ry, w, h);

            g.drawLine(rx - ha, ry, rx + w + ha, ry);
            g.fillRect(rx - a, ry, w + a*2, a);


            ry += (2*Math.round((h + a)/2)) - 2;
            g.drawLine(rx - ha, ry, rx + w + ha, ry);
            g.fillRect(rx - a, ry, w + a*2, a);


            //Highlight
            g.setColor(Color.WHITE);
            g.fillRect(x, (ry - h) + 2, 1, h - 2);

            g.setColor(color);
            ry -= Math.round((h + a)/2);
            g.drawLine(rx - ha, ry, rx + w + ha, ry);
            g.fillRect(rx - a, ry, w + a*2, a);

            g2.rotate(-rotation, x, y);
        }
    }

}
