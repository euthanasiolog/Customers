/**
 * Created by Piatrok on 23.10.16.
 */
public class Main {
    public static void main (String[]args)
    {
        Customer [] customers = new Customer[5];
        customers [0] = new Customer("Pit","Kit","Vasich",239,9846_3724_3766_7878L,2384883949L,"Narnia");
        customers [1] = new Customer("Jora","Kit","Palych",239,1847_3724_3766_7878L,2384883949L,"Narnia");
        customers [2] = new Customer("Nik","Zero","Monich",239,3865_3724_3766_7878L,2384883949L,"Narnia");
        customers [3] = new Customer("Loh","Haron","Petrovich",239,5873_3724_3766_7878L,2384883949L,"Narnia");
        customers [4] = new Customer("Odin","Lucer","Kolich",239,2990_3724_3766_7878L,2384883949L,"Narnia");

        long min, max;
        min = 3000_0000_0000_0000L;
        max = 6000_0000_0000_0000L;
        int i;
        for (i =0; i<5;i++)
        {
            long k = customers[i].getCreditCardId();
            if (k>min && k<max)
            {
                System.out.println(customers[i]);
            }
        }
    }
}
