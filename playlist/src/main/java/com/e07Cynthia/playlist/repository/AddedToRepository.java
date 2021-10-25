package com.e07Cynthia.playlist.repository;

import com.e07Cynthia.playlist.model.AddedTo;
import com.e07Cynthia.playlist.model.AddedToPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPk> {
}
