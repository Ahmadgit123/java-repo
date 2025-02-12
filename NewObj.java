public class NewObj {
    String message;

    public NewObj(String msg) {
        this.message = msg;
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        try {
            
            Class<?> clazz = Class.forName("NewObj");

            NewObj obj1 = (NewObj) clazz.getConstructor(String.class).newInstance("Welcome to GitHub");
            NewObj obj2 = (NewObj) clazz.getConstructor(String.class).newInstance("Using VSCode!");

            obj1.displayMessage();
            obj2.displayMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

