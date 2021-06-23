/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.model;

data class User(var id: String = ""
, var firstName: String = ""
, var lastName: String = ""
, var email: String = "") {

    override fun toString(): String {
        return StringBuffer().append(email).toString();
    }
}
