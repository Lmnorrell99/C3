import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;
import org.junit.jupiter.api.DynamicTest;

public class JTesting {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    // set ups

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }


    @Test
    public void Testing() throws IOException {
        final String input = "";
        final String output = "Hello World";
        provideInput(input);

        Main.main(new String[] {input});

        assertEquals(output, getOutput());
    }

}