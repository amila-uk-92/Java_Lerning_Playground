package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class PlayGround {
    public static void main(String args[]) {

    }

    private static class Payment {

        String from;
        String to;
        Double amount;

        public Payment(String from, String to, Double amount){
            this.amount = amount;
            this.from = from;
            this.to = to;
        }


    }

    private List<Payment> resolveBalances(HashMap<String, Double> balances) {

        List<Payment> paymentList = new ArrayList<>();

        Stack<String> toGet = new Stack<>();
        HashMap<String, Double> toSend = new HashMap<>();

        balances.entrySet().stream().filter(item ->{
            return item.getValue() == 0.0;
        }).forEach(item->{
            if(item.getValue() < 0) toSend.put(item.getKey(), item.getValue());
            if(item.getValue() > 0) toGet.add(item.getKey());
        });

        do{
            toSend.entrySet().forEach(item->{
                Double amountToBePayed = item.getValue();

                Double balanceVal = balances.get(toGet.peek());
                balanceVal = balanceVal + amountToBePayed;

                paymentList.add(new Payment(item.getKey(), toGet.peek(), balanceVal));

                balances.put(toGet.peek(), balanceVal);

                if(balanceVal == 0 ) toGet.pop();
                if(balanceVal < 0) {
                    toGet.pop();
                    toSend.put(toGet.peek(), balanceVal);
                }
            });
        }while (!toGet.empty());

        return paymentList;
    }
}
