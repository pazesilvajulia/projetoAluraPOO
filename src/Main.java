public class Main {
    public static void main(String[] args) {

        Cliente cliente = Reader.dataReader();

        Data.dataShow(cliente);
        Menu.menuShow(cliente);

    }
}
