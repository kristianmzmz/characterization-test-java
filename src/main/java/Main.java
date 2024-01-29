public class Main {
    public static String stringTransformer(String inputString) {
        StringBuffer outputString = new StringBuffer();
        for (int currentrPosition = 0; currentrPosition < inputString.length(); ++currentrPosition) {
            int currentCharacter = inputString.charAt(currentrPosition);
            if (currentCharacter == '<') {
                while (currentrPosition < inputString.length() && inputString.charAt(currentrPosition) != '/' && inputString.charAt(currentrPosition) != '>')
                    currentrPosition++;
                if (currentrPosition < inputString.length() && inputString.charAt(currentrPosition) == '/')
                    currentrPosition += 4;
                else
                    currentrPosition++;
            }
            if (currentrPosition < inputString.length())
                outputString.append(inputString.charAt(currentrPosition));
        }
        return new String(outputString);
    }
}
