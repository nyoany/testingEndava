//Yet another TestNG parameter testing example, with @DataProvider.
//1. CharUtil Class
//Let’s say, a class to convert a character to ASCII or vice verse,
// how can you unit test it with TestNG?

package parameter;

/**
 * Character Utility class
 *
 * @author mkyong
 *
 */
public class CharUtils {
    /**
     * Convert the characters to ASCII value
     *
     * @param character character
     * @return ASCII value
     */
    public static int CharToASCII(final char character) {
        return (int) character;
    }

    /**
     * Convert the ASCII value to character
     *
     * @param ascii ascii value
     * @return character value
     */
    public static char ASCIIToChar(final int ascii) {
        return (char) ascii;
    }
}
