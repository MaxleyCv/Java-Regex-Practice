package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CapitalizerTest {


    @Test
    public void capitalizeTest() {
        String input = "Gonna kick every lazy man from the army! Gonna replace 'em all with the cats. May it be even better? I hope cats are smarter...";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);


        Scanner scanner = new Scanner(System.in);
        String recievedString = scanner.nextLine();

        Capitalizer stringCapitalizer = new Capitalizer(recievedString);
        System.out.println(recievedString);
        assertTrue(stringCapitalizer.capitalize("(\\w)(\\s+|\\p{Punct})").contains("Y"));

    }

}
