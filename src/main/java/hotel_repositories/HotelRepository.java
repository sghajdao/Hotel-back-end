package hotel_repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel_model.Rooms;

@Repository
public interface HotelRepository extends JpaRepository<Rooms, Integer>{
    
}