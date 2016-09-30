package top.pigo.riceroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author : zhuzhenglin
 * @Date : 16/9/29 23:55
 * @Email : zhenglin.zhu@xfxb.net
 * @Since : v1.0
 */
@SpringBootApplication(scanBasePackages = {"top.pigo.riceroll.service","top.pigo.riceroll.dao"})
public class RiceRollBootApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(RiceRollBootApplication.class);

        application.run(args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("<==============      The RiceRoll server is running....       ===============>");
    }
}
