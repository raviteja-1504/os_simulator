package simulation;

public class fifo {
    int Output;

    public fifo(int fr, int[] in) {
        int[] a = new int[fr];
        int[] flag = new int[in.length];
        int i = 0;
        while (i < in.length) {
            flag[i] = 0;
            ++i;
        }
        i = 0;
        while (i < fr) {
            a[i] = -1;
            ++i;
        }
        this.Output = 0;
        int j = 0;
        int i2 = 0;
        while (i2 < in.length) {
            boolean k = false;
            int y = 0;
            while (y < fr) {
                if (a[y] == in[i2]) {
                    k = true;
                }
                ++y;
            }
            if (!k) {
                j = 0;
                while (j < fr - 1) {
                    a[j] = a[j + 1];
                    ++j;
                }
                a[j] = in[i2];
                ++this.Output;
            }
            ++i2;
        }
    }

    public int method() {
        return this.Output;
    }
}