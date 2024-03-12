package cohort33.lessons.lesson54_231129_ENUMS;

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
