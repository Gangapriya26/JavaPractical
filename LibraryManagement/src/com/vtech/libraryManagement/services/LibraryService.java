package com.vtech.libraryManagement.services;

import java.util.ArrayList;
import java.util.Iterator;
import com.vtech.libraryManagement.models.Library;

public class LibraryService {

    private ArrayList<Library> libraryList = new ArrayList<>();

    public void addLibrary(Library library) {
    
        libraryList.add(library);
        System.out.println("Library added successfully.");
    }

    public void viewLibraries() {
        if (libraryList.isEmpty()) {
            System.out.println("No libraries available.");
            return;
        }
        libraryList.stream().forEach(lib->System.out.println(lib.toString()));
    }

    public void updateLibrary(String name, Library updatedLibrary) {
        boolean found = false;
        for (Library lib : libraryList) {
            if (lib.getLibraryName().equalsIgnoreCase(name)) {
                lib.setLocation(updatedLibrary.getLocation());
                lib.setTotalBooks(updatedLibrary.getTotalBooks());
                lib.setOpen(updatedLibrary.isOpen());
                System.out.println("Library updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Library not found: " + name);
        }
    }

    public void deleteLibrary(String name) {
        Iterator<Library> iterator = libraryList.iterator();
        while (iterator.hasNext()) {
            Library lib = iterator.next();
            if (lib.getLibraryName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Library deleted successfully.");
                return;
            }
        }
        System.out.println("Library not found: " + name);
    }
}
