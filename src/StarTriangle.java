public class StarTriangle {
    int widht;

    public StarTriangle() {
        this.widht = 3;
    }

    public StarTriangle(int width) {
        this.widht = width;
    }
    @Override
    public String toString() {
        String res = "";

        for (int i = 0; i < widht; i++) {
            for (int x = 0; x < i + 1; x++) {
                res += "[*]";
            }
            res += "\n";
        }
        return res;
    }
}
