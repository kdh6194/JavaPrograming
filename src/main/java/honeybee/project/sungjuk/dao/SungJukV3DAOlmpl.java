package honeybee.project.sungjuk.dao;

import honeybee.project.sungjuk.model.SungJukVO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SungJukV3DAOlmpl implements SungJukV3DAO {

    private String fname = "c:/Java/sungjukv3.dat";
    private FileWriter fw = null;
    private FileReader fr = null;
    private BufferedWriter bw = null;
    private BufferedReader br = null;

    @Override
    public boolean saveSungJuk(SungJukVO sj) {
        // 생성된 성적 데이터를 파일에 저장
        // 파일을 누적해서 작성하려면 추가 기능을 활성화해야됨
        // FileWriter 두번째 파라미터에 true라 작성하면 활성화됨
        try {
            fw = new FileWriter(fname,true);
            bw = new BufferedWriter(fw);

            bw.write(sj.toString()); // 파일에 저장(기록)

        } catch (Exception e) {
            System.out.println("성적 데이터 저장중 오류발생");
            System.out.println(e.getMessage());
            return false;
        }finally {
            if(bw != null) try {bw.close();} catch (Exception ex) {}
            if(fw != null) try {fw.close();} catch (Exception ex) {}
        }
        return true;
    }
}
