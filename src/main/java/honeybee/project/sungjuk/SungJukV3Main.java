package honeybee.project.sungjuk;

import honeybee.project.sungjuk.service.SungJukV1cService;
import honeybee.project.sungjuk.service.SungJukV3Servicelmpl;


public class SungJukV3Main {
    public static void main(String[] args) {
        SungJukV1cService sjsrv = new SungJukV3Servicelmpl();

        while (true) {
            int menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }
    }

}
