import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   public void q1Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q1();

     // assertion
     assertEquals("Hello World\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q2Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q2();

     // assertion
     assertEquals(" Hello there big fella\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q3Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q3();

     // assertion
     assertEquals("4\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void q4Test()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q4();

     // assertion
     assertEquals("5.3\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}
