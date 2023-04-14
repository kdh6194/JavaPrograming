package honeybee.project.sungjuk.dao;

import honeybee.project.sungjuk.model.SungJukVO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

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

    // 파일에 저장된 성적 데이터들을 모두 읽어서
    // ArrayList 객체에 저장하고 리턴
    @Override
    public List<SungJukVO> loadSungJuk() {
        List<SungJukVO> sjdata = new ArrayList<>();

        try {
            fr = new FileReader(fname);
            br = new BufferedReader(fr);

            while(br.ready()){
                // 파일에서 성적데이터 한줄을 읽어서
                // SungJuk 객체에 개별 값을 저장하고
                // ArrayList 객체에 저장
               String[] val = br.readLine().split("[ ]");

               SungJukVO sj = new SungJukVO(val[0],Integer.parseInt(val[1]),
                       Integer.parseInt(val[2]),Integer.parseInt(val[3]),
                       Integer.parseInt(val[4]),Double.parseDouble(val[5]),
                       val[6].charAt(0));

               sjdata.add(sj);
            }

        } catch (Exception e) {
            System.out.println("성적 데이터 저장중 오류발생");
            System.out.println(e.getMessage());

        }finally {
            if(br != null) try {br.close();} catch (Exception ex) {}
            if(fr != null) try {fr.close();} catch (Exception ex) {}
        }
        return sjdata;
    }
}
