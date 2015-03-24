import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharacterTile extends Tile {
    protected char symbol;
    private static Map<Character, Character> charMap;
    static
    {
        Map<Character, Character> aMap = new HashMap<>();
        aMap.put('1','\u4E00');
        aMap.put('2','\u4E8C');
        aMap.put('3','\u4E09');
        aMap.put('4','\u56DB');
        aMap.put('5','\u4E94');
        aMap.put('6','\u516D');
        aMap.put('7','\u4E03');
        aMap.put('8','\u516B');
        aMap.put('9','\u4E5D');
        aMap.put('N','\u5317');
        aMap.put('E','\u6771');
        aMap.put('W','\u897F');
        aMap.put('S','\u5357');
        aMap.put('C','\u4E2D');
        aMap.put('F','\u767C');
        aMap.put('A','\u842C');
        charMap = Collections.unmodifiableMap(aMap);
    }

    public CharacterTile(char symbol)
    {
        this.symbol = symbol;
        setToolTipText(toString());
    }

    public boolean matches(Tile other)
    {
        if(!super.matches(other))
            return false;
        CharacterTile otherCharacterTile = (CharacterTile)other;
        return (symbol == otherCharacterTile.symbol);
    }

    public String toString()
    {
        switch (symbol)
        {
            case 'N':
                return "North Wind";
            case 'E':
                return "East Wind";
            case 'W':
                return "West Wind";
            case 'S':
                return "South Wind";
            case 'C':
                return "Red Dragon";
            case 'F':
                return "Green Dragon";
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return "Character "+symbol;
            default:
                return "Unknown Character";
        }
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Font f;
        FontMetrics fm;
        int wid, wid2;
        Graphics2D g2 = (Graphics2D)g;
        Color red = new Color(236, 84, 81);
        Color green = new Color(66, 195, 108);

        int v = Character.getNumericValue(symbol);
        if(v > 9 || v < 1)
        {
            //Wind or Dragon Tile
            g2.setColor(Color.BLACK);
            if(symbol == 'C')
            {
                g2.setColor(red);
            }
            if(symbol == 'F')
            {
                g2.setColor(green);
            }
            f = g2.getFont().deriveFont(50F);
            g2.setFont(f);
            fm = g2.getFontMetrics();
            wid = fm.stringWidth(Character.toString(charMap.get(symbol)));
            g2.drawString(Character.toString(charMap.get(symbol)),
                    tilePerspective + (tileSize / 2) - (wid/2),54);
        }
        else
        {
            // CharacterTile
            f = g2.getFont().deriveFont(25F);
            g2.setFont(f);
            fm = g2.getFontMetrics();
            wid = fm.stringWidth(Character.toString(charMap.get(symbol)));
            g2.drawString(Character.toString(charMap.get(symbol)),
                    tilePerspective + (tileSize / 2) - (wid / 2), 27);

            g2.setColor(red);
            wid = fm.stringWidth(Character.toString(charMap.get('A')));
            g2.drawString(Character.toString(charMap.get('A')),
                    tilePerspective + (tileSize / 2) - (wid/2),56);
        }

        g2.setColor(red);
        f = g2.getFont().deriveFont(12F);
        g2.setFont(f);
        fm = g2.getFontMetrics();
        wid2 = fm.stringWidth(Character.toString(symbol));
        g2.drawString(Character.toString(symbol),
                (tilePerspective) + (tileSize/2) + (wid2/2) + 13, 15);
    }

    public static void main(String[] args)
    {
        JFrame		frame = new JFrame();
        JPanel		tiles = new JPanel();
        JScrollPane	scroller = new JScrollPane(tiles);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Character Tiles");
        frame.add(scroller);

        // Try something like this if your tiles don't fit on the screen.
        // Replace "tile width" and "tile height" with your values.
        //scroller.setPreferredSize(new Dimension(8 * tile width, 40 + tile height));

        tiles.add(new CharacterTile('1'));
        tiles.add(new CharacterTile('2'));
        tiles.add(new CharacterTile('3'));
        tiles.add(new CharacterTile('4'));
        tiles.add(new CharacterTile('5'));
        tiles.add(new CharacterTile('6'));
        tiles.add(new CharacterTile('7'));
        tiles.add(new CharacterTile('8'));
        tiles.add(new CharacterTile('9'));
        tiles.add(new CharacterTile('N'));
        tiles.add(new CharacterTile('E'));
        tiles.add(new CharacterTile('W'));
        tiles.add(new CharacterTile('S'));
        tiles.add(new CharacterTile('C'));
        tiles.add(new CharacterTile('F'));

        frame.pack();
        frame.setVisible(true);
    }
}
