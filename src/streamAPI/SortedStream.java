package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {
	
	static Comparator<User> customSort = new Comparator<User>() {
 		@Override
 		public int compare(User o1, User o2) {
 			//return  o1.getCell(12).getStringCellValue().compareTo(o2.getCell(12).getStringCellValue());
 			String cel1=o1.getName()!=null ? o1.getName()  : "";
 			String cel2=o2.getName()!=null ? o2.getName()  : "";
 			Integer cel3=o1.getAge()!=null ? o1.getAge()  : 0;
  			Integer cel4=o2.getAge()!=null ? o2.getAge()  : 0;
 			return  cel2.compareTo(cel1);
 		}
     };
     
     static Comparator<User> customSortForAge = new Comparator<User>() {
  		@Override
  		public int compare(User o1, User o2) {
  			//return  o1.getCell(12).getStringCellValue().compareTo(o2.getCell(12).getStringCellValue());
  			Integer cel1=o1.getAge()!=null ? o1.getAge()  : 0;
  			Integer cel2=o2.getAge()!=null ? o2.getAge()  : 0;
  			return  cel2.compareTo(cel1);
  		}
      };

    static List<User> users = Arrays.asList(
            new User("Anand", 30),
            new User("wKG", 40),
            new User("wKG1", 10),
            new User("ptwenty", 20));

    public static void main(String[] args) {
        
        /*List<User> sortedList = users.stream()
			.sorted((o1, o2) -> o1.getAge() - o2.getAge())
			.collect(Collectors.toList());*/
		
    	Collections.sort(users,customSort);
    	
		/*
		 * List<User> sortedList = users.stream()
		 * .sorted(Comparator.comparing(User::getName)) .collect(Collectors.toList());
		 */
 
        users.forEach(System.out::println);
        
        System.out.println();
        
        System.out.println();
        
        
        System.out.println();
        
        Collections.sort(users,customSortForAge);
        
        users.forEach(System.out::println);
       
        

    }

    static class User {

        private String name;
        private Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
