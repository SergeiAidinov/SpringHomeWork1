package ru.yandex.incoming34;

import org.springframework.stereotype.Component;

@Component("timeTable")
public class TimeTable implements PatientInterface{

	public String perform() {
		return "Я знаю расписание работы врача!";
	}

}
