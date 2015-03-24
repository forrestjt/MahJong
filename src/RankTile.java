public abstract class RankTile extends Tile {
    protected int rank;

    public RankTile(int rank)
    {
        this.rank = rank;
    }

    public boolean matches(Tile other)
    {
        if (!super.matches(other))
            return false;
        RankTile otherRankTile = (RankTile)other;
        return (rank == (otherRankTile.rank));
    }
}
