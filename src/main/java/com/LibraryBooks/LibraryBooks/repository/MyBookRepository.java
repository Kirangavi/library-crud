package com.LibraryBooks.LibraryBooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LibraryBooks.LibraryBooks.entity.MyBookList;
@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {

}
