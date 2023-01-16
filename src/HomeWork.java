public class HomeWork {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача №1");
        int age = 15;

        if (age >= 18) {
            System.out.println("Возраст человека равен " + age + " , он совершеннолетний.");
        } else {
            System.out.println("Возраст человека равен " + age + ", он не достиг совершеннолетия, нужно подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача №2");
        int temp = 2;
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов. Можно идти без шапки!");
        } else {
            System.out.println("На улице " + temp + " градусов. Нужно надеть шапку.");

        }
    }

    public static void task3() {
        System.out.println("Задача №3");
        int speed = 55;
        if (speed >= 61) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ехать спокойно!");
        }


    }

    public static void task4() {
        System.out.println("Задача №4");
        int age = 27;
        if (age >= 2 && age < 6)
        {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age < 18)
        {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу.");
        }
        if (age > 18 && age <= 24)
        {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет.");
        }
        else   {
            System.out.println("Если возраст человека равен " + age + " ,то ему пора ходить на работу.");
        }

    }
    public static void task5() {
        System.out.println("Задача №5");
        int ageChild = 16;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему нельзя кататься на атракционе.");
        }
        if (ageChild >= 5 && ageChild <14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему можно кататься в сопровождении  взрослых.");

        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему можно кататься без сопровождении  взрослых." );
        }
    }
    public static void task6() {
        System.out.println("Задача №6");
        int totalCapacity=97;

        if (totalCapacity<102){
            System.out.println("Места в вагоне есть.");
        }
        else   {
            System.out.println("Мест в вагоне НЕТ");
        }
        if (totalCapacity < 60) {
            System.out.println("Сидячие места есть!");
        }
        if (totalCapacity > 60 && totalCapacity < 102){
            System.out.println("Есть только стоячие места!");
        }



    }
    public static void task7() {
        System.out.println("Задача №7");
        int oneA = 99;
        int twoB = 46;
        int threeC = 63;
        if (oneA>twoB && oneA>threeC) {
            System.out.println(oneA + " самое большое число.");
        }
        else if (twoB>oneA && twoB>threeC) {
            System.out.println(twoB + " самое большое число.");
        }
        else {
            System.out.println(threeC + " самое большое число.");
        }

    }
}