import java.util.Date;
import java.util.Locale;

public class dataResLang {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data.toString());
        Locale locale = Locale.getDefault();
        String lang = locale.getDisplayLanguage();
        System.out.println("O idioma do sistema é:" + lang);


    }
}
