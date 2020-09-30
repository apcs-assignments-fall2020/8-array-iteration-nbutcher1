public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] finished = new int[arr.length];
        finished[0] = arr[(arr.length-1)];
        finished[(arr.length-1)] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            finished[i] = arr[(arr.length-i-1)];
        }
        return finished;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int place = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                place = i;
            }
        }

        int second = -1000000;
        for (int i = 0; i < arr.length; i++) {
            if (place != i && arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double counter = (double) arr[1] / (double) arr[0];
        for(int i = 1; i < arr.length; i++) {
            if ((double) arr[i] / counter != (double) arr[i-1]) {
                return false;
        }
    }
    return true;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
