package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
      //  ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(Beanconfig.class);

        Doctor doctor = (Doctor) context.getBean("doctor");
        Nurse nurse = context.getBean(Nurse.class);
        nurse.assisst();
        doctor.assisst();
        doctor.setQualifcations("MBBS");
        System.out.println(doctor);
        Doctor doctor1= context.getBean(Doctor.class);
        System.out.println(doctor1);
    }

}
