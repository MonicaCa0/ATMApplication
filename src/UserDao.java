import Models.User;

public interface UserDao {

    void addUser(User user);

    void deleteUser(User user, int id);

}
