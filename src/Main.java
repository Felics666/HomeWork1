//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//////Задача 1:
    System.out.println();
    System.out.println("Задача № 1");
        var dog = 8.0;
         System.out.println("dog - " + dog);

           var cat = 3.6;
            System.out.println("cat - " + cat);

              var paper = 763789;
               System.out.println ("paper - " + paper);
/////Задача 2:
    System.out.println();
    System.out.println("Задача № 2");
         dog = dog + 4;
          System.out.println ("dog - " + dog);

          cat = cat + 4;
           System.out.println ("cat - " + cat);

            paper = paper + 4;
             System.out.println ("paper - " + paper);

/////Задача 3
    System.out.println();
    System.out.println("Задача № 3");
        dog = dog - 3.5;
         System.out.println ("dog - " + dog);

          cat = cat - 1.6;
           System.out.println ("cat - " + cat);

            paper = paper - 7639;
             System.out.println ("paper - " + paper);

/////Задача 4
    System.out.println();
    System.out.println("Задача № 4");

        var friend = 19;
         System.out.println("friend - " + friend);

          var rez = friend + 2;
           System.out.println("friend = " + rez);

            var rez2 = rez / 7;
             System.out.println("friend = " + rez2);

/////Задача 5
    System.out.println();
    System.out.println("Задача № 5");

        var frog = 3.5;
         System.out.println("frog - " + frog);

          var rez3 = frog * 10;
           System.out.println("frog = " + rez3);

            var rez4 = rez3 / 3.5;
             System.out.println ("frog = " + rez4);

              var rez5 = rez4 + 4;
              System.out.println("frog = " + rez5);

/////Задача 6
    System.out.println();
    System.out.println("Задача № 6");

        var FirstBoxer = 78.2;
        var SecondBoxer = 82.7;
        var WeightBoxer = FirstBoxer + SecondBoxer;
         System.out.println("Общий вае бойцов = " + WeightBoxer);

         var MassDifference = SecondBoxer - FirstBoxer;
          System.out.println("Разница между массами бойцов = " + MassDifference);

/////Задача 7
    System.out.println();
    System.out.println("Задача № 7");
        ///// Переменные объявлены в задаче № 6
         var RezMass = SecondBoxer % FirstBoxer;
          System.out.println("Остаток от деления массы двух бойцов = " + RezMass);

///// Задача № 8
    System.out.println();
    System.out.println("Задача № 8");

          var TotalHours = 640;
          var OneEmployee = 8;
          var TotalEmployees = TotalHours / OneEmployee; ///Узнали кол-во сотрудников
            System.out.println("Всего работников в компании - " + TotalEmployees + " человек");

             var TotalEmployees2 = TotalEmployees + 94;
              System.out.println("Если в компании работет - " + TotalEmployees2 + " человек, то всего " + (TotalEmployees2 * 8) + " часа работы может быть поделено между сотрудниками." );




    }
}