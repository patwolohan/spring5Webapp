package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Pat Wolohan
 * User:pwolo
 * Date:27/08/2025
 * Time:14:14
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
