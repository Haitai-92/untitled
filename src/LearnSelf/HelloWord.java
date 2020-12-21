package LearnSelf;


import com.health.bean.Customer;

import java.util.ArrayList;

public class HelloWord {

    public static void main(String[] args)
    {
        System.out.println("Hello world!!!");
        ArrayList list = new ArrayList();
        list.add("张爽啊1");
        list.add("张爽啊2");
        list.add("张爽啊3");
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        if (args != null) {

        }

    }

    private static final Customer cust=new Customer();
}
