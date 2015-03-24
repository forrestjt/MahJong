import javax.swing.*;
import java.awt.*;

public abstract class PictureTile extends Tile {
    private String name;
    private ImageIcon image;
    private int margin;

    public PictureTile(String name)
    {
        this.name = name;
        margin = 2;
        setToolTipText(toString());
        image = new ImageIcon("images/" + name + ".png");
        image = new ImageIcon(image.getImage().getScaledInstance(tileSize-(margin*2), tileSize-(margin*2), Image.SCALE_SMOOTH));

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image.getImage(), tilePerspective+margin, margin, this);
    }

    public String toString()
    {
        return name;
    }

    public static void main(String[] args)
    {
        JFrame	frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Picture Tiles");

        frame.add(new Bamboo1Tile());

        frame.add(new FlowerTile("Chrysanthemum"));
        frame.add(new FlowerTile("Orchid"));
        frame.add(new FlowerTile("Plum"));
        frame.add(new FlowerTile("Bamboo"));

        frame.add(new SeasonTile("Spring"));
        frame.add(new SeasonTile("Summer"));
        frame.add(new SeasonTile("Fall"));
        frame.add(new SeasonTile("Winter"));

        frame.pack();
        frame.setVisible(true);
    }


}
