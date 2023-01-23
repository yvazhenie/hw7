import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] ffs = new int[3];
        ffs[0] = 1;
        ffs[1] = 2;
        ffs[2] = 3;
        for (int f = 0; f < ffs.length; f++) {
            System.out.print(ffs[f]);
            if (f != ffs.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] ssf = {1.57, 7.654, 9.986};
        for (int d = 0; d < ssf.length; d++) {
            System.out.print(ssf[d]);
            if (d != ssf.length - 1) {
                System.out.print(", ");
            }
            }
            System.out.println();

            int[] dda = {3, 7, 9};
            for (int a = 0; a < dda.length; a++) {
                System.out.print(dda[a]);
                if (a != dda.length - 1) {
                    System.out.print(", ");
                }
            }
        System.out.println();
        }
    private static void task2(){
        System.out.println("Задача 3");
        int[] ffs = new int[3];
        ffs[0] = 1;
        ffs[1] = 2;
        ffs[2] = 3;
        for (int f = ffs.length - 1; f >= 0; f--){
            System.out.print(ffs[f]);
            if (f != 0){
                System.out.print(", ");
            }

        }
        System.out.println();

        double[] ssf = {1.57, 7.654, 9.986};
        for (int d = ssf.length - 1; d>=0; d--){
            System.out.print(ssf[d]);
            if (d != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] dda = {3, 7, 9};
        for (int a = dda.length - 1; a>=0 ; a--){
            System.out.print(dda[a]);
            if (a!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task3() {
        int[] ffs = new int[3];
        ffs[0] = 1;
        ffs[1] = 2;
        ffs[2] = 3;
        for (int i = 0; i < ffs.length; i++) {
           if (ffs[i] % 2 != 0){
               ffs[i] += 1;
           }
        }

        System.out.print(Arrays.toString(ffs));
    }
}

