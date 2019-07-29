package com.stackroute.Muzix_Assignment.Muzix.Repository;

import com.stackroute.Muzix_Assignment.Muzix.Domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuzixRepository extends JpaRepository<Track,Integer> {

}
