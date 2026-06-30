package simulation;

import java.util.Arrays;

public class clook {
    int[] Output;
    int Output1;

    public clook(int head, int[] in) {
        int i;
        int j;
        this.Output = new int[in.length + 1];
        int[] temp = new int[in.length + 1];
        this.Output1 = 0;
        int index = 0;
        int i2 = 0;
        while (i2 < in.length) {
            temp[i2] = in[i2];
            ++i2;
        }
        temp[in.length] = head;
        Arrays.sort(temp);
        i2 = 0;
        while (i2 < temp.length) {
            if (temp[i2] == head) {
                index = i2;
                break;
            }
            ++i2;
        }
        if (head <= 100) {
            j = 0;
            i = index;
            while (i >= 0) {
                this.Output[j] = temp[i];
                ++j;
                --i;
            }
            i = temp.length - 1;
            while (i >= index + 1) {
                this.Output[j] = temp[i];
                ++j;
                --i;
            }
        } else {
            j = 0;
            i = index;
            while (i < temp.length) {
                this.Output[j] = temp[i];
                ++j;
                ++i;
            }
            i = 0;
            while (i < index) {
                this.Output[j] = temp[i];
                ++j;
                ++i;
            }
        }
        int h = 0;
        i = 1;
        while (i < this.Output.length) {
            h = this.Output[i] - this.Output[i - 1];
            if (h < 0) {
                h = - h;
            }
            this.Output1 += h;
            ++i;
        }
    }

    public int[] method() {
        return this.Output;
    }

    public int method3() {
        return this.Output1;
    }
}
