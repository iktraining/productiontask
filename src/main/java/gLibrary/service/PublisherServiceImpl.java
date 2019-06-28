package gLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gLibrary.dataaccess.mapper.PublisherDaoMapper;
import gLibrary.domain.books.publishers.Publisher;

@Service("PublisherServiceImpl")
public class PublisherServiceImpl implements PublisherService{
	@Autowired
	PublisherDaoMapper publisherDaoMapper;

	public List<Publisher> likeSearchPublishName(String word) {
		return publisherDaoMapper.likeSearchPublisherName(word);
	}

	public Publisher findPublisherNumber(Publisher publisher) {
		return publisherDaoMapper.findPublisherNumberByName(publisher);
	}

	public void register(Publisher publisher) {
		publisherDaoMapper.register(publisher.getPublisherName());
	}
}
