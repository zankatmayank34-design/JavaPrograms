package OOPs;

class Course {

    static int MaxCapacity = 120; // Maximum Number of students for any course

    String courseName;
    int enrollmentNo;
    String studentName;
    String[] enrollStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollmentNo = 0;
        this.enrollStudents = new String[MaxCapacity];
    }

    static void SetMaxCapacity(int MaxCapacity){
        Course.MaxCapacity = MaxCapacity;
    }

    void enrollStudents(String studentName){
        if(enrollmentNo < MaxCapacity){
            enrollStudents[enrollmentNo] = studentName;
            enrollmentNo++;
        }
        else{
            System.out.println("Course is full.");
        }
    }
    void unenrollStudents(String studentName){

        int pos = -1;
        int i = 0;
        while (i < enrollStudents.length){
            if (studentName.equals(enrollStudents[i])){
                pos = i;
                break;
            }
            i++;
        }
        if (pos != -1){
            for (i = pos; i < enrollStudents.length - 1; i++){
                enrollStudents[i] = enrollStudents[ i + 1 ];
            }
            enrollStudents[enrollmentNo - 1] = null;
            enrollmentNo--;
            System.out.println(studentName + " is now Unenrolled...");
        } else {
            System.out.println("Error: Entered wrong enrolled student name, PLease Enter Correct Name.");
        }

    }

    void displayStudents(){
        System.out.println("Students in " + courseName);
        for(int i = 0; i < enrollmentNo; i++){
            System.out.println(enrollStudents[i] + " ");
        }

    }

    public static void main(String[] args){
    Course Maths = new Course("Maths");
    Course Science = new Course("Science");

    Maths.enrollStudents("Rahul");
    Maths.enrollStudents("Krish");
    Science.enrollStudents("Dipak");

    Maths.displayStudents();
    Science.displayStudents();

    Maths.unenrollStudents("Krish");
    Maths.displayStudents();
    }
}
