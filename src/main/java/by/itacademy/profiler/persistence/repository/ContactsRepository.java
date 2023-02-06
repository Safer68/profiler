package by.itacademy.profiler.persistence.repository;

import by.itacademy.profiler.persistence.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

    @Query("select c.contacts from CurriculumVitae c where c.uuid = :uuid and c.user.email = :username")
    Optional<Contacts> findByUuidAndUsername(String uuid, String username);
}