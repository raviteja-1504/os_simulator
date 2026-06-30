package simulation;

public class fcfs {
    int[] Output;
    int Output1;

    public fcfs(int head, int[] in) {
        this.Output = new int[in.length + 1];
        this.Output1 = 0;
        this.Output[0] = head;
        int i = 1;
        while (i <= in.length) {
            this.Output[i] = in[i - 1];
            ++i;
        }
        int k = 0;
        int i2 = 1;
        while (i2 < this.Output.length) {
            k = this.Output[i2] - this.Output[i2 - 1];
            if (k < 0) {
                k = - k;
            }
            this.Output1 += k;
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
