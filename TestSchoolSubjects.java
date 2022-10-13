package sy2;

import java.util.Scanner;

public class TestSchoolSubjects {
    public void menu1() {
        System.out.println("欢迎使用学生选课模拟系统!" + "\n" + "菜单:" + "\n" + "1.教师登录" + "\n" + "2.学生登录" + "\n" + "请输入1/2选择登录方式");
    }

    public void menu2() {
        System.out.println("欢迎使用学生选课模拟系统!" + "\n" + "菜单:" + "\n" + "1.开始选课" + "\n" + "2.开始退课" + "\n" + "请输入1/2选择登录方式");
    }

    public void reportError() {
        System.out.println("输入错误|程序终止");
    }

    public void fengexian() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("-----");
        }
        ;
        System.out.println();
    }

    public static void main(String[] args) { 
        TestSchoolSubjects TS = new TestSchoolSubjects();
        Scanner input = new Scanner(System.in);
        Curriculums gaoshu = new Curriculums(1, "gaoshu", "jiao103", "8:00");
        Curriculums wuli = new Curriculums(2, "wuli", "jiao300", "13:00");
        Curriculums dianlu = new Curriculums(3, "dianlu", "jiao201", "14:00");
        Curriculums xiandai = new Curriculums(4, "xiandai", "jiao202", "15:00");
        Curriculums lisan = new Curriculums(5, "lisan", "jiao203", "16:00");
        Curriculums wulishiyan = new Curriculums(6, "wulishiyan", "jiao204", "17:00");
        Curriculums moren1[] = new Curriculums[6];
        Curriculums moren2[] = new Curriculums[6];
        Teachers MrChen = new Teachers(1, "MrChen", "男", moren1); 
        Students StdChen = new Students(1, "StdChen", "男", moren2); 
        int x = 0;
        while (true) {
            TS.fengexian();
            if (x == 0) {
                System.out.println("欢迎使用学生选课系统" + "\n" + "还未有教师开设课程，本次默认为开课操作" + "\n" + "正在进行开课操作!");
                TS.fengexian();
                System.out.println("可开课程为:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                        + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname + "\n"
                        + wulishiyan.curriculumsname + "以上次序依次为0~5");
                TS.fengexian();
                System.out.println("请输入所开设课程");
                int z = input.nextInt();
                Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                MrChen.openCurriculums(MrChen, z, moren[z]);
                moren[z].curriculumsTeacher = "MrChen";
                TS.fengexian();
                System.out.println("是否继续进行操作?" + "\n" + "1.继续" + "\n" + "2.结束");
                TS.fengexian();
                x = input.nextInt();
                if (x == 1) {
                    continue;
                }
                TS.fengexian();
                break;
            } else {
                TS.menu1();
                TS.fengexian();
                x = input.nextInt();
                if (x == 1) { 
                    System.out.println("正在进行开课操作!");
                    TS.fengexian();
                    System.out.println("可开课程为:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                            + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname
                            + "\n" + wulishiyan.curriculumsname + "以上次序依次为0~5");
                    TS.fengexian();
                    System.out.println("请输入所开设课程");
                    int z = input.nextInt();
                    Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                    MrChen.openCurriculums(MrChen, z, moren[z]);
                    moren[z].curriculumsTeacher = "MrChen";
                } else if (x == 2) {
                    TS.fengexian();
                    TS.menu2();
                    TS.fengexian();
                    int s = input.nextInt();
                    if (s == 1) { //学生选课操作
                        TS.fengexian();
                        System.out.println("正在进行选课操作!");
                        TS.fengexian();
                        System.out.println("可选课程为:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                                + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname
                                + "\n" + wulishiyan.curriculumsname + "以上次序依次为0~5");
                        TS.fengexian();
                        Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                        int j = input.nextInt();
                        StdChen.choiceCurriculums(StdChen, j, moren[j]);
                    } else if (s == 2) { //学生退课操作
                        System.out.println("正在进行退课操作!");
                        TS.fengexian();
                        int p = input.nextInt();
                        StdChen.outCurriculums(StdChen, p);
                    } else {
                        TS.fengexian();
                        TS.reportError();
                        TS.fengexian();
                        break;
                    }
                    TS.fengexian();
                    System.out.println("本次选课已结束，正在打印学生选课信息"); //课表打印
                    System.out.println("学生姓名:" + StdChen.name + "\n" + "所选课程:" + "\n");
                    for (int i = 0; i < 6; i++) {
                        if (StdChen.curriculums[i] == null) {
                            continue;
                        }
                        System.out.print(StdChen.curriculums[i].number + "丨" + StdChen.curriculums[i].curriculumsname
                                + "丨" + StdChen.curriculums[i].place + "丨" + StdChen.curriculums[i].Classtime + "丨"
                                + StdChen.curriculums[i].curriculumsTeacher + "\n");
                    }
                    TS.fengexian();
                } else {
                    TS.fengexian();
                    TS.reportError();
                    TS.fengexian();
                    break;
                }
            }
            ;
            System.out.println("是否继续进行操作?" + "\n" + "1.继续" + "\n" + "2.结束"); 
            TS.fengexian();
            int y = input.nextInt();
            if (y == 1) {
                continue;
            } else if (y == 2)
                break;
            else {
                TS.fengexian();
                TS.reportError();
                TS.fengexian();
                break;
            }
        }
        input.close();
    }

}

