package example.service;

import example.model.*;

import java.util.ArrayList;
import java.util.HashMap;

public class UserServiceImpl(var userMap: HashMap<String,User> = HashMap<String,User>()) : UserService {

    override fun addUser(user: User) {
        userMap.put(user.id, user);
    }

    override fun getUsers(): ArrayList<User> {
        return ArrayList(userMap.values);
    }

    override fun getUser(id: String): User? {
        return userMap.get(id);
    }

    @Throws(UserException::class)
    override fun editUser(forEdit: User): User? {
        try {
            if (forEdit.id == null)
                throw UserException("ID cannot be blank");

            val toEdit: User? = userMap.get(forEdit.id);

            if (toEdit == null)
                throw UserException("User not found");

            if (forEdit.email != null) {
                toEdit.email = forEdit.email;
            }
            if (forEdit.firstName != null) {
                toEdit.firstName = forEdit.firstName;
            }
            if (forEdit.lastName != null) {
                toEdit.lastName = forEdit.lastName;
            }
            if (forEdit.id != null) {
                toEdit.id = forEdit.id;
            }

            return toEdit;
        } catch (ex: Exception) {
            throw UserException("function is dead");
        }

        return null;
    }

    override fun deleteUser(id: String) {
        userMap.remove(id);
    }

    override fun userExist(id: String): Boolean {
        return userMap.containsKey(id);
    }

}
