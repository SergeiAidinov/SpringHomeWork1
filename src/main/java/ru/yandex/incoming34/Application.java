package ru.yandex.incoming34;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Patient patient = context.getBean("patient", Patient.class);
		Patient patient1 = context.getBean("patient", Patient.class);
		patient.getMedicalCare();
		patient1.getMedicalCare();
		((AbstractApplicationContext) context).close();
		

	}

}
