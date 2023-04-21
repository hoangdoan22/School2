package homeworkOOPday3_2;

public class MainOOPday3_2 {
	public static void main(String[] args) {
		// Define year
		Year year2011 = new Year();
		year2011.id = 1;
		year2011.name = "2011";

		Year year2012 = new Year();
		year2012.id = 2;
		year2012.name = "2012";

		Year[] years = { year2011, year2012 };

		// Define semester

		Semester semesterIYear2011 = new Semester();
		semesterIYear2011.id = 1;
		semesterIYear2011.name = "Semester I";
		semesterIYear2011.year = year2011;
		semesterIYear2011.multiplication = 1;

		Semester semesterIIYear2011 = new Semester();
		semesterIIYear2011.id = 2;
		semesterIIYear2011.name = "Semester II";
		semesterIIYear2011.year = year2011;
		semesterIIYear2011.multiplication = 2;

		Semester semesterIYear2012 = new Semester();
		semesterIYear2012.id = 3;
		semesterIYear2012.name = "Semester I";
		semesterIYear2012.year = year2012;
		semesterIYear2012.multiplication = 1;

		Semester semesterIIYear2012 = new Semester();
		semesterIIYear2012.id = 4;
		semesterIIYear2012.name = "Semester II";
		semesterIIYear2012.year = year2012;
		semesterIIYear2012.multiplication = 2;

		Semester[] semesters = { semesterIYear2011, semesterIIYear2011, semesterIYear2012, semesterIIYear2012 };

		// Define room
		Room room201 = new Room();
		room201.id = 1;
		room201.name = "Room 201";
		room201.location = "Building A";

		Room room202 = new Room();
		room202.id = 2;
		room202.name = "Room 202";
		room202.location = "Building A";

		Room[] rooms = { room201, room202 };
		// Define primary teacher

		Teacher teacherDung = new Teacher();
		teacherDung.id = 1;
		teacherDung.name = "Dung Nguyen";

		Teacher teacherJayden = new Teacher();
		teacherJayden.id = 2;
		teacherJayden.name = "Jayden";

		Teacher[] teachers = { teacherDung, teacherJayden };

		// Define class
		Clazz class10A1 = new Clazz();
		class10A1.id = 1;
		class10A1.name = "Class 10A1";
		class10A1.room = room201;
		class10A1.primaryTeacher = teacherDung;

		Clazz class10A2 = new Clazz();
		class10A2.id = 2;
		class10A2.name = "Class 10A2";
		class10A2.room = room201;
		class10A2.primaryTeacher = teacherJayden;

		Clazz[] clazzs = { class10A1, class10A2 };

		// Define Student
		Student studentHoang = new Student();
		studentHoang.id = 1;
		studentHoang.name = "Hoang Doan";
		studentHoang.dateOfBirth = "ddmmyyyy";
		studentHoang.clazz = class10A1;

		Student[] students = { studentHoang };

		// Define attendace

		Attendance attendanceDung = new Attendance();
		attendanceDung.id = 1;
		attendanceDung.name = "Dung Nguyen Attendance";
		attendanceDung.teacher = teacherDung;
		attendanceDung.times = 100;

		Attendance attendanceJayden = new Attendance();
		attendanceJayden.id = 2;
		attendanceJayden.name = "Jayden Attendance";
		attendanceJayden.teacher = teacherJayden;
		attendanceJayden.times = 150;

		Attendance[] attendances = { attendanceDung, attendanceJayden };

		// Define Subject

		Subject subjectMath = new Subject();
		subjectMath.id = 1;
		subjectMath.name = "Math";
		subjectMath.multiplication = 2;

		Subject subjectLite = new Subject();
		subjectLite.id = 2;
		subjectLite.name = "Literature";
		subjectLite.multiplication = 1;

		Subject[] subjects = { subjectMath, subjectLite };

		// Define subject detail

		SubjectDetail mathteachDung = new SubjectDetail();
		mathteachDung.id = 1;
		mathteachDung.subject = subjectMath;
		mathteachDung.teacher = teacherDung;

		SubjectDetail liteteachDung = new SubjectDetail();
		mathteachDung.id = 2;
		liteteachDung.subject = subjectLite;
		liteteachDung.teacher = teacherDung;

		SubjectDetail mathteachJayden = new SubjectDetail();
		mathteachJayden.id = 3;
		mathteachJayden.subject = subjectLite;
		mathteachJayden.teacher = teacherJayden;

		SubjectDetail[] subjectDetails = { mathteachDung, liteteachDung, mathteachJayden };

		// Define exam

		Exam examMid = new Exam();
		examMid.id = 1;
		examMid.name = "Mid Exam";

		Exam examFinal = new Exam();
		examFinal.id = 2;
		examFinal.name = "Final Exam";

		Exam[] exams = { examMid, examFinal };

		// Define exam detail
		// HK1 2011

		ExamDetail mathMidSem1Year2011 = new ExamDetail();
		mathMidSem1Year2011.semester = semesterIYear2011;
		mathMidSem1Year2011.student = studentHoang;
		mathMidSem1Year2011.subject = subjectMath;
		mathMidSem1Year2011.exam = examMid;
		mathMidSem1Year2011.multiplication = 1;
		mathMidSem1Year2011.point = 8;
		mathMidSem1Year2011.subPoint = mathMidSem1Year2011.point * mathMidSem1Year2011.multiplication;

		ExamDetail mathFinalSem1Year2011 = new ExamDetail();
		mathFinalSem1Year2011.semester = semesterIYear2011;
		mathFinalSem1Year2011.student = studentHoang;
		mathFinalSem1Year2011.subject = subjectMath;
		mathFinalSem1Year2011.exam = examFinal;
		mathFinalSem1Year2011.multiplication = 2;
		mathFinalSem1Year2011.point = 10;
		mathFinalSem1Year2011.subPoint = mathFinalSem1Year2011.point * mathFinalSem1Year2011.multiplication;

		ExamDetail liteFinalSem1Year2011 = new ExamDetail();
		liteFinalSem1Year2011.semester = semesterIYear2011;
		liteFinalSem1Year2011.student = studentHoang;
		liteFinalSem1Year2011.subject = subjectLite;
		liteFinalSem1Year2011.exam = examFinal;
		liteFinalSem1Year2011.multiplication = 2;
		liteFinalSem1Year2011.point = 9;
		liteFinalSem1Year2011.subPoint = liteFinalSem1Year2011.point * liteFinalSem1Year2011.multiplication;

		// HK2 2011

		ExamDetail mathMidSem2Year2011 = new ExamDetail();
		mathMidSem2Year2011.semester = semesterIIYear2011;
		mathMidSem2Year2011.student = studentHoang;
		mathMidSem2Year2011.subject = subjectMath;
		mathMidSem2Year2011.exam = examMid;
		mathMidSem2Year2011.multiplication = 1;
		mathMidSem2Year2011.point = 7;
		mathMidSem2Year2011.subPoint = mathMidSem2Year2011.point * mathMidSem2Year2011.multiplication;

		ExamDetail mathFinalSem2Year2011 = new ExamDetail();
		mathFinalSem2Year2011.semester = semesterIIYear2011;
		mathFinalSem2Year2011.student = studentHoang;
		mathFinalSem2Year2011.subject = subjectMath;
		mathFinalSem2Year2011.exam = examFinal;
		mathFinalSem2Year2011.multiplication = 2;
		mathFinalSem2Year2011.point = 8;
		mathFinalSem2Year2011.subPoint = mathFinalSem2Year2011.point * mathFinalSem2Year2011.multiplication;

		ExamDetail liteFinalSem2Year2011 = new ExamDetail();
		liteFinalSem2Year2011.semester = semesterIIYear2011;
		liteFinalSem2Year2011.student = studentHoang;
		liteFinalSem2Year2011.subject = subjectLite;
		liteFinalSem2Year2011.exam = examFinal;
		liteFinalSem2Year2011.multiplication = 2;
		liteFinalSem2Year2011.point = 8;
		liteFinalSem2Year2011.subPoint = liteFinalSem2Year2011.point * liteFinalSem2Year2011.multiplication;

		// HK1 2012

		ExamDetail mathMidSem1Year2012 = new ExamDetail();
		mathMidSem1Year2012.semester = semesterIYear2012;
		mathMidSem1Year2012.student = studentHoang;
		mathMidSem1Year2012.subject = subjectMath;
		mathMidSem1Year2012.exam = examMid;
		mathMidSem1Year2012.multiplication = 1;
		mathMidSem1Year2012.point = 6;
		mathMidSem1Year2012.subPoint = mathMidSem1Year2012.point * mathMidSem1Year2012.multiplication;

		ExamDetail mathFinalSem1Year2012 = new ExamDetail();
		mathFinalSem1Year2012.semester = semesterIYear2012;
		mathFinalSem1Year2012.student = studentHoang;
		mathFinalSem1Year2012.subject = subjectMath;
		mathFinalSem1Year2012.exam = examFinal;
		mathFinalSem1Year2012.multiplication = 2;
		mathFinalSem1Year2012.point = 8;
		mathFinalSem1Year2012.subPoint = mathFinalSem1Year2012.point * mathFinalSem1Year2012.multiplication;

		ExamDetail liteFinalSem1Year2012 = new ExamDetail();
		liteFinalSem1Year2012.semester = semesterIYear2012;
		liteFinalSem1Year2012.student = studentHoang;
		liteFinalSem1Year2012.subject = subjectLite;
		liteFinalSem1Year2012.exam = examFinal;
		liteFinalSem1Year2012.multiplication = 2;
		liteFinalSem1Year2012.point = 7;
		liteFinalSem1Year2012.subPoint = liteFinalSem1Year2012.point * liteFinalSem1Year2012.multiplication;

		// HK2 2012

		ExamDetail mathMidSem2Year2012 = new ExamDetail();
		mathMidSem2Year2012.semester = semesterIIYear2012;
		mathMidSem2Year2012.student = studentHoang;
		mathMidSem2Year2012.subject = subjectMath;
		mathMidSem2Year2012.exam = examMid;
		mathMidSem2Year2012.multiplication = 1;
		mathMidSem2Year2012.point = 8;
		mathMidSem2Year2012.subPoint = mathMidSem2Year2012.point * mathMidSem2Year2012.multiplication;

		ExamDetail mathFinalSem2Year2012 = new ExamDetail();
		mathFinalSem2Year2012.semester = semesterIIYear2012;
		mathFinalSem2Year2012.student = studentHoang;
		mathFinalSem2Year2012.subject = subjectMath;
		mathFinalSem2Year2012.exam = examFinal;
		mathFinalSem2Year2012.multiplication = 2;
		mathFinalSem2Year2012.point = 8;
		mathFinalSem2Year2012.subPoint = mathFinalSem2Year2012.point * mathFinalSem2Year2012.multiplication;

		ExamDetail liteFinalSem2Year2012 = new ExamDetail();
		liteFinalSem2Year2012.semester = semesterIIYear2012;
		liteFinalSem2Year2012.student = studentHoang;
		liteFinalSem2Year2012.subject = subjectLite;
		liteFinalSem2Year2012.exam = examFinal;
		liteFinalSem2Year2012.multiplication = 2;
		liteFinalSem2Year2012.point = 9;
		liteFinalSem2Year2012.subPoint = liteFinalSem2Year2012.point * liteFinalSem2Year2012.multiplication;

		ExamDetail[] examDetails = { mathMidSem1Year2011, mathFinalSem1Year2011, liteFinalSem1Year2011,
				mathMidSem2Year2011, mathFinalSem2Year2011, liteFinalSem2Year2011, mathMidSem1Year2012,
				mathFinalSem1Year2012, liteFinalSem1Year2012, mathMidSem2Year2012, mathFinalSem2Year2012,
				liteFinalSem2Year2012 };

		for (Student student : students) {

			System.out.println("Name :" + student.name);
			System.out.println("Class :" + student.clazz.name);
			System.out.println("Primary Teacher :" + student.clazz.primaryTeacher.name);
			System.out.println("---------------------");
			
			for (Year year : years) {
				System.out.println("Year : " + year.name);
				double averagePointYear = 0;
				double totalPointSemester = 0;
				double toltalMultiplicationSemester = 0;

				for (Semester semester : semesters) {
					if (semester.year.id == year.id) {
						double totalSubject = 0;
						double totalMultiplicationSubject = 0;
						double averagePointSemester = 0;

						System.out.println("Semester :" + semester.name);
						System.out.println("");

						for (Subject subject : subjects) {
							System.out.println("Subject :" + subject.name);
							double totalExam = 0;
							double totalMultiplicationExam = 0;
							double averagePointSubject = 0;

							for (ExamDetail examDetail : examDetails) {
								if (examDetail.subject.name == subject.name && examDetail.semester.name == semester.name
										&& examDetail.student.name == student.name
										&& year.id == examDetail.semester.year.id) {
									System.out.println(examDetail.exam.name + "  ---  Point :" + examDetail.point);

									totalExam += examDetail.subPoint;
									totalMultiplicationExam += examDetail.multiplication;
									averagePointSubject = totalExam / totalMultiplicationExam;

								}
							}
							System.out.println("Point of Subject : " + Math.round(averagePointSubject * 100.0) / 100.0);
							System.out.println("--------------------");
							totalSubject += averagePointSubject * subject.multiplication;
							totalMultiplicationSubject += subject.multiplication;
							averagePointSemester = totalSubject / totalMultiplicationSubject;
						}
						System.out.println("Point of Semester : " + Math.round(averagePointSemester * 100.0) / 100.0);
						System.out.println("----------------------------------------------------");
						totalPointSemester += averagePointSemester * semester.multiplication;
						toltalMultiplicationSemester += semester.multiplication;
						averagePointYear = totalPointSemester / toltalMultiplicationSemester;
					}

				}
				System.out.println("Average of Year : " + Math.round(averagePointYear * 100.0) / 100.0);
				System.out.println("----------------------------------------------------");
			}
		}
	}
}
