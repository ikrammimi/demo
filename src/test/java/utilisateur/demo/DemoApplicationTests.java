package utilisateur.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import utilisateur.demo.entities.Utilisateur;
import utilisateur.demo.repos.UtilisateurRepository;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private UtilisateurRepository utilisateurService;

	@Test
	void contextLoads() {
	}

	@Test
	void testPersist() {
		Utilisateur user = new Utilisateur();
		user.setFullName("test");
		user.setEmail("test@gmail.com");
		Utilisateur userTest = utilisateurService.save(user);
		assertTrue(userTest.equals(user));
	}

	@Test
	void testGetAll() {
		List<Utilisateur> list = utilisateurService.findAll();
		assertTrue(list.size() > 0);
	}

}
