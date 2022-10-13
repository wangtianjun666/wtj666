package sy2;

import java.util.Scanner;

public class Teachers { 
    Scanner input = new Scanner(System.in);
    public int number;
    public String name;
    public String sex;
    public Curriculums[] curriculums;

    public Teachers(int number, String name, String sex, Curriculums[] curriculums) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.curriculums = curriculums;
    }

    public void openCurriculums(Teachers teacher, int n, Curriculums curriculums1) { //开课方法
        teacher.curriculums[n] = curriculums1;
        System.out.println(teacher.name + "开设" + teacher.curriculums[n].curriculumsname + "课程成功");
    }
}

