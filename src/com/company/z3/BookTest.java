package com.company.z3;

import java.util.Scanner;
public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String author;
        String title;
        int year;
        int pages;
        boolean state = true;
        Book book1;
        while (state != false) {
            state = scan.nextBoolean();
            if (state != false) {
                author = scan.next();
                title = scan.next();
                year = scan.nextInt();
                pages = scan.nextInt();
                book1 = new Book(author, title, year, pages);
                System.out.println(book1.getAuthor() + " " + book1.getTitle() + " " + book1.getYear() + " " + book1.getPages() + " pages.");
            }
        }
    }
}
