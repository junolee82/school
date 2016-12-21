package kr.or.dgit.jdbc.dao;

import java.util.List;

public interface InterfaceDao<T> {
	void insertItem(T item);

	void deleteItem(int idx);

	void updateItem(T item);

	T selectByNo(int idx);

	List<T> selectByAll();
	
	
}
