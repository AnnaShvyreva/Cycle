package com.company;

import jdk.nashorn.internal.ir.ContinueNode;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String tmp;
        String h="N";
        Integer i=0;
        Scanner sr = new Scanner(System.in);
        do {
            System.out.println("Доброе утро");
            System.out.println("Уже есть 7:00? Введите Y или N");
            tmp = sr.next();
            if (tmp.equals("Y") | tmp.equals("y")) {
                System.out.println("Бежать к автобусу");
            } else {
                System.out.println("Собраться, позвонить подружкам и пойти с ними на конечную автобуса");
            }

            /////////////////////////////////////////////////////////////////////////////
            do {

                System.out.println("Сели в автобус? Введите Y или N");


                tmp = sr.next();
                if (tmp.equals("N") | tmp.equals("n"))
                    do {
                        System.out.println("Ждите автобус. Дождались?");
                        tmp = sr.next();
                        //if (tmp.equals("Y")|tmp.equals("y")){
                        //    break;
                        //}
                        i++;
                    } while ((i < 10) && (tmp.equals("N") | tmp.equals("n")));
                if (tmp.equals("Y") | tmp.equals("y")) {
                    System.out.println("Есть сидячие места?");
                    tmp = sr.next();
                    i = 0;
                    if (tmp.equals("N") | tmp.equals("n"))
                        do {
                            System.out.println("Возмущаться. Обсуждать провальное современное поколение. Уступили место?");
                            tmp = sr.next();
                            i++;
                        } while ((i < 10) && (tmp.equals("N") | tmp.equals("n")));
                    if (i == 10) {
                        System.out.println("Ехать молча");
                    } else {
                        System.out.println("Занять место");
                    }
                    System.out.println("Поехать: \n 1. до конечной \n 2. в поликлинику\n 3. на рынок \n 4. пока не выгонят");
                    //tmp = sr.next();
                    Integer str = sr.nextInt();
                    switch (str) {
                        case 1: {
                            System.out.println("Конечная.");
                            break;
                        }
                        case 2: {
                            System.out.println("Поликлиника. Я здесь по делу?");
                            tmp = sr.next();
                            if (tmp.equals("N") | tmp.equals("n")) {
                                System.out.println("Придумать болячку.");
                            }
                            System.out.println("Доставать врача. Просить бесплатные лекарства и путевки в санаторий.");
                            break;
                        }
                        case 3: {
                            System.out.println("Нужно покупать продукты?");
                            tmp = sr.next();
                            if (tmp.equals("N") | tmp.equals("n")) {
                                System.out.println("Есть с кем погалдеть?");
                                if (tmp.equals("Y") | tmp.equals("y")) {
                                    System.out.println("Нагалдеться.");
                                }
                            } else {
                                System.out.println("Купить продукты.");
                            }
                            break;

                        }
                        case 4: {
                            System.out.println("Выгнали.");
                            break;
                        }
                    }
                    System.out.println("Пора домой?");
                    h = sr.next();
                    if (h.equals("N") | h.equals("n")) {
                        System.out.println("Сесть на следующий автобус");
                    }
                }
                else{
                    break;
                }

            } while (h.equals("N") | h.equals("n"));

            System.out.println("Поехать домой. \n Дома.");
            System.out.println("Хочу есть?");
            tmp = sr.next();
            if (tmp.equals("Y") | tmp.equals("y")) {
                System.out.println("Есть что поесть?");
                tmp = sr.next();
                if (tmp.equals("N") | tmp.equals("n")) {
                    System.out.println("Приготовить: \n 1. блинчики \n2. борщ \n 3.пирожки \n4. что-то другое");
                    sr.next();
                }
                System.out.println("Поесть.");
            }

            i = 0;
            System.out.println("Хочу гулять?");
            tmp = sr.next();
            if (tmp.equals("Y") | tmp.equals("y")) {
                System.out.println("Посидеть у подъезда.");
                do {
                    System.out.println("Насиделась?");
                    tmp = sr.next();
                    i++;
                } while ((i < 4) && (tmp.equals("N") | tmp.equals("n")));

                if (tmp.equals("N") | tmp.equals("n")) {
                    System.out.println("Иди домой! Сериал начался!!!!");
                }
            }
            i = 0;
            System.out.println("Смотреть сериал?");
            tmp = sr.next();
            if (tmp.equals("Y") | tmp.equals("y"))
                do {
                    System.out.println("Смотреть.");
                    System.out.println("Закончился?");
                    tmp = sr.next();
                    i++;
                } while ((i < 4) && (tmp.equals("N") | tmp.equals("n")));

             System.out.println("Пора спать!");
            i=0;
            System.out.println("Сон.");
            do {
                System.out.println("Проснуться?");
                tmp = sr.next();
                i++;
            }while ((i<10) && (tmp.equals("N") | tmp.equals("n")));
            System.out.println("Просыпайся!!! Утро!");
        }while (true);
    }
}
