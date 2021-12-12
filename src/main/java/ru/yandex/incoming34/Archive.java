package ru.yandex.incoming34;

import org.springframework.stereotype.Component;

@Component("archive")
public class Archive implements PatientInterface{

	public String perform() {
		return "Я получил медицинскую карту с номером " + this.hashCode() + " !";
	}

}
