package sy2;

import java.util.Scanner;

public class TestSchoolSubjects {
    public void menu1() {
        System.out.println("��ӭʹ��ѧ��ѡ��ģ��ϵͳ!" + "\n" + "�˵�:" + "\n" + "1.��ʦ��¼" + "\n" + "2.ѧ����¼" + "\n" + "������1/2ѡ���¼��ʽ");
    }

    public void menu2() {
        System.out.println("��ӭʹ��ѧ��ѡ��ģ��ϵͳ!" + "\n" + "�˵�:" + "\n" + "1.��ʼѡ��" + "\n" + "2.��ʼ�˿�" + "\n" + "������1/2ѡ���¼��ʽ");
    }

    public void reportError() {
        System.out.println("�������|������ֹ");
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
        Teachers MrChen = new Teachers(1, "MrChen", "��", moren1); 
        Students StdChen = new Students(1, "StdChen", "��", moren2); 
        int x = 0;
        while (true) {
            TS.fengexian();
            if (x == 0) {
                System.out.println("��ӭʹ��ѧ��ѡ��ϵͳ" + "\n" + "��δ�н�ʦ����γ̣�����Ĭ��Ϊ���β���" + "\n" + "���ڽ��п��β���!");
                TS.fengexian();
                System.out.println("�ɿ��γ�Ϊ:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                        + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname + "\n"
                        + wulishiyan.curriculumsname + "���ϴ�������Ϊ0~5");
                TS.fengexian();
                System.out.println("������������γ�");
                int z = input.nextInt();
                Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                MrChen.openCurriculums(MrChen, z, moren[z]);
                moren[z].curriculumsTeacher = "MrChen";
                TS.fengexian();
                System.out.println("�Ƿ�������в���?" + "\n" + "1.����" + "\n" + "2.����");
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
                    System.out.println("���ڽ��п��β���!");
                    TS.fengexian();
                    System.out.println("�ɿ��γ�Ϊ:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                            + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname
                            + "\n" + wulishiyan.curriculumsname + "���ϴ�������Ϊ0~5");
                    TS.fengexian();
                    System.out.println("������������γ�");
                    int z = input.nextInt();
                    Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                    MrChen.openCurriculums(MrChen, z, moren[z]);
                    moren[z].curriculumsTeacher = "MrChen";
                } else if (x == 2) {
                    TS.fengexian();
                    TS.menu2();
                    TS.fengexian();
                    int s = input.nextInt();
                    if (s == 1) { //ѧ��ѡ�β���
                        TS.fengexian();
                        System.out.println("���ڽ���ѡ�β���!");
                        TS.fengexian();
                        System.out.println("��ѡ�γ�Ϊ:" + "\n" + gaoshu.curriculumsname + "\n" + wuli.curriculumsname + "\n"
                                + dianlu.curriculumsname + "\n" + xiandai.curriculumsname + "\n" + lisan.curriculumsname
                                + "\n" + wulishiyan.curriculumsname + "���ϴ�������Ϊ0~5");
                        TS.fengexian();
                        Curriculums moren[] = { gaoshu, wuli, dianlu, xiandai, lisan, wulishiyan };
                        int j = input.nextInt();
                        StdChen.choiceCurriculums(StdChen, j, moren[j]);
                    } else if (s == 2) { //ѧ���˿β���
                        System.out.println("���ڽ����˿β���!");
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
                    System.out.println("����ѡ���ѽ��������ڴ�ӡѧ��ѡ����Ϣ"); //�α��ӡ
                    System.out.println("ѧ������:" + StdChen.name + "\n" + "��ѡ�γ�:" + "\n");
                    for (int i = 0; i < 6; i++) {
                        if (StdChen.curriculums[i] == null) {
                            continue;
                        }
                        System.out.print(StdChen.curriculums[i].number + "ح" + StdChen.curriculums[i].curriculumsname
                                + "ح" + StdChen.curriculums[i].place + "ح" + StdChen.curriculums[i].Classtime + "ح"
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
            System.out.println("�Ƿ�������в���?" + "\n" + "1.����" + "\n" + "2.����"); 
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

