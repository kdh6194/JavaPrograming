package honeybee.project.sungjuk;

import honeybee.project.sungjuk.service.SungJukV1cService;
import honeybee.project.sungjuk.service.SungJukV1cServicelmpl;


public class SungJukV1cMain {
    public static void main(String[] args) {
        SungJukV1cService sjsrv = new SungJukV1cServicelmpl();

        while (true) {
            int menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }
    }

}
