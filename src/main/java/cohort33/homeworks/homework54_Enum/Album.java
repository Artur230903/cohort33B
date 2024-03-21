package cohort33.homeworks.homework54_Enum;

public class Album {

  private String nameOfAlbum;

  private String nameOfCompositor;

  private MusicGenre musicGenre;

  public Album(String nameOfAlbum, String nameOfCompositor, MusicGenre musicGenre) {
    this.nameOfAlbum = nameOfAlbum;
    this.nameOfCompositor = nameOfCompositor;
    this.musicGenre = musicGenre;
  }

  public MusicGenre getMusicGenre() {
    return musicGenre;
  }

  @Override
  public String toString() {
    return "nameOfAlbum: " + nameOfAlbum + ", nameOfCompositor: " + nameOfCompositor
        + ", description: " + "\"" + musicGenre.getDescription() + "\"";
  }
}
