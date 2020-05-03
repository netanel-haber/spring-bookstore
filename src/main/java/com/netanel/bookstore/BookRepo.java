package com.netanel.bookstore;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    @Modifying
    @Query("update Book b set deleted = true where b = :b")
    void delete(Book b);

    @Modifying(flushAutomatically = true, clearAutomatically = true)
    @Query("update Book b set b.deleted = true where b.id = :id")
    void deleteById(@Param("id") Long id);

    @Query(value = "SELECT * FROM books WHERE deleted=0", nativeQuery = true)
    List<Book> findAll();

    @Query(value = "SELECT * FROM books WHERE deleted=0 AND id=:id", nativeQuery = true)
    Optional<Book> findById(@Param("id") Long id);

}