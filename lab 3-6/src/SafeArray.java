public class SafeArray {
    private int[] data;
    private int length;


    public SafeArray() {
        this(100); // Default size of 100
    }


    public SafeArray(int size) {
        data = new int[size];
        length = size;
    }

    public int getIndex(int index) {
        if (index >= 0 && index < length) {
            return data[index];
        } else {
            System.out.println("Invalid index. Returning default value of 0.");
            return 0;
        }
    }

    public void setIndex(int index, int value) {
        if (index >= 0 && index < length) {
            data[index] = value;
        } else {
            System.out.println("Invalid index. Cannot modify the array.");
        }
    }

    public int maxValue() {
        int max = data[0];
        for (int i = 1; i < length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public int minValue() {
        int min = data[0];
        for (int i = 1; i < length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += data[i];
        }
        return sum;
    }
}
