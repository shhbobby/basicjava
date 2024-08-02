package create.build;

public class User {
    private String name;
    private int age;
    private String gender;
    private String address;

    //TODO key point
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String gender;
        private String address;
        //TODO key point
        private Builder() {
        }
        //TODO key point
        private static Builder newBuilder() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        //TODO key point
        public User build() {
            return new User(this);
        }

    }
}
