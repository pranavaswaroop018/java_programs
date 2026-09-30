public class employee {
    String name;
    int id;

    employee() {
        name = "Juhith";
        id = 6769;
     }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    public static void main(String[] args) {
        employee e = new employee();

        e.display(); 
    }
}

