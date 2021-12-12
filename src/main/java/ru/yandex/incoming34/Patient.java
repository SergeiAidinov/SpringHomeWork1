package ru.yandex.incoming34;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("patient")
public class Patient {
	@Autowired
	private Archive archive;
	@Autowired
	private BuildingSchema buildingSchema;
	@Autowired
	private TimeTable timeTable;
	
	public void getMedicalCare() {
		System.out.println("Пациент " + this.hashCode() + ": ");
		System.out.println("	" + (Objects.nonNull(archive) ? archive.perform() : "У меня нет медицинской карты!"));
		System.out.println("	" + (Objects.nonNull(buildingSchema) ? buildingSchema.perform() : "Я не знаю, где находится кабинет врача!"));
		System.out.println("	" + (Objects.nonNull(timeTable) ? timeTable.perform() : "Я не знаю, когда принимает нужный мне врач!"));
	}

}
