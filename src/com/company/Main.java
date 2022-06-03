package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//    Programmer programmer = new Programmer("name", 32, Language.KYRGYZ);
//    //Language language = Language.KYRGYZ;
//        System.out.println(programmer);

//    Language[] languages = Language.values();
//        for (Language language:Language.values()) {
//            System.out.println((language));
//        }

//        Language[] language = Language.values();
//        System.out.println(Language.TURKISH.ordinal());

//        String language = "English";
//        System.out.println(Language.valueOf(language.toUpperCase(Locale.ROOT)));
//

//        String lanfuage1 = Language.TURKISH.name();
//        System.out.println(lanfuage1);

//        Oblasty oblasties = Oblasty.CHUY;
//        System.out.println(oblasties.CHUY.getOzgocho1());
//        switch (oblasties){
//            case CHUY -> System.out.println("my language");
//            case NARYN -> System.out.println("popular klanguage");
//            case  TALAS-> System.out.println("same with kyrgyz language");
//        }

        /*Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter day of week");
            String sc = scanner.nextLine();
            Weekdays weekday1 = Weekdays.MONDAY;
            if (sc.equals("monday")) {
                System.out.println(weekday1.getRaspisanie());
            }
            Weekdays weekday2 = Weekdays.TUESDAY;
            if (sc.equals("tuesday")) {
                System.out.println(weekday2.getRaspisanie());
            }
            Weekdays weekday3 = Weekdays.WEDNESDAY;
            if (sc.equals("wednesday")) {
                System.out.println(weekday3.getRaspisanie());
            }
            Weekdays weekday4 = Weekdays.THURSDAY;
            if (sc.equals("thursday")) {
                System.out.println(weekday4.getRaspisanie());
            }
            Weekdays weekday5 = Weekdays.FRIDAY;
            if (sc.equals("friday")) {
                System.out.println(weekday5.getRaspisanie());
            }
            Weekdays weekday6 = Weekdays.SATURDAY;
            if (sc.equals("saturday")) {
                System.out.println(weekday6.getRaspisanie());
            }
            Weekdays weekday7 = Weekdays.SUNDAY;
            if (sc.equals("sunday")) {
                System.out.println(weekday7.getRaspisanie());
            }else {
                System.out.println("sorry, unknown command");
            }
            scanner.close();
        }*/

            Scanner scanner = new Scanner(System.in);
            String sc = scanner.nextLine();
            Weekdays[] weekdays = Weekdays.values();
            if (sc.equals("monday")) {
                System.out.println(weekdays[0]);
            } else if (sc.equals("tuesday")) {
                System.out.println(weekdays[1]);
            } else if (sc.equals("wednesday")) {
                System.out.println(weekdays[2]);
            } else if (sc.equals("thursday")) {
                System.out.println(weekdays[3]);
            } else if (sc.equals("friday")) {
                System.out.println(weekdays[4]);
            } else if ("saturday".equals(sc)) {
                System.out.println(weekdays[5]);
            } else if (sc.equals("sunday")) {
                System.out.println(weekdays[6]);
            }
        }

        }
