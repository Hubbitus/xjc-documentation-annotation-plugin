package info.hubbitus;

import com.sun.codemodel.JExpressionImpl;
import com.sun.codemodel.JFormatter;

/**
 * String literal unescaped.
 * Copied class {@link com.sun.codemodel.JStringLiteral} and slightly modified.
 * We can't just extend it because of non-public constructor
 *
 * @author Pavel Alexeev
 * @since 2019-01-24 01:26:29
 */
public class JStringLiteralUnescaped extends JExpressionImpl {

    public final String str;


    JStringLiteralUnescaped(String what) {
        this.str = what;

    }

    @Override
    public void generate(JFormatter f) {
    	f.p(quotify('"', str));
    }

    static final String charEscape = "\b\t\n\f\r\"\'\\";
    static final String charMacro  = "btnfr\"'\\";
    /**
     * WARNING! Copy/past {@see com.sun.codemodel.JExpr#quotify(char, java.lang.String)} without Unicode characters escapes!
     *
     * Also {@see XJCPluginDescriptionAnnotation#annotateUnescaped(com.sun.codemodel.JAnnotatable, java.lang.Class, java.util.Map)}
     *
     * @bug @link https://github.com/javaee/jaxb-codemodel/issues/30
     *
     * Escapes the given string, then surrounds it by the specified
     * quotation mark.
     * @return String which proper quite literals, but not Unicode values
     */
    private static String quotify(char quote, String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(n + 2);
        sb.append(quote);
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int j = charEscape.indexOf(c);
            if(j>=0) {
                if((quote=='"' && c=='\'') || (quote=='\'' && c=='"')) {
                    sb.append(c);
                } else {
                    sb.append('\\');
                    sb.append(charMacro.charAt(j));
                }
            } else {
//                // technically Unicode escape shouldn't be done here,
//                // for it's a lexical level handling.
//                //
//                // However, various tools are so broken around this area,
//                // so just to be on the safe side, it's better to do
//                // the escaping here (regardless of the actual file encoding)
//                //
//                // see bug
//                if( c<0x20 || 0x7E<c ) {
//                    // not printable. use Unicode escape
//                    sb.append("\\u");
//                    String hex = Integer.toHexString(((int)c)&0xFFFF);
//                    for( int k=hex.length(); k<4; k++ )
//                        sb.append('0');
//                    sb.append(hex);
//                } else {
                    sb.append(c);
//                }
            }
        }
        sb.append(quote);
        return sb.toString();
    }
}
