package simulation;

import java.io.PrintStream;

public class secondchance {
    int h;
    int full = 0;
    int[] a;
    int[] ref;
    int[] frame;
    int repptr = 0;
    int count = 0;

    public void display() {
        System.out.println("\nThe elements in the frame are\n");
        int i = 0;
        while (i < this.full) {
            System.out.println(this.frame[i]);
            ++i;
        }
    }

    public int Pagerep(int ele) {
        while (this.ref[this.repptr] != 0) {
            this.ref[this.repptr++] = 0;
            if (this.repptr != this.h) continue;
            this.repptr = 0;
        }
        int temp = this.frame[this.repptr];
        this.frame[this.repptr] = ele;
        this.ref[this.repptr] = 1;
        return temp;
    }

    public void Pagefault(int ele) {
        if (this.full != this.h) {
            this.ref[this.full] = 1;
            this.frame[this.full++] = ele;
        }
    }

    public int Search(int ele) {
        int flag = 0;
        if (this.full != 0) {
            int i = 0;
            while (i < this.full) {
                if (ele == this.frame[i]) {
                    flag = 1;
                    this.ref[i] = 1;
                    break;
                }
                ++i;
            }
        }
        return flag;
    }

    public secondchance(int fr, int[] in) {
        this.h = fr;
        this.ref = new int[fr];
        this.frame = new int[fr];
        this.a = new int[in.length];
        int i = 0;
        while (i < in.length) {
            this.a[i] = in[i];
            ++i;
        }
        i = 0;
        while (i < this.a.length) {
            if (this.Search(this.a[i]) != 1) {
                this.Pagefault(this.a[i]);
                ++this.count;
            }
            ++i;
        }
    }

    public int method() {
        return this.count;
    }
}
