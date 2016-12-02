package simulation;

import java.util.Arrays;

public class look {
    int[] Output;
    int Output1;

    public look(int head, int[] in) {
        int i;
        this.Output = new int[in.length + 1];
        this.Output1 = 0;
        int[] temp = new int[in.length];
        int start = 0;
        int i2 = 0;
        while (i2 < in.length) {
            temp[i2] = in[i2];
            ++i2;
        }
        Arrays.sort(temp);
        start = head < 100 ? 0 : 199;
        int j = 0;
        int k = 0;
        int i3 = 0;
        while (i3 < temp.length) {
            if (temp[i3] < head) {
                k = ++j;
            }
            ++i3;
        }
        int p = 0;
        if (start == 0) {
            if (head != 0 && head != 199) {
                this.Output[p] = head;
                ++p;
            }
            i = j - 1;
            while (i >= 0) {
                if (temp[i] != 0 && temp[i] != 199) {
                    this.Output[p] = temp[i];
                    ++p;
                }
                --i;
            }
            if (start != 0 && start != 199) {
                this.Output[p] = start;
                ++p;
            }
            i = k;
            while (i < temp.length) {
                if (temp[i] != 0 && temp[i] != 199) {
                    this.Output[p] = temp[i];
                    ++p;
                }
                ++i;
            }
        } else {
            if (head != 0 && head != 199) {
                this.Output[p] = head;
                ++p;
            }
            i = k;
            while (i < temp.length) {
                if (temp[i] != 0 && temp[i] != 199) {
                    this.Output[p] = temp[i];
                    ++p;
                }
                ++i;
            }
            if (start != 0 && start != 199) {
                this.Output[p] = start;
                ++p;
            }
            i = j - 1;
            while (i >= 0) {
                if (temp[i] != 0 && temp[i] != 199) {
                    this.Output[p] = temp[i];
                    ++p;
                }
                --i;
            }
        }
        int h = 0;
        int i4 = 1;
        while (i4 < this.Output.length) {
            h = this.Output[i4] - this.Output[i4 - 1];
            if (h < 0) {
                h = - h;
            }
            this.Output1 += h;
            ++i4;
        }
    }

    public int[] method() {
        return this.Output;
    }

    public int method3() {
        return this.Output1;
    }
}
