package com.LibraryBooks.LibraryBooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.LibraryBooks.LibraryBooks.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
