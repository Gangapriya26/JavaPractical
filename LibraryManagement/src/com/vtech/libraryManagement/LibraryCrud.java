package com.vtech.libraryManagement;

import java.util.Scanner;

import com.vtech.libraryManagement.models.Library;
import com.vtech.libraryManagement.services.LibraryService;

public class LibraryCrud {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        LibraryService service = new LibraryService();
	        int choice;

	        do {
	            System.out.println("\n---- Library Management System ----");
	            System.out.println("1: Add Library");
	            System.out.println("2: View Libraries");
	            System.out.println("3: Update Library");
	            System.out.println("4: Delete Library");
	            System.out.println("5: Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: {
	                    System.out.print("Enter Library Name: ");
	                    String name = sc.next();
	                    System.out.print("Enter Location: ");
	                    String location = sc.next();
	                    System.out.print("Enter Total Books: ");
	                    int totalBooks = sc.nextInt();
	                    System.out.print("Is Open? (true/false): ");
	                    boolean isOpen = sc.nextBoolean();

	                    service.addLibrary(new Library(name, location, totalBooks, isOpen));
	                    break;
	                }

	                case 2: {
	                    service.viewLibraries();
	                    break;
	                }

	                case 3:{
	                    System.out.print("Enter the Library Name to update: ");
	                    String oldName = sc.next();
	                    System.out.print("Enter new Location: ");
	                    String location = sc.next();
	                    System.out.print("Enter new Total Books: ");
	                    int totalBooks = sc.nextInt();
	                    System.out.print("Is Open? (true/false): ");
	                    boolean isOpen = sc.nextBoolean();

	                    service.updateLibrary(oldName, new Library(oldName, location, totalBooks, isOpen));
	                    break;
	                }

	                case 4: {
	                    System.out.print("Enter the Library Name to delete: ");
	                    String deleteName = sc.next();
	                    service.deleteLibrary(deleteName);
	                    break;
	                }

	                case 5:
	                    System.out.println("Exiting Library Management...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 5);

	        sc.close();
	    }
	}


