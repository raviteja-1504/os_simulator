package simulation;

import java.util.Arrays;

public class cscan {
    int[] Output;
    int Output1;

    public cscan(int head, int[] in) {
        int i;
        int j;
        this.Output = new int[in.length + 3];
        this.Output1 = 0;
        int[] temp = new int[in.length + 1];
        int i2 = 0;
        while (i2 < in.length) {
            temp[i2] = in[i2];
            ++i2;
        }
        temp[in.length] = head;
        int index = 0;
        Arrays.sort(temp);
        int i3 = 0;
        while (i3 < temp.length) {
            if (temp[i3] == head) {
                index = i3;
                break;
            }
            ++i3;
        }
        if (head <= 100) {
            j = 0;
            i = index;
            while (i >= 0) {
                this.Output[j] = temp[i];
                ++j;
                --i;
            }
            this.Output[j] = 0;
            this.Output[j + 1] = 200;
            j += 2;
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
            this.Output[j] = 200;
            this.Output[j + 1] = 0;
            j += 2;
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
