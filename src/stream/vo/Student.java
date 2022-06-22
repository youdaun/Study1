package stream.vo;

/**
 * <pre>
 * Statemnts
 * </pre>
 *
 * @ClassName   : Student.java
 * @Description  :
 * @author : user
 * @since 2022-06-22
 * @version 1.0
 * @see
 * @Modification Information
 * <pre>
 * since                 author                           description
 * =============== ================= =========================================
 * 2022-06-22 user                 최초생성
 * </pre>
 */
public class Student {
    private String studentId;
    private String studentNm;
    private int score;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentNm() {
        return studentNm;
    }

    public void setStudentNm(String studentNm) {
        this.studentNm = studentNm;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {

    }

    public Student(int score, String studentNm) {
        this.score = score;
        this.studentNm = studentNm;
    }

    @Override public String toString() {
        return "Student{" + "studentId='" + studentId + '\'' + ", studentNm='" + studentNm + '\''
                        + ", score=" + score + '}';
    }
}
