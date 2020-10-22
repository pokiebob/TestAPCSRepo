package TestAPCSRepo;

public class Demo {

    public static String arrToString(int[] arr) {
        String str = "{";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
            if (i < arr.length - 1) {
                str = str + ", ";
            }
        }
        return str + "}";
    }

    public static String arrayDeepToString(int[][] arr) {
        String str = "{";
        for (int i = 0; i < arr.length; i++) {
            str = str + arrToString(arr[i]);
            if (i < arr.length - 1) {
                str = str + ", ";
            }
        }
        return str + "}";
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (maxValue + 1));
            }
        }
        return arr;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
        int[][] arr = new int[rows][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[(int) (Math.random() * (cols + 1))];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] = (int) (Math.random() * (maxValue + 1));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        // System.out.println(arrayDeepToString(create2DArray(5, 4, 4)));
        // System.out.println(arrayDeepToString(create2DArray(6, 2, 3)));
        // System.out.println(arrayDeepToString(create2DArrayRandomized(4, 10, 100)));
    }
}
