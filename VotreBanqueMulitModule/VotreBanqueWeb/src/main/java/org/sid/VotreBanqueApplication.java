package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages={"org.sid.repository"})
//@EntityScan(basePackages={"org.sid.metier"})
//@ComponentScan(basePackages={"org.sid.entities","org.sid.metier","org.sid.web"})
public class VotreBanqueApplication  {


	public static void main(String[] args) {
		
		ApplicationContext	ctx=SpringApplication.run(VotreBanqueApplication.class, args);
//		ClientRepository clientRepository=ctx.getBean(ClientRepository.class);
//		CompteRepository compteRepository=ctx.getBean(CompteRepository.class);
//		OperationRepository operationRepository=ctx.getBean(OperationRepository.class);
//		IBanqueMetier banqueMetier=ctx.getBean(IBanqueMetier.class);
//		
//		Client c1=clientRepository.save(new Client("Kassem","kassem@hotmail.fr"));
//		Client c2=clientRepository.save(new Client("l3arbaoui","l3arbaoui@hotmail.fr"));
//		
//         Compte cp1=compteRepository.save(new CompteCourant("c1",new Date(),9000,c1,6000));
//         Compte cp2=compteRepository.save(new CompteEpargne("c2",new Date(),6000,c2,5.5));
//        operationRepository.save(new Versement(new Date(), 9000,cp1));
//        operationRepository.save(new Versement(new Date(), 6000,cp1));
//        operationRepository.save(new Versement(new Date(), 2300,cp1));
//        operationRepository.save(new Retrait(new Date(), 9000,cp1));
//        
//
//        operationRepository.save(new Versement(new Date(), 2300,cp2));
//        operationRepository.save(new Versement(new Date(), 400,cp2));
//        operationRepository.save(new Versement(new Date(), 2300,cp2));
//        operationRepository.save(new Retrait(new Date(), 3000,cp2));
//        
//        banqueMetier.verser("c1", 10000);
	}

}

