import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Days days = Days.valueOf(scan.nextLine().toUpperCase());
                switch (days) {
                    case MONDAY -> System.out.println(Days.MONDAY);
                    case TUESDAY -> System.out.println(Days.TUESDAY);
                    case WEDNESDAY -> System.out.println(Days.WEDNESDAY);
                    case THURSDAY -> System.out.println(Days.THURSDAY);
                    case FRIDAY -> System.out.println(Days.FRIDAY);
                    case SATURDAY -> System.out.println(Days.SATURDAY);
                    case SUNDAY -> System.out.println(Days.SUNDAY);

                }
            }
        }

    