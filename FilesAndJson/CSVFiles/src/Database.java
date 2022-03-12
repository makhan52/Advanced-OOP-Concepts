public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
        String[] rows = contents.split("\n");
        this.colNames = rows[0].split(",");
        int numCols = this.colNames.length;
        this.numRows = rows.length - 1;
        this.data = new String[this.numRows][numCols];
        for (int i = 1; i < this.numRows; i++)
            this.data[i - 1] = rows[i].split(",");
    }

    public String getValue(String columnName, int row) {
        int index = -1;
        for (int i = 0; i < this.colNames.length; i++)
            if (this.colNames[i].equals(columnName)) {
                index = i;
                break;
            }
        return this.data[row][index];
    }
}