package com.fst.srt.controller;
import java.util.ArrayList;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fst.srt.entities.Classes2;
import com.fst.srt.entities.Etudiants2;

import static com.fst.srt.Demo1Application.Classess2;
import static com.fst.srt.Demo1Application.Etudiantss2;
import java.util.List;


@Controller
@RequestMapping("/etudiant")
public class EtudiantController {

	@GetMapping("/infoetudiant")
 
	public String classetest(Model model)

	{	 
		model.addAttribute("Etudiantss2",Etudiantss2);
		
		return "etudiant.html";
		}
 
	@GetMapping("/ajout") 
	
	public String publier()
	{
		return "ajout.html";
	}
	//@ResponseBody

	@PostMapping("/ajout")
	public String ajouter(@RequestParam("id") int id,@RequestParam("nom")String nom, @RequestParam("prenom") String prenom,
			@RequestParam("adresse")String adresse, @RequestParam("email") String email) {
		Etudiants2 E4 = new Etudiants2(id,nom,prenom,adresse,email);
		Etudiantss2.add(E4);
		return "redirect:/etudiant/infoetudiant";

	}
	
	
	@GetMapping("delete/{id}")
	//@ResponseBody
	public String delete(@PathVariable("id") int id)
	{
 		for(Etudiants2 c:Etudiantss2)
		{
		if(c.getId()==id)
		{
			Etudiantss2.remove(c);
				break;
		}
		}
		
 	    return "redirect:../infoetudiant";
				
	}

	//modification 
	 
	@GetMapping("/modifier/{id}")
	public String afficherFormulaireModification(@PathVariable int id, Model model) {
	// Rechercher la classe avec l'ID
	for (Etudiants2 c : Etudiantss2) {
	if (c.getId() == id) {
	model.addAttribute("etudiant", c);

			            }}
	return "etudiantModifier2"; }

		 
	
	
	        @PostMapping("/modifier") 
		    public String traiterFormulaireModificationPost(
		            @RequestParam int id,
		            @RequestParam String nom,
		            @RequestParam String prenom,
		            @RequestParam String adresse,
		            @RequestParam String email) {

	 	        for (Etudiants2 c : Etudiantss2) {
		            if (c.getId() == id) {
		                c.setNom(nom);
		                c.setPrenom(prenom);
		                c.setAdresse(adresse);
		                c.setEmail(email);
		                break;
		            }
		        }

	 	        return "redirect:/etudiant/infoetudiant";
		    }
 
}


