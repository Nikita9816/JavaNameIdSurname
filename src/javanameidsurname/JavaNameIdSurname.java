/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanameidsurname;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JavaNameIdSurname {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя ползователя - ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию пользователя");
        String surname = scanner.nextLine();
        System.out.println("Введите личный код пользвателя");
        String id = scanner.nextLine();
        String year = (id.substring(1,3));
        String day = (id.substring(5,7));
        String month = (id.substring(3,5));
        
        //System.out.printf("Вся информация -\t"+name+surname+id);
        System.out.print("\t"+name);
        System.out.print("\t"+surname);
        System.out.println(" родился " + day +" числа " + year + " года " + month + " месяца ");
        
       
        
        
        
        
        
        
        
                
        
        
        
        
                
                
        
    }
    
}
