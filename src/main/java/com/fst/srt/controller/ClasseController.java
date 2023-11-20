package com.fst.srt.controller;
import java.util.ArrayList;
 import java.util.List;
 
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

 
import static com.fst.srt.Demo1Application.Classess2;
 import com.fst.srt.entities.Classes2;

//Un contrôleur est une classe Java portant l’annotation @Controller,nous permettre de gérer les requêtes HTTP  
@Controller
@RequestMapping("/classe")
//**@RequestMapping annotation utilisée pour mapper des méthodes de contrôleur
public class ClasseController {
		
	@RequestMapping("/infoclasse")
 	public String classetest(Model model)
	{
		model.addAttribute("Classess2",Classess2);
		return "classe.html";
		}

//différence entre @RequestMapping et @GetMapping ?
// RequestMapping plus général nesta3melha l différents types de requêtes kima http w JSON w XML ema getmapping plus spécifique !! kn l les requêtes http.
//* maaneha k yebda contrôleur ne répond qu'aux requêtes HTTP GET,@RequestMapping par @GetMapping kifkif

@GetMapping("/ajoutClasse") 
 
	public String publier()
	{
		return "ajoutClasse.html";
	}
	
	@PostMapping("/ajoutClasse")
 
	public String ajouter(@RequestParam("id") int id,@RequestParam("departement")String departement, @RequestParam("faculte") String faculte,
			@RequestParam("type_de_formation")String type_de_formation, @RequestParam("niveau") String niveau) {
		Classes2 C4 = new Classes2(id,departement,faculte,type_de_formation,niveau);
		Classess2.add(C4);
		return "redirect:/classe/infoclasse";

	}
	

	@GetMapping("delete/{id}")
 	public String delete(@PathVariable("id") int id)
	{
 		for(Classes2 c:Classess2)
		{
		if(c.getId()==id)
		{
			Classess2.remove(c);
				break;
		}}
		
 	    return "redirect:../infoclasse";
				
	}
  
 
//new
 
@GetMapping("/modifier/{id}")
public String afficherFormulaireModification(@PathVariable int id, Model model) {
// Rechercher la classe avec l'ID spécifié (vous devez implémenter cette logique)
for (Classes2 c : Classess2) {
if (c.getId() == id) {
model.addAttribute("classe", c);

		            }}
return "classeModifier"; }

	    @PostMapping("/modifier")
	    public String traiterFormulaireModificationPost(
	            @RequestParam int id,
	            @RequestParam String departement,
	            @RequestParam String faculte,
	            @RequestParam String type_de_formation,
	            @RequestParam String niveau) {

 	        for (Classes2 c : Classess2) {
	            if (c.getId() == id) {
	                c.setDepartement(departement);
	                c.setFaculte(faculte);
	                c.setType_de_formation(type_de_formation);
	                c.setNiveau(niveau);
	                break;
	            }
	        }

 	        return "redirect:/classe/infoclasse";
	    }

 
}
	   
