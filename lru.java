package simulation;

public class lru {
    int Output;

    public lru(int fr, int[] in) {
        int[] frame = new int[fr];
        int[] fs = new int[fr];
        int index = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        int pf = 0;
        int i = 0;
        while (i < fr) {
            frame[i] = -1;
            ++i;
        }
        int j = 0;
        while (j < in.length) {
            flag1 = false;
            flag2 = false;
            int i2 = 0;
            while (i2 < fr) {
                if (frame[i2] == in[j]) {
                    flag1 = true;
                    flag2 = true;
                    break;
                }
                ++i2;
            }
            if (!flag1) {
                i2 = 0;
                while (i2 < fr) {
                    if (frame[i2] == -1) {
                        frame[i2] = in[j];
                        flag2 = true;
                        break;
                    }
                    ++i2;
                }
            }
            if (!flag2) {
                i2 = 0;
                while (i2 < 3) {
                    fs[i2] = 0;
                    ++i2;
                }
                int k = j - 1;
                int l = 1;
                while (l <= fr - 1) {
                    i2 = 0;
                    while (i2 < fr) {
                        if (frame[i2] == in[k]) {
                            fs[i2] = 1;
                        }
                        ++i2;
                    }
                    ++l;
                    --k;
                }
                i2 = 0;
                while (i2 < 3) {
                    if (fs[i2] == 0) {
                        index = i2;
                    }
                    ++i2;
                }
                frame[index] = in[j];
                ++pf;
            }
            ++j;
        }
        this.Output = pf + fr;
    }

    public int method() {
        return this.Output;
    }
}
