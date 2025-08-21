import java.util.*;
class CLLI {
    static class Student{
        String name;
        double marks;
        Student(String s,double m){
            name = s;
            marks = m;
        }
        void printData(){
            System.out.print("Name : "+name);
            System.out.println("  Marks : "+ marks);
        }
    }
    public static void main(String[] args) {
        LinkedList<String> L1 = new LinkedList<>();
        L1.add("Surat");
        L1.add("Ahmedabad");
        L1.add("Vadodara");
        L1.add("Bhavnagar");

        Iterator<String> itr = L1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Student sArray[] =new Student[5];
        sArray[0] = new Student("Ram",31.3);
        sArray[1] = new Student("SRam",35.3);
        sArray[2] = new Student("KRam",37.3);
        sArray[3] = new Student("MRam",39.3);
        sArray[4] = new Student("HRam",35.7);

        LinkedList<Student> L2 = new LinkedList<>(Arrays.asList(sArray));

        Iterator<Student> it = L2.iterator();
        while(it.hasNext()){
            Student temp = it.next();
            temp.printData();
        }
    }
}