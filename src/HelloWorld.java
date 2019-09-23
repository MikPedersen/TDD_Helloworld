
public class HelloWorld {

    public static String getHelloNavn(String navn) {

        if (navn.trim().equals("")) {
            return "Hello!";
        }
        else if (navn == "Станислав"){
            return "Привет " + navn + "!";
        }
        else ;
        {
            return "Hello " + navn.trim() + "!";
        }
    }
}