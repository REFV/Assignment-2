package comm.example;

import comm.example.model.HomeTask;
import comm.example.model.OfficeTask;
import comm.example.model.SocialTask;
import comm.example.repository.HomeTaskRepository;
import comm.example.repository.OfficeTaskRepository;
import comm.example.repository.SocialTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class TasksServiceApplication implements CommandLineRunner {
    private OfficeTaskRepository officeTaskRepository;
    private HomeTaskRepository homeTaskRepository;
    private SocialTaskRepository socialTaskRepository;
    @Autowired
    public OfficeTasksServiceApplication(OfficeTaskRepository officeTaskRepository, HomeTaskRepository homeTaskRepository, SocialTaskRepository socialTaskRepository) {
        this.officeTaskRepository = officeTaskRepository;
        this.homeTaskRepository = homeTaskRepository;
        this.socialTaskRepository = socialTaskRepository;
    }




    public static void main(String[] args) {
        SpringApplication.run(OfficeTasksServiceApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
    officeTaskRepository.save(new OfficeTask(1,"Java learner",5,"In process","25-06-2020","30-06-2020","red"));
    officeTaskRepository.save(new OfficeTask(2,"Angular learner",8,"Not started","15-07-2020","10-10-2020","green"));
    homeTaskRepository.save(new HomeTask(3,"HTML,CSS learner",10,"Completed","20-06-2020","21-06-20","yellow"));
        }
    }


