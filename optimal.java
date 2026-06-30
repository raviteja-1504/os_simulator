package simulation;

public class optimal {
    int Output;

    public optimal(int fr, int[] in) {
        int hit = 0;
        int miss = 0;
        int min = 100000;
        int minj = 0;
        int[] count = new int[100];
        int i = 0;
        while (i < 100) {
            count[i] = 0;
            ++i;
        }
        int[] page = new int[100];
        i = 0;
        while (i < 100) {
            page[i] = -1;
            ++i;
        }
        i = 0;
        while (i < in.length) {
            count[in[i]] = count[in[i]] + 1;
            ++i;
        }
        i = 0;
        while (i < fr) {
            page[i] = in[i];
            ++i;
        }
        miss = fr;
        i = 0;
        while (i < in.length) {
            boolean status = false;
            int j = 0;
            while (j < fr) {
                if (page[j] == in[i]) {
                    status = true;
                    int[] arrn = count;
                    int n = page[j];
                    arrn[n] = arrn[n] - 1;
                }
                ++j;
            }
            if (status) {
                ++hit;
            } else {
                int k = 0;
                while (k < fr) {
                    if (count[page[k]] < min) {
                        min = count[page[k]];
                        minj = k;
                    }
                    ++k;
                }
                page[minj] = in[i];
                count[page[minj]] = count[page[minj]] - 1;
                ++miss;
            }
            ++i;
        }
        this.Output = miss;
    }

    public int method() {
        return this.Output;
    }
}
