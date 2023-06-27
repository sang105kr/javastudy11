package day13.quiz10;

import java.util.Arrays;

public class ClassRoll {

    private Student2[]	sbook;    // Student 객체들의 배열
    private String	coursename;   // 교과목명
    private final int	size = 30;  // 출석부의 크기
    private int	count;            // 출석부에 있는 사람들의 수


//	생성자메소드: 크기가 30인 빈 출석부 객체를 생성한다

    public ClassRoll() {
        sbook = new Student2[size];
    }

//	setCourseName: 교과목명을 주어진 값으로 변경한다
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
//	getCourseName: 교과목명을 반환한다
    public String getCoursename() {
        return coursename;
    }

//	add: 한 Student 객체를 출석부에 추가한다
    public void add(Student2 student){
        sbook[count] = student;
        count++;
    }

    //	findIndex: 주어진 Student 객체의 출석부내의 위치(index)를 알려 준다
    private int findIndex(String number) {
        int idx = -1;
        for (int i = 0; i < count; i++) {
            if(sbook[i].getNumber().equals(number)){
                idx = i;
                break;
            }
        }
        return idx;
    }

    //	delete: 주어진 Student 객체를 출석부에서 삭제한다
    public void delete(String number) {
        int index = findIndex(number);
        if(index == -1){
            System.out.println("찾고자하는 학생이 없습니다.");
            return;
        }
        for (int i = index; i < count; i++) {
            sbook[i] = sbook[i+1];
        }
        count--;
//        sbook[index] = null;
    }

    //	search: 주어진 Student 객체를 출석부에서 찾아서 출석를 알려준다
    public String search(String number) {
        int index = findIndex(number);
        if (index == -1) {
            System.out.println("찾고자하는 학생이 없습니다.");
            return null;
        }
        String name = sbook[index].getName();
        return name;
    }
//	toString: 출석부의 모든 정보를 알려 준다
    @Override
    public String toString() {
        return "ClassRoll{" +
            "sbook=" + Arrays.toString(sbook) +
            ", coursename='" + coursename + '\'' +
            ", size=" + size +
            ", count=" + count +
            '}';
    }
}
