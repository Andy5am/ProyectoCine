public class Seats {
    int row;
    int column;
    Boolean taken;

    public Seats(int row, int column) {
        this.row = row;
        this.column = column;
        this.taken = false;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "" +this.row +this.column;
    }
}