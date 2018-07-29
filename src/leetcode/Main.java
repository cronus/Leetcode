package leetcode;

public class Main {

    public static void main(String[] args) {

        ContainerWithMostWater question = new ContainerWithMostWater();

        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        long startTime = System.nanoTime();
        int solution = question.bruteForce(input);
        long endTime   = System.nanoTime();

        long totalTime = endTime - startTime;
        System.out.println("Solution:" + solution);
        System.out.println("Running Time (ns): " + totalTime);
    }
}
