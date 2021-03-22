package pl.zzpj2021.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter {
    public String getCurrentPageContents(Book book) {
        return book.getPages().get(book.getCurrentPage());
    }

    public void printCurrentPage(Book book) {
        System.out.println(getCurrentPageContents(book));
    }

    public String printAllPages(Book book) {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
