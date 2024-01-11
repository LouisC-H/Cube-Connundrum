import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Part2Examples {

    @Test
    void testA(){
        Assertions.assertEquals(Main.getPowerCubes("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green"), 48);
    }

    @Test
    void testB(){
        Assertions.assertEquals(Main.getPowerCubes("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue"), 12);
    }

    @Test
    void testC(){
        Assertions.assertEquals(Main.getPowerCubes("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red"), 1560);
    }

    @Test
    void testD(){
        Assertions.assertEquals(Main.getPowerCubes("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red"), 630);
    }

    @Test
    void testE(){
        Assertions.assertEquals(Main.getPowerCubes("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"), 36);
    }
}
