import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.InputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
	
	private static final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private static final ByteArrayOutputStream err = new ByteArrayOutputStream();
	private static final PrintStream originalOut = System.out;
	private static final PrintStream originalErr = System.err;
	private static final InputStream originalIn = System.in;

	@BeforeEach
	void setUp() throws Exception {
	    System.setOut(new PrintStream(out));
	    System.setErr(new PrintStream(err));
	}

	@AfterEach
	void tearDown() throws Exception {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	    System.setIn(originalIn);
	}

	@Test
	void test() throws IOException {
		byte[] initialArray = "Crystal".getBytes();
	    InputStream targetStream = new ByteArrayInputStream(initialArray);
		System.setIn(targetStream);
	    HelloWorld.main(null);
	    String outputString = out.toString().strip();
	    outputString = outputString.replace( '\r', ' ');
	    	assertEquals("Please input your name: \r\nHello, Crystal", out.toString().strip());
	    
	}

}
