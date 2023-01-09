package jt.oopnext;

import jt.oopnext.users.Address;
import jt.oopnext.users.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        User myFirstUser = new User("test.test.ch", "09.01.2023", "momo", "toto", new Address(1000, "rue du jura", 11, "lausanne"));

        myFirstUser.setFirstName("vbc");
        
        System.out.println(myFirstUser);

    }

}


// void dans une fonction de Java, cela signifie que la fonction ne renvoie rien.
// public devant une class signifie que l'objet est accesible depuis partout et sinon qu'elle ne l'est pas
