package sy2;

import java.util.Scanner;

public class Students { 
    Scanner input = new Scanner(System.in);
    public int number;
    public String name;
    public String sex;
    public Curriculums[] curriculums;

    public Students(int number, String name, String sex, Curriculums[] curriculums) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.curriculums = curriculums;
    }

    public void choiceCurriculums(Students student, int n, Curriculums curriculums1) { //ѡ�η���
        student.curriculums[n] = curriculums1;
        System.out.println(student.name + "ѡ��" + student.curriculums[n].curriculumsname + "�γ̳ɹ�");
    }

    public void outCurriculums(Students student, int n) {//�˿η���
        System.out.println(student.name + "��ѡ" + student.curriculums[n].curriculumsname + "�γ̳ɹ�");
        student.curriculums[n] = null;
    }
}

