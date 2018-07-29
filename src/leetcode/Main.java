package leetcode;

public class Main {

    public static void main(String[] args) {

        //==================================
        // time variables
        //==================================
        long startTime;
        long endTime;
        long totalTime;

        //==================================
        // problem definition
        //==================================
        ContainerWithMostWater question = new ContainerWithMostWater();
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int solution;

        //==================================
        // run problem and print out results
        //==================================
        startTime = System.nanoTime();
        solution = question.bruteForce(input);
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;

        System.out.println("Solution:" + solution);
        System.out.println("Running Time (ns): " + totalTime);

        startTime = System.nanoTime();
        solution = question.algorithm(input);
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;

        System.out.println("Solution:" + solution);
        System.out.println("Running Time (ns): " + totalTime);
    }
}
