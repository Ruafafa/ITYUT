package fun.ruafafa.ityut;

import fun.ruafafa.ityut.constant.TyutCampus;
import fun.ruafafa.ityut.dto.*;

import java.util.List;
import java.util.Map;

public class ITyutUtilProxy {

    private String account;

    private ITyutUtilProxy() {
    }

    public ITyutUtilProxy(String account) {
        this.account = account;
    }

    public boolean isLogin() {
        return ITyutUtil.isLogin(account);
    }

    public Map<String, String> getSemester() {
        return ITyutUtil.getSemester(account);
    }

    public GradeReport getGradeReport() {
        return ITyutUtil.getGradeReport(account);
    }

    public StudentInfo getStudentInfo() {
        return ITyutUtil.getStudentInfo(account);
    }

    public List<CourseGrade> getCourseGrade() {
        return ITyutUtil.getCourseGrade(account);
    }

    public String getTeachingBuildingJSON(TyutCampus campus) {
        return ITyutUtil.getTeachingBuildingJSON(account, campus);
    }

    public List<TeachBuilding> getTeachingBuilding(TyutCampus campus) {
        return ITyutUtil.getTeachingBuilding(account,campus);
    }

    public void onClickEvaluation() {
        ITyutUtil.oneClickEvaluation(account);
    }

    public List<ExamInfo> getExamSchedule() {
        return ITyutUtil.getExamSchedule(account);
    }

    public List<CourseInfo> getCourseListAtCurrentSemester() {
        return ITyutUtil.getCourseListAtCurrentSemester(account);
    }

    public List<CourseInfo> getCourseInfo(String classNumber) {
        return ITyutUtil.getCourse(account, classNumber);
    }

    public List<CourseInfo> getCourseInfo(String semester, String classNumber) {
        return ITyutUtil.getCourse(account, semester, classNumber);
    }

    public void logout() {
        ITyutUtil.logout(account);
    }
}
