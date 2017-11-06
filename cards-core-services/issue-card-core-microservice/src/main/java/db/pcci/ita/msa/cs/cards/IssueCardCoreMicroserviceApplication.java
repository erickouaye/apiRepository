package db.pcci.ita.msa.cs.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by oprecos on 06.11.2017.
 */

@SpringBootApplication(scanBasePackages={"db.pcci.ita.msa.cs.cards"})
public class IssueCardCoreMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(IssueCardCoreMicroserviceApplication.class, args);}
}
