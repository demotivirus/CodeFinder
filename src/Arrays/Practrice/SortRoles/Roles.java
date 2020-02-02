package Arrays.Practrice.SortRoles;


import java.util.List;

public class Roles {
    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.print(printTextPerRole3(roles, textLines));
    }

    public static String printTextPerRole3(String[] roles, String[] textLines){
        StringBuilder[] roleArr = new  StringBuilder[roles.length];

        //Set roles
        for (int i = 0; i <roles.length ; i++) {
            roleArr[i] = new StringBuilder(roles[i] + ":");
        }

        //Find number of text for every roles
        for (int i = 0; i < textLines.length; i++) {

            //Search in every string
            String[] split = textLines[i].split(":", 2);
            //Write of array
            String role = split[0];
            String text = split[1];
            //System.out.println(split.length);

            //Sort roles
            int count = 0;
            while(!roles[count].equals(role)){
                count++;
            }

            roleArr[count].append("\n" + (i + 1) + ")" + text);
        }

        String res = "";
        for (StringBuilder sb : roleArr)
            res += sb + "\n\n";

        return res;
    }

    public static String printTextPerRole2(String[] roles, String[] textLines) {
        StringBuilder[] textByRoles = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            textByRoles[i] = new StringBuilder(roles[i] + ":");
        }

        for (int i = 0; i < textLines.length; i++) {
            String[] splitLine = textLines[i].split(": ");
            String role = splitLine[0];
            String text = splitLine[1];

            int j = 0;
            while (!roles[j].equals(role)) {
                j++;
            }
            textByRoles[j].append("\n" + (i + 1) + ") " + text);
        }

        String result = "";
        for (StringBuilder line : textByRoles) {
            result += line + "\n\n";
        }
        return result;
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder();
        for (String role : roles) {
            res.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    res.append((i+1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }


}
