package com.company.hw7;

import com.company.hw7.service.UserCreateAnimal;
import com.company.hw7.service.UserInputService;

public class Main {
    public static void main(String[] args) {
        UserCreateAnimal userCreateAnimal = new UserCreateAnimal();
        UserInputService userInputService = new UserInputService();
        userInputService.doAction(userCreateAnimal.createAnimal());
    }
}
