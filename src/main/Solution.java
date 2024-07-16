package main;
public class Solution {

    public static void main(String[] args) {
        int[] T = {0, 0, 1, 1};
        int days = minDaysToLearnAllSkills(T);
        System.out.println("Minimum days required: " + days);
    }

    private static int minDaysToLearnAllSkills(int[] T) {
        int[] daysToLearn = new int[T.length];
        int maxDays = 0;

        for (int i = 0; i < T.length; i++) {
            int days = dfs(i, T, daysToLearn);
            maxDays = Math.max(maxDays, days);
        }

        return maxDays;
    }

    private static int dfs(int skill, int[] T, int[] daysToLearn) {
        if (daysToLearn[skill] > 0) {
            return daysToLearn[skill];
        }

        int dependenciesDays = 0;

        if (T[skill] != skill) {
            dependenciesDays = dfs(T[skill], T, daysToLearn);
        }

        daysToLearn[skill] = 1 + dependenciesDays;
        return daysToLearn[skill];
    }
}
