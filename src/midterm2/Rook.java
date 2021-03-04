package midterm2;

public class Rook extends Piece {

    public Rook(int row, int column) {
        super(row, column);
    }

    @Override
    public boolean moveValid(int row, int column) {
        /*
         * Make sure we are moving to a different square than we are currently
         * on.
         */
        if (this.getRow() == row && this.getColumn() == column) {
            return false;
        }
        return this.getRow() == row || this.getColumn() == column;
    }

}
