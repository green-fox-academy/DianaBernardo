import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

  Animal cow;

  @BeforeEach
  void setUp() {
    cow = new Animal();
  }

  @Test
  void checkIfEatingDiminishesHunger() {
    assertEquals(49, cow.eat());
  }

  @Test
  void checkIfDrinkingDiminishesThirst() {
    assertEquals(49,cow.drink());
  }

  @Test
  void checkIfPlayIncreasesHungerAndThirst() {
    cow.play();
    assertEquals(51,cow.hunger);
    assertEquals(51,cow.thirst);
  }
}