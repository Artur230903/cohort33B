package cohort33.lessons.lesson55_231130;

public enum Seasons {

  WINTER("Its cold"), SPRING("Warm"), SUMMER("Hot"), AUTUMN("Wet");

  private final String description;

  Seasons(String description){
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
