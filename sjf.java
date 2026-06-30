package simulation;

import java.io.PrintStream;

public class sjf {
    public int value;
    public int s_burst;
    public int s;
    public int[] burstTime;
    public int[] prevTime;
    public int[] arrivalTime;
    public int[] waitingTime;
    public double averageWaitingTime;

    public sjf(int n, int[] a, int[] b) {
        this.burstTime = new int[n];
        this.waitingTime = new int[n];
        this.arrivalTime = new int[n];
        this.prevTime = new int[n];
        this.value = n;
        this.s_burst = 0;
        this.s = 0;
        int i = 0;
        while (i < n) {
            this.burstTime[i] = b[i];
            this.s_burst += b[i];
            ++i;
        }
        i = 0;
        while (i < n) {
            this.arrivalTime[i] = a[i];
            ++i;
        }
    }

    public void print() {
        int i = 0;
        while (i < this.value) {
            System.out.print(String.valueOf(this.burstTime[i]) + " ");
            ++i;
        }
        System.out.println("");
        i = 0;
        while (i < this.value) {
            System.out.print(String.valueOf(this.arrivalTime[i]) + " ");
            ++i;
        }
        System.out.println("");
    }

    public void averageWaitingTimeCalc() {
        this.waitingTime[0] = 0;
        int i = 0;
        while (i < this.s_burst) {
            int min = 100000000;
            int index_min = 0;
            int j = 0;
            while (j < this.value) {
                if (this.arrivalTime[j] <= i && this.burstTime[j] < min && this.burstTime[j] > 0) {
                    min = this.burstTime[j];
                    index_min = j;
                }
                ++j;
            }
            int[] arrn = this.burstTime;
            int n = index_min;
            arrn[n] = arrn[n] - 1;
            int[] arrn2 = this.waitingTime;
            int n2 = index_min;
            arrn2[n2] = arrn2[n2] + (i - this.prevTime[index_min]);
            this.prevTime[index_min] = i + 1;
            ++i;
        }
    }

    public void printw() {
        int i = 0;
        while (i < this.value) {
            System.out.println(this.waitingTime[i]);
            ++i;
        }
    }

    public double printWaitingTime() {
        this.s = 0;
        int i = 0;
        while (i < this.value) {
            this.s += this.waitingTime[i];
            ++i;
        }
        this.averageWaitingTime = (double)this.s * 1.0 / (double)this.value;
        return this.averageWaitingTime;
    }
}
