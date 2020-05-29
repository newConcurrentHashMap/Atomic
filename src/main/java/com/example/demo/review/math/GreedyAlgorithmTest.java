package com.example.demo.review.math;

/**
 * 贪心算法
 * 1.货币只有 25 分、10 分、5 分和 1 分四种硬币；
 * 2.找给客户 41 分钱的硬币；
 * 3.硬币最少化
 */
public class GreedyAlgorithmTest {


    public static void main(String[] args) {
        int sumMoney = 41, coin_1 = 1, coin_5 = 5, coin_10 = 10, coin_25 = 25;
        int coin_25_count = 0, coin_10_count = 0, coin_5_count = 0, coin_1_count = 0;
        while (sumMoney >= coin_25) {
            sumMoney -= coin_25;
            coin_25_count++;
        }

        while (sumMoney >= coin_10) {
            sumMoney -= coin_10;
            coin_10_count++;
        }

        while (sumMoney >= coin_5) {
            sumMoney -= coin_5;
            coin_5_count++;
        }

        while (sumMoney >= coin_1) {
            sumMoney -= coin_1;
            coin_1_count++;
        }
        if (sumMoney == 0) {
            System.out.println("需要25分硬币:" + coin_25_count + ",10分硬币:" + coin_10_count +
                    ",5分硬币:" + coin_5_count + ",1分硬币:" + coin_1_count);
        }

    }
}
