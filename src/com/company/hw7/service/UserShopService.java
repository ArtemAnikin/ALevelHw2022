package com.company.hw7.service;
import com.company.hw7.model.Animal;
import java.util.Scanner;

public class UserShopService {
    private final Scanner scanner = new Scanner(System.in);

    public void doAction(Animal animal) {
        int presentNumber = 0;
        StringBuilder createPresentUserMenu = new StringBuilder("Chose action ").append("\n")
                .append(presentNumber++).append(") ").append("Выйти в главное меню").append("\n")
                .append(presentNumber++).append(") ").append("Купить подарок за 100").append("\n")
                .append(presentNumber++).append(") ").append("Купить подарок за 150").append("\n")
                .append(presentNumber++).append(") ").append("Купить подарок за 200").append("\n");
    }
}
