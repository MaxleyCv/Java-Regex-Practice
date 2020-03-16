package ua.lviv.iot;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Capitalizer {
    private String textToCapitalize;

    public Capitalizer(String textToCapitalize) {
        this.textToCapitalize = textToCapitalize;
    }

    public String capitalize(final String pattern) {
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(this.textToCapitalize);
        while (matcher.find()) {
            this.textToCapitalize = this.textToCapitalize.replace(matcher.group(), matcher.group().toUpperCase());
        }
        System.out.println(this.textToCapitalize);
        return textToCapitalize;
    }

    public String getTextToCapitalize() {
        return textToCapitalize;
    }

    public void setTextToCapitalize(String textToCapitalize) {
        this.textToCapitalize = textToCapitalize;
    }
}
