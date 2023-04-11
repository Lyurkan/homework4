package main;
public class Main {
    public static void main(String[] args) {
        Question question1 = new Question("Сколько ног у собаки? ",
                new String[]{"Две ноги", "Три ноги", "Четыре ноги"}, 2);
        Question question2 = new Question("В каком году началась вторая мировая война?",
                new String[]{"1930", "1935", "1939", "1941"}, 2);
        Question question3 = new Question("Сколько будет 2+1?",
                new String[]{"Один", "Шесть", "Четыре", "Пять", "Три"}, 4);

        Victorina victorina = new Victorina(new Question[]{question1, question2, question3});
        victorina.start();
    }
}