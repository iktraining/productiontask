package gLibrary.dataaccess.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gLibrary.domain.books.publishers.Publisher;
import gLibrary.domain.books.publishers.PublisherName;

@Mapper
public interface PublisherDaoMapper {
	public List<Publisher> likeSearchPublisherName(String word);
	public Publisher findPublisherNumberByName(Publisher publisher);
	public void register(PublisherName publisherName);
}