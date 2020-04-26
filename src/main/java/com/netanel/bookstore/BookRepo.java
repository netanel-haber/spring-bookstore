package com.netanel.bookstore;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    @Modifying 
    @Query("update Book b set deleted = true where b = :b")
    void delete(Book b);

    @Query("select b FROM Book b WHERE b.deleted = false")
    Page<Book> findAll(Pageable pageable);
}