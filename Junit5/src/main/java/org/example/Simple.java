package org.example;

interface Simple {
    public boolean Course();
}

class JavaCourse implements Simple{
        public boolean Course(){
            System.out.println("Java Course Purchased");
            return true;
        }
}

class CCourse implements Simple{
    public boolean Course(){
        System.out.println("C Course Purchased");
        return true;
    }
}

class CppCourse implements Simple{
    public boolean Course(){
        System.out.println("CPP Course Purchased");
        return true;
    }
}

class CourseP{
    private Simple course;
    public boolean purchased(Simple course){
        return course.Course();
    }
}