package simulation;

public class sstf {
    int[] Output;
    int Output1;

    public sstf(int head, int[] in) {
        this.Output = new int[in.length + 1];
        this.Output[0] = head;
        this.Output1 = 0;
        int i = 0;
        while (i < in.length) {
            int j = 0;
            int min = 1000;
            int k = 0;
            while (j < in.length) {
                if (in[j] != -1) {
                    int g = this.Output[i] - in[j];
                    if (g < 0) {
                        g = - g;
                    }
                    if (min > g) {
                        min = g;
                        k = j;
                    }
                }
                ++j;
            }
            this.Output[i + 1] = in[k];
            in[k] = -1;
            ++i;
        }
        int p = 0;
        int i2 = 1;
        while (i2 < this.Output.length) {
            p = this.Output[i2] - this.Output[i2 - 1];
            if (p < 0) {
                p = - p;
            }
            this.Output1 += p;
            ++i2;
        }
    }

    public int[] method() {
        return this.Output;
    }

    public int method3() {
        return this.Output1;
    }
}
