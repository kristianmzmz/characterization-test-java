import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Step3Test {

    @Test
    public void shouldDoSomethingWithStrings() {
        // Given
        String aRandomString = "a random string";

        // When
        String aFormattedText = Main.f(aRandomString);

        // Then
        assertEquals("I don't know what I'm doing", aFormattedText);
    }

    @Test
    public void shouldDoSomethingWithChevron() {
        // Given
        String aRandomString = "a random string containing < and something else";

        // When
        String aFormattedText = Main.f(aRandomString);

        // Then
        assertEquals("I don't know what I'm doing", aFormattedText);
    }

    @Test
    public void shouldNotApplyAnyChangeToAPlainString() {
        // Given
        String aRandomString = "Cómo mola esto de los tests ";

        // When
        String aFormattedText = Main.f(aRandomString);

        // Then
        assertEquals(aRandomString, aFormattedText);
    }
}
