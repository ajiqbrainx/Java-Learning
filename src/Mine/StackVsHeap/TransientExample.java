package Mine.StackVsHeap;

import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    String username;
    transient String password; // This field will not be serialized

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }
}

public class TransientExample {
    public static void main(String[] args) throws Exception {
        User user = new User("Ajith", "secret123");

        // Serialize the object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"));
        out.writeObject(user);
        out.close();

        // Deserialize the object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.txt"));
        User deserializedUser = (User) in.readObject();
        in.close();

        // Password will be null after deserialization
        System.out.println("After Deserialization: " + deserializedUser);
    }
}
