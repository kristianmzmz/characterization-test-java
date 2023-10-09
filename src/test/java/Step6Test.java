import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Step6Test {

    @Test
    public void shouldDoSomethingWithStrings() {
        // Given
        String aRandomString = "a random string";

        // When
        String aFormattedText = Main.formatText(aRandomString);

        // Then
        assertEquals("I don't know what I'm doing", aFormattedText);
    }

    @Test
    public void shouldDoSomethingWithChevron() {
        // Given
        String aRandomString = "a random string containing < and something else";

        // When
        String aFormattedText = Main.formatText(aRandomString);

        // Then
        assertEquals("I don't know what I'm doing", aFormattedText);
    }

    @Test
    public void shouldNotApplyAnyChangeToAPlainString() {
        // Given
        String aRandomString = "Cómo mola esto de los tests ";

        // When
        String aFormattedText = Main.formatText(aRandomString);

        // Then
        assertEquals(aRandomString, aFormattedText);
    }

    @Test
    public void shouldStripTextWhenAChevronIsFound() {
        // Given
        String aRandomString = "En este texto llegaremos hasta el símbolo < y no más";

        // When
        String aFormattedText = Main.formatText(aRandomString);

        // Then
        assertEquals("En este texto llegaremos hasta el símbolo ", aFormattedText);
    }

    @Test
    public void shouldRemoveAllTheTextBetweenTheChevronAndTheBackslash() {
        // Given
        String aRandomString = "En este texto llegaremos hasta el símbolo < y lo que hay en medio/ pero no el resto";

        // When
        String aFormattedText = Main.formatText(aRandomString);

        // Then
        assertEquals("En este texto llegaremos hasta el símbolo pero no el resto", aFormattedText);
    }

    @Test
    public void nowWhat() {
    }
}
