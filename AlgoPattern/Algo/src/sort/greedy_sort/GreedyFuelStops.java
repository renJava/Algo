package sort.greedy_sort;

/**
 * Минимальное количество остановок на заправку
 */
public class GreedyFuelStops {
    public static void main(String[] args) {
        int[] fuelStations = {0, 200, 375, 550, 750, 950};
        int startPoint = 0;
        int endPoint = 950;

        int minStops = calculateMinStops(fuelStations, startPoint, endPoint);
        System.out.println("Минимальное количество остановок на заправку: " + minStops);
    }

    private static int calculateMinStops(int[] fuelStations, int startPoint, int endPoint) {
        int currentPosition = startPoint;
        int numStops = 0;

        while (currentPosition < endPoint) {
            int nextStation = -1;

            for (int i = fuelStations.length - 1; i >= 0; i--) {
                if (fuelStations[i] <= currentPosition + 400) {
                    nextStation = fuelStations[i];
                    break;
                }
            }

            if (nextStation == -1) {
                // Нет доступных заправок без остановки
                break;
            }

            currentPosition = nextStation;
            numStops++;
        }

        return numStops;
    }
}