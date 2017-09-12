public class Main {

	public static void main(String[] args)
 {
	//student st=new student(33,"David Luis","1996-09-23",82);
	Student students[] = new Student[3];
	students[0] = new Student();
        students[0].id = 1;
        students[0].fullName = "preetham";
        students[0].birthDate = "1996-09-23";
	students[0].avgMark= 82;
    
        students[1] = new Student();
	students[1].id = 2;
        students[1].fullName = "Suresh";
        students[1].birthDate = "1996-09-22";
	students[1].avgMark= 81;
    
        students[2] = new Student();
	students[2].id = 3;
        students[2].fullName = "Ramesh";
	students[2].birthDate= "1996-09-22";
	students[2].avgMark = 83;
    


	



		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
