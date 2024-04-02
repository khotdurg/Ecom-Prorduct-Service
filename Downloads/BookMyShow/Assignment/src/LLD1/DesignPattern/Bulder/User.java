package LLD1.DesignPattern.Bulder;

public class User {
    private final String userId;
    private final String userName;

    private User(UserBuilder builder){ //created private so that we cannot call directly to the constructor
        //initialize
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Username: "+this.userName+"\nUserId: "+ this.getUserId();
    }

    //inner class to create object
    static class UserBuilder{
        private String userId;
        private String userName;

        public UserBuilder() {
        }

        //writing UserBuilder and return this called method chaining target ti call the methods object itself
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
