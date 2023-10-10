package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//       HashMap<String,String> dictionary = new HashMap<>();
//       HashMap<String,Integer> top = new HashMap<>();
//       dictionary.put("ніч","night");
//       top.put("ніч",0);
//       dictionary.put("літо","summer");
//        top.put("літо",0);
//       dictionary.put("ранок","morning");
//        top.put("ранок",0);
//       int menu = -1;
//       while (menu!=0){
//           System.out.print("Оберіть\n0-Вихід\n1-Додати слово до словника\n2-Показати переклад\n3-Видалити слово\n4-Замінити переклад\n5- 10 найпопулярніших слів\n6- 10 не популярных слів\n Ваш вибір: ");
//           menu = scanner.nextInt();
//           scanner.nextLine();
//           switch (menu){
//               case 1:{
//                String word;
//                String translate;
//                System.out.print("Введіть слово: ");
//                word = scanner.nextLine();
//                System.out.print("Введіть переклад: ");
//                translate = scanner.nextLine();
//                if(dictionary.containsKey(word))
//                    System.out.println("Таке слово вже є");
//                else
//                    dictionary.put(word,translate);
//                    top.put(word,0);
//               }break;
//               case 2: {
//                   String word;
//                   System.out.print("Введіть слово яке хочете перевести: ");
//                   word = scanner.nextLine();
//                   if(dictionary.containsKey(word)){
//                       System.out.println(word + " - " + dictionary.get(word));
//                       Integer temp = top.get(word);
//                       temp+=1;
//                       top.put(word,temp);
//                   }
//                   else
//                       System.out.println("Слова немає у словнику");
//               }break;
//               case 3:{
//                   String word;
//                   System.out.print("Введіть слово яке хочете видалити: ");
//                   word = scanner.nextLine();
//                   if(dictionary.containsKey(word))
//                       dictionary.remove(word);
//                   else
//                       System.out.println("Слово не знайдено");
//
//               }break;
//               case 4:{
//                   String word;
//                   String translate;
//                   System.out.print("Введіть слово: ");
//                   word = scanner.nextLine();
//                   System.out.print("Введіть переклад: ");
//                   translate = scanner.nextLine();
//                   dictionary.put(word,translate);
//               }break;
//               case 5:{
//                   List<Map.Entry<String,Integer>> sort = new ArrayList<>(top.entrySet());
//                   sort.sort((i1,i2)->i2.getValue().compareTo(i1.getValue()));
//                   int count = 0;
//                   for (Map.Entry<String,Integer> element :sort){
//                       if (count>=10){
//                           break;
//                       }
//                       System.out.println(element.getKey()+ " - "+element.getValue());
//                       count++;
//                   }
//               }break;
//               case 6:{
//                   List<Map.Entry<String,Integer>> sort = new ArrayList<>(top.entrySet());
//                   sort.sort((i1,i2)->i1.getValue().compareTo(i2.getValue()));
//                   int count = 0;
//                   for (Map.Entry<String,Integer> element :sort){
//                       if (count>=10){
//                           break;
//                       }
//                       System.out.println(element.getKey()+ " - "+element.getValue());
//                       count++;
//                   }
//               }
//
//           }
//
//       }
    }
}