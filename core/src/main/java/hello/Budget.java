package hello;

import java.util.HashMap;
import java.util.Map;

public class Budget {
    private Double myBudget;
    private Double myTotalBudget;
    private Map<String,Double> borrow;
    private Map<String,Double> lend;

    public Budget(){
        myBudget = 0.0;
        myTotalBudget = 0.0;
        borrow = new HashMap<String, Double>();
        lend = new HashMap<String, Double>();
    }

    public void setMyBudget(Double myBudget){
        this.myBudget = myBudget;
    }

    public void setBorrow(String borrowName,Double borrowAmount){
        if (borrowName != "" && borrowName != null){
            this.borrow.put(borrowName,borrowAmount);
        }
    }

    public void setLend(String lendName,Double lendAmount){
        if (lendName != "" && lendName != null){
            this.lend.put(lendName,lendAmount);
        }
    }

    public Double getMyTotalBudget(){
        return myTotalBudget;
    }

    public void calculateTotalBudget(){
        myTotalBudget = myBudget;
        for(Map.Entry<String,Double> entry:borrow.entrySet()){
            String borrowName = entry.getKey();
            Double borrowMoney = entry.getValue();
            if (borrowName != "" && borrowMoney!= null){
                myTotalBudget = myTotalBudget + borrowMoney;
            }
        }
        for(Map.Entry<String,Double> entry:lend.entrySet()){
            String lendName = entry.getKey();
            Double lendMoney = entry.getValue();
            if (lendName != "" && lendMoney!= null){
                myTotalBudget = myTotalBudget + lendMoney;
            }
        }
    }
}
