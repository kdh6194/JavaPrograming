package honeybee;

public class SungJukV1bMain {
    public static void main(String[] args) {
        SungJukV1bServicelmpl sjsrv = new SungJukV1bServicelmpl();

        while (true) {
            String menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }
    }

}
