package FirstPackage;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 2, 8, 3, 1, 9, 4, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));

               for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

}
