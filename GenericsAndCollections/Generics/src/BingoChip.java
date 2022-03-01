public class BingoChip<T1, T2> {
    private T1 itemOne;
    private T2 itemTwo;

    public BingoChip(T1 itemOne, T2 itemTwo) {
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
    }
    @Override
    public String toString() {
        return "Chip:" + itemOne + "-" + itemTwo;
    }
}

