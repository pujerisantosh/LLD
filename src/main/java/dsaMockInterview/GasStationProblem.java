package dsaMockInterview;

public class GasStationProblem {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalTank = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            int current = gas[i] - cost[i];
            totalGas += current;
            totalTank += current;

            if (totalTank < 0) {
                // If cannot reach the next station, reset start to i+1
                startStation = i + 1;
                totalTank = 0;
            }
        }

        return totalGas >= 0 ? startStation : -1;
    }

    public static void main(String[] args) {
        // Example input
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int startIndex = canCompleteCircuit(gas, cost);
        System.out.println("Starting station index: " + startIndex);
    }
}

//Time Complexity	O(n)
//Space Complexity	O(1)

