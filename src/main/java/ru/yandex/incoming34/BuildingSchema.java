package ru.yandex.incoming34;

import org.springframework.stereotype.Component;

@Component("buildingSchema")
public class BuildingSchema implements PatientInterface{

	public String perform() {
		return "Я знаю, где находится кабинет врача!";
	}

}
