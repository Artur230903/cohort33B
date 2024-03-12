package cohort33.homeworks.homework54_Enum;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {

  public static void main(String[] args) {

    Album albumPop01 = new Album("Pop01", "AAA", MusicGenre.POP);
    Album albumPop02 = new Album("Pop02", "BBB", MusicGenre.POP);
    Album albumClassic01 = new Album("Classic01", "CCC", MusicGenre.CLASSICAL);
    Album albumClassic02 = new Album("Classic02", "DDD", MusicGenre.CLASSICAL);
    albumList.add(albumPop01);
    albumList.add(albumPop02);
    albumList.add(albumClassic01);
    albumList.add(albumClassic02);

   getAlbumsByGenre(MusicGenre.POP);
   getAlbumsByGenre(MusicGenre.CLASSICAL);

  }

  private static List<Album> albumList = new ArrayList<>();

  public static void getAlbumsByGenre(MusicGenre genre){
    for (Album album : albumList){
      if (genre.equals(album.getMusicGenre())){
        System.out.println(album);
      }
    }
  }
}
