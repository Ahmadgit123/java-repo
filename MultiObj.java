public class MultiObj {
    int stuid;
    String name;
    String clgName;
    String sem;

    public MultiObj() {
        
    }

    public void displayDetails() {
        System.out.println("Student ID: " + stuid);
        System.out.println("Name: " + name);
        System.out.println("College Name: " + clgName);
        System.out.println("Semester: " + sem);
    }

    public static void main(String[] args) {
        MultiObj student1 = new MultiObj();
        student1.stuid = 44;
        student1.name = "Ahmad Ziya";
        student1.clgName = "SRM University";
        student1.sem = "second";
        
        student1.displayDetails();
    }
}
