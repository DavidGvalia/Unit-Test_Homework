public class StringUtils {
    public static boolean isEmpty(final String subject) {
        return subject == null || subject.replaceAll("\\s", "").isEmpty();
    }

    public static double toDouble(String source) {
        if (source == null) {
            return Double.NaN;
        }
        return Double.parseDouble(source);
    }

    public static String fromDouble(double source) {
        return String.valueOf(source);
    }
    public static String year1(int year) {
        String message;
        if (year % 400 == 0) {
            return message = "Год является високосным.";
        } else if (year % 100 == 0) {
            return message = "Год не является високосным.";
        } else if (year % 4 == 0) {
            return message = "Год является високосным.";
        } else return message = "Год не является високосным.";
    }

}
