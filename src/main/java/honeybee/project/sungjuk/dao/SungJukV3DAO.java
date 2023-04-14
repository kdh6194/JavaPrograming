package honeybee.project.sungjuk.dao;

import honeybee.project.sungjuk.model.SungJukVO;

import java.util.List;

public interface SungJukV3DAO {

    boolean saveSungJuk(SungJukVO sj);

    List<SungJukVO> loadSungJuk();

    void writeSungJuk(List<SungJukVO> sjs);
}
