package com.buyFruit.pro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        buyFruit1();
        buyFruit2();
        buyFruit3();
        buyFruit4();

    }

    public static void buyFruit1() {
        Market market = new Market();

        int appleWeight = 2; // 顾客购买的苹果重量
        int strawberryWeight = 3; // 顾客购买的草莓重量

        double totalPrice = appleWeight * market.apple.getPricePerKg() +
                strawberryWeight * market.strawberry.getPricePerKg();

        System.out.println("第一题: ");
        System.out.println("顾客购买的苹果重量：" + appleWeight + "斤");
        System.out.println("顾客购买的草莓重量：" + strawberryWeight + "斤");
        System.out.println("总价为：" + totalPrice + "元");
    }

    public static void buyFruit2() {
        Market market = new Market();

        int appleWeight = 2; // 顾客购买的苹果重量
        int strawberryWeight = 3; // 顾客购买的草莓重量
        int mangoWeight = 1; // 顾客购买的芒果重量

        double totalPrice = appleWeight * market.apple.getPricePerKg() +
                strawberryWeight * market.strawberry.getPricePerKg() +
                mangoWeight * market.mango.getPricePerKg();


        System.out.println("第二题: ");
        System.out.println("顾客购买的苹果重量：" + appleWeight + "斤");
        System.out.println("顾客购买的草莓重量：" + strawberryWeight + "斤");
        System.out.println("顾客购买的芒果重量：" + mangoWeight + "斤");
        System.out.println("总价为：" + totalPrice + "元");
    }

    public static void buyFruit3() {
        Market market = new Market();

        int appleWeight = 2; // 顾客购买的苹果重量
        int strawberryWeight = 3; // 顾客购买的草莓重量
        int mangoWeight = 1; // 顾客购买的芒果重量

        double totalPrice = appleWeight * market.apple.getPricePerKg() +
                strawberryWeight * market.strawberry.getPricePerKg() * 0.8 + // 8折优惠
                mangoWeight * market.mango.getPricePerKg();

        System.out.println("第三题: ");
        System.out.println("顾客购买的苹果重量：" + appleWeight + "斤");
        System.out.println("顾客购买的草莓重量：" + strawberryWeight + "斤");
        System.out.println("顾客购买的芒果重量：" + mangoWeight + "斤");
        System.out.println("总价为：" + totalPrice + "元");
    }

    public static void buyFruit4() {
        Market market = new Market();

        int appleWeight = 2; // 顾客购买的苹果重量
        int strawberryWeight = 3; // 顾客购买的草莓重量
        int mangoWeight = 1; // 顾客购买的芒果重量

        double totalPrice = appleWeight * market.apple.getPricePerKg() +
                strawberryWeight * market.strawberry.getPricePerKg() +
                mangoWeight * market.mango.getPricePerKg();

        // 满 100 减 10 的促销活动
        if (totalPrice >= 100) {
            totalPrice -= 10;
        }
        System.out.println("第四题: ");
        System.out.println("顾客购买的苹果重量：" + appleWeight + "斤");
        System.out.println("顾客购买的草莓重量：" + strawberryWeight + "斤");
        System.out.println("顾客购买的芒果重量：" + mangoWeight + "斤");
        System.out.println("总价为：" + totalPrice + "元");
    }

}