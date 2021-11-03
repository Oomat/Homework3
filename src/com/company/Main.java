package com.company;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        double[] arr = {3.3, -4.54, -43.23, -43.3, 23.4, 54.7, -1.23, 32.56, 45.7, -56.56, 8.9, 67.6, 7.9, 9.8, 6.8};
        double res = 0;
        int len = 0;
        boolean a = false;
        for (double i : arr) {
            if (i < 0) {
                a = true;
            } else {
                if (a) {
                    len++;
                    res += i;

                }
            }
        }
                System.out.println(res / len);
                System.out.println(Arrays.toString(arr));
            }
        }

                // дз на собразительность




