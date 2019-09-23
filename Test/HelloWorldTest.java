import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

    public void testGetHelloNavn() {
        String resultat;

        resultat = HelloWorld.getHelloNavn("Laila");
        assertEquals("Hello Laila!", resultat);

        resultat = HelloWorld.getHelloNavn("Toke");
        assertEquals("Hello Toke!", resultat);

        resultat = HelloWorld.getHelloNavn("René");
        assertEquals("Hello René!", resultat);

        resultat = HelloWorld.getHelloNavn("Mik    ");
        assertEquals("Hello Mik!", resultat);

        resultat = HelloWorld.getHelloNavn("System.out.println(\"noget\")");
        assertEquals("Hello System.out.println(\"noget\")!", resultat);
    }

    public void testGetHelloNavnForEmptyInput() {
        String resultat;

        resultat = HelloWorld.getHelloNavn("");
        assertEquals("Hello!", resultat);

        resultat = HelloWorld.getHelloNavn(" ");
        assertEquals("Hello!", resultat);

        resultat = HelloWorld.getHelloNavn("    ");
        assertEquals("Hello!", resultat);
    }

    public void testGetHelloNavnForForeignChars() {
        String resultat;
        resultat = HelloWorld.getHelloNavn("Станислав");
        assertEquals("Привет Станислав!", resultat);
    }
}