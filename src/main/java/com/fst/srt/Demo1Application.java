package com.fst.srt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fst.srt.entities.Classes2;
import com.fst.srt.entities.Etudiants2;

@SpringBootApplication
public class Demo1Application {
		public static List<Etudiants2> Etudiantss2 = new ArrayList<>();
		public static List<Classes2> Classess2 = new ArrayList<>();

	public static void main(String[] args) {

			Etudiants2 E1 = new Etudiants2 (1,"ben khlif ","oumayma","tunis","oumayma@hotmail.com"); 		
			Etudiants2 E2 = new Etudiants2 (2,"hassnaoui","marwa","jerba","marwa@hotmail.com"); 
			Etudiants2 E3 = new Etudiants2 (3,"saadani","mayar","bizerte","mayar@hotmail.com");  
			Etudiantss2.add(E1);	
			Etudiantss2.add(E2);
			Etudiantss2.add(E3);
			
			
			
			Classes2 C1 = new Classes2 (1,"info","FST","formation en presentiel","MSRT2"); 		
			Classes2 C2 = new Classes2 (2,"physique","FST","formation a distance","LTIC3"); ; 
			Classes2 C3 = new Classes2 (3,"science","FST","formation en presentiel","LSVT2"); ; 
			Classess2.add(C1);	
			Classess2.add(C2);
			Classess2.add(C3);
			
		SpringApplication.run(Demo1Application.class, args);
	}

}
