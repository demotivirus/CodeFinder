package OOP.theory.Enum.Example_03;

public enum  Color {
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00");
    private String colorCode;

    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }
}
