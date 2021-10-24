package com.example.springbootmongodbtransaction.space;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceShipRepository extends MongoRepository<SpaceShip, String> {
}
