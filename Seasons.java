public class Seasons {
    public static void main(String[] args) {
        whichSeason(Month.DECEMBER);
    }
    public static void whichSeason(Month month) {
        switch (month) {
            case DECEMBER, JANUARY, FEBRUARY:
                System.out.printf("%s is the winter season\n", month);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.printf("%s is the spring season\n", month);
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.printf("%s is the summer season\n", month);
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.printf("%s is the autumn season\n", month);
                break;

        }

        }
    }

    /*
    public static void whichSeason(int month) {
        switch (month) {
            case 1:
                System.out.println("January is the winter season");
                break;
            case 2:
                System.out.println("February is the winter season");
                break;
            case 3:
                System.out.println("March is the spring season");
                break;
            case 4:
                System.out.println("April is the spring season");
                break;
            case 5:
                System.out.println("May is the spring season");
                break;
            case 6:
                System.out.println("June is the summer season");
                break;
            case 7:
                System.out.println("July is the summer season");
                break;
            case 8:
                System.out.println("August is the summer season");
                break;
            case 9:
                System.out.println("September is the autumn season");
                break;
            case 10:
                System.out.println("October is the autumn season");
                break;
            case 11:
                System.out.println("November is the autumn season");
                break;
            case 12:
                System.out.println("December is the winter season");
                break;
            default:
                System.out.printf("%d is an invalid month", month);
                break;
        }
    }
} */
