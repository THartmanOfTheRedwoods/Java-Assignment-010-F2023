class Student{
    private String name;
    private int rollNo;

    Student(String s, int r)
    {
        name = s;
        rollNo = r;
    }

    void methodForDisplay()
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        Student obj1=new Student("Rambo",21);
        obj1.methodForDisplay();
    }
}