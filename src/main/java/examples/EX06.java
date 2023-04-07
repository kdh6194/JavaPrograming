package examples;

import java.util.StringJoiner;

public class EX06 {
    public static void main(String[] args) {
        // board 테이블에 대응하는 클래스 작성

        // employees, departments 테이블에 대응하는 클래스 작성

    }

    class Board {
    private int bno;
    private String title;
    private String userid;
    private String regdate;
    private int views;
    private String contents;

    public Board() {
    }

    public Board(int bno, String title, String userid, String regdate, int views, String contents) {
        this.bno = bno;
        this.title = title;
        this.userid = userid;
        this.regdate = regdate;
        this.views = views;
        this.contents = contents;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %s %d %s \n";
        return String.format(fmt,bno,title,userid,regdate,views,contents);
    }
  }
}
class EmployeesVO {
    private int employeeid;
    private String firstname;
    private String lastname;
    private String Eamil;
}

class SungJukVO {}