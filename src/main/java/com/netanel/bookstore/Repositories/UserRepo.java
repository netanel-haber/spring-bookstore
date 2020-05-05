package com.netanel.bookstore.Repositories;

import java.util.List;
import java.util.Optional;

import com.netanel.bookstore.Entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Modifying
    @Query("update User u set deleted = true where u = :u")
    void delete(User u);

    @Modifying(flushAutomatically = true, clearAutomatically = true)
    @Query("update User u set u.deleted = true where u.id = :id")
    void deleteById(@Param("id") Long id);

    @Query(value = "SELECT * FROM users WHERE deleted=0", nativeQuery = true)
    List<User> findAll();

    @Query(value = "SELECT * FROM users WHERE deleted=0 AND id=:id", nativeQuery = true)
    Optional<User> findById(@Param("id") Long id);

    @Query(value = "SELECT * FROM users WHERE deleted=0 AND username=:username", nativeQuery = true)
    User findByUsername(@Param("username") String username);

}