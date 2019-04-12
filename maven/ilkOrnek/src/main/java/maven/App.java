package maven;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String p ="<p> my pragraph </p>";

        System.out.println(StringEscapeUtils.escapeHtml3(p));
    }
}
