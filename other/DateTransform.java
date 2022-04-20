package other;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateTransform {

    public static List<String> transformDateFormat(List<String> dates) {
        final ArrayList<String> results = new ArrayList();

        String outputPattern = "yyyyMMdd";
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern, Locale.ENGLISH);

        for (int i = 0; i < dates.size(); i++) {
            String dateStr = dates.get(i);

            String inputPattern1 = "yyyy/MM/dd";

            SimpleDateFormat inputFormat1 = new SimpleDateFormat(inputPattern1, Locale.ENGLISH);
            Date date1;

            String resultDate = "";
            try {
                date1 = inputFormat1.parse(dateStr);
                resultDate = outputFormat.format(date1);

                results.add(resultDate);
            } catch (Exception e) {

                String inputPattern2 = "dd/MM/yyyy";

                SimpleDateFormat inputFormat2 = new SimpleDateFormat(inputPattern2, Locale.ENGLISH);
                Date date2;

                try {
                    date2 = inputFormat2.parse(dateStr);
                    resultDate = outputFormat.format(date2);

                    results.add(resultDate);
                } catch (Exception e2) {
                    String inputPattern3 = "MM-dd-yyyy";

                    SimpleDateFormat inputFormat3 = new SimpleDateFormat(inputPattern3, Locale.ENGLISH);
                    Date date3;

                    try {
                        date3 = inputFormat3.parse(dateStr);
                        resultDate = outputFormat.format(date3);

                        results.add(resultDate);
                    } catch (Exception e3) {

                    }
                }
            }
        }

        return results;
    }

    public static void main(String[] args) {
        List<String> dates = transformDateFormat(Arrays.asList("2010/02/20", "19/12/2016", "11-18-2012", "20130720"));
        for (String date : dates) {
            System.out.println(date);
        }
    }
}