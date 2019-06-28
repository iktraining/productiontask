package gLibrary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import gLibrary.domain.books.publishers.Publisher;

@Service
public interface PublisherService {
	public List<Publisher> likeSearchPublishName(String word);
	public Publisher findPublisherNumber(Publisher publisher);
	public void register(Publisher publisher);
}
