package utilisateur.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import utilisateur.demo.entities.Utilisateur;
import utilisateur.demo.repos.UtilisateurRepository;

@Controller
@RequestMapping(path = "/user")
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository userRepository;

	//Persist utilisateur dans la base
	@PostMapping(path = "/create")
	public @ResponseBody Utilisateur addNewUser(@RequestParam String name, @RequestParam String email) {

		Utilisateur user = new Utilisateur();
		user.setFullName(name);
		user.setEmail(email);
		return userRepository.save(user);
	}

	//Lister tout les utilisateurs
	@GetMapping(path = "/all")
	public @ResponseBody List<Utilisateur> getAllUsers() {
		return userRepository.findAll();
	}

}
