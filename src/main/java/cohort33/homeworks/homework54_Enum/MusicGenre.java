package cohort33.homeworks.homework54_Enum;

public enum MusicGenre {

  POP("Popular and mainstream music"), ROCK("it`s rock"),
  JAZZ("it`s jazz"), CLASSICAL("it`s classic"),
  ELECTRONIC("it`s electro"), HIPHOP("it`s funny");

  private final String description;

  MusicGenre(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  }
