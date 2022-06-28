package com.company;

public class Main {

    public static void main(String[] args) {

        int currentAccount = 100; // текущий счет
        int replenishmentAmount = 1550; // сумма пополнения
        int finalScore = currentAccount + replenishmentAmount; // итоговый счет
        int bonusAmount = 0;
        if (replenishmentAmount > 1000) {
            bonusAmount = replenishmentAmount / 100; // сумма бонуса
        }
        int finalScoreBonus = finalScore + bonusAmount; // итоговый счет с бонусом

        System.out.println("итоговая сумма счета с бонусом: " + finalScoreBonus);
        System.out.println("сумма бонуса: " + bonusAmount);
    }
}
