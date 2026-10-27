public class User extends checking {

    public User(String Username, String Password) throws InvalidPasswordLengthException {
        super(Username, Password);
    }

    @Override
    public String toString() {
        return getUsername();
    }
}
