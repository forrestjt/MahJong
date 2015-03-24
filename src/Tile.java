
import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel
{

    protected int tileSize = 65;
    protected int tilePerspective = 16;
    private double scale;

    public Tile()
    {
        scale = Toolkit.getDefaultToolkit().getScreenResolution() / 96;
        setPreferredSize(new Dimension((int)((tileSize + tilePerspective) * scale),(int)((tileSize + tilePerspective) * scale)));
    }

    public boolean matches(Tile other)
    {
        if(other == null)
            return false;
        return (this.getClass() == other.getClass());
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.scale(scale,scale);
        GradientPaint	grad = new GradientPaint(tilePerspective, tileSize, Color.WHITE,
                tilePerspective + tileSize, 0, new Color(252, 230, 201));
        g2.setPaint(grad);
        g.fillRect(tilePerspective, 0, tileSize, tileSize);

        // lightgreen: (0,235,0)
        // darkgreen: (0, 115, 0)
        GradientPaint	grad2 = new GradientPaint(0, tilePerspective + tileSize, new Color(63, 244, 138),
                tilePerspective + tileSize, 0, new Color(71, 128, 66));

        // Left
        Polygon		p0 = new Polygon();
        p0.addPoint(tilePerspective, 0);
        p0.addPoint(tilePerspective / 2, (tilePerspective / 2));
        p0.addPoint(tilePerspective / 2, ((tilePerspective / 2) + tileSize));
        p0.addPoint(tilePerspective, tileSize);

        Polygon		p1 = new Polygon();
        p1.addPoint(tilePerspective / 2, (tilePerspective / 2));
        p1.addPoint(0, (tilePerspective));
        p1.addPoint(0, (tilePerspective + tileSize));
        p1.addPoint(tilePerspective / 2, ((tilePerspective / 2) + tileSize));

        // Bottom
        Polygon		p2 = new Polygon();
        p2.addPoint(tilePerspective, tileSize);
        p2.addPoint((tilePerspective / 2), (tilePerspective / 2) + tileSize);
        p2.addPoint(((tilePerspective / 2) + tileSize), ((tilePerspective / 2) + tileSize));
        p2.addPoint(tilePerspective + tileSize, tileSize);

        Polygon		p3 = new Polygon();
        p3.addPoint(tilePerspective / 2, ((tilePerspective / 2) + tileSize));
        p3.addPoint(0, (tilePerspective + tileSize));
        p3.addPoint(tileSize, (tilePerspective + tileSize));
        p3.addPoint(((tilePerspective / 2) + tileSize), ((tilePerspective / 2) + tileSize));

        g2.setPaint(grad);
        g2.fill(p0);
        g2.fill(p2);

        g2.setPaint(grad2);
        g2.fill(p1);
        g2.fill(p3);


        // Draw Outlines

        g2.setPaint(Color.BLACK);
        g.drawPolygon(p0);
        g.drawPolygon(p1);
        g.drawPolygon(p2);
        g.drawPolygon(p3);
        g2.drawRect(tilePerspective, 0, tileSize, tileSize);
    }

    public static void main(String[] args){
        JFrame	frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tile");

        frame.add(new Tile());

        frame.pack();
        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        frame.setLocation(x, y);
        frame.setVisible(true);
    }
}
