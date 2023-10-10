import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Step1Test {

    @Test
    public void shouldDoSomethingWithStrings() {
        // Given
        String aRandomString = "a random string";

        // When
        String aFormattedText = Main.f(aRandomString);

        // Then
        assertEquals("I don't know what I'm doing", aFormattedText);
    }
}
