package cohort33.lessons.lesson42_231029;

import java.util.ArrayList;
import java.util.Objects;

public class User {

  private int id;

  private String name;

  private ArrayList<User> friends = new ArrayList<>();

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public boolean addFriend(User newFriend) {
    for (User friend : friends) {
      if (friend.getId() == newFriend.getId()) {
        System.out.println("Пользователь с id {} существует в списке друзей " + friend.getId());
        return false;
      }
    }
    return friends.add(newFriend);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof User user)) {
      return false;
    }
    return id == user.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }


  public ArrayList<User> getFriends() {
    return friends;
  }

}
