package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "lynx", 'f', LocalDate.of(1988, 6, 30), 5));
        forumUserList.add(new ForumUser(2, "whale", 'm', LocalDate.of(1988, 4, 30), 1));
        forumUserList.add(new ForumUser(3, "saba", 'f', LocalDate.of(1999, 1, 1), 2));
        forumUserList.add(new ForumUser(4, "mathew", 'm', LocalDate.of(2008, 12, 24), 36));
        forumUserList.add(new ForumUser(5, "jack", 'm', LocalDate.of(1983, 3, 8), 1));
    }

    public List<ForumUser> getUserList() { //nazwa metody getForumUserList wydaje mi się bardziej konsekwentna
        return new ArrayList<>(forumUserList);
    }
}
