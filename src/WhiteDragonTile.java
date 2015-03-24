import javax.swing.*;
import java.awt.*;

public class WhiteDragonTile extends Tile
{
    private int margin;

    public WhiteDragonTile()
    {
        setToolTipText(toString());
        margin = 8;
    }

	public String toString()
	{
		return "White Dragon";
	}

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int outerSize = Math.round(tileSize - (margin*2));
        int thickness = Math.round(tileSize / 12);
        int innerSize = Math.round(outerSize - (thickness * 2));
        Color blue = new Color(71, 68, 203);

        g.setColor(blue);
        g.drawRect(tilePerspective + margin, margin, outerSize, outerSize);
        g.drawRect(tilePerspective + margin + thickness, margin + thickness, innerSize, innerSize);

        // Top
        g.fillRect(tilePerspective+margin, margin, outerSize/6, thickness);
        g.fillRect(Math.round(tilePerspective+margin + 2*outerSize/6), margin, outerSize/6, thickness);
        g.fillRect(Math.round(tilePerspective+margin + 4*outerSize/6), margin, outerSize/6, thickness);

        // Bottom
        g.fillRect(tilePerspective+margin, innerSize + thickness + margin, outerSize/6, thickness);
        g.fillRect(Math.round(tilePerspective+margin + 2*outerSize/6), innerSize + thickness + margin, Math.round(outerSize/6), thickness);
        g.fillRect(Math.round(tilePerspective+margin + 4*outerSize/6), innerSize + thickness + margin, Math.round(outerSize/6), thickness);

        // Left
        g.fillRect(tilePerspective+margin, Math.round(margin+thickness + innerSize/5), thickness, Math.round(innerSize/5));
        g.fillRect(tilePerspective+margin, Math.round(margin+thickness + 3*innerSize/5), thickness, Math.round(innerSize/5));

        // Rignt
        g.fillRect(tilePerspective+margin+thickness+innerSize, margin+thickness, thickness, innerSize/5);
        g.fillRect(tilePerspective+margin+thickness+innerSize, Math.round(margin+thickness + 2*innerSize/5), thickness, Math.round(innerSize/5));
        g.fillRect(tilePerspective+margin+thickness+innerSize, Math.round(margin+thickness + 4*innerSize/5), thickness, Math.round(innerSize/5));

    }

    public static void main(String[] args)
    {
        JFrame	frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bamboo 1 Tile");

        frame.add(new WhiteDragonTile());

        frame.pack();
        frame.setVisible(true);
    }
}

