
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            int a = 30000;
            System.out.println(a);
            byte b = 120;
            System.out.println(b);
            short c = 10200;
            System.out.println(c);
            long d = 1345678;
            System.out.println(d);
            float e = 15.2f;
            System.out.println(e);
            double f = 12.5;
            System.out.println(f);


            System.out.println("Задача 2 ");
            double ab = 27.12;
            System.out.println(ab);
            long ac = 987678965;
            System.out.println(ac);
            short ad = 2786;
            System.out.println(ad);
            int ae = 569;
            System.out.println(ae);
            int af = -159;
            System.out.println(af);
            long ar = 27897;
            System.out.println(ar);
            byte at = 67;
            System.out.println(at);

            System.out.println("Задача 3");
            int ludmila = 23;
            System.out.println(ludmila);
            byte Anna = 27;
            System.out.println(Anna);
            short Ekaterina = 30;
            System.out.println(Ekaterina);
            long totalList = 480;
            System.out.println(totalList);
            long result = 480 / (ludmila + Anna + Ekaterina);
            System.out.println("На каждого ученика" + result + "рассчитано");

            System.out.println("задача 4");
            byte hourBottles = 2;
            System.out.println(hourBottles);
            long bottles = 16;
            System.out.println(bottles);
            long bottleminute = bottles / hourBottles;
            System.out.println(bottleminute);
            long times = 20;
            System.out.println(times);
            result = (int) (times * bottleminute);
            System.out.println("За" + times + "минут машина произвела" + result);
            long hour2 = 72 * 60;
            System.out.println(hour2);
            long resultday3 = hour2 * bottleminute;
            System.out.println("За" + hour2 + "машина произвела" + resultday3);
            int hour3 = 24 * 60;
            System.out.println(hour3);
            long resultday = hour3 * bottleminute;
            System.out.println("за" + hour3 + "машина произвела" + resultday);
            long mouths = (30 * 24) * 60;
            System.out.println(mouths);
            long resultmouth = mouths * bottleminute;
            System.out.println("За" + mouths + "машина произвела" + resultmouth);

            System.out.println("задача 5");
            byte canTotal = 120;
            System.out.println(canTotal);
            byte whitecan = 2;
            System.out.println(whitecan);
            byte browncan = 4;
            System.out.println(browncan);
            int classOne = 6;
            System.out.println(classOne);
            long totalClass = canTotal / classOne;
            System.out.println(totalClass);
            long totalWhiteCan = totalClass * whitecan;
            System.out.println(totalWhiteCan);
            long totalBrownCan = totalClass * browncan;
            System.out.println(totalBrownCan);
            System.out.println("В школе,где" + totalClass + "классов,нужно" + totalWhiteCan + "белой краски и" + totalBrownCan + "банок коричнеовй краски");

            System.out.println("задача 6");
            byte bananOne = 80;
            byte bananTotal = 5;
            int bananaWeight = bananOne * bananTotal;
            System.out.println(bananaWeight);
            long milkOne = 105;
            long milkTotal = 2;
            Long milweight = milkOne * milkTotal;
            System.out.println(milweight);
            byte icecreamOne = 2;
            byte icecreamTotal = 100;
            int icecreamWeight = icecreamOne * icecreamTotal;
            System.out.println(icecreamWeight);
            byte eggsOne = 70;
            byte eggsTotal = 4;
            int eggsWeight = eggsOne * eggsTotal;
            System.out.println(eggsWeight);
            long totalWeight = bananaWeight + milweight + icecreamWeight + eggsWeight;
            System.out.println(totalWeight);
            long totalWeightKg = totalWeight / 1000;
            System.out.println(totalWeightKg);

            System.out.println("задача 7");
            int dieta250 = 250;
            int dieta500 = 500;
            long weightSportgramm = 7 * 1000;
            long day250 = weightSportgramm / dieta250;
            System.out.println(day250);
            long day500 = weightSportgramm / dieta500;
            System.out.println(day500);
            System.out.println("Если спортсмен будет терять" + dieta250 + "то ему понадобится " + day250 + "дней на то чтобы похудеть,а если спортсмен будет терять в день " + dieta500 + "то ему понадобится" + day500 + "дней на чтобы похудеть");

            System.out.println("задача 8");
            int Masha = 67760;
            System.out.println(Masha);
            int Denis = 83690;
            System.out.println(Denis);
            int kristina = 76230;
            System.out.println(kristina);
            long mashaplus = 67760 / 10;
            System.out.println(mashaplus);
            long denisplus = 83690 /10 ;
            System.out.println(denisplus);
            long kristinaplus = 76230/10 ;
            System.out.println(kristinaplus);
            long mashayear = 67760 * 12;
            System.out.println(mashayear);
            long denisyear = 83690 * 12;
            System.out.println(denisyear);
            long kristinayear = 76230 * 12;
            System.out.println(kristinayear);
            long mashanewzp = Masha + mashaplus;
            System.out.println(mashanewzp);
            long denisnewzp = Denis + denisplus;
            System.out.println(denisnewzp);
            long kristinanewzp = kristina + kristinaplus;
            System.out.println(kristinanewzp);
            long mashaposlenewzp = mashanewzp * 12;
            System.out.println(mashaposlenewzp);
            long denisposlenewzp =denisnewzp * 12;
            System.out.println(denisposlenewzp);
            long kristinaposlenewzp = kristinanewzp * 12;
            System.out.println(kristinaposlenewzp);
            long masharaznica = mashaposlenewzp-mashayear;
            System.out.println(masharaznica);
            long denisraznica = denisposlenewzp - denisyear;
            System.out.println(denisraznica);
            long kristinaraznica = kristinaposlenewzp - kristinayear;
            System.out.println(kristinaraznica);
            System.out.println("Маша получает теперь в месяц" + mashanewzp + "годовой доход вырос на " + masharaznica);
            System.out.println("Денис теперь получает в месяц" + denisnewzp + "годовой доход вырос на " + denisraznica);
            System.out.println("Кристина теперь получает в есяц " + kristinanewzp + "годовой доход вырос на " + kristinaraznica);
       System.out.println("готово!");
        }
    }
}



