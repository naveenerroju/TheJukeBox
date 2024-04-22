package com.naveen.jukebox.repository;

import com.naveen.jukebox.entity.SongsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepository extends CrudRepository<SongsEntity, Long> {

}