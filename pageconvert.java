package simulation;

public class pageconvert {
    int n;
    int[] h;

    public pageconvert(String s) {
        String[] ele = s.split("\\s+");
        this.n = ele.length;
        this.h = new int[this.n];
        int i = 0;
        while (i < this.n) {
            this.h[i] = Integer.parseInt(ele[i].trim());
            ++i;
        }
    }

    public int[] method1() {
        return this.h;
    }
}