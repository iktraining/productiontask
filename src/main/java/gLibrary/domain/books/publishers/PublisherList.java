package gLibrary.domain.books.publishers;

import java.util.ArrayList;

public class PublisherList {
	private ArrayList<Publisher> publisherList;

	public PublisherList(ArrayList<Publisher> publisherList) {
		this.publisherList = publisherList;
	}

	public ArrayList<Publisher> getPublisherList() {
		return publisherList;
	}
}
