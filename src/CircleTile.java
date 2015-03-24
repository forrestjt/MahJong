import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CircleTile extends RankTile {

    private ArrayList<Circle> circles;
    Color red, green, blue;

    public CircleTile(int rank) {
        super(rank);
        circles = new ArrayList<>();
        red = new Color(236, 84, 81);
        green = new Color(66, 195, 108);
        blue = new Color(71, 68, 203);
        switch (rank) {
            case 1:
                circles.add(new PancakeCircle(tilePerspective+(tileSize/2),(tileSize/2), (tileSize/2) - 4));
                break;
            case 2:
                circles.add(new Circle(tilePerspective+(tileSize/2),(tileSize/4),(tileSize/4) - 2, red));
                circles.add(new Circle(tilePerspective+(tileSize/2),(3*tileSize/4),(tileSize/4) - 2, blue));
                break;
            case 3:
                circles.add(new Circle(tilePerspective+(tileSize/4)-2,(tileSize/4)-2,(tileSize/6), blue));
                circles.add(new Circle(tilePerspective+(2*tileSize/4),(2*tileSize/4),(tileSize/6), red));
                circles.add(new Circle(tilePerspective+(3*tileSize/4)+2,(3*tileSize/4)+2,(tileSize/6), green));
                break;
            case 4:
                circles.add(new Circle(tilePerspective+(tileSize/4),(tileSize/4),(tileSize/4) - 2, blue));
                circles.add(new Circle(tilePerspective+(tileSize/4),(3*tileSize/4),(tileSize/4) - 2, green));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(tileSize/4),(tileSize/4) - 2, green));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(3*tileSize/4),(tileSize/4) - 2, blue));
                break;
            case 5:
                circles.add(new Circle(tilePerspective+(tileSize/5),(tileSize/5),(tileSize/5) - 2, blue));
                circles.add(new Circle(tilePerspective+(tileSize/5),(4*tileSize/5),(tileSize/5) - 2, green));
                circles.add(new Circle(tilePerspective+(4*tileSize/5),(tileSize/5),(tileSize/5) - 2, green));
                circles.add(new Circle(tilePerspective+(4*tileSize/5),(4*tileSize/5),(tileSize/5) - 2, blue));
                circles.add(new Circle(tilePerspective+(tileSize/2),(tileSize/2),(tileSize/5) - 2, red));
                break;
            case 6:
                circles.add(new Circle(tilePerspective+(tileSize/4),(tileSize/4) - 4,(tileSize/6), green));
                circles.add(new Circle(tilePerspective+(tileSize/4),(2*tileSize/4),(tileSize/6), red));
                circles.add(new Circle(tilePerspective+(tileSize/4),(3*tileSize/4) + 4,(tileSize/6), red));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(tileSize/4) - 4,(tileSize/6), green));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(2*tileSize/4),(tileSize/6), red));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(3*tileSize/4) + 4,(tileSize/6), red));
                break;
            case 7:
                circles.add(new Circle(tilePerspective+(tileSize/6),(2*tileSize/10),(tileSize/8) - 2, green));
                circles.add(new Circle(tilePerspective+(3*tileSize/6),(3*tileSize/10),(tileSize/8) - 2, green));
                circles.add(new Circle(tilePerspective+(5*tileSize/6),(4*tileSize/10),(tileSize/8) - 2, green));

                circles.add(new Circle(tilePerspective+(2*tileSize/7),(6*tileSize/10),(tileSize/8) - 2, red));
                circles.add(new Circle(tilePerspective+(5*tileSize/7),(6*tileSize/10),(tileSize/8) - 2, red));
                circles.add(new Circle(tilePerspective+(2*tileSize/7),(9*tileSize/11),(tileSize/8) - 2, red));
                circles.add(new Circle(tilePerspective+(5*tileSize/7),(9*tileSize/11),(tileSize/8) - 2, red));
                break;
            case 8:
                circles.add(new Circle(tilePerspective+(tileSize/4),(2*tileSize/16),(tileSize/8) - 2, blue));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(2*tileSize/16),(tileSize/8) - 2, blue));
                circles.add(new Circle(tilePerspective+(tileSize/4),(6*tileSize/16),(tileSize/8) - 2, blue));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(6*tileSize/16),(tileSize/8) - 2, blue));
                circles.add(new Circle(tilePerspective+(tileSize/4),(10*tileSize/16),(tileSize/8) - 2, blue));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(10*tileSize/16),(tileSize/8) - 2, blue));
                circles.add(new Circle(tilePerspective+(tileSize/4),(14*tileSize/16),(tileSize/8) - 2, blue));
                circles.add(new Circle(tilePerspective+(3*tileSize/4),(14*tileSize/16),(tileSize/8) - 2, blue));
                break;
            case 9:
                circles.add(new Circle(tilePerspective+(tileSize/6)+2,(tileSize/6)+2,(tileSize/6), green));
                circles.add(new Circle(tilePerspective+(3*tileSize/6),(tileSize/6)+2,(tileSize/6), green));
                circles.add(new Circle(tilePerspective+(5*tileSize/6)-2,(tileSize/6)+2,(tileSize/6), green));

                circles.add(new Circle(tilePerspective+(tileSize/6)+2,(3*tileSize/6),(tileSize/6), red));
                circles.add(new Circle(tilePerspective+(3*tileSize/6),(3*tileSize/6),(tileSize/6), red));
                circles.add(new Circle(tilePerspective+(5*tileSize/6)-2,(3*tileSize/6),(tileSize/6), red));

                circles.add(new Circle(tilePerspective+(tileSize/6)+2,(5*tileSize/6)-2,(tileSize/6), blue));
                circles.add(new Circle(tilePerspective+(3*tileSize/6),(5*tileSize/6)-2,(tileSize/6), blue));
                circles.add(new Circle(tilePerspective+(5*tileSize/6)-2,(5*tileSize/6)-2,(tileSize/6), blue));
//                circles.add(new Circle(tilePerspective+(3*tileSize/6),(3*tileSize/6),(tileSize/6), Color.GREEN));
//                circles.add(new Circle(tilePerspective+(5*tileSize/6),(5*tileSize/6),(tileSize/6), Color.GREEN));
                break;
        }
        setToolTipText(toString());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Circle c : circles)
        {
            c.draw(g);
        }
    }

    public String toString() {
        return "Circle " + rank;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Circle Tiles");

        frame.add(new CircleTile(1));
        frame.add(new CircleTile(2));
        frame.add(new CircleTile(3));
        frame.add(new CircleTile(4));
        frame.add(new CircleTile(5));
        frame.add(new CircleTile(6));
        frame.add(new CircleTile(7));
        frame.add(new CircleTile(8));
        frame.add(new CircleTile(9));

        frame.pack();
        frame.setVisible(true);
    }

    class Circle
    {
        protected int x, y, r;
        protected Color color;
        Circle(int x, int y, int r, Color color)
        {
            this.x = x; this.y = y; this.r = r;
            this.color = color;
        }
        public void draw(Graphics g)
        {
            Color prevColor = g.getColor();
            g.setColor(color);
            g.fillOval(x - r, y - r, r * 2, r * 2);
            g.setColor(Color.WHITE);
            // Draw x over circle
            int rSm = r - 3;
            double c = (rSm * Math.cos(Math.PI / 4)), s = (rSm * Math.sin(Math.PI / 4));
            g.drawLine((int)Math.round(x + c), (int)Math.round(y - s),
                       (int)Math.round(x - c), (int)Math.round(y + s));
            g.drawLine((int)Math.round(x - c), (int)Math.round(y - s),
                       (int)Math.round(x + c), (int)Math.round(y + s));

            g.setColor(prevColor);
        }
    }
    class PancakeCircle extends Circle
    {
        private int outerRadius;
        PancakeCircle(int x, int y, int r)
        {
            super(x,y, r/4, red);
            outerRadius = r;
        }

        @Override
        public void draw(Graphics g)
        {
            Color prevColor = g.getColor();

            g.setColor(green);
            g.fillOval(x - outerRadius, y - outerRadius, outerRadius * 2, outerRadius * 2);
            g.setColor(Color.BLACK);
            g.drawOval(x - outerRadius, y - outerRadius, outerRadius * 2, outerRadius * 2);

            // Draw border of circles
            g.setColor(Color.WHITE);
            int cRad = outerRadius - 6, cSmallRad = 2;
            int n = (int)Math.round((cRad*Math.PI)/(cSmallRad*2));
            for(double t=0;t<(2*Math.PI);t+=((2*Math.PI)/n))
            {
                g.fillOval((int)Math.round((x + cRad*Math.cos(t)) - cSmallRad),
                           (int)Math.round((y - cRad*Math.sin(t)) - cSmallRad), cSmallRad * 2, cSmallRad * 2);
            }

            // Draw Center Circle with x
            g.setColor(color);
            g.fillOval(x - r, y - r, r * 2, r * 2);
            g.setColor(Color.WHITE);
            g.drawOval(x - r, y - r, r * 2, r * 2);
            // Draw x over circle
            int rSm = r - 3;
            double c = (rSm * Math.cos(Math.PI / 4)), s = (rSm * Math.sin(Math.PI / 4));
            g.drawLine((int)Math.round(x + c), (int)Math.round(y - s),
                       (int)Math.round(x - c), (int)Math.round(y + s));
            g.drawLine((int)Math.round(x - c), (int)Math.round(y - s),
                       (int)Math.round(x + c), (int)Math.round(y + s));
            g.setColor(prevColor);
        }
    }
}
