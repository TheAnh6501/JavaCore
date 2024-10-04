package Lab06;

import java.util.ArrayList;

public class Lab_06_B2 {

    public static void main(String[] args) {
        Student st1 = new Student("Nguyễn Văn A", "SV001");
        Student st2 = new Student("Trần Văn B", "SV002");
        Student st3 = new Student("Võ Văn C", "SV003");
        Student st4 = new Student("Vũ Văn D", "SV004");
        Student st5 = new Student("Lê Văn E", "SV005");

        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(st5);
        arr.add(st4);
        arr.add(st3);
        arr.add(st2);
        arr.add(st1);

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getName().startsWith("Nguyễn")){
                System.out.println("Starts with Nguyễn: " + arr.get(i));
            }
        }
        System.out.println("Check arr: " + arr);
    }
}
