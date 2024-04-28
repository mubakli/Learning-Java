import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmailSender.sendPlainTextEmail("brkasarcikli.com",
                "serpil.ustebay@gmail.com",
                "Email örneği",
                "Selam Jakarta",
                true);
    }
}