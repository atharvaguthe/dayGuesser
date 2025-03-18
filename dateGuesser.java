import java.util.*;


class Project {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int day = 0;
        int month = 0;
        int year = 0;
        int k = 0;
        int j = 0;
        int m = 0;
        int h = 0;
        int aDate = 0;
        String aDay = "";



        System.out.println("Day Calculator from the date");


        
        System.out.print("Enter the Month (like for January -> 1, February -> 2...) :");
        month = sc.nextInt();
        
        if(month == 1 ||month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) { 
            System.out.print("Enter the Day between 1 and 31:");
            day = sc.nextInt();

            if(day >= 1 && day <=31) {
                System.out.print("Enter the year:");
                year = sc.nextInt();
            } else {
                System.out.print("Invalid input. This month doesn't have that date.");
            }
            
        } else if(month == 4 || month == 6 || month == 9 || month == 11  ) { 
            System.out.print("Enter the Day between 1 and 30:");
            day = sc.nextInt();

            if(day >= 1 && day <=30) {
                System.out.print("Enter the year:");
                year = sc.nextInt();
            } else {
                System.out.print("Invalid input. This month doesn't have that date.");
            } 
        } else if (month == 2) {
            System.out.print("Enter the year:");
            year = sc.nextInt();

            if (year % 4 == 0 && year % 100 != 0) {
                System.out.print("Enter the day between 1 and 29:");
                day = sc.nextInt();
                
                if(day >= 1 && day <=29) {
                } else {
                    System.out.println("Invalid input. This month doesn't have that date.");
                }

            } else if(year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("Enter the day between 1 and 29:");
                    day = sc.nextInt();

                    if(day >= 1 && day <=29) {
                    } else {
                        System.out.println("Invalid input. This month doesn't have that date.");
                    }
                } else {
                    System.out.print("Enter the day between 1 and 28:");
                    day = sc.nextInt();

                    if(day >= 1 && day <=28) {
                    } else {
                        System.out.println("Invalid input. This month doesn't have that date.");
                    }
                }

            } else {
                System.out.print("Enter the day between 1 and 28:");
                day = sc.nextInt();

                    if(day >= 1 && day <=28) {
                    } else {
                        System.out.println("Invalid input. This month doesn't have that date.");
                    }
            }
        } else {
            System.out.println("Invalid Input");
        }



        k = year % 100;
        j = year / 100;

        switch(month) {

            case 1 -> m = 13;
            case 2 -> m = 14;
            case 3 -> m = 1;
            case 4 -> m = 2;
            case 5 -> m = 3;
            case 6 -> m = 4;
            case 7 -> m = 5;
            case 8 -> m = 6;
            case 9 -> m = 7;
            case 10 -> m = 8;
            case 11 -> m = 9;
            case 12 -> m = 10;
            default -> System.out.println("Invalid");
        }


        h = (day + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) - 2 * j);        //Zeller's Congruence formula

        aDate = h % 7;


        switch (aDate) {

            case 0 -> aDay = "Thursday";
            case 1 -> aDay = "Friday";
            case 2 -> aDay = "Saturday";
            case 3 -> aDay = "Sunday";
            case 4 -> aDay = "Monday";
            case 5 -> aDay = "Tuesday";
            case 6 -> aDay = "Wednesday";
        }


        System.out.println("On " + day + "/" + month + "/" + year + " was:" + aDay);
        System.out.println(aDate); 

            

    }
}

                    



















