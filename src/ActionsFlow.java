import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class ActionsFlow {
        List<User> users = new ArrayList<User>();
        Scanner in = new Scanner(System.in);


        public void runActions() {
            while (true) {
                int actionType = choiceActions();
                switch (actionType) {
                    case 1 -> handleFirstAction();
                    case 2 -> handleSecondAction();
                    default -> System.out.println("Wrong action type");
                }
            }
        }

        private int choiceActions() {
            Scanner in = new Scanner(System.in);
            System.out.println("\tchoice your action: \n1:create user\n2:view all users");
            return in.nextInt();
        }

        private void handleFirstAction() {
            System.out.println("\n\tAdd user info please");
            System.out.print("choice new user name: ");
            String newUserName = this.in.nextLine();
            System.out.print("\nchoice new user id: ");
            int newUserId = this.in.nextInt();
            User newUser = new User(newUserId, newUserName);
            this.users.add(newUser);
            User.printUserInfo(newUser);
            onActionSuccess();
        }

        private void handleSecondAction() {
            System.out.println("\n\tHere is user list infos");
            if (this.users.isEmpty()) {
                System.out.println("\nUser list is empty, please add some users");
            } else {
                for (int i = 0; i < this.users.size(); i++) {
                    User.printUserInfo(this.users.get(i));
                }
            }
            onActionSuccess();
        }

        private void onActionSuccess() {
            System.out.println("\naction done successfully\n");
}
    }
}
