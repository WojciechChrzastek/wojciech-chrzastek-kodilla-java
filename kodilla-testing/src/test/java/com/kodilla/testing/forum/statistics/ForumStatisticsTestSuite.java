package com.kodilla.testing.forum.statistics;

import com.github.javafaker.Faker;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        int usersCount = 100;
        List<String> usersNamesList = generateListOfNUsersNames(usersCount);
        int postsCount = 1000;
        int commentsCount = 10;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator.showStatistics();

        //Then
        assertEquals(commentsCount / postsCount, statisticsCalculator.getAvgCommentCountPerPost(), 0);
        assertEquals(commentsCount / usersCount, statisticsCalculator.getAvgCommentCountPerUser(), 0);
        assertEquals(postsCount / usersCount, statisticsCalculator.getAvgPostCountPerUser(), 0);
    }

    private List<String> generateListOfNUsersNames(int usersCount) {
        Faker faker = new Faker();
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            String userName = faker.name().firstName();
            usersNamesList.add(userName);
        }
        return usersNamesList;
    }
}