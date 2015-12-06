import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IdentifierChecker {
  public static boolean isValid(String idn) {
    return Pattern.compile("[$a-zA-Z_][$a-zA-Z0-9_]*").matcher(idn).matches();
  }
}
