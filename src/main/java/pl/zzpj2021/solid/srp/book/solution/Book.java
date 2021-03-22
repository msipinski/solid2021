package pl.zzpj2021.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private int currentPage = 0;

    private Map<Integer, String> pages = new HashMap<>();

    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public void turnPage() {
        currentPage ++;
    }
}
