import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

class Practice {
    private static Practice instance;
    
    private Practice() {}
    
    public static Practice getInstance () {
    	if(instance == null) {
    		instance = new Practice();
    	}
    	
    	return instance;
    }
    
    public static void main(String[] args) {
    	System.out.println(Practice.getInstance().hashCode());
    	System.out.println(Practice.getInstance().hashCode());
	}
}
