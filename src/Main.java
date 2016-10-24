import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Piatrok on 23.10.16.
 */
public class Main {
    public static void main (String[]args) throws IOException
    {
        Customer [] customers = new Customer[5];
        customers [0] = new Customer("Pit","Kit","Vasich",239,9846_3724_3766_7878L,2384883949L,"Narnia");
        customers [1] = new Customer("Jora","Kit","Palych",239,1847_3724_3766_7878L,2384883949L,"Narnia");
        customers [2] = new Customer("Nik","Zero","Monich",239,3865_3724_3766_7878L,2384883949L,"Narnia");
        customers [3] = new Customer("Loh","Haron","Petrovich",239,5873_3724_3766_7878L,2384883949L,"Narnia");
        customers [4] = new Customer("Odin","Lucer","Kolich",239,2990_3724_3766_7878L,2384883949L,"Narnia");

        System.out.println("Список клиентов:");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(customers[i]);
        }

        System.out.println("\nОтсортированный список:");
        Arrays.sort(customers);
        for (int i = 0; i < 5; i++)
        {
            System.out.println(customers[i]);
        }

        long min, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальный номер карточки:");
        min = scanner.nextLong();
        System.out.println("Введите максимальный номер карточки:");
        max = scanner.nextLong();

        System.out.println("\nКлиенты с карточками от " + min + " до " + max);
        for (int i = 0; i < 5; i++)
        {
            long k = customers[i].getCreditCardId();
            if (k > min && k < max)
            {
                System.out.println(customers[i]);
            }
        }


    }
}
