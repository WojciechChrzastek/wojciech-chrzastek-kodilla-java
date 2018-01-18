package com.kodilla.patterns.strategy.social;

import org.junit.*;

import static org.junit.Assert.*;

public class UserTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("user1");
        User user2 = new YGeneration("user2");
        User user3 = new ZGeneration("user3");
        //When
        String user1SharesUsing = user1.sharePost();
        System.out.println("User 1 shares using: " + user1SharesUsing);
        String user2SharesUsing = user2.sharePost();
        System.out.println("User 2 shares using: " + user2SharesUsing);
        String user3SharesUsing = user3.sharePost();
        System.out.println("User 3 shares using: " + user3SharesUsing);
        //Then
        assertEquals("Facebook", user1SharesUsing);
        assertEquals("Twitter", user2SharesUsing);
        assertEquals("Snapchat", user3SharesUsing);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("user1");
        //When
        String user1SharesUsing = user1.sharePost();
        System.out.println("User 1 shares using: " + user1SharesUsing);
        user1.setSharingStrategy(new SnapchatPublisher());
        user1SharesUsing = user1.sharePost();
        System.out.println("User 1 now shares using: " + user1SharesUsing);
        //Then
        assertEquals("Snapchat", user1SharesUsing);
    }
}