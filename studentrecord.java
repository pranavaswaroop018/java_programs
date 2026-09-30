public class studentrecord {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        studentrecord s = new studentrecord();

        s.name = "Rahul";
        s.marks = 85;

        s.display();
    }
}

