import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {
        // Redirect standard output to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        Main.main(new String[]{});

        // Get the printed output
        String printedOutput = outputStream.toString();

        // Assert that the output matches the expected output
        assertEquals("Turkey:Gobble gobble...\n"+"Turkey:Short distance flight...\n"+"Mallard duck: I'm flying with wings!\n" +
                     "Redhead duck: I'm flying with wings!\n" +
                     "Rubber duck: I can't fly!\n" +
                     "Mallard duck with rocket: I'm flying with a rocket!\n"+
                     "Turkey adapted to duck: Turkey is flying (adapted)\n", printedOutput);
    }
}
