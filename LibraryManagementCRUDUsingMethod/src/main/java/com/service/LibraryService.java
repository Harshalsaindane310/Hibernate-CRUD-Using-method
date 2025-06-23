package com.service;

import com.dao.LibraryDao;

public class LibraryService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void updateData() {

		LibraryDao ld = new LibraryDao();
		ld.updateData();
	}

	public void setData() {

		LibraryDao ld = new LibraryDao();
		ld.setData();
	}

	public void deleteData() {

		LibraryDao ld = new LibraryDao();
		ld.daleteData();
	}

}
