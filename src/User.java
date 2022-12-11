public class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        static void printUserInfo(User user) {
            var id = user.id;
            var name = user.name;
            System.out.println(
                    "User id: " + id + "\n"
                            + "User name: " + name + "\n"
            );
    }
}

