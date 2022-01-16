package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormatter {
    // Digunakan untuk merubah format date yang diinputkan
    // Date yang sudah dirubah formatnya, akan ditampilakn di invoice
    public String getFormattedDateWithDay(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfNew = new SimpleDateFormat("E, MMM dd yyyy");

        Date date = sdf.parse(strDate);

        return sdfNew.format(date);
    }
}
