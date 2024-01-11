import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Part1Examples {

    @Test
    void testA(){
        Assertions.assertEquals(Main.getIDifValid("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green"), 1);
    }

    @Test
    void testB(){
        Assertions.assertEquals(Main.getIDifValid("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue"), 2);
    }

    @Test
    void testC(){
        Assertions.assertEquals(Main.getIDifValid("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red"), 0);
    }

    @Test
    void testD(){
        Assertions.assertEquals(Main.getIDifValid("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red"), 0);
    }

    @Test
    void testE(){
        Assertions.assertEquals(Main.getIDifValid("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"), 5);
    }
}
