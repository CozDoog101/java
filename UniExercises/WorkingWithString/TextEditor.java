package WorkingWithString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {
    StringBuilder sb = new StringBuilder();

    public void addText(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break;
            }
            sb.append(line).append("\n");
        }
    }
    public void printCount() {
        String text = sb.toString();
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;
        int charCount = text.length();
        System.out.println("Word count: " + wordCount);
        System.out.println("char count: " + charCount);
    }
    public void searchTextByKeyword(String keyword) {
        Pattern keywordPattern = Pattern.compile("^" + keyword + "$");
        Matcher keywordMatcher = keywordPattern.matcher(sb.toString());
        int count = 0;
        while (keywordMatcher.find()) {
            count++;
        }
        System.out.println("Keyword found " + count + " times.");
    }
    public void searchCountOfEmails() {
        Pattern emailPattern = Pattern.compile("[A-Za-z0-0-9]{1,15}@[a-z]{2,5}\\.[a-z]{1,5}");
        Matcher emailMatcher = emailPattern.matcher(sb.toString());
        int count = 0;
        while (emailMatcher.find()) {
            count++;
        }
        System.out.println("Emails found " + count + " times.");
    }
    public void reverseText() {
        StringBuilder revStr = new StringBuilder("");
        int end = sb.length();
        int counter = sb.length()-1;
        for (int i = sb.length()-1; i >= 0; i--) {     
            if (sb.charAt(i) == ' ' || i == 0) {
                if (i != 0) {
                    revStr.append(sb.substring(i+1, end));
                    revStr.append(" ");
                }
                else {
                    revStr.append(sb.substring(i,end));
                }
                end = counter;
            }
            counter--;
        }
        System.out.println(revStr);
    }
    
}
