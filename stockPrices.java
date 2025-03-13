package Blind75;

public class stockPrices {
    public static void main(String[] args) {
        int[] prices = { 2,4,1 };
        stocks(prices);
    }

    static void stocks(int[] prices) {
        int min = prices[0];
        int prevMin = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            prevMin = min;
            if (min > prices[i]) {
                min = prices[i];
                index = i;
            }
        }
        if (min == prices[prices.length - 1]) {
            output1(prices,index, prevMin, max);
        } else {
            output(prices, index, min, max);
        }

    }

    static void output1(int[] prices,int index, int min, int max) {
        for (int k = index-1; k < prices.length; k++) {
            if (prices[k] > max) {
                max = prices[k];

            }
        }
        if (max > min) {
            System.out.println("Profit is : " + (max - min));
        } else {
            System.out.println("0");
        }
    }

    static void output(int[] prices, int index, int min, int max) {
        for (int j = index + 1; j < prices.length; j++) {
            if (prices[j] > max) {
                max = prices[j];

            }

        }
        if (max > min) {
            System.out.println("Profit is : "+(max - min));
        } else {
            System.out.println("0");
        }

    }
}
