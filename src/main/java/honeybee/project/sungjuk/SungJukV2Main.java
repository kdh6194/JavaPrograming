package honeybee.project.sungjuk;

import honeybee.project.sungjuk.service.SungJukV1cService;
import honeybee.project.sungjuk.service.SungJukV2Servicelmpl;


public class SungJukV2Main {
    public static void main(String[] args) {
        SungJukV1cService sjsrv = new SungJukV2Servicelmpl();

        while (true) {
            int menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }
    }

}
