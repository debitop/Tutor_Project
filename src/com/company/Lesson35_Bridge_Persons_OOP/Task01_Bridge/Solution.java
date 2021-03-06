package com.company.Lesson35_Bridge_Persons_OOP.Task01_Bridge;

import com.company.Lesson35_Bridge_Persons_OOP.Task02_Persons___factory_metod.Test01;

/**
 * Created by Саша on 23.04.2017.
 */
/* Мосты
1. Создать интерфейс Bridge с методом int getCarsCount().
2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
3. Метод getCarsCount() должен возвращать любое захардкоженое значение типа int
4. Метод getCarsCount() должен возвращать различные значения для различных классов
5. В классе Solution создать публичный метод println(Bridge bridge).
6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.
7. Каждый класс и интерфейс должны быть в отдельных файлах.
*/
public class Solution  {
    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }


}
