package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamMain {
    public static void main(String[] args) {
        Forum users = new Forum();
        Map<Integer, ForumUser> theMapOfUsers = users.getUserList().stream()
                .filter(user -> user.getSex() == ('M'))
                .filter(user -> user.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        theMapOfUsers.entrySet().stream()
                .forEach(System.out::println);

    }
}
