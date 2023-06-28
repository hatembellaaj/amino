package tn.mdweb.amino.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.mdweb.amino.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
