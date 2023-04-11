package main;

import java.util.Scanner;
public class Victorina {
    private final Question[] questions;

    public Victorina(Question[] questions) {
        this.questions = questions;
    }

    public void start() {
        int[] userAnswers = new int[questions.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getQuestion());
            for (int j = 0; j < questions[i].getAnswers().length; j++) {
                System.out.println((j + 1) + ". " + questions[i].getAnswers()[j]);
            }
            userAnswers[i] = scanner.nextInt() - 1;
        }

        int rightAnswers = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getIndexOfCorrectAnswer() == userAnswers[i]) {
                rightAnswers++;
            }
        }
        System.out.println("Количество правильных ответов: " + rightAnswers + " из " + questions.length);
    }
}
