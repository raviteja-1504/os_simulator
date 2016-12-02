package simulation;

import java.util.Random;

public class RandomInput {
    public int[] array;
    private int numOfProcess;
    private int maxRange;

    public RandomInput(int numOfProcess, int maxRange) {
        this.numOfProcess = numOfProcess;
        this.maxRange = maxRange;
        this.array = new int[this.numOfProcess];
    }

    public RandomInput() {
        this.numOfProcess = 50;
        this.maxRange = 50;
    }

    public RandomInput(int numOfProcess) {
        this.numOfProcess = numOfProcess;
        this.maxRange = 50;
    }

    public int[] randomGeneration() {
        Random randomVariable = new Random();
        int idx = 0;
        while (idx < this.numOfProcess) {
            int randomTempVar;
            this.array[idx] = randomTempVar = randomVariable.nextInt(this.maxRange);
            ++idx;
        }
        return this.array;
    }

    public void randomGenerationToFile() {
    }
}
