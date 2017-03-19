package com.company.Lesson02;

/**
 * Экранирование символов
 * <p>
 * Про экранирование символов в Java читайте в дополнительном материале к лекции.
 * Вывести на экран следующий текст - две строки:
 * It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 * It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 * Created by Саша on 25.10.2016.
 * \n - перевод на новую строку
 * \t - табуляция
 * \r - возврат каретки ( перевод позиции печати на крайнее левое положение )
 * \b - возврат на одну позицию
 */

public class Test07 {
    public static void main(String[] args) {
        String s1 = "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        System.out.println(s1);
        String s2 = "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
        System.out.println(s2);
    }
}
