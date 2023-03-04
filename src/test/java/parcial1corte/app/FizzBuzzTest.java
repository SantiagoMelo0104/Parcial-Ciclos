package parcial1corte.app;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void prueba_deberia_Fizz(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Act
        String expect = "Fizz";
        String actual = FizzBuzz.fizz_buzz(123);
        //Assert
        Assert.assertEquals(expect, actual);
    }
    @Test
    public void prueba_deberia_Buzz(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Act
        String expect = "Buzz";
        String actual = FizzBuzz.fizz_buzz(50);
        //Assert
        Assert.assertEquals(expect, actual);
    }
    @Test
    public void prueba_deberia_FizzBuzz(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Act
        String expect = "Fizz";
        String actual = FizzBuzz.fizz_buzz(15);
        //Assert
        Assert.assertEquals(expect, actual);
    }

}
