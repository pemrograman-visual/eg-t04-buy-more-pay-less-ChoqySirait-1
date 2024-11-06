// 12S24012 - Choqy Pananda Sirait
// 12S24006 - Margareth Bungaran Sitompul

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arrISBN = new String[3];
        int i;
        double[] arrPrice = new double[3];

        for (i = 0; i <= 2; i++) {
            arrPrice[i] = 0;
        }
        int[] arrQuantity = new int[3];

        for (i = 0; i <= 2; i++) {
            arrQuantity[i] = 0;
        }
        double[] arrEksPrice = new double[3];

        for (i = 0; i <= 2; i++) {
            arrEksPrice[i] = 0;
        }
        double totalHarga;

        totalHarga = 0;
        int quantity0, quantity1, quantity2, b;

        quantity0 = 0;
        quantity1 = 0;
        quantity2 = 0;
        int[] quantity = new int[3];

        for (i = 0; i <= 2; i++) {
            quantity[i] = 0;
        }
        b = 0;
        String buku0, buku1, buku2;

        buku0 = "buku";
        buku1 = "buku";
        buku2 = "buku";
        while (b < 3) {
            arrISBN[b] = input.nextLine();
            if (!arrISBN[b].equals("---")) {
                if (arrISBN[b].equals(arrISBN[0])) {
                    buku0 = arrISBN[b];
                    b = 0;
                    arrPrice[b] = Double.parseDouble(input.nextLine());
                    arrQuantity[b] = Integer.parseInt(input.nextLine());
                    quantity0 = quantity0 + arrQuantity[b];
                    b = b + 1;
                } else {
                    buku1 = arrISBN[b];
                    if (arrISBN[b].equals(arrISBN[1])) {
                        b = 1;
                        arrPrice[b] = Double.parseDouble(input.nextLine());
                        arrQuantity[b] = Integer.parseInt(input.nextLine());
                        quantity1 = quantity1 + arrQuantity[b];
                        b = b + 1;
                    } else {
                        buku2 = arrISBN[b];
                        if (arrISBN[b].equals(arrISBN[2])) {
                            b = 2;
                            arrPrice[b] = Double.parseDouble(input.nextLine());
                            arrQuantity[b] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + arrQuantity[b];
                            b = b + 1;
                        }
                    }
                }
            } else {
                b = 3;
            }
        }
        if (quantity0 <= 5) {
            arrPrice[0] = arrPrice[0] - arrPrice[0] * 0.02;
        } else {
            if (quantity0 <= 10) {
                arrPrice[0] = arrPrice[0] - arrPrice[0] * 0.05;
            } else {
                if (quantity0 <= 20) {
                    arrPrice[0] = arrPrice[0] - arrPrice[0] * 0.12;
                }
            }
        }
        arrEksPrice[0] = arrPrice[0] * quantity0;
        if (quantity1 >= 20) {
            arrPrice[1] = arrPrice[1] - arrPrice[1] * 0.12;
        } else {
            if (quantity1 >= 10) {
                arrPrice[1] = arrPrice[1] - arrPrice[1] * 0.05;
            } else {
                if (quantity1 >= 5) {
                    arrPrice[1] = arrPrice[1] - arrPrice[1] * 0.02;
                }
            }
        }
        arrEksPrice[1] = arrPrice[1] * quantity1;
        if (quantity2 >= 20) {
            arrPrice[2] = arrPrice[2] - arrPrice[2] * 0.12;
        } else {
            if (quantity2 >= 10) {
                arrPrice[2] = arrPrice[2] - arrPrice[2] * 0.05;
            } else {
                if (quantity2 >= 5) {
                    arrPrice[2] = arrPrice[2] - arrPrice[2] * 0.02;
                }
            }
        }
        arrEksPrice[2] = arrPrice[2] * quantity2;
        totalHarga = arrEksPrice[0] + arrEksPrice[1] + arrEksPrice[2];
        System.out.println(toFixed(totalHarga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
