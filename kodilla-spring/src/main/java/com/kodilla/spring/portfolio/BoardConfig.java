package com.kodilla.spring.portfolio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    @Scope("prototype")
    public Board createArrayOfTaskLists() {
        return new Board(createListToDo(),createInProgressList(),createDoneList());
    }

    @Bean
    @Scope("prototype")
    public TaskList createListToDo() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList createInProgressList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList createDoneList() {
        return new TaskList();
    }
}
