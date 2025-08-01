package com.vtech.libraryManagement.models;

public class Library {
	
	    private String libraryName;
	    private String location;
	    private int totalBooks;
	    private boolean isOpen;
		public Library(String libraryName, String location, int totalBooks, boolean isOpen) {
			super();
			this.libraryName = libraryName;
			this.location = location;
			this.totalBooks = totalBooks;
			this.isOpen = isOpen;
		}
		public String getLibraryName() {
			return libraryName;
		}
		public void setLibraryName(String libraryName) {
			this.libraryName = libraryName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getTotalBooks() {
			return totalBooks;
		}
		public void setTotalBooks(int totalBooks) {
			this.totalBooks = totalBooks;
		}
		public boolean isOpen() {
			return isOpen;
		}
		public void setOpen(boolean isOpen) {
			this.isOpen = isOpen;
		}
		@Override
		public String toString() {
			return "Library [libraryName=" + libraryName + ", location=" + location + ", totalBooks=" + totalBooks
					+ ", isOpen=" + isOpen + "]";
		}
	


}
