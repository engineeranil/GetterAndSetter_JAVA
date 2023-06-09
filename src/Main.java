public class Main {
    public static void main(String[] args) {
        GetterSetterDemo g = new GetterSetterDemo("Tugce",23);
        System.out.println(g.year);
        g.print();
        System.out.println(g.getName());
        g.setName("ALI");
        System.out.println(g.getName());
    }

}
