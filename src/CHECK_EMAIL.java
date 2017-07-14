import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CHECK_EMAIL {

   private Pattern pattern;
   private Matcher matcher;

   String EMAIL="[a-zA-Z_0-9]*[.[a-zA-Z_0-9]*]*@[a-zA-Z_0-9]*[.[a-zA-Z_0-9]*]*.[a-zA-Z]{2,3}";


    CHECK_EMAIL(){
    pattern=Pattern.compile(EMAIL);
}

        public boolean valid(String enterEMAIL){

        matcher=pattern.matcher(enterEMAIL);
        return matcher.matches();

}

}
