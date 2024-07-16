package main;

class Arith {
	
	public static void main(String[] args) {
		Arith obj = new Arith();
		int [] arr1 = {0,0,1,1};
		int [] arr2 = {2};
			int result = 	obj.solution(arr1, arr2);
			System.out.println(result);
	}
	
    public int solution(int[] T, int[] A) {
        int[] requiredSkills = new int[T.length];
        int[] result = new int[T.length];
        
        for (int i = 0; i < A.length; i++) {
            int skill = A[i];
            requiredSkills[skill] = 1; // Mark the skill as required
        }
        
        int totalSkillsToLearn = 0;
        for (int i = 0; i < A.length; i++) {
            int skill = A[i];
            if (result[skill] == 0) { // If not already counted
                totalSkillsToLearn += countSkillsToLearn(T, skill, requiredSkills, result);
            }
        }
        
        return totalSkillsToLearn;
    }
    
    private int countSkillsToLearn(int[] T, int currentSkill, int[] requiredSkills, int[] result) {
        if (result[currentSkill] > 0) {
            return result[currentSkill];
        }
        
        if (requiredSkills[currentSkill] == 0) {
            return 0;
        }
        
        int skillsToLearn = 1; // Count the current skill
        if (T[currentSkill] != currentSkill) {
            skillsToLearn += countSkillsToLearn(T, T[currentSkill], requiredSkills, result);
        }
        
        result[currentSkill] = skillsToLearn;
        return skillsToLearn;
    }
}