import java.util.Arrays;

public class array {


        public static boolean areEqual(int arr1[], int arr2[])
        {
            int n = arr1.length;
            int m = arr2.length;

            // cek jika array tidak sama maka salah
            if (n != m)
                return false;

            // hitung array
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // membandingkan array
            for (int i = 0; i < n; i++)
                if (arr1[i] != arr2[i])
                    return false;

            //kembalikan nilai
            return true;
        }


        public static void main(String[] args)
        {
            int arr1[] = { 3, 5, 2, 5, 5 };
            int arr2[] = { 2, 3, 5, 5, 5 };

            if (areEqual(arr1, arr2))
                System.out.println("Yes");
            else
                System.out.println("No");
        }

}
