package cohort33.homeworks.homework36;

import cohort33.homeworks.homework36.Superhero;
import cohort33.homeworks.homework36.SuperheroManager;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuperheroManagerTest {

  List<Superhero> superheroes;

  private SuperheroManager superheroManager;

  @BeforeEach
  void setUp() {
    superheroes = new ArrayList<>();
    superheroManager = new SuperheroManager();
  }

  @Test
  void addSuperheroSucces() {
    Superhero superheroThor = new Superhero("Thor", 10, 1021);
    superheroManager.addSuperhero(superheroThor);
    List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
    int sizeResult = superheroesResult.size();
    Assertions.assertEquals(1, sizeResult);
    Assertions.assertEquals(superheroThor, superheroesResult.get(0));

  }
  @Test
  void addSuperheroFail() {
    Superhero superheroThor = new Superhero("Thor", 10, 1021);
    superheroManager.addSuperhero(superheroThor);
    List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
    int sizeResult = superheroesResult.size();
    Assertions.assertEquals(1, sizeResult);
    superheroManager.addSuperhero(superheroThor);
    Assertions.assertEquals(1, sizeResult);


  }

  @Test
  void removeSuperheroSuccess() {
    Superhero superheroIronMan = new Superhero("Iron Man", 10, 40);
    Superhero superheroBatman = new Superhero("Batman", 9, 40);
    Superhero superheroSuperman = new Superhero("Superman", 10, 33);

    superheroManager.addSuperhero(superheroIronMan);
    superheroManager.addSuperhero(superheroBatman);
    superheroManager.addSuperhero(superheroSuperman);

    List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
    int sizeResult = superheroesResult.size();
    Assertions.assertEquals(3, sizeResult);

    superheroManager.removeSuperhero("Batman");

    List<Superhero> superheroesResultRemove = superheroManager.getAllSuperheroes();
    Assertions.assertEquals(2, superheroesResultRemove.size());

    for (Superhero superhero : superheroesResultRemove){
      Assertions.assertNotEquals("Batman", superhero.getName());
    }


  }
  @Test
  void removeSuperheroFail() {
    Superhero superheroIronMan = new Superhero("Iron Man", 10, 40);
    Superhero superheroBatman = new Superhero("Batman", 9, 40);
    Superhero superheroSuperman = new Superhero("Superman", 10, 33);

    superheroManager.addSuperhero(superheroIronMan);
    superheroManager.addSuperhero(superheroBatman);
    superheroManager.addSuperhero(superheroSuperman);

    List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
    int sizeResult = superheroesResult.size();
    Assertions.assertEquals(3, sizeResult);

    superheroManager.removeSuperhero("Cat");
    List<Superhero> superheroesResultRemove = superheroManager.getAllSuperheroes();
    Assertions.assertEquals(3, superheroesResultRemove.size());

  }

  @Test
  void getSuperheroSuccess() {
    Superhero superhero = new Superhero("Spider-Man", 9, 30);
    superheroManager.addSuperhero(superhero);
    Assertions.assertNotNull(superheroManager.getSuperhero(superhero.getName()));
    Assertions.assertEquals(superhero, superheroManager.getSuperhero(superhero.getName()));
  }
  @Test
  void getSuperheroFail() {
    Superhero superhero = new Superhero("Spider-Man", 9, 30);
    superheroManager.addSuperhero(superhero);
    Assertions.assertNull(superheroManager.getSuperhero("SpiderMan"));
  }

  @Test
  void getAllSuperheroes() {
    Superhero superheroIronMan = new Superhero("Iron Man", 10, 40);
    Superhero superheroBatman = new Superhero("Batman", 9, 40);
    Superhero superheroSuperman = new Superhero("Superman", 10, 33);

    superheroManager.addSuperhero(superheroIronMan);
    superheroManager.addSuperhero(superheroBatman);
    superheroManager.addSuperhero(superheroSuperman);

    List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
    Assertions.assertEquals(3, superheroesResult.size());
    Assertions.assertEquals(superheroIronMan, superheroesResult.get(0));
    Assertions.assertEquals(superheroBatman, superheroesResult.get(1));
    Assertions.assertEquals(superheroSuperman, superheroesResult.get(2));




  }
}