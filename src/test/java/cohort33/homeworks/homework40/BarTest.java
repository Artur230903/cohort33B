package cohort33.homeworks.homework40;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarTest {

  private Bar bar;

  @BeforeEach
  public void setUp(){
    bar = new Bar();
  }

  @Test
  void addDrinkSuccess(){
    Drink drink = new Drink("Bier", "alcohol", 500);
    Map<String, Drink> resultAllDrinks = bar.getBarCollection();
    Assertions.assertEquals(0,resultAllDrinks.size());
    Assertions.assertTrue(bar.addDrink("1", drink));
    resultAllDrinks = bar.getBarCollection();
    Assertions.assertEquals(1, resultAllDrinks.size());
  }
  @Test
  void addDrinkFailIdNull(){
    Drink drink = new Drink("Bier", "alcohol", 500);
    Assertions.assertFalse(bar.addDrink(null, drink));
  }

  @Test
  void addDrinkFailDrinkNull(){
    Drink drink = null;
    Assertions.assertFalse(bar.addDrink("1", null));
  }

  @Test
  void getDrinkFailIDNull() {
    Drink drink = new Drink("Bier", "alcohol", 500);

  }
  @Test
  void getDrinkSuccess() {
    Drink drink = new Drink("Bier", "alcohol", 500);
    Assertions.assertTrue(bar.addDrink("1", drink));
    Assertions.assertNotNull(bar.getDrink("1"));
    Assertions.assertEquals(drink, bar.getDrink("1"));

  }

  @Test
  void getDrinkFail(){
    Assertions.assertNull(bar.getDrink("2"));

  }

  @Test
  void getBarCollection() {
    Assertions.assertNotNull(bar.getBarCollection());
  }
}