package colorpicker;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 * The {@code NumberDocumentFilter} class filters out any non-numerical inputs 
 * it receives.
 * 
 * @author Oliver Abdulrahim
 * @deprecated No longer necessary within the scope of this package.
 */
public class NumberDocumentFilter 
    extends DocumentFilter
{

    /**
     * {@inheritDoc}
     * 
     * This implementation filters out any characters which are not digits.
     */
    @Override
    public void insertString(FilterBypass fb, int offset, String string, 
            AttributeSet attr) throws BadLocationException 
    {
        boolean containsDigit = stringHasDigit(string);
        if (containsDigit) {
            super.insertString(fb, offset, string, attr);
        }
        else {
            invalidInputReceived();
        }
    }
    
    /**
     * {@inheritDoc}
     * 
     * This implementation filters out any characters which are not digits.
     */
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, 
            AttributeSet attrs) throws BadLocationException 
    {
        boolean containsDigit = stringHasDigit(text);
        if (containsDigit) {
            super.replace(fb, offset, length, text, attrs);
        }
        else {
            invalidInputReceived();
        }
        
    }
    
    /**
     * Tests if a given {@code String} contains at least one digit, returning 
     * {@code true} if it does, {@code false} otherwise.
     * 
     * @param str The {@code String} to test.
     * @return {@code true} if the given {@code String} contains a digit, 
     *         {@code false} otherwise.
     */
    private static boolean stringHasDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Defines behavior to be executed for an invalid input.
     */
    private static void invalidInputReceived() {
        Toolkit.getDefaultToolkit().beep();
    }
    
}
