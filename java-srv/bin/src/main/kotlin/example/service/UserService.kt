package example.service;

import example.model.User;
import example.model.UserException;

import java.util.ArrayList;

interface UserService {
    fun addUser(user: User);

    fun getUsers(): ArrayList<User>;

    fun getUser(id: String): User?;

    @Throws(UserException::class)
    fun editUser(user: User): User?;

    fun deleteUser(id: String);

    fun userExist(id: String): Boolean;
}
