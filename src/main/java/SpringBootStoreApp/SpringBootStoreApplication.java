package SpringBootStoreApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Magazin online cu produse:
// - un ecran in care sa poti cumpara;
// - un ecran in care sa poti edita produsele;
// form-uri, submituri
//frontend => html, css, js
//backend => spring, springmvc, database mysql, hibernate.

//1. DE FACUT TABEL CU PRODUSELE

@SpringBootApplication
public class SpringBootStoreApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootStoreApplication.class, args);

	}
}