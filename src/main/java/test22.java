import java.util.ArrayList;
import java.util.List;

public class test22 {

    public enum VisitState {
        NOT_VISITED("Not_Visited"),
        HALF_VISITED("Half_Visited"),
        FULL_VISITED("Full_Visited");

        private String value;

        VisitState(String labelKey) {
            this.value = labelKey;
        }

        public String value() {
            return value;
        }
    }
    public static void main(String[] args) {

        System.out.println(VisitState.FULL_VISITED.value());
    }
    public void featureAddeddToExistingBranch() {
        System.out.println("feature addedd to exsiting branch");
    }
}
