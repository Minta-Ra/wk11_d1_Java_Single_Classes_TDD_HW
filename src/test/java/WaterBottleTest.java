import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getBottleVolume());
    }

    @Test
    public void reducesVolumeByDrink(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getBottleVolume());
    }

    @Test
    public void bringsVolumeDownTo0(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getBottleVolume());
    }

    @Test
    public void fillsVolumeBackTo100(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getBottleVolume());
    }
}
