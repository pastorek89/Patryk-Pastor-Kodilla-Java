package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic helpForumTopic = new JavaHelpForumTopic();
        ForumTopic toolsForumTopic = new JavaToolsForumTopic();
        ForumUser patrykPastor = new ForumUser("Patryk Pastor");
        ForumUser karolinaPastor = new ForumUser("Karolina Pastor");
        ForumUser adrianFatyga = new ForumUser("Adrian Fatyga");
        toolsForumTopic.registerObserver(patrykPastor);
        toolsForumTopic.registerObserver(karolinaPastor);
        toolsForumTopic.registerObserver(adrianFatyga);
        helpForumTopic.registerObserver(patrykPastor);
        helpForumTopic.registerObserver(karolinaPastor);
        //When
        toolsForumTopic.addPost("Hello guys, got a problem with IntelliJ!");
        toolsForumTopic.addPost("What kind of problem?");
        helpForumTopic.addPost("My computer doesn't work");
        helpForumTopic.addPost("Throw it through the window!");
        toolsForumTopic.addPost("None thx, problem resolved");
        //Then
        Assert.assertEquals(5,patrykPastor.getUpdateCount());
        Assert.assertEquals(5,karolinaPastor.getUpdateCount());
        Assert.assertEquals(3,adrianFatyga.getUpdateCount());
    }
}
