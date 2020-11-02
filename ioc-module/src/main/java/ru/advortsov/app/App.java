package ru.advortsov.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.advortsov.app.service.IService;

/**
 * App.
 *
 * @author Aleksandr_Dvortsov
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.advortsov.app");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        IService iService = (IService) context.getBean("serviceImpl");
        String s = iService.interactWithDaoString();
        System.out.println(s);

    }
}
