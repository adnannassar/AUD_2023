package Search;

import Sort.Util;

public class Linear {
    public static void main(String[] args) {
        int[] array = {57, 16, 62, 30, 80, 7 , 21, 78, 87, 15, 41};
        Util.print(array);
        int n = 80;
        int m = 200;
        System.out.println("Is "+ n + " exist ? --> " + linearSearch(array, n));
        System.out.println("Is "+ m + " exist ? --> " + linearSearch(array, m));

    }

    public static boolean linearSearch(int[] array, int nr) {
        for (int i = 0; i < array.length; i++) {
                if(array[i] == nr){
                    return true;
            }
        }
        return false;
    }

}
