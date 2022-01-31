import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(200, 300);
    }

    @Test
    public void hasNumOfSheets(){
        assertEquals(200, printer.getNumOfSheets());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(300, printer.getTonerVolume());
    }

    @Test
    public void hasEnoughPaperToPrint(){
        assertEquals(true, printer.print(20, 2));
    }

    @Test
    public void hasNotEnoughPaperToPrint(){
        assertEquals(false, printer.print(100, 3));
    }

    @Test
    public void testReduceTonerVolume(){
        assertEquals(140, printer.reduceTonerVolume(80, 2));
    }

}
