public class Main {
    public static String f(String t) {
        StringBuffer o = new StringBuffer();
        for (int n = 0; n < t.length(); ++n) {
            int c = t.charAt(n);
            if (c == '<') {
                while (n < t.length() && t.charAt(n) != '/' && t.charAt(n) != '>')
                    n++;
                if (n < t.length() && t.charAt(n) == '/')
                    n += 4;
                else
                    n++;
            }
            if (n < t.length())
                o.append(t.charAt(n));
        }
        return new String(o);
    }
}
