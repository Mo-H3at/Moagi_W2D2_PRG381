package PracticalQuestions.q6;

import PracticalQuestions.q6.Q6Commercial;
import PracticalQuestions.q6.Q6Domestic;
import PracticalQuestions.q6.Q6Institutional;

public class Q6BillFactory {
    public Q6 getBill(String plan, double bill) {
        if(plan == null){
            return null;
        }
        else if (plan.equalsIgnoreCase("COMMERCIAL")) {
            return new Q6Commercial();
        }
        else if (plan.equalsIgnoreCase("DOMESTIC")) {
            return new Q6Domestic();
        }
        else if (plan.equalsIgnoreCase("INSTITUTIONAL")) {
            return new Q6Institutional();
        }

        return null;
    }
}
